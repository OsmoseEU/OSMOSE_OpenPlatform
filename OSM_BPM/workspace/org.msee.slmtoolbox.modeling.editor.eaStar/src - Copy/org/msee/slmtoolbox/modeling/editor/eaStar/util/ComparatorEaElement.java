package org.msee.slmtoolbox.modeling.editor.eaStar.util;

import java.util.Comparator;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement;

/**
 * Comparator for EaBaseElement
 * @author fto
 *
 */
public class ComparatorEaElement implements Comparator<EaBaseElement> {
	
	/**
	 * Compare a EaBaseElement
	 */
	public int compare(EaBaseElement element1, EaBaseElement element2) {
		if (null == element1.getName()) {
			return -1;
		} else if (null == element2.getName()) {
			return 1;
		} else {
			return element1.getName().compareTo(element2.getName());
		}
	}

}