package org.msee.slmtoolbox.modeling.editor.eaStar.properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

public class FlowNodeGraphitiPropertyFilter extends	AbstractPropertySectionFilter {
	@Override
	protected boolean accept(PictogramElement pe) {
		Object object = Graphiti.getLinkService()
				.getBusinessObjectForLinkedPictogramElement(pe);
		if (object instanceof EObject) {
			return true;
		}
		return false;
	}
}