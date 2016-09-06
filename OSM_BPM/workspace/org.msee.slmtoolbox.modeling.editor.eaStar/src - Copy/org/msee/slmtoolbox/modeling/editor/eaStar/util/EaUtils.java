package org.msee.slmtoolbox.modeling.editor.eaStar.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.graphiti.ui.services.IUiLayoutService;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.PropertiesEAStar.EAStarEditorWizardProperties;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * Utils class
 * @author fto
 *
 */
public class EaUtils {

	/**
	 * Get string for organization graphical text
	 * @param organization
	 * @return string for organization graphical text
	 */
	public static String getTextWithCode(EaBaseElement eaElement) {
		StringBuffer text = new StringBuffer();
		if (null != eaElement.getCode() && !"".equals(eaElement.getCode())) {
			 text.append(eaElement.getCode());
			if (null != eaElement.getName() && !"".equals(eaElement.getName())) {
				 text.append(" - ");
				 text.append(eaElement.getName());
			}
		} else  if (null != eaElement.getName() && !"".equals(eaElement.getName())) {
			text.append(eaElement.getName());
		}
		return text.toString();
	}
	
	/**
	 * Refresh and Add organization to the node
	 * @param featureProvider	iFeatureProvider
	 * @param diagram			diagram
	 * @param eaStarAppService 	app service
	 * @param organization		organization
	 */
	public static void refreshAndAddOrganizationToNode(IFeatureProvider featureProvider, Diagram diagram,
			EaFlowNode flowNode, EAStarAppService eaStarAppService) {
		EaOrganization defaultOrgnization = getDefaultOrganization(featureProvider, diagram);
		/* ***************************************
		 *  refresh all Organization
		 * **************************************/
		if (null != flowNode.getOrganization()) {
			EaOrganization organization = flowNode.getOrganization();
			List<int[]> allGraphicDatas = getGraphicDatasOrganization (featureProvider, organization);
			if (!isFlowNodeInOrganization(featureProvider, flowNode, allGraphicDatas)) {
				organization.getFlowNode().remove(flowNode);
			}
		}

		/* ***************************************
		 *  find organization if not found
		 * **************************************/
		if (null == flowNode.getOrganization()) {
			EaModel model = flowNode.getProcess().getModel();
			for (EaOrganization organization : model.getOrganizations()) {
				List<int[]> allGraphicDatas = getGraphicDatasOrganization (featureProvider, organization);
				if (isFlowNodeInOrganization(featureProvider, flowNode, allGraphicDatas)) {
					organization.getFlowNode().add(flowNode);
					// update data bsm
					if (flowNode instanceof EaResource) {
						eaStarAppService.updateOrganization((EaResource) flowNode);
					} else if (flowNode instanceof EaProcessConnector) {
						eaStarAppService.updateOrganization(((EaProcessConnector) flowNode).getProcessRef(), organization);
					} else if (flowNode instanceof EaStructuralExtendedActivity) {
						eaStarAppService.updateOrganization(((EaStructuralExtendedActivity) flowNode).getIsA(), organization);
					}
					break;
				}
			}
		}
		// add to default organization if not found
		if (null == flowNode.getOrganization()) {
			defaultOrgnization.getFlowNode().add(flowNode);
			// update data bsm
			if (flowNode instanceof EaResource) {
				eaStarAppService.updateOrganization((EaResource) flowNode);
			}
		}
		
	}

