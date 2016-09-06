package org.msee.slmtoolbox.modeling.editor.graigrid;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

public class GraiGridImageProvider extends AbstractImageProvider {
	 
    // The prefix for all identifiers of this image provider
    protected static final String PREFIX =
              "org.msee.slmtoolbox.modeling.editor.graigrid.";

    // The image identifier for an Function.
    public static final String IMG_16_FUNCTION = PREFIX + "function";
    // The image identifier for an decision level.
    public static final String IMG_16_LEVEL = PREFIX + "decision.level";
    // The image identifier for an decision center.
	public static final String IMG_16_DECISION_CENTER = PREFIX + "decision.center";
    // The image identifier for an information center.
	public static final String IMG_16_INFORMATION_CENTER = PREFIX + "information.center";
    // The image identifier for an information flow.
	public static final String IMG_16_INFORMATION_FLOW = PREFIX + "information.flow";
    // The image identifier for a decision frame.
	public static final String IMG_16_DECISION_FRAME = PREFIX + "decision.framework";
    // The image identifier for a collaborative decision.
	public static final String IMG_16_COLLABORATIVE_DECISION = PREFIX + "collaborative.decision";
    // The image identifier for a organization.
	public static final String IMG_16_ORGANIZATION = PREFIX + "organization";
    // The image identifier for an Function.
    public static final String IMG_16_PAINT = PREFIX + "paint";
    // The image identifier for an Pi option.
    public static final String IMG_16_PI = PREFIX + "pi";
    
    @Override
    protected void addAvailableImages() {
        // register the path for each image identifier
        addImageFilePath(IMG_16_FUNCTION, "icons/16/gridgrai_c.png");
        addImageFilePath(IMG_16_LEVEL, "icons/16/gridgrai_l.png");
        addImageFilePath(IMG_16_DECISION_CENTER, "icons/16/gridgrai_dc.png");
        addImageFilePath(IMG_16_INFORMATION_CENTER, "icons/16/gridgrai_ic.png");
        addImageFilePath(IMG_16_INFORMATION_FLOW, "icons/16/gridgrai_if.png");
        addImageFilePath(IMG_16_DECISION_FRAME, "icons/16/gridgrai_df.png");
        addImageFilePath(IMG_16_COLLABORATIVE_DECISION, "icons/16/gridgrai_cd.png");
        addImageFilePath(IMG_16_ORGANIZATION, "icons/16/gridgrai_organization.png");
        addImageFilePath(IMG_16_PAINT, "icons/16/action_paint.png");
        addImageFilePath(IMG_16_PI, "icons/16/action_pi.png");
        
    }
}
