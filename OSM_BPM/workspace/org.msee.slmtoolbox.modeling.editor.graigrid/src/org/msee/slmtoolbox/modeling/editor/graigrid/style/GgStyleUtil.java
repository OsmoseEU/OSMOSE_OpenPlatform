package org.msee.slmtoolbox.modeling.editor.graigrid.style;

import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.GraiGridStyle;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.AbstractStyleUtil;

/**
 * Class for define all style for EAStar editor
 * @author fto
 */
public class GgStyleUtil extends AbstractStyleUtil {

	private static final IColorConstant DEFAULT_FOREGROUND = new ColorConstant(
			98, 131, 167);
	private static final IColorConstant GRID_TEXT_FOREGROUND = new ColorConstant(
			153, 51, 51);
	private static final IColorConstant INFORMATION_FLOW_FOREGROUND = new ColorConstant(
			200, 98, 98);
	private static final IColorConstant DECISION_FRAMEWORK_FOREGROUND = new ColorConstant(
			98, 98, 200);
	private static final IColorConstant COLLABORATIVE_DECISION_FOREGROUND = new ColorConstant(
			98, 200, 98);
	

	private static String DEFAULT_FONT = "Arial";

	/** Style for a Organization element */
	public static Style getStyleOrganization(Diagram diagram) {
		final String styleId = "ORGANIZATION";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);

			gaService.setRenderingStyle(style,
					GgColoredAreas.getOrganizationAreas());
			
			style.setForeground(gaService.manageColor(diagram,
					DEFAULT_FOREGROUND));
			style.setLineWidth(1);
		}
		return style;
	}

	/** Style for a Function element */
	public static Style getStyleFunction(Diagram diagram) {
		final String styleId = "FUNCTION";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);

			gaService.setRenderingStyle(style,
					GgColoredAreas.getFunctionAreas());
			
			style.setForeground(gaService.manageColor(diagram,
					DEFAULT_FOREGROUND));
			style.setLineWidth(1);
		}
		return style;
	}

	/** Style for a Function element text */
	public static Style getStyleFunctionText(Diagram diagram) {
		final String styleId = "FUNCTION-TEXT";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(getStyleFunction(diagram), styleId);
			// "overwrites" values from parent style
			style.setForeground(gaService.manageColor(diagram,
					DEFAULT_TEXT_FOREGROUND));
			style.setFont(gaService.manageFont(diagram, GraiGridStyle.DEFAULT_FONT, GraiGridStyle.TEXT_SIZE, false,
					false));
			style.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			style.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		}
		return style;
	}

	/** Style for a Function element Acronym */
	public static Style getStyleFunctionAcronym(Diagram diagram) {
		final String styleId = "FUNCTION-ACRONYM";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(getStyleFunction(diagram), styleId);
			// "overwrites" values from parent style
			style.setForeground(gaService.manageColor(diagram,
					DEFAULT_TEXT_FOREGROUND));
			style.setFont(gaService.manageFont(diagram, GraiGridStyle.DEFAULT_FONT, GraiGridStyle.TEXT_SIZE, false,
					false));
			style.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			style.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		}
		return style;
	}

	/** Style for a DecisionLevel element */
	public static Style getStyleLevel(Diagram diagram) {
		final String styleId = "DECISION";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);
			gaService.setRenderingStyle(style,
					GgColoredAreas.getDecisionLevelAreas());
			
			style.setForeground(gaService.manageColor(diagram,
					DEFAULT_FOREGROUND));
			style.setLineWidth(1);
		}
		return style;
	}

	/** Style for a DecisionLevel element text */
	public static Style getStyleLevelText(Diagram diagram) {
		Style style = getStyleFunctionText(diagram);
		style.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		style.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		return style;
	}

	public static Style getStyleLevelTextCode(Diagram diagram) {
		Style style = getStyleFunctionText(diagram);
		style.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT);
		style.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		return style;
	}

	/** Style for a InformationSource element */
	public static Style getStyleInformationSource(Diagram diagram) {
		final String styleId = "INFORMATIONSOURCE";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);
			gaService.setRenderingStyle(style,
					GgColoredAreas.getInformationSourceAreas());
			
			style.setForeground(gaService.manageColor(diagram, DEFAULT_FOREGROUND));
			style.setLineWidth(1);
		}
		return style;
	}

	/** Style for a DecisionCenter element */
	public static Style getStyleDecisionCenter(Diagram diagram) {
		final String styleId = "DECISIONCENTER";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);

			gaService.setRenderingStyle(style,
					GgColoredAreas.getDecisionCenterAreas());
			
			style.setForeground(gaService.manageColor(diagram,
					DEFAULT_FOREGROUND));
			style.setLineWidth(1);
		}
		return style;
	}

	/** Style for a InformationCenter element */
	public static Style getStyleInformationCenter(Diagram diagram) {
		final String styleId = "INFORMATIONCENTER";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);
			gaService.setRenderingStyle(style,
					GgColoredAreas.getInformationCenterAreas());
			
			style.setForeground(gaService.manageColor(diagram,
					DEFAULT_FOREGROUND));
			style.setLineWidth(1);
		}
		return style;
	}

	/** Style for a Center element */
	public static Style getStyleTextCenter(Diagram diagram) {
		final String styleId = "CENTER-TEXT";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(getStyleFunction(diagram), styleId);
			// "overwrites" values from parent style
			style.setForeground(gaService.manageColor(diagram,
					COLOR_BLACK));

			style.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			style.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			style.setFont(gaService.manageFont(diagram, GraiGridStyle.DEFAULT_FONT, GraiGridStyle.TEXT_SIZE, false,
					false));
		}
		return style;
	}

	/** Style for a Grid element */
	public static Style getStyleGrid(Diagram diagram) {
		final String styleId = "GRID";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);

			gaService.setRenderingStyle(style,
					GgColoredAreas.getGridAreas());
			style.setForeground(gaService.manageColor(diagram,
					DEFAULT_FOREGROUND));
			style.setLineWidth(1);
		}
		return style;
	}

	/** Style for a GraiGrid name element text */
	public static Style getStyleGridText(Diagram diagram) {
		final String styleId = "GRID-TEXT";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(getStyleFunction(diagram), styleId);
			// "overwrites" values from parent style
			style.setForeground(gaService.manageColor(diagram,
					GRID_TEXT_FOREGROUND));
			style.setFont(gaService.manageFont(diagram, GraiGridStyle.DEFAULT_FONT, GraiGridStyle.TEXT_SIZE, true,
					true));
			style.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			style.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		}
		return style;
	}

	/** Style for a Information Flow element */
	public static Style getStyleInformationFlow(Diagram diagram) {
		final String styleId = "INFORMATION_FLOW";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);
			gaService.setRenderingStyle(style,
					GgColoredAreas.getInformationFlowAreas());
			
			style.setForeground(gaService.manageColor(diagram,
					INFORMATION_FLOW_FOREGROUND));
			style.setLineStyle(LineStyle.DOT);
			style.setLineWidth(3);
		}
		return style;
	}


	public static Style getStyleCollaBorativeDecision(Diagram diagram) {
		final String styleId = "COLLABORATIVE_DECISION";
		Style style = findStyle(diagram, styleId);
		
		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);
			gaService.setRenderingStyle(style,
					GgColoredAreas.getInformationFlowAreas());
			
			style.setForeground(gaService.manageColor(diagram,
					COLLABORATIVE_DECISION_FOREGROUND));
			style.setLineWidth(3);
		}
		return style;
	}

	public static Style getStyleDecisionFrame(Diagram diagram) {
		final String styleId = "DECISION_FRAMEWORK";
		Style style = findStyle(diagram, styleId);
		
		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, styleId);
			gaService.setRenderingStyle(style,
					GgColoredAreas.getInformationFlowAreas());
			
			style.setForeground(gaService.manageColor(diagram,
					DECISION_FRAMEWORK_FOREGROUND));
			style.setLineWidth(3);
		}
		return style;
	}

	public static Style getStyleEntreprise(Diagram diagram) {
		final String styleId = "ENTREPRISE-TEXT";
		Style style = findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(getStyleFunction(diagram), styleId);
			// "overwrites" values from parent style
			style.setForeground(gaService.manageColor(diagram,
					GRID_TEXT_FOREGROUND));
			style.setFont(gaService.manageFont(diagram, DEFAULT_FONT, 16,
					true, true));
		}
		return style;
	}
}
