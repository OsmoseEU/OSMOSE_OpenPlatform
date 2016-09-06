package org.msee.slmtoolbox.modeling.service.app.utils;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaHumanResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaITResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaMaterialResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType;

public class Utils {

	/**
	 * Convert eaStarResource to bsmResource
	 * @param eaStarType	resource type for eaStar
	 * @return a bsm resouce type
	 */
	public static BsmResourceType convertEaStarResourceToBsmResource(
			Class<? extends EaResource> eaStarType) {
		// type bsm
		BsmResourceType bsmType = null;
		
		if (EaHumanResource.class.equals(eaStarType)) {
			bsmType = BsmResourceType.HUMAN;
		} else if (EaITResource.class.equals(eaStarType)) {
			bsmType = BsmResourceType.IT;
		} else if (EaMaterialResource.class.equals(eaStarType)) {
			bsmType = BsmResourceType.PHYSICAL_MEAN;
		} else {
			bsmType = BsmResourceType.UNDEFINED;
		}
		return bsmType;
	}

}
