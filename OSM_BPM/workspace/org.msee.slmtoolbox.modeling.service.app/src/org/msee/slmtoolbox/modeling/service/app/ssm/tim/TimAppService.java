package org.msee.slmtoolbox.modeling.service.app.ssm.tim;


import org.msee.slmtoolbox.modeling.model.ssm.tim.TimFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;



/**
 * Implementation TIM service
 * @author fto
 *
 */
public class TimAppService extends AbstractAppService {
	
	/** log */
	//private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(TimAppService.class);
	
	/**
	 * Constructor by copie
	 * @param appService with param for service
	 */
	public TimAppService(AbstractAppService appService) {
		super(appService);
	}


	/**
	 * Constructor
	 */
	public TimAppService() {
		super(null);
	}

	/**
	 * Create a new bsm service system model
	 * @param bsmProjectName	project name
	 * @param organizationName	first organization name
	 * @param serviceName		first service name
	 * @return	a new bsm service system model
	 */
	public TimModel createTimModel(
			String timProjectName, String organizationName, String serviceName) {
		// create a TimServiceSystemModel
		TimModel tim = TimFactory.eINSTANCE.createTimModel();
		tim.setName(timProjectName);	
		
		// create an organization
		TimOrganization organization = HumanRelatedPartFactory.eINSTANCE.createTimOrganization();
		organization.setName(organizationName);
		tim.getOrganizations().add(organization);
		organization.setModel(tim);
		
		// create a service
		TimService service = CommonConceptsFactory.eINSTANCE.createTimService();
		service.setName(serviceName);
		tim.getServices().add(service);
		service.setModel(tim);
		
		// add to resource
		if (null != getResource()) {
			getResource().getContents().add(tim);
		}
		
		return tim;
	}
}
