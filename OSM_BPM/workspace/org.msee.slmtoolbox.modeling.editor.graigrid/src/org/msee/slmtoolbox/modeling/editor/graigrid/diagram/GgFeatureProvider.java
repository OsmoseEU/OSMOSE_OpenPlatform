package org.msee.slmtoolbox.modeling.editor.graigrid.diagram;


import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IMoveAnchorFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IReconnectionFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IMoveAnchorContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.GgDefaultDeleteFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.GgDefaultResizeShapeFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.anchor.GgDeleteAnchorFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.anchor.GgMoveAnchorFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.center.GgAddDecisionCenterFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.center.GgAddInformationCenterFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.center.GgCreateDecisionCenterFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.center.GgCreateInformationCenterFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.center.GgMoveDecisionCenterFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.center.GgMoveInformationCenterFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.center.GgPiFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.center.GgUpdateNodeFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.custom.GgPaintDefaultFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.custom.GgPaintFunctionFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.flow.GgAddCollaBorativeDecisionFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.flow.GgAddDecisionFrameFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.flow.GgAddInformationFlowFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.flow.GgCreateCollaborativeDecisionFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.flow.GgCreateDecisionFrameFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.flow.GgCreateInformationFlowFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.flow.GgReconnectFlowForDecisionCenterFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.flow.GgReconnectFlowForNodeFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.function.GgAddFunctionFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.function.GgAddOrganizationFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.function.GgCreateFunctionFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.function.GgCreateOrganizationFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.function.GgDeleteFunctionFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.function.GgDeleteOrganizationFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.function.GgMoveFunctionFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.function.GgMoveInformationSourceFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.function.GgMoveOrganizationFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.function.GgUpdateFunctionFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.function.GgUpdateInformationSourceFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.function.GgUpdateOrganizationFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.grid.GgAddGridFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.grid.GgMoveGridFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.grid.GgUpdateGraiGridFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.informationsource.GgAddInformationSourceFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.level.GgAddLevelFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.level.GgCreateLevelFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.level.GgDeleteLevelFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.level.GgMoveLevelFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.level.GgUpdateLevelFeature;
import org.msee.slmtoolbox.modeling.editor.graphiti.diagram.DefaultMseeFeatureProvider;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgCollaborativeDecision;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationFlow;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

/** FeatureProvider for GraiGrid diagram */
public class GgFeatureProvider extends DefaultMseeFeatureProvider<GgAppService> {

