package org.msee.slmtoolbox.modeling.editor.eaStar.features.activity;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.ConstantesEAStarActivity;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeUpdateFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

public class EaUpdateActivityFeature extends AbstractMseeUpdateFeature<EAStarAppService> {

	Object bo;
	
	/**
	 * Default constructor
	 * @param fp
	 */
	public EaUpdateActivityFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Checks whether the values of the current pictogram element of the given
	 * context can be updated.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true if update is possible
	 */
	public boolean canUpdate(IUpdateContext context) {
		// return true, if linked business object is a EClass
		bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return (bo instanceof EaExtendedActivity);
	}
	
	/**
	 * Check whether the values in the pictogram element are up to date, that
	 * means whether the graphics algorithm of this pictogram element contain
	 * the latest values from the business objects.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true if parts of the pictogram model needs to be updated with the
	 *         latest values from the business model
	 */
	public IReason updateNeeded(IUpdateContext context) {

        // test if need bsm update
        boolean needUpdateBsm = false;
        if (bo instanceof EaStructuralExtendedActivity) {
        	needUpdateBsm = getAppService().needUpdate(((EaStructuralExtendedActivity) bo).getIsA());
        }
		// update needed, if names are different
        IReason updateDiagramNeed = updateNeededForDiagram(context);

        if (needUpdateBsm && !updateDiagramNeed.toBoolean()) {
            return Reason.createTrueReason("Name is not updated with the BSM model");
        } else {
			return updateDiagramNeed;
		}
	}

	/**
	 * Check if need an update for diagram values
	 * @param context	feature context
	 * @return true if diagram values need update
	 */
	private IReason updateNeededForDiagram(IUpdateContext context) {
		// retrieve name from pictogram model
		String pictogramName = null;
		String pictogramCode = null;
		String pictogramDecompositionCode = null;
		// boolean to indicate if a text should be transformed to multi text
		boolean transformText = false;
		boolean transformCode = false;
		boolean transformDecompositionCode = false;
		boolean isGraphicStart = false; 
		boolean isGraphicEnd = false; 
		boolean transformStart = false; 
		boolean transformEnd = false;
		boolean osmioticColor = false;
		String getStyle = "UNDEFINED";
		PictogramElement pictogramElement = context.getPictogramElement();
		
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape container = (ContainerShape) pictogramElement;
			GraphicsAlgorithm graphic = container.getGraphicsAlgorithm();

			
			if (graphic instanceof RoundedRectangle
					&&  graphic.getGraphicsAlgorithmChildren().size() > 0) {
				AbstractText text = (AbstractText) graphic.getGraphicsAlgorithmChildren().get(0);
				pictogramName = text.getValue();
				getStyle = graphic.getStyle().getId();
			}
						
			// test start icon
			if (container.getChildren().size()>ConstantesEAStarActivity.START_ICON_ID) {
				Shape children = container.getChildren().get(ConstantesEAStarActivity.START_ICON_ID);
				isGraphicStart = children.getGraphicsAlgorithm().getX() > 0;
			}
			// test end icon
			if (container.getChildren().size()>ConstantesEAStarActivity.END_ICON_ID) {
				Shape children = container.getChildren().get(ConstantesEAStarActivity.END_ICON_ID);
				isGraphicEnd = children.getGraphicsAlgorithm().getX() > 0;
			}
			// test decomposition code
			if (container.getChildren().size()>ConstantesEAStarActivity.DECOMPOSITION_CODE_ID) {
				Shape children = container.getChildren().get(ConstantesEAStarActivity.DECOMPOSITION_CODE_ID);
				if (children.getGraphicsAlgorithm() instanceof AbstractText)
					pictogramDecompositionCode = ((AbstractText)children.getGraphicsAlgorithm()).getValue();
			}
			// test code
			if (container.getChildren().size()>ConstantesEAStarActivity.CODE_ID) {
				Shape children = container.getChildren().get(ConstantesEAStarActivity.CODE_ID);
				if (children.getGraphicsAlgorithm() instanceof AbstractText)
					pictogramCode = ((AbstractText)children.getGraphicsAlgorithm()).getValue();
			}
			
		}
		
