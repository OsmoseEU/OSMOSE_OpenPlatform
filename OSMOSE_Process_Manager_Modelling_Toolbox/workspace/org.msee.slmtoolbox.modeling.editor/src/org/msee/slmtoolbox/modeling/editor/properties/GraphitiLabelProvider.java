/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.msee.slmtoolbox.modeling.editor.properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.ILinkService;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;

/**
 * @author glefur
 */
public class GraphitiLabelProvider extends DecoratingLabelProvider {

	/**
	 * 
	 */
	public GraphitiLabelProvider() {
		super(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()), null);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider#getImage(java.lang.Object)
	 */
	public Image getImage(Object element) {
		return super.getImage(unwrap(element));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object element) {
		return ""; //unwrap(element).toString();
	}

	/**
	 * 
	 */
	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return unwrap(((IStructuredSelection)element).getFirstElement());
		}
		if (element instanceof PictogramElement) {
			PictogramElement pe = (PictogramElement)element;
			ILinkService link = Graphiti.getLinkService();

			EObject eObject = link.getBusinessObjectForLinkedPictogramElement(pe);
			if (eObject == null) {
				if(pe instanceof Shape) {
					Shape shape = (Shape) pe;
					if(shape.getContainer() != null) {
						return unwrap(shape.getContainer());
					}
				} else if(pe instanceof Anchor) {
					Anchor anchor = (Anchor) pe;
					if(anchor.getParent() != null) {
						return unwrap(anchor.getParent());
					}					
				}
			} else {
				return eObject;
			}
		} else if(element instanceof org.eclipse.gef.editparts.AbstractGraphicalEditPart) {
			org.eclipse.gef.editparts.AbstractGraphicalEditPart el = (org.eclipse.gef.editparts.AbstractGraphicalEditPart) element;
			return unwrap(el.getModel());
		}
		
		return element;
	}

}
