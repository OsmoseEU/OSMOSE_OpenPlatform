package org.msee.slmtoolbox.modeling.editor.graigrid.style;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.LocationType;
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
import org.eclipse.graphiti.util.IGradientType;
import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
import org.eclipse.graphiti.util.PredefinedColoredAreas;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGridSize;

public class GgColoredAreas extends PredefinedColoredAreas {

	/** The ID for a function gradient. */
	public static final String FUNCTION_ID = "functionIdGradient";
	/** The ID for a DecisionLevel gradient. */
	public static final String DECISIONLEVEL_ID = "decisionLevelIdGradient";
	/** The ID for a InformationSource gradient. */
	public static final String INFORMATION_ID = "informatioIdGradient";
	/** The ID for a grid gradient. */
	public static final String GRID_ID = "gridIdGradient";
	/** The ID for a information flow gradient. */
	public static final String INFORMATION_FLOW = "informationFlowIdGradient";

	/**
	 * The color-areas for elements Organization
	 */
	public static AdaptedGradientColoredAreas getOrganizationAreas() {
		final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE
				.createAdaptedGradientColoredAreas();
		agca.setDefinedStyleId(FUNCTION_ID);
		agca.setGradientType(IGradientType.VERTICAL);
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
				getOrganizationDefaultAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
				getOrganizationSelectedAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
				getOrganizationSelectedAreas());
		return agca;
	}
	
	/**
	 * The color-areas for elements function
	 */
	public static AdaptedGradientColoredAreas getFunctionAreas() {
		final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE
				.createAdaptedGradientColoredAreas();
		agca.setDefinedStyleId(FUNCTION_ID);
		agca.setGradientType(IGradientType.VERTICAL);
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
				getFunctionDefaultAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
				getFunctionSelectedAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
				getFunctionSelectedAreas());
		return agca;
	}

	/**
	 * The color-areas for elements function
	 */
	public static AdaptedGradientColoredAreas getDecisionLevelAreas() {
		final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE
				.createAdaptedGradientColoredAreas();
		agca.setDefinedStyleId(DECISIONLEVEL_ID);
		agca.setGradientType(IGradientType.HORIZONTAL);
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
				getDecisionLevelDefaultAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
				getDecisionLevelSelectedAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
				getDecisionLevelSelectedAreas());
		
		return agca;
	}

	/**
	 * The color-areas for elements InformationSource
	 */
	public static AdaptedGradientColoredAreas getInformationSourceAreas() {
		final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE
				.createAdaptedGradientColoredAreas();
		agca.setDefinedStyleId(INFORMATION_ID);
		agca.setGradientType(IGradientType.VERTICAL);
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
				getInformationSourceDefaultAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
				getInformationSourceSelectedAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
				getInformationSourceSelectedAreas());
		
		return agca;
	}

	/**
	 * The color-areas for elements DecisionCenter
	 */
	public static AdaptedGradientColoredAreas getDecisionCenterAreas() {
		final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE
				.createAdaptedGradientColoredAreas();
		agca.setDefinedStyleId(FUNCTION_ID);
		agca.setGradientType(IGradientType.VERTICAL);
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
				getDecisionCenterDefaultAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
				getDecisionCenterSelectedAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
				getDecisionCenterSelectedAreas());
		
		return agca;
	}

	/**
	 * The color-areas for elements InformationCenter
	 */
	public static AdaptedGradientColoredAreas getInformationCenterAreas() {
		final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE
				.createAdaptedGradientColoredAreas();
		agca.setDefinedStyleId(INFORMATION_ID);
		agca.setGradientType(IGradientType.VERTICAL);
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
				getInformationCenterDefaultAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
				getInformationCenterSelectedAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
				getInformationCenterSelectedAreas());
		
		return agca;
	}

	/**
	 * The color-areas for elements Grid
	 */
	public static AdaptedGradientColoredAreas getGridAreas() {
		final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE
				.createAdaptedGradientColoredAreas();
		agca.setDefinedStyleId(GRID_ID);
		agca.setGradientType(IGradientType.VERTICAL);
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
				getGridDefaultAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
				getGridDefaultAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
				getGridDefaultAreas());
		
		return agca;
	}

	/**
	 * The color-areas for elements Information Flow
	 */
	public static AdaptedGradientColoredAreas getInformationFlowAreas() {
		final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE
				.createAdaptedGradientColoredAreas();
		agca.setDefinedStyleId(INFORMATION_FLOW);
		agca.setGradientType(IGradientType.VERTICAL);
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
				getInformationFlowDefaultAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
				getInformationFlowDefaultAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
				getInformationFlowDefaultAreas());
		
		return agca;
	}

	/**
	 * The color-areas for primary selected elements function
	 */
	private static GradientColoredAreas getOrganizationSelectedAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();

		addGradientColoredArea(
				gcas,
				"FBF8FE", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "F8FBFE", 1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"F5EDFC", 1, LocationType.LOCATION_TYPE_ABSOLUTE_START, "EDF5FC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"EDDEFA", 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "DEEDFA", 3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E7D4F8", 3, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FAFBFC", GgUtilsGridSize.SIZE_ORGANIZATION_HEIGHT_HEAD - 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E5E2E9", GgUtilsGridSize.SIZE_ORGANIZATION_HEIGHT_HEAD - 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "E2E5E9", GgUtilsGridSize.SIZE_ORGANIZATION_HEIGHT_HEAD, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);

		return gradientColoredAreas;
	}

	/**
	 * The color-areas for primary default elements function
	 */
	private static GradientColoredAreas getOrganizationDefaultAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();
		addGradientColoredArea(
				gcas,
				"F8FBFE", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "F8FBFE", 1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"EDF5FC", 1, LocationType.LOCATION_TYPE_ABSOLUTE_START, "EDF5FC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"DEEDFA", 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "DEEDFA", 3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"D4E7F8", 3, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FAFBFC", GgUtilsGridSize.SIZE_ORGANIZATION_HEIGHT_HEAD - 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E2E5E9", GgUtilsGridSize.SIZE_ORGANIZATION_HEIGHT_HEAD - 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "E2E5E9", GgUtilsGridSize.SIZE_ORGANIZATION_HEIGHT_HEAD, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		
		
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
		return gradientColoredAreas;
	}

	/**
	 * The color-areas for primary selected elements function
	 */
	private static GradientColoredAreas getFunctionSelectedAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();

		addGradientColoredArea(
				gcas,
				"FBF8FE", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "F8FBFE", 1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"F5EDFC", 1, LocationType.LOCATION_TYPE_ABSOLUTE_START, "EDF5FC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"EDDEFA", 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "DEEDFA", 3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E7D4F8", 3, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FAFBFC", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E5E2E9", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "E2E5E9", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);

		addGradientColoredArea(
				gcas,
				"FBF8FE", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER, LocationType.LOCATION_TYPE_ABSOLUTE_END, "F8FBFE", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"F5EDFC", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-1, LocationType.LOCATION_TYPE_ABSOLUTE_END, "EDF5FC", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"EDDEFA", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-2, LocationType.LOCATION_TYPE_ABSOLUTE_END, "DEEDFA", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"E7D4F8", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-3, LocationType.LOCATION_TYPE_ABSOLUTE_END, "FAFBFC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"E5E2E9", 2, LocationType.LOCATION_TYPE_ABSOLUTE_END, "E2E5E9", 0, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);

		return gradientColoredAreas;
	}

	/**
	 * The color-areas for primary default elements function
	 */
	private static GradientColoredAreas getFunctionDefaultAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();
		addGradientColoredArea(
				gcas,
				"F8FBFE", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "F8FBFE", 1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"EDF5FC", 1, LocationType.LOCATION_TYPE_ABSOLUTE_START, "EDF5FC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"DEEDFA", 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "DEEDFA", 3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"D4E7F8", 3, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FAFBFC", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E2E5E9", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "E2E5E9", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		

		addGradientColoredArea(
				gcas,
				"F8FBFE", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER, LocationType.LOCATION_TYPE_ABSOLUTE_END, "F8FBFE", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"EDF5FC", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-1, LocationType.LOCATION_TYPE_ABSOLUTE_END, "EDF5FC", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"DEEDFA", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-2, LocationType.LOCATION_TYPE_ABSOLUTE_END, "DEEDFA", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"D4E7F8", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-3, LocationType.LOCATION_TYPE_ABSOLUTE_END, "FAFBFC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"E2E5E9", 2, LocationType.LOCATION_TYPE_ABSOLUTE_END, "E2E5E9", 0, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
		return gradientColoredAreas;
	}

	/**
	 * The color-areas for primary selected elements DecisionLevel
	 */
	private static GradientColoredAreas getDecisionLevelSelectedAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();

		addGradientColoredArea(
				gcas,
				"FBF8FE", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "F8FBFE", 1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"F5EDFC", 1, LocationType.LOCATION_TYPE_ABSOLUTE_START, "EDF5FC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"EDDEFA", 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "DEEDFA", 3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E7D4F8", 3, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FAFBFC", GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH - 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E5E2E9", GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH - 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "E2E5E9", GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);

		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);

		return gradientColoredAreas;
	}

	/**
	 * The color-areas for primary default elements DecisionLevel
	 */
	private static GradientColoredAreas getDecisionLevelDefaultAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();
		addGradientColoredArea(
				gcas,
				"F8FBFE", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "F8FBFE", 1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"EDF5FC", 1, LocationType.LOCATION_TYPE_ABSOLUTE_START, "EDF5FC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"DEEDFA", 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "DEEDFA", 3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"D4E7F8", 3, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FAFBFC", GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH - 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E2E5E9", GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH - 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "E2E5E9", GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
		return gradientColoredAreas;
	}

	/**
	 * The color-areas for primary default elements InformationSource
	 */
	private static GradientColoredAreas getInformationSourceDefaultAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();
		addGradientColoredArea(
				gcas,
				"FBF8A0", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "F8FBFE", 1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"F5EDA0", 1, LocationType.LOCATION_TYPE_ABSOLUTE_START, "EDF5FC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"EDDEA0", 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "DEEDFA", 3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E7D4A0", 3, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FAFBFC", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E5E2A0", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "E2E5E9", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		

		addGradientColoredArea(
				gcas,
				"FBF8A0", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER, LocationType.LOCATION_TYPE_ABSOLUTE_END, "F8FBFE", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"F5EDA0", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-1, LocationType.LOCATION_TYPE_ABSOLUTE_END, "EDF5FC", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"EDDEA0", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-2, LocationType.LOCATION_TYPE_ABSOLUTE_END, "DEEDFA", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"E7D4A0", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-3, LocationType.LOCATION_TYPE_ABSOLUTE_END, "FAFBFC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"E5E2A0", 2, LocationType.LOCATION_TYPE_ABSOLUTE_END, "E2E5E9", 0, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		
		gradientColoredAreas
			.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
		return gradientColoredAreas;
	}

	/**
	 * The color-areas for primary selected elements InformationSource
	 */
	private static GradientColoredAreas getInformationSourceSelectedAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();

		addGradientColoredArea(
				gcas,
				"EBE890", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "F8FBFE", 1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E5DD90", 1, LocationType.LOCATION_TYPE_ABSOLUTE_START, "EDF5FC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"DDDD90", 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "DEEDFA", 3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"D7C490", 3, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FAFBFC", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"D5D290", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "E2E5E9", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		

		addGradientColoredArea(
				gcas,
				"EBE890", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER, LocationType.LOCATION_TYPE_ABSOLUTE_END, "F8FBFE", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"E5DD90", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-1, LocationType.LOCATION_TYPE_ABSOLUTE_END, "EDF5FC", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"DDDD90", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-2, LocationType.LOCATION_TYPE_ABSOLUTE_END, "DEEDFA", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"D7C490", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER-3, LocationType.LOCATION_TYPE_ABSOLUTE_END, "FAFBFC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				"D5D290", 2, LocationType.LOCATION_TYPE_ABSOLUTE_END, "E2E5E9", 0, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);

		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);

		return gradientColoredAreas;
	}

	/**
	 * The color-areas for primary selected elements DecisionCenter
	 */
	private static GradientColoredAreas getDecisionCenterSelectedAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();

		addGradientColoredArea(
				gcas,
				"FBF8FE", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "F8FBFE", 1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"F5EDFC", 1, LocationType.LOCATION_TYPE_ABSOLUTE_START, "EDF5FC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"EDDEFA", 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "DEEDFA", 3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E7D4F8", 3, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FAFBFC", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E5E2E9", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "E2E5E9", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);

		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);

		return gradientColoredAreas;
	}

	/**
	 * The color-areas for primary default elements DecisionCenter
	 */
	private static GradientColoredAreas getDecisionCenterDefaultAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();
		addGradientColoredArea(
				gcas,
				"F8FBFE", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "F8FBFE", 1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"EDF5FC", 1, LocationType.LOCATION_TYPE_ABSOLUTE_START, "EDF5FC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"DEEDFA", 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "DEEDFA", 3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"D4E7F8", 3, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FAFBFC", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E2E5E9", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "E2E5E9", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
		return gradientColoredAreas;
	}

	/**
	 * The color-areas for primary default elements InformationCenter
	 */
	private static GradientColoredAreas getInformationCenterDefaultAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();
		addGradientColoredArea(
				gcas,
				"FBF8A0", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "F8FBFE", 1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"F5EDA0", 1, LocationType.LOCATION_TYPE_ABSOLUTE_START, "EDF5FC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"EDDEA0", 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "DEEDFA", 3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E7D4A0", 3, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FAFBFC", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E5E2A0", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "E2E5E9", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		
		gradientColoredAreas
			.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
		return gradientColoredAreas;
	}

	/**
	 * The color-areas for primary selected elements InformationCenter
	 */
	private static GradientColoredAreas getInformationCenterSelectedAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();
		addGradientColoredArea(
				gcas,
				"EBE890", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "F8FBFE", 1, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"E5DD90", 1, LocationType.LOCATION_TYPE_ABSOLUTE_START, "EDF5FC", 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"DDDD90", 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "DEEDFA", 3, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"D7C490", 3, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FAFBFC", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				"D5D290", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, "E2E5E9", GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);

		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);

		return gradientColoredAreas;
	}

	/**
	 * The color-areas default for elements InformationSource
	 */
	private static GradientColoredAreas getGridDefaultAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();

		addGradientColoredArea(
				gcas,
				"FFFFFF", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FFFFFF", 0, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);

		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);

		return gradientColoredAreas;
	}

	/**
	 * The color-areas default for elements InformationSource
	 */
	private static GradientColoredAreas getInformationFlowDefaultAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();

		addGradientColoredArea(
				gcas,
				"FFFFFF", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FFFFFF", 0, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);

		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);

		return gradientColoredAreas;
	}



}
