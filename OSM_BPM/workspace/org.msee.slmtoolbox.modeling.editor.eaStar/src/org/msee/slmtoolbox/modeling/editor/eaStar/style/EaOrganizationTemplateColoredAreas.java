package org.msee.slmtoolbox.modeling.editor.eaStar.style;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;
import org.eclipse.graphiti.mm.algorithms.styles.LocationType;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.AbstractMsseTemplateColoredAreas;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeStylePaintManager;

/**
 * Default class for define style color area
 * @author fto
 */
public class EaOrganizationTemplateColoredAreas extends AbstractMsseTemplateColoredAreas {

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
				MseeStylePaintManager.color(color,notSelected), 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, MseeStylePaintManager.color(color,notSelected), 0, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
	}
}
