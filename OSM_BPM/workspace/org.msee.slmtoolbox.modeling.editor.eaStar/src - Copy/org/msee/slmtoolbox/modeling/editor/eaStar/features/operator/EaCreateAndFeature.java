package org.msee.slmtoolbox.modeling.editor.eaStar.features.operator;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaCreateFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAnd;

/**
 * Class for logical And operator create feature
 * @author fto
 *
 */
public class EaCreateAndFeature extends AbstractEaCreateFeature {
	public EaCreateAndFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, "AND Logical Operator", "Create AND Logical Operator");
	}

	@Override
	public String getCreateImageId() {
		return EaImageProvider.IMG_AND;
	}

	public Object[] create(ICreateContext context) {
		// create EClass
		EaAnd andOperator = getAppService().createEaAnd(findProcess(),getOrganization(context));
		
		// do the add
		addGraphicalRepresentation(context, andOperator);

		// return newly created business object(s)
		return new Object[] { andOperator };
	}

}
