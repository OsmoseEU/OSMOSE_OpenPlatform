package org.msee.slmtoolbox.modeling.editor.graigrid.properties;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;

public class GgGraphitiPropertyFilter extends AbstractPropertySectionFilter {
	@Override
	protected boolean accept(PictogramElement pe) {
		Object object = Graphiti.getLinkService()
				.getBusinessObjectForLinkedPictogramElement(pe);
		if (object instanceof GgBaseElement) {
			return true;
		}
		return false;
	}
}