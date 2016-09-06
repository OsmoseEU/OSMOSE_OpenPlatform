package org.msee.slmtoolbox.modeling.editor.eaStar.features.organization;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaAddFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.ConstantesEAStarActivity;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;

/**
 * Class for activity atomic add feature
 * @author fto
 *
 */
public class EaAddOrganizationFeature extends AbstractEaAddFeature {

	/**
	 * Default constructor
	 * @param fp
	 */
	public EaAddOrganizationFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Checks, if the add can be executed.
	 * 
	 * @param context
	 *            the context needed to execute the add
	 * 
	 * @return true, if the add can be executed
	 */
	public boolean canAdd(IAddContext context) {
		ContainerShape shape = context.getTargetContainer();
		Object bo = getBusinessObjectForPictogramElement(shape);
		return bo instanceof EaProcess;
	}

	/**
	 * Executes the add.
	 * 
	 * @param context
	 *            the context needed to execute the add
	 * 
	 * @return the added pictogram element
	 */
	public PictogramElement add(IAddContext context) {
		EaOrganization addedNode = (EaOrganization) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);
		// find index
		EaModel model = addedNode.getModel();
		int indexOrganization = model.getOrganizations().indexOf(addedNode)-1;// first index is default organization, it  hav'nt containershape
		// change order container for new organization
		targetDiagram.getChildren().move(indexOrganization, containerShape);

		IGaService gaService = Graphiti.getGaService();
		{
			// create and set graphics algorithm
			Rectangle rectangle = gaService.createRectangle(containerShape);
			rectangle.setStyle(EaStyleUtil.getStyleDefaultOrganization(getDiagram()));
			gaService.setLocationAndSize(rectangle, context.getX(),
					context.getY(),
					150, 75);

			// create link and wire it
			link(containerShape, addedNode);
		}
		// SHAPE ICON
		{
			// create shape for icon
			Shape shape = peCreateService.createShape(containerShape, false);
			// create  icon
			Image img = gaService.createImage(shape,
					EaImageProvider.IMG_ORGANIZATION);
			gaService
					.setLocationAndSize(img, ConstantesEAStarActivity.TEXT_MARGE, ConstantesEAStarActivity.TEXT_MARGE, 
							ConstantesEAStarActivity.ICON_SIZE, ConstantesEAStarActivity.ICON_SIZE);
		}
		// SHAPE WITH TEXT NAME
		{
			// create shape for text
			Shape shape = peCreateService.createShape(containerShape, false);
			// create and set text graphics algorithm
			Text text = gaService.createDefaultText(getDiagram(), shape, EaUtils.getTextWithCode(addedNode));
			text.setStyle(EaStyleUtil.getStyleTextOrganization(getDiagram()));
			text.setHorizontalAlignment(text.getStyle().getHorizontalAlignment());
			text.setVerticalAlignment(text.getStyle().getVerticalAlignment());
			text.setFont(text.getStyle().getFont());
			gaService.setLocationAndSize(text, 
					ConstantesEAStarActivity.ICON_SIZE + ConstantesEAStarActivity.TEXT_MARGE +1, 
					+ ConstantesEAStarActivity.TEXT_MARGE, -1, -1);
		}
		return containerShape;
	}
}
