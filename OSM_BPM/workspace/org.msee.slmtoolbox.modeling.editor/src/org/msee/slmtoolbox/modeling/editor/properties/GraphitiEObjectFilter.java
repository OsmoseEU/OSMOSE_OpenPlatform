package org.msee.slmtoolbox.modeling.editor.properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;

public class GraphitiEObjectFilter extends AbstractPropertySectionFilter {
	@Override
	protected boolean accept(PictogramElement pe) {
		Object object = Graphiti.getLinkService()
				.getBusinessObjectForLinkedPictogramElement(pe);
		if (object instanceof EObject) {
			return !(object instanceof GgFunction);
		}
		return false;
	}
}