package org.msee.slmtoolbox.modeling.editor.eaStar.features.operator;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaCreateFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOr;

/**
 * Class for logical Or operator create feature
 * @author fto
 *
 */
public class EaCreateOrFeature extends AbstractEaCreateFeature {
	public EaCreateOrFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, "OR Logical Operator", "Create OR Logical Operator");
	}

	@Override
	public String getCreateImageId() {
		return EaImageProvider.IMG_OR;
	}

	public Object[] create(ICreateContext context) {
		// create EClass
		EaOr orOperator = getAppService().createEaOr(findProcess(),getOrganization(context));
		
		// do the add
		addGraphicalRepresentation(context, orOperator);

		// return newly created business object(s)
		return new Object[] { orOperator };
	}

}