	/**
	 * Refresh and Add node to the organization
	 * @param featureProvider	iFeatureProvider
	 * @param diagram			diagram
	 * @param organization		organization
	 * @param eaStarAppService 
	 */
	public static void refreshAndAddNodeToOrganization(IFeatureProvider featureProvider, Diagram diagram,
			EaOrganization organization, EAStarAppService eaStarAppService) {
		/* ***************************************
		 *  define graphic data for organization
		 * **************************************/
		List<int[]> allGraphicDatas = getGraphicDatasOrganization(featureProvider, organization);
		
		/* ***************************************
		 *  refresh all node
		 * **************************************/
		for (int index = organization.getFlowNode().size()-1; index >= 0; index--) {
			EaFlowNode flowNode = organization.getFlowNode().get(index);
			if (!isFlowNodeInOrganization(featureProvider, flowNode, allGraphicDatas)) {
				refreshAndAddOrganizationToNode(featureProvider, diagram, flowNode, eaStarAppService);
			}
		}

		/* ***************************************
		 *  find new element
		 * **************************************/
		EaProcess process = organization.getModel().getProcess();
		// for all element of process
		for (EaFlowElement element : process.getFlowElements()) {
			// if element is a EaFlowNode and not associate to organization
			if (element instanceof EaFlowNode
					&& !organization.getFlowNode().contains((EaFlowNode)element)) {
				EaFlowNode node = (EaFlowNode) element;
				if (isFlowNodeInOrganization(featureProvider, node, allGraphicDatas)) {
					organization.getFlowNode().add(node);
					node.setOrganization(organization);
					// update data bsm
					if (node instanceof EaResource) {
						eaStarAppService.updateOrganization((EaResource) node);
					} else if (node instanceof EaProcessConnector) {
						eaStarAppService.updateOrganization(((EaProcessConnector) node).getProcessRef(), organization);
					} else if (node instanceof EaStructuralExtendedActivity) {
						eaStarAppService.updateOrganization(((EaStructuralExtendedActivity) node).getIsA(), organization);
					}
				}
			}
			
		}
		
	}
	
	/**
	 * 
	 * @param featureProvider
	 * @param organization
	 * @return
	 */
	private static List<int[]> getGraphicDatasOrganization(
			IFeatureProvider featureProvider, EaOrganization organization) {
		PictogramElement[] pElementsOrga = featureProvider.getAllPictogramElementsForBusinessObject(organization);
		List<int[]> allGraphicDatas = new ArrayList<int[]>();
		for (int i = 0; i < pElementsOrga.length; i++) {
			int[] graphicData = new int[4];
			graphicData[0] = pElementsOrga[i].getGraphicsAlgorithm().getX();
			graphicData[1] = pElementsOrga[i].getGraphicsAlgorithm().getY(); 
			graphicData[2] = pElementsOrga[i].getGraphicsAlgorithm().getWidth(); 
			graphicData[3] = pElementsOrga[i].getGraphicsAlgorithm().getHeight();  
			allGraphicDatas.add(graphicData);
		}
		return allGraphicDatas;
	}

	/**
	 * Checks if element is in organization
	 * @param iFeatureProvider
	 * @param node				element
	 * @param allGraphicDatas	all organization graphic data [x,y,width, height]
	 * @return false if all element graphic representation isn't on at least one representation
	 */
	private static boolean isFlowNodeInOrganization(IFeatureProvider iFeatureProvider, EaFlowNode node,
			List<int[]> allGraphicDatas) {
		boolean isFlowNodeInOrganization = allGraphicDatas.size()>0;
		PictogramElement[] pElements = iFeatureProvider.getAllPictogramElementsForBusinessObject(node);
		// for all graphic representations of an element, 
		for (int i = 0; i < pElements.length; i++) {
			// it is checked if at least one of weather applications organism
			if (pElements[i] instanceof Shape 
					&& !(pElements[i].getGraphicsAlgorithm() instanceof AbstractText)
					&& !isInGraphicOrganization(pElements[i].getGraphicsAlgorithm(), allGraphicDatas)) {
				isFlowNodeInOrganization = false;
				break;
			}
		}
		return isFlowNodeInOrganization;
	}

	/**
	 * Checks if one element graphic representation is on one organization graphical representation
	 * @param graphicsAlgorithm	of element
	 * @param allGraphicDatas	all organization graphic data [x,y,width, height]
	 * @return if one element graphic representation is on one organization graphical representation
	 */
	private static boolean isInGraphicOrganization(GraphicsAlgorithm graphicsAlgorithm,
			List<int[]> allGraphicDatas) {
		boolean is = false;
		for(int[] graphicData : allGraphicDatas) {
			if (graphicsAlgorithm.getX() >= graphicData[0]
					&& graphicsAlgorithm.getY() >= graphicData[1]
					&& graphicsAlgorithm.getX() + graphicsAlgorithm.getWidth() <= graphicData[0] + graphicData[2]
					&& graphicsAlgorithm.getY() + graphicsAlgorithm.getHeight() <= graphicData[1] + graphicData[3]){
				is = true;
				break;
			}
		}
		return is;
	}

