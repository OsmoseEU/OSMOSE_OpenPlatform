package org.msee.slmtoolbox.modeling.app.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.LabelProvider;

/**
 * Label provider for IProject list
 * @author fto
 *
 */
public class LabelProjectProvider extends LabelProvider {
	/**
	 * define a text for project element
	 */
	public String getText(Object element) {
		String text = "";
		if (element instanceof IProject) {
			text = ((IProject) element).getName();
		} else {
			text = element == null ? "" : element.toString();
		}
		return text;
	}
}