		// retrieve name from business model
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof EaExtendedActivity) {
			EaExtendedActivity eaObject = (EaExtendedActivity) bo;
			transformText = ((pictogramName == null && eaObject.getName() != null) || (pictogramName != null && !pictogramName
					.equals(eaObject.getName())));
			transformStart = eaObject.isIsStarting() != isGraphicStart ;
			transformEnd = eaObject.isIsEnding() != isGraphicEnd;
			transformDecompositionCode =  ((pictogramDecompositionCode == null && eaObject.getDecompositionCode() != null) 
					|| (pictogramDecompositionCode != null && !pictogramDecompositionCode.equals(eaObject.getDecompositionCode())));
			transformCode =  ((pictogramCode == null && eaObject.getCode() != null) 
					|| (pictogramCode != null && !pictogramCode.equals(eaObject.getCode())));
			osmioticColor =!((EaExtendedActivity) bo).getOsmoseWorld().equalsIgnoreCase(getStyle);	
		}
		
		// update needed, if names are different
        boolean updateDiagramNeed = transformText || transformCode || transformDecompositionCode || transformStart || transformEnd 
        		|| osmioticColor;

        if (updateDiagramNeed) {
        	if (transformText) {
        		return Reason.createTrueReason("Name is out of date");
        	}
        	if (transformCode) {
        		return Reason.createTrueReason("Code is out of date");
        	}
        	if (transformDecompositionCode) {
        		return Reason.createTrueReason("Decomposition code is out of date");
        	}
        	if (transformStart && transformEnd) {
        		return Reason.createTrueReason("Start/End icon is out of date");
        	}
        	if (osmioticColor) {
        		return Reason.createTrueReason("Osmiotic Color is out of date");
        	}
    		return Reason.createTrueReason("Data is out of date");
        	
		} else {
			return Reason.createFalseReason();
		}
	}

	public boolean update(IUpdateContext context) {
        IReason updateDiagramNeed = updateNeededForDiagram(context);
		// retrieve name from business model
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);

		if (bo instanceof EaExtendedActivity) {
			EaExtendedActivity node = (EaExtendedActivity) bo;

			// update pictogram element
			if (pictogramElement instanceof ContainerShape) {
				ContainerShape container = (ContainerShape) pictogramElement;
				GraphicsAlgorithm graphic = container.getGraphicsAlgorithm();
				
				// control data
				if(!updateDiagramNeed.toBoolean() && bo instanceof EaStructuralExtendedActivity) {
					EaProcess process = ((EaStructuralExtendedActivity) bo)
							.getIsA();
					// if need update with data BSM
					getAppService().updateEa(process);
					node.setName(process.getName());
					node.setCode(process.getCode());
					node.setDecompositionCode(process.getDecompositionCode());
				} else if(updateDiagramNeed.toBoolean() && bo instanceof EaStructuralExtendedActivity) {
					EaProcess process = ((EaStructuralExtendedActivity) bo)
							.getIsA();
					// if need update with data BSM
					process.setName(node.getName());
					process.setCode(node.getCode());
					process.setDecompositionCode(node.getDecompositionCode());
					getAppService().update(process);
				}
				
				if (graphic instanceof RoundedRectangle){
					switch (node.getOsmoseWorld()) {
						case "REAL": graphic.setStyle(EaStyleUtil.getStyleRealActivity(getDiagram()));break;
						case "VIRTUAL": graphic.setStyle(EaStyleUtil.getStyleVirtualActivity(getDiagram()));;break;
						case "DIGITAL": graphic.setStyle(EaStyleUtil.getStyleDigitalActivity(getDiagram()));;break;
						default:graphic.setStyle(EaStyleUtil.getStyleDefaultActivity(getDiagram()));
					}
				}
				
				// update name
				if (graphic instanceof RoundedRectangle
						&&  graphic.getGraphicsAlgorithmChildren().size() > 0) {
					AbstractText text = (AbstractText) graphic.getGraphicsAlgorithmChildren().get(0);
					text.setValue(node.getName());
				}
				
				// update decomposition code
				if (container.getChildren().size()>ConstantesEAStarActivity.DECOMPOSITION_CODE_ID) {
					Shape children = container.getChildren().get(ConstantesEAStarActivity.DECOMPOSITION_CODE_ID);
					if (children.getGraphicsAlgorithm() instanceof AbstractText)
						((AbstractText)children.getGraphicsAlgorithm()).setValue(node.getDecompositionCode());
					if (node instanceof EaStructuralExtendedActivity
							&& null != ((EaStructuralExtendedActivity) node).getIsA()) {
						((EaStructuralExtendedActivity) node).getIsA().setDecompositionCode(node.getDecompositionCode());
					}
				}
				
				// update code
				if (container.getChildren().size()>ConstantesEAStarActivity.CODE_ID) {
					Shape children = container.getChildren().get(ConstantesEAStarActivity.CODE_ID);
					if (children.getGraphicsAlgorithm() instanceof AbstractText)
						((AbstractText)children.getGraphicsAlgorithm()).setValue(node.getCode());
					if (node instanceof EaStructuralExtendedActivity
							&& null != ((EaStructuralExtendedActivity) node).getIsA()) {
						((EaStructuralExtendedActivity) node).getIsA().setCode(node.getCode());
					}
				}
				
				// update start icon
				if (container.getChildren().size()>ConstantesEAStarActivity.START_ICON_ID) {
					Shape children = container.getChildren().get(ConstantesEAStarActivity.START_ICON_ID);
					int x = - 2 * ConstantesEAStarActivity.START_ICON_X;
					if (node.isIsStarting()) {
						x = ConstantesEAStarActivity.START_ICON_X;
					}
					children.getGraphicsAlgorithm().setX(x);
				}
				
				// update end icon
				if (container.getChildren().size()>ConstantesEAStarActivity.END_ICON_ID) {
					Shape children = container.getChildren().get(ConstantesEAStarActivity.END_ICON_ID);
					int x = - 2 * ConstantesEAStarActivity.END_ICON_X;
					if (node.isIsEnding()) {
						x = ConstantesEAStarActivity.END_ICON_X;
					}
					children.getGraphicsAlgorithm().setX(x);
				}
			}
		}
		
		return false;
	}
}
