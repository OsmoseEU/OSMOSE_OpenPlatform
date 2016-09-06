package org.msee.slmtoolbox.modeling.service.data.ssm.tim;

import org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel;

public interface ITimDataService {


	/**
	 * Add a BSM service system mModel in data base
	 * @param ssm		BSM service system mModel
	 */
	public void addServiceSystemModel(TimModel ssm);


	/**
	 * find a BsmModel by id
	 * @param id	BsmModel id
	 * @return BsmModel
	 */
	public TimModel findServiceSystemModelsById(String id);
}
