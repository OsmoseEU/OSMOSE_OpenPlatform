package org.msee.slmtoolbox.modeling.editor.eaStar.style;

import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.PropertiesEAStar.EAStarStyle;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.AbstractStyleUtil;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeStylePainPalette;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeStylePaintManager;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeDefaultTemplateColoredAreas;

/**
 * Class for define all style for EAStar editor
 * @author fto
 */
public class EaStyleUtil extends AbstractStyleUtil{

	/** anchor background */
	private static final IColorConstant ANCHOR_BACKGROUND = new ColorConstant(0, 128, 0);
	private static final IColorConstant E_CLASS_FOREGROUND = new ColorConstant(0,0,0);
	
	/** Style for an element */
	public static Style getStyleDefault(Diagram diagram) {
		final String styleId = "DEFAULT";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			style = MseeStylePaintManager.getStyle(diagram, 
					MseeStylePainPalette.getStylePaint(MseeStylePainPalette.ID_STYLE_WITH), 
					new MseeDefaultTemplateColoredAreas());
		}
		return style;
	}

	
	/** Style for an organization element */
	public static Style getStyleDefaultOrganization(Diagram diagram) {
		final String styleId = "DEFAULT_ORGANIZATION";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			style = MseeStylePaintManager.getStyle(diagram, 
					EaOrganizationStylePainPalette.getStylePaint(EaOrganizationStylePainPalette.ID_STYLE_BLUE), 
					new EaOrganizationTemplateColoredAreas());
		}
		return style;
	}

	/**
	 * Get style for a graphical element image
	 * @param diagram	diagram
	 * @return style
	 */
	public static Style getStyleImage(Diagram diagram) {
		final String styleId = "IMAGE";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			style = MseeStylePaintManager.getStyle(diagram, 
					MseeStylePainPalette.getStylePaint(MseeStylePainPalette.ID_STYLE_WITH), 
					new MseeDefaultTemplateColoredAreas());
			style.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			style.setVerticalAlignment(Orientation.ALIGNMENT_LEFT);
			style.setLineWidth(0);
		}
		return style;
	}

	/**
	 * Get style for a graphical element connector
	 * @param diagram	diagram
	 * @return style
	 */
	public static Style getStyleConnector(Diagram diagram) {
		final String styleId = "CONNECTOR";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			style = MseeStylePaintManager.getStyle(diagram, 
					MseeStylePainPalette.getStylePaint(MseeStylePainPalette.ID_STYLE_WITH), 
					new MseeDefaultTemplateColoredAreas());
		}
		return style;
	}

	/**
	 * Get style for a graphical element text
	 * @param diagram	diagram
	 * @return style
	 */
	public static Style getStyleText(Diagram diagram) {
		final String styleId = "TEXT";
		Style style = findStyle(diagram, styleId);

		if (style == null) {// style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);
			
			style.setForeground(gaService.manageColor(diagram, DEFAULT_TEXT_FOREGROUND));
			style.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			style.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			style.setLineWidth(2);
			style.setFont(gaService.manageFont(diagram, EAStarStyle.DEFAULT_FONT, EAStarStyle.TEXT_SIZE, false,
					false));

		}
		return style;
	}

	/**
	 * Get style for a graphical element text for activity
	 * @param diagram	diagram
	 * @return style
	 */
	public static Style getStyleTextActivity(Diagram diagram) {
		final String styleId = "TEXTLEFT";
		Style style = findStyle(diagram, styleId);

		if (style == null) {// style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);
			
			style.setForeground(gaService.manageColor(diagram, DEFAULT_TEXT_FOREGROUND));
			style.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
			style.setVerticalAlignment(Orientation.ALIGNMENT_LEFT);
			style.setLineWidth(2);
			style.setFont(gaService.manageFont(diagram, EAStarStyle.DEFAULT_FONT, EAStarStyle.TEXT_SIZE, false,
					false));

		}
		return style;
	}

	/**
	 * Get style for a graphical element text for code activity
	 * @param diagram	diagram
	 * @return style
	 */
	public static Style getStyleTextDecompoCode(Diagram diagram) {
		final String styleId = "TEXTDecompoCODE";
		Style style = findStyle(diagram, styleId);

		if (style == null) {// style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);
			
			style.setForeground(gaService.manageColor(diagram, COLOR_BLACK));
			style.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
			style.setVerticalAlignment(Orientation.ALIGNMENT_LEFT);
			style.setLineWidth(2);
			style.setFont(gaService.manageFont(diagram, EAStarStyle.DEFAULT_FONT, EAStarStyle.TEXT_SIZE, false,
					false));

		}
		return style;
	}

	/**
	 * Get style for a graphical element text for code activity
	 * @param diagram	diagram
	 * @return style
	 */
	public static Style getStyleTextCode(Diagram diagram) {
		final String styleId = "TEXTCODE";
		Style style = findStyle(diagram, styleId);

		if (style == null) {// style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);
			
			style.setForeground(gaService.manageColor(diagram, COLOR_BLACK));
			style.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT);
			style.setVerticalAlignment(Orientation.ALIGNMENT_RIGHT);
			style.setLineWidth(2);
			style.setFont(gaService.manageFont(diagram, EAStarStyle.DEFAULT_FONT, EAStarStyle.TEXT_SIZE, false,
					false));

		}
		return style;
	}

	/**
	 * Get style for a graphical element text for flow
	 * @param diagram	diagram
	 * @return style
	 */
	public static Style getStyleTextFlow(Diagram diagram) {
		final String styleId = "TEXTFLOW";
		Style style = findStyle(diagram, styleId);

		if (style == null) {// style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);
			
			style.setForeground(gaService.manageColor(diagram, IColorConstant.BLACK));
		}
		return style;
	}

	/**
	 * Get style for a graphical element text for organization
	 * @param diagram	diagram
	 * @return style
	 */
	public static Style getStyleTextOrganization(Diagram diagram) {
		final String styleId = "TEXTORGANIZATION";
		Style style = findStyle(diagram, styleId);

		if (style == null) {// style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);
			
			style.setForeground(gaService.manageColor(diagram, IColorConstant.BLACK));
			style.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
			style.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		}
		return style;
	}

	/**
	 * Get style for a graphical element anchor
	 * @param diagram	diagram
	 * @return style
	 */
	public static Style getStyleAnchor(Diagram diagram) {
		final String styleId = "ANCHOR";
		Style style = findStyle(diagram, styleId);

		if (style == null) {// style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);

			style.setForeground(gaService.manageColor(diagram, COLOR_BLACK));
			style.setBackground(gaService.manageColor(diagram, ANCHOR_BACKGROUND));
			
			style.setLineWidth(1);
		}
		return style;
	}
	
	/**
	 * Get style for a graphical element SupportFlow ResponsableFor
	 * @param diagram	diagram
	 * @return style
	 */
	public static Style getStyleSupportFlowResponsableFor(Diagram diagram) {
		final String styleId = "SUPPORT_FLOW_RESPONSABLE_FOR";
		Style style = findStyle(diagram, styleId);

		if (style == null) {// style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);

			style.setForeground(gaService.manageColor(diagram, COLOR_BLACK));
			style.setLineWidth(1);
		}
		return style;
	}
	
	/**
	 * Get style for a graphical element SupportFlow ParticipatIn 
	 * @param diagram	diagram
	 * @return style
	 */
	public static Style getStyleSupportFlowParticipatIn(Diagram diagram) {
		final String styleId = "SUPPORT_FLOW_PARTICIPATE_IN";
		Style style = findStyle(diagram, styleId);

		if (style == null) {// style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);

			style.setForeground(gaService.manageColor(diagram, COLOR_BLACK));
			style.setLineWidth(1);
			style.setLineStyle(LineStyle.DASH);
		}
		return style;
	}

	public static Style getStyleInvisible(Diagram diagram) {
		final String styleId = "INVISIBLE";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, "INVISIBLE");
			
			gaService.setRenderingStyle(style,
					EaColoredAreas.getInvisibleAreas());
			style.setLineWidth(0);
		}
		return style;
	}
	
	/**
	 * Get Styles for OSMOSE
	 */
	
	public static Style getStyleDefaultActivity(Diagram diagram) {
		final String styleId = "UNDEFINED";
		IGaService gaService = Graphiti.getGaService();

        // this is a child style of the common-values-style
        Style parentStyle = getStyleDefault(diagram);
        Style style = gaService.findStyle(parentStyle, styleId);

        if (style == null) { // style not found - create new style
            style = gaService.createPlainStyle(parentStyle, styleId);
            style.setFilled(true);
            style.setForeground(gaService.manageColor(diagram,
                    E_CLASS_FOREGROUND));
            // no background color here, we have a gradient instead
            gaService.setRenderingStyle(style,
            		EaColoredAreas.getGrayWhiteAdaptions());
        }
        return style;
	}
	
	public static Style getStyleDigitalActivity(Diagram diagram) {
		final String styleId = "DIGITAL";
		IGaService gaService = Graphiti.getGaService();

        // this is a child style of the common-values-style
        Style parentStyle = getStyleDefault(diagram);
        Style style = gaService.findStyle(parentStyle, styleId);

        if (style == null) { // style not found - create new style
            style = gaService.createPlainStyle(parentStyle, styleId);     
            style.setFilled(true);
            style.setForeground(gaService.manageColor(diagram,
                    E_CLASS_FOREGROUND));
            gaService.setRenderingStyle(style,
                    EaColoredAreas.getGreenWhiteAdaptions());
        }
        return style;
	}
	
	public static Style getStyleVirtualActivity(Diagram diagram) {
		final String styleId = "VIRTUAL";
		IGaService gaService = Graphiti.getGaService();

        // this is a child style of the common-values-style
        Style parentStyle = getStyleDefault(diagram);
        Style style = gaService.findStyle(parentStyle, styleId);

        if (style == null) { // style not found - create new style
            style = gaService.createPlainStyle(parentStyle, styleId);
            style.setFilled(true);
            style.setForeground(gaService.manageColor(diagram,
                    E_CLASS_FOREGROUND));
            gaService.setRenderingStyle(style,
                    EaColoredAreas.getRedWhiteAdaptions());
        }
        return style;
	}
	
	public static Style getStyleRealActivity(Diagram diagram) {
		final String styleId = "REAL";
		IGaService gaService = Graphiti.getGaService();

        // this is a child style of the common-values-style
        Style parentStyle = getStyleDefault(diagram);
        Style style = gaService.findStyle(parentStyle, styleId);

        if (style == null) { // style not found - create new style
            style = gaService.createPlainStyle(parentStyle, styleId);
            style.setFilled(true);
            style.setForeground(gaService.manageColor(diagram,
                    E_CLASS_FOREGROUND));
            gaService.setRenderingStyle(style,
            		EaColoredAreas.getBlueWhiteAdaptions());
        }
        return style;
	}


}
