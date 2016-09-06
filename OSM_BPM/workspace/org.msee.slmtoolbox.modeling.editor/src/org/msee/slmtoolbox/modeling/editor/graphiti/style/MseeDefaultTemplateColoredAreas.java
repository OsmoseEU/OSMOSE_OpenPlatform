package org.msee.slmtoolbox.modeling.editor.graphiti.style;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;
import org.eclipse.graphiti.mm.algorithms.styles.LocationType;

/**
 * Default class for define style color area
 * @author fto
 */
public class MseeDefaultTemplateColoredAreas extends AbstractMsseTemplateColoredAreas {

	/**
	 * Get a prefix for id style
	 * @return
	 */
	public String getPrefixId() {
		return "DEFAULT_";
	}

	/**
	 * Add color to Areaa
	 * 
	 */
	protected void addColorToGradientArea(EList<GradientColoredArea> gcas,
			int[] colorLight, int[] color, int[] colorDark, int[] colorBottom, boolean notSelected) {
		
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
				MseeStylePaintManager.color(color,notSelected), 6, LocationType.LOCATION_TYPE_ABSOLUTE_START, MseeStylePaintManager.color(colorLight,notSelected), 2, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		addGradientColoredArea(
				gcas,
				MseeStylePaintManager.color(colorBottom,notSelected), 2, LocationType.LOCATION_TYPE_ABSOLUTE_END, MseeStylePaintManager.color(colorDark,notSelected), 0, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		
	}
}
