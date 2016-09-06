package org.msee.slmtoolbox.modeling.editor.graigrid.style;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;
import org.eclipse.graphiti.mm.algorithms.styles.LocationType;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGridSize;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.AbstractMsseTemplateColoredAreas;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeStylePaintManager;

/**
 * Default class for define style color area
 * @author fto
 */
public class GgFunctionTemplateColoredAreas extends AbstractMsseTemplateColoredAreas {

	/**
	 * Get a prefix for id style
	 * @return
	 */
	public String getPrefixId() {
		return "GG_FUNCTION_";
	}
	
	/**
	 * Add color to Areaa
	 * 
	 */
	protected void addColorToGradientArea(EList<GradientColoredArea> gcas,
			int[] colorLight, int[] color, int[] colorDark, int[] colorBottom, boolean notSelected) {
		
		/** Area TOP */
		addGradientColoredArea(
				gcas,
				MseeStylePaintManager.color(colorLight,notSelected), 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, MseeStylePaintManager.color(color,notSelected), 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				MseeStylePaintManager.color(color,notSelected), 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, MseeStylePaintManager.color(colorDark,notSelected), 4, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				MseeStylePaintManager.color(colorDark,notSelected), 4, LocationType.LOCATION_TYPE_ABSOLUTE_START, MseeStylePaintManager.color(color,notSelected), 6, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				MseeStylePaintManager.color(color,notSelected), 6, LocationType.LOCATION_TYPE_ABSOLUTE_START, MseeStylePaintManager.color(colorLight,notSelected), GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(
				gcas,
				MseeStylePaintManager.color(colorBottom,notSelected), GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD - 2, LocationType.LOCATION_TYPE_ABSOLUTE_START, MseeStylePaintManager.color(colorDark,notSelected), GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		
		/** Area BOTTOM */
		addGradientColoredArea(
				gcas,
				MseeStylePaintManager.color(colorLight,notSelected), GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER, LocationType.LOCATION_TYPE_ABSOLUTE_END, MseeStylePaintManager.color(color,notSelected), GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER - 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				MseeStylePaintManager.color(color,notSelected), GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER - 2, LocationType.LOCATION_TYPE_ABSOLUTE_END, MseeStylePaintManager.color(colorDark,notSelected), GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER - 4, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				MseeStylePaintManager.color(colorDark,notSelected), GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER - 4, LocationType.LOCATION_TYPE_ABSOLUTE_END, MseeStylePaintManager.color(color,notSelected), GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER - 6, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				MseeStylePaintManager.color(color,notSelected), GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER - 6, LocationType.LOCATION_TYPE_ABSOLUTE_END, MseeStylePaintManager.color(colorLight,notSelected), 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				MseeStylePaintManager.color(colorBottom,notSelected), 2, LocationType.LOCATION_TYPE_ABSOLUTE_END, MseeStylePaintManager.color(colorDark,notSelected), 0, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
	}
}