	public static void calculateRealeLoaction(IAddContext context) {
		ContainerShape shape = context.getTargetContainer();
		if (!(shape instanceof Diagram) && context instanceof AddContext) {
			Shape shapeParent = shape;
			while (null != shapeParent.eContainer()) {
				((AddContext) context).setX(((AddContext) context).getX()+
						shapeParent.getGraphicsAlgorithm().getX());
				((AddContext) context).setY(((AddContext) context).getY()+
						shapeParent.getGraphicsAlgorithm().getY());
				shapeParent = (Shape) shape.eContainer();
				
			}
		}
		
	}

	/**
	 * Get default organization
	 * @param featureProvider	
	 * @param diagram		source
	 * @return	null if not found
	 */
	public static EaOrganization getDefaultOrganization(
			IFeatureProvider featureProvider, Diagram diagram) {
		EaOrganization defaultOrganization = null;
		EaProcess mainProcess = findProcess(featureProvider, diagram);
		
		if (null != mainProcess) {
			// find model
			EaModel model = mainProcess.getModel();
			// find organization
			defaultOrganization = getDefaultOrganization(model);
		}
		
		// TODO Auto-generated method stub
		return defaultOrganization;
	}

	/**
	 * Get default organization
	 * @param model source
	 * @return	null if not found
	 */
	public static EaOrganization getDefaultOrganization(EaModel model) {
		if (null != model
				&& isHaveDefaultOrganization(model)) {
			return model.getOrganizations().get(0);
		}
		return null;
	}
	
	/**
	 * find the process business object
	 * @return null if not found a process
	 */
	public static EaProcess findProcess(IFeatureProvider featureProvider, Diagram diagram) {
		EaProcess process = null;
		// find the businesseObject 
		Object businesseObject = featureProvider.getBusinessObjectForPictogramElement(diagram);
		// if not a GraiGrid, it's error, return null
		if (businesseObject instanceof EaProcess) {
			process = (EaProcess) businesseObject;
		}
		
		return process;
	}

	/**
	 * 
	 * @param model source
	 * @return true if can have a default orgnization
	 */
	public static boolean isHaveDefaultOrganization(EaModel model) {
		return  model.getOrganizations().size() > 0;
	}

	
	/**
	 * Get diagram file name for a process
	 * @param name				process name
	 * @param decompositionCode	process decomposition code
	 * @return complete file name
	 */
	public static String getDiagramNameFile(String name, String decompositionCode) {
		return getDiagramNameFile(name, decompositionCode, true);
	}
	
	/**
	 * Get diagram file name for a process
	 * @param name				process name
	 * @param decompositionCode	process decomposition code
	 * @param withExtension		false for name without extension
	 * @return complete file name
	 */
	public static String getDiagramNameFile(String name, String decompositionCode, boolean withExtension) {
		StringBuffer temp = new StringBuffer();
		if (null != decompositionCode) {
			temp.append(decompositionCode);
		}
		if (null != name) {
			if (null != decompositionCode) {
				temp.append(".");
			}
			temp.append(name);
		}
		if (withExtension) {
			temp.append(EAStarEditorWizardProperties.DIAGRAM_EXTENSION);
		}
		return  temp.toString();
	}
	
	/**
	 * Get diagram file name for a process
	 * @param process		target
	 * @param withExtension	false for name without extension
	 * @return complete file name
	 */
	public static String getDiagramNameFile(EaProcess process, boolean withExtension) {
		if (null != process) {
			return getDiagramNameFile(process.getName(), process.getDecompositionCode(), withExtension);
		} else {
			return null;
		}
	}

	/**
	 * Get diagram file name for a process
	 * @param process	target
	 * @return complete file name
	 */
	public static String getDiagramNameFile(EaProcess process) {
		return getDiagramNameFile(process, true);
	}
	
	public static int getTextWidth(String text, Diagram diagram ){
		IUiLayoutService util = GraphitiUi.getUiLayoutService();
		IDimension dim = util.calculateTextSize(text, EaStyleUtil.getStyleText(diagram).getFont());
		return dim.getWidth();
	}
}
