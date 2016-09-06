package org.msee.slmtoolbox.modeling.editor.graphiti.style;

import java.util.Collection;

import org.eclipse.graphiti.mm.StyleContainer;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

/**
 * Abstract class for define all editor style
 * @author fto
 */
public abstract class AbstractStyleUtil {

	/** color constant black */
	protected static final IColorConstant COLOR_BLACK = new ColorConstant(
			0, 0, 0);
	/** default color for a foreground */
	protected static final IColorConstant DEFAULT_TEXT_FOREGROUND = new ColorConstant(
			51, 51, 153);

	/**
	 * find the style with a given id in the style-container, can return null
	 * @param styleContainer	style container
	 * @param id				style id
	 * @return style or null if not found
	 */
	protected static Style findStyle(StyleContainer styleContainer, String id) {
		// find and return style
		Collection<Style> styles = styleContainer.getStyles();
		if (styles != null) {
			for (Style style : styles) {
				if (id.equals(style.getId())) {
					return style;
				}
			}
		}
		return null;
	}
}
