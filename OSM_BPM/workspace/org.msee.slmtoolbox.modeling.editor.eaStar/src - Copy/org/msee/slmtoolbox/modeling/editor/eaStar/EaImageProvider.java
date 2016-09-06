package org.msee.slmtoolbox.modeling.editor.eaStar;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

public class EaImageProvider extends AbstractImageProvider {

    // The prefix for all identifiers of this image provider
    protected static final String PREFIX = 
              "org.msee.slmtoolbox.modeling.editor.eaStar.";

    // The image identifier for an feature paint.
    public static final String IMG_PAINT = PREFIX + "paint";

    // The image identifier for an input/output flow.
    public static final String IMG_INPUT_OUTPUT_FLOW = PREFIX + "InputOutputFlow";
    
    // The image identifier for a control flow.
    public static final String IMG_CONTROL_FLOW = PREFIX + "ControlFlow";

    // The image identifier for a support flow.
    public static final String IMG_SUPPORT_FLOW = PREFIX + "SupportFlow";

    // The image identifier for a FlowNode.
    public static final String IMG_FLOWNODE = PREFIX + "Flownode";

    // The image identifier for a FlowNode.
    public static final String IMG_STRUCTURAL_ACTIVITY = PREFIX + "StructuralActivity";
    
    // The image identifier for an InternalConnector.
    public static final String IMG_INTERNAL_CONNECTOR = PREFIX + "InternalConnector";
    
    // The image identifier for an ExternalConnector.
    public static final String IMG_EXTERNAL_CONNECTOR = PREFIX + "ExternalConnector";
    
    // The image identifier for an ProcessConnector.
    public static final String IMG_PROCESS_CONNECTOR = PREFIX + "ProcessConnector";
    
    // The icon identifier for an HumanResource
    public static final String IMG_HUMAN_RESOURCE = PREFIX + "HumanResource";
    
    // The image identifier for an HumanResource
    public static final String IMG_HUMAN_RESOURCE_DIAG = PREFIX + "HumanResourceDiag";
    
    // The icon identifier for a MaterialResource
    public static final String IMG_MATERIAL_RESOURCE = PREFIX + "MaterialResource";
    
    // The image identifier for a MaterialResource
    public static final String IMG_MATERIAL_RESOURCE_DIAG = PREFIX + "MaterialResourceDiag";
    
    // The icon identifier for an ITResource
    public static final String IMG_IT_RESOURCE = PREFIX + "ITResource";
    
    // The image identifier for an ITResource
    public static final String IMG_IT_RESOURCE_DIAG = PREFIX + "ITResourceDiag";
    
    // The icon identifier for an And LogicalOperator
    public static final String IMG_AND = PREFIX + "And";
    
    // The image identifier for an And LogicalOperator
    public static final String IMG_AND_DIAG = PREFIX + "AndDiag";
    
    // The icon identifier for an Or LogicalOperator
    public static final String IMG_OR = PREFIX + "Or";
    
    // The image identifier for an Or LogicalOperator
    public static final String IMG_OR_DIAG = PREFIX + "OrDiag";
    
    public static final String IMG_PLUS_SIGN = PREFIX + "plusSignStructural";

    // The image identifier for an icon start
	public static final String IMG_ACTIVITY_START = PREFIX + "ActivityStart";

    // The image identifier for an icon end
	public static final String IMG_ACTIVITY_END = PREFIX + "ActivityEnd";

	public static final String IMG_ORGANIZATION = PREFIX + "Organization";

    // The image identifier for an feature Up.
    public static final String IMG_UP = PREFIX + "up";
    
    // The image identifier for an feature Down.
    public static final String IMG_DOWN = PREFIX + "down";
    
    // The image identifier for an feature transform activity.
    public static final String IMG_TRANSFORM_ACTIVITY = PREFIX + "transform.activity";
    
    // The image identifier for an feature transform activity.
    public static final String IMG_MSE_SERVICE = PREFIX + "mse.service";
    
    // The image identifier for an feature transform activity.
    public static final String IMG_MSE_SERVICE_PLUS = PREFIX + "mse.service.plus";
    
    // The image identifier for an feature transform activity.
    public static final String IMG_MSE_ASSET = PREFIX + "mse.asset";
    
    // The image identifier for an feature transform activity.
    public static final String IMG_MSE_ASSET_PLUS = PREFIX + "mse.asset.plus";
    
    @Override
    protected void addAvailableImages() {
        // register the path for each image identifier
        addImageFilePath(IMG_INPUT_OUTPUT_FLOW, "icons/16/eastar_input_output_flow.png");
        addImageFilePath(IMG_CONTROL_FLOW, "icons/16/eastar_control_flow.png");
        addImageFilePath(IMG_SUPPORT_FLOW, "icons/16/eastar_support_flow.png");
        addImageFilePath(IMG_FLOWNODE, "icons/16/eastar_flownode.png");
        addImageFilePath(IMG_STRUCTURAL_ACTIVITY, "icons/16/eastar_structural_activity.png");
        addImageFilePath(IMG_INTERNAL_CONNECTOR, "icons/16/eastar_InternalConnector.png");
        addImageFilePath(IMG_EXTERNAL_CONNECTOR, "icons/16/eastar_ExternalConnector.png");
        addImageFilePath(IMG_PROCESS_CONNECTOR, "icons/16/eastar_ProcessConnector.png");
        addImageFilePath(IMG_HUMAN_RESOURCE, "icons/16/eastar_HumanResource.png");
        addImageFilePath(IMG_HUMAN_RESOURCE_DIAG, "icons/60/eastar_HumanResourceDiag.png");
        addImageFilePath(IMG_MATERIAL_RESOURCE, "icons/16/eastar_MaterialResource.png");
        addImageFilePath(IMG_MATERIAL_RESOURCE_DIAG, "icons/60/eastar_MaterialResourceDiag.png");
        addImageFilePath(IMG_IT_RESOURCE, "icons/16/eastar_ITResource.png");
        addImageFilePath(IMG_IT_RESOURCE_DIAG, "icons/60/eastar_ITResourceDiag.png");
        addImageFilePath(IMG_AND, "icons/16/eastar_And.png");
        addImageFilePath(IMG_AND_DIAG, "icons/44/eastar_AndDiag.png");
        addImageFilePath(IMG_OR, "icons/16/eastar_Or.png");
        addImageFilePath(IMG_OR_DIAG, "icons/44/eastar_OrDiag.png");
        addImageFilePath(IMG_PLUS_SIGN, "icons/24/eastar_plusSignStructural.png");
        addImageFilePath(IMG_PAINT, "icons/16/action_paint.png");
        addImageFilePath(IMG_ACTIVITY_START, "icons/16/eastar_activity_start.png");
        addImageFilePath(IMG_ACTIVITY_END, "icons/16/eastar_activity_end.png");
        addImageFilePath(IMG_ORGANIZATION, "icons/16/eastar_organization.png");
        addImageFilePath(IMG_UP, "icons/16/eastar_up.png");
        addImageFilePath(IMG_DOWN, "icons/16/eastar_down.png");
        addImageFilePath(IMG_TRANSFORM_ACTIVITY, "icons/16/eastar_transform_activity.png");
        addImageFilePath(IMG_MSE_SERVICE, "icons/16/eastar_mse_service.png");
        addImageFilePath(IMG_MSE_SERVICE_PLUS, "icons/24/eastar_mse_service_plus.png");
        addImageFilePath(IMG_MSE_ASSET, "icons/16/eastar_mse_service.png");
        addImageFilePath(IMG_MSE_ASSET_PLUS, "icons/24/eastar_mse_service_plus.png");
        
    }
}
