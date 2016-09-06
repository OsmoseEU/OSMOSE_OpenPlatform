package org.msee.slmtoolbox.modeling.service.data.ssm.tim;


import org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel;
import org.msee.slmtoolbox.modeling.service.data.AbstractDataService;


/**
 * Implementation BSM data service
 * @author fto
 *
 *
 */
public class TimDataServiceStub extends AbstractDataService implements ITimDataService {
	
	/** log */
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(TimDataServiceStub.class);
	
	/**
	 * Default constructor
	 */
	public TimDataServiceStub() {
		super();
		log.debug("Create a TimDataServiceStub");
	}

	/**
	 * Add a BSM service system mModel in data base
	 * @param ssm		BSM service system mModel
	 */
	public void addServiceSystemModel(TimModel ssm) {
	}


	/**
	 * find a BsmModel by id
	 * @param id	BsmModel id
	 * @return BsmModel
	 */
	public TimModel findServiceSystemModelsById(String id) {
		return null;
	}
}
