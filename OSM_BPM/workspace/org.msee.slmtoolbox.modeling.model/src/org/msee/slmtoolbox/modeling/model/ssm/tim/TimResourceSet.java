package org.msee.slmtoolbox.modeling.model.ssm.tim;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartPackage;

/**
 * ResourceSet for TIM resource
 * @author fto
 *
 */
public class TimResourceSet extends ResourceSetImpl {
	
	/**
	 * Default constructor
	 */
	public TimResourceSet() {
		super();
		this.getPackageRegistry().put(TimPackage.eNS_URI, TimPackage.eINSTANCE);
		this.getPackageRegistry().put(CommonConceptsPackage.eNS_URI, CommonConceptsPackage.eINSTANCE);
		this.getPackageRegistry().put(HumanRelatedPartPackage.eNS_URI, HumanRelatedPartPackage.eINSTANCE);
		this.getPackageRegistry().put(ITRelatedPartPackage.eNS_URI, ITRelatedPartPackage.eINSTANCE);
		this.getPackageRegistry().put(PhysicalMeanRelatedPartPackage.eNS_URI, PhysicalMeanRelatedPartPackage.eINSTANCE);
	}

}