	/**
	 * COnstructor with param
	 * @param dtp	diagram type provider
	 */
	public GgFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	/**
	 * Add features create graphical representations of domain model objects.
	 * @param context of add feature
	 * @return add features manager 
	 */
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		if (context.getNewObject() instanceof GgGraiGrid) {
			return new GgAddGridFeature(this);
		} else if (context.getNewObject() instanceof GgOrganization) {
			return new GgAddOrganizationFeature(this);
		} else if (context.getNewObject() instanceof GgFunction) {
			return new GgAddFunctionFeature(this);
		} else if (context.getNewObject() instanceof GgLevel) {
			return new GgAddLevelFeature(this);
		} else if (context.getNewObject() instanceof GgInformationSource) {
			return new GgAddInformationSourceFeature(this);
		} else if (context.getNewObject() instanceof GgDecisionCenter) {
			return new GgAddDecisionCenterFeature(this);
		} else if (context.getNewObject() instanceof GgInformationCenter) {
			return new GgAddInformationCenterFeature(this);
		} else if (context.getNewObject() instanceof GgInformationFlow) {
			return new GgAddInformationFlowFeature(this);
		}  else if (context.getNewObject() instanceof GgDecisionFrame) {
			return new GgAddDecisionFrameFeature(this);
		}  else if (context.getNewObject() instanceof GgCollaborativeDecision) {
			return new GgAddCollaBorativeDecisionFeature(this);
		}
		return super.getAddFeature(context);
	}

	/**
	 * Provides all create features. In the graphics framework they will be
	 * visualized in an editor as create tools.
	 * @return object model can be created by the editor
	 */
	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] {
				new GgCreateOrganizationFeature(this),
				new GgCreateFunctionFeature(this),
				new GgCreateLevelFeature(this),
				new GgCreateDecisionCenterFeature(this),
				new GgCreateInformationCenterFeature(this),};
	}

	/**
	 * Get an update manager
	 * @param context of update feature
	 * @return update feature manager
	 */
	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			Object bo = getBusinessObjectForPictogramElement(pictogramElement);
			if (bo instanceof GgFunction) {
				return new GgUpdateFunctionFeature(this);
			} else if (bo instanceof GgInformationSource) {
				return new GgUpdateInformationSourceFeature(this);
			} else if (bo instanceof GgLevel) {
				return new GgUpdateLevelFeature(this);
			} else if (bo instanceof GgNode) {
				return new GgUpdateNodeFeature(this);
			} else if (bo instanceof GgOrganization) {
				return new GgUpdateOrganizationFeature(this);
			} else if (bo instanceof GgGraiGrid) {
				return new GgUpdateGraiGridFeature(this);
			}
		}
		return super.getUpdateFeature(context);
	}

	/**
	 * Get a move manager
	 * @param context of move feature
	 * @return move feature manager
	 */
	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		Shape shape = context.getShape();
		Object bo = getBusinessObjectForPictogramElement(shape);
		if (bo instanceof GgGraiGrid) {
			return new GgMoveGridFeature(this);
		} else if (bo instanceof GgFunction) {
			return new GgMoveFunctionFeature(this);
		}  else if (bo instanceof GgLevel) {
			return new GgMoveLevelFeature(this);
		} else if (bo instanceof GgInformationSource) {
			return new GgMoveInformationSourceFeature(this);
		} else if (bo instanceof GgInformationCenter) {
			return new GgMoveInformationCenterFeature(this);
		} else if (bo instanceof GgDecisionCenter) {
			return new GgMoveDecisionCenterFeature(this);
		} else if (bo instanceof GgOrganization) {
			return new GgMoveOrganizationFeature(this);
		}
		return super.getMoveShapeFeature(context);
	}

	/**
	 * Get a delete manager
	 * @param context of delete feature
	 * @return delete feature manager
	 */
	@Override
	public IDeleteFeature getDeleteFeature(IDeleteContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			Object bo = getBusinessObjectForPictogramElement(pictogramElement);
			if (bo instanceof GgGraiGrid) {
				return null;
			} else if (bo instanceof GgFunction) {
				return new GgDeleteFunctionFeature(this);
			} else if (bo instanceof GgLevel) {
				return new GgDeleteLevelFeature(this);
			} else if (bo instanceof GgOrganization) {
				return new GgDeleteOrganizationFeature(this);
			} else if (bo instanceof GgInformationSource) {
				return null;
			} 
		} else if (pictogramElement instanceof Anchor) {
			return new GgDeleteAnchorFeature(this);
		}
		return new GgDefaultDeleteFeature(this);
	}

	/**
	 * Get a resize manager
	 * @param context of resize feature
	 * @return resize feature manager
	 */
	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context){
		return new GgDefaultResizeShapeFeature(this);
	}

	/**
	 * Provides all create connection features. In the graphics framework they will be
	 * visualized in an editor as create tools.
	 * @return object connection can be created by the editor
	 */
	@Override
    public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] {
            new GgCreateInformationFlowFeature(this),
            new GgCreateDecisionFrameFeature(this),
            new GgCreateCollaborativeDecisionFeature(this)};
    }

	/**
	 * Provides all move anchor features.
	 */
	@Override
	public IMoveAnchorFeature getMoveAnchorFeature(IMoveAnchorContext context) {
		// Prevent anchor move
		return new GgMoveAnchorFeature(this);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.graphiti.features.impl.AbstractFeatureProvider#getReconnectionFeature(org.eclipse.graphiti.features.context.IReconnectionContext)
	 */
	@Override
	public IReconnectionFeature getReconnectionFeature(IReconnectionContext context) {
		Connection connection =  context.getConnection();
		Object bo = getBusinessObjectForPictogramElement(connection);
		if (bo instanceof GgDecisionFrame) {
			return new GgReconnectFlowForDecisionCenterFeature(this);
		} else if (bo instanceof GgCollaborativeDecision) {
		    return new GgReconnectFlowForDecisionCenterFeature(this);
		} else if (bo instanceof GgInformationFlow) {
		    return new GgReconnectFlowForNodeFeature(this);
		} else{
			return null;
		}
	 } 
	
	/**
	 * Custom features can do anything. Their functionality can not be planned
	 * by the graphics framework (team).
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return custom feature according to the given context
	 * 
	 * @see ICustomFeature
	 */
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		PictogramElement[] pictogramElement = context.getPictogramElements();
		if (1 == pictogramElement.length) {
			Object bo = getBusinessObjectForPictogramElement(pictogramElement[0]);
			if (bo instanceof GgDecisionCenter) {
				return new ICustomFeature[] {new GgPaintDefaultFeature(this), new GgPiFeature(this)};
			} else if (bo instanceof GgInformationCenter) {
				return new ICustomFeature[] {new GgPaintDefaultFeature(this),};
			} else if (bo instanceof GgFunction) {
				return new ICustomFeature[] {new GgPaintFunctionFeature(this),};
			} else  {
				return new ICustomFeature[0];
			}
		} else {
			return new ICustomFeature[0];
		}
	 } 


}
