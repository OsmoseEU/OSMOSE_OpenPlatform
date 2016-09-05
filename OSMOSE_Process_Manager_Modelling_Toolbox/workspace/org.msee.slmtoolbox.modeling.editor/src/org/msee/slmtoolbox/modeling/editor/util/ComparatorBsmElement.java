package org.msee.slmtoolbox.modeling.editor.util;

import java.util.Comparator;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement;

/**
 * Comparator for EaBaseElement
 * @author fto
 *
 */
public class ComparatorBsmElement implements Comparator<IBsmNamedElement> {
	
	/**
	 * Compare a EaBaseElement
	 */
	public int compare(IBsmNamedElement element1, IBsmNamedElement element2) {
		if (null == element1.getName()) {
			return -1;
		} else if (null == element2.getName()) {
			return 1;
		} else {
			return element1.getName().compareTo(element2.getName());
		}
	}

}