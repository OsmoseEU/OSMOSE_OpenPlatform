package org.msee.slmtoolbox.modeling.service.data.lang.eastar;

import java.util.List;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.service.data.AbstractDataService;
import org.msee.slmtoolbox.modeling.service.data.exception.ServiceDataException;

/**
 * Implementation EAStar data service
 * @author fto
 *
 */
public class EAStarDataServiceStub extends AbstractDataService implements IEAStarDataService {
	
	/** log */
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(EAStarDataServiceStub.class);
	
	/**
	 * Default constructor
	 */
	public EAStarDataServiceStub() {
		super();
		log.debug("Create a EAStarDataServiceStub");
	}
	
	/**
	 * Find ExtendedActigramModel for a id
	 * @param id		element id
	 * @return ExtendedActigramModel or null if not exist
	 * @throws ServiceDataException	error from database
	 */
	public EaModel findExtendedActigramModel(String id) {
		return null;
	}
	
	/**
	 * Find EAStarExtendedActivity for a id
	 * @param id		element id
	 * @return ExtendedActigramModel or null if not exist
	 * @throws ServiceDataException	error from database
	 */
	public EaExtendedActivity findExtendedActivity(String id) {
		return null;
	}

	/**
	 * Find EAStarResource for a BsmResource and EAStarProcess
	 * @param resource		bsm resource for search
	 * @param process		eaStar proces for search
	 * @param resourceType	resource type : EAStarHuman.class, EAStarIT.class or EAStarMaterial.class
	 * @return EAStarResource or null if not found
	 */
	public EaResource findResource(BsmResource resource, EaProcess process, Class<? extends EaResource> resourceType) {
		return null;
	}

	/**
	 * Find extended activity Children for a process
	 * @param process					process parent
	 * @param type						of extended activity, can be null
	 * @return extended activity Children list of process.
	 * 		   If type isn't null, return only objects of type passed as a parameter
	 */
	public List<EaExtendedActivity> findExtendedActivityList(EaProcess process) {
		return null;
	}

}
