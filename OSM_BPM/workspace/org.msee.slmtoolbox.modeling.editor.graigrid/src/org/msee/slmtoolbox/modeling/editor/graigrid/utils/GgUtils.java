package org.msee.slmtoolbox.modeling.editor.graigrid.utils;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;

/**
 * Utils class
 * @author fto
 *
 */
public class GgUtils {

	/**
	 * Get string for GgBaseElement graphical text
	 * @param element
	 * @return string for organization graphical text
	 */
	public static String getNameWithCode(GgBaseElement element) {
		StringBuffer text = new StringBuffer();
		if (null != element.getCode() && !"".equals(element.getCode())) {
			 text.append(element.getCode());
			if (null != element.getName() && !"".equals(element.getName())) {
				 text.append(" - ");
				 text.append(element.getName());
			}
		} else  if (null != element.getName() && !"".equals(element.getName())) {
			text.append(element.getName());
		}
		return text.toString();
	}
}
