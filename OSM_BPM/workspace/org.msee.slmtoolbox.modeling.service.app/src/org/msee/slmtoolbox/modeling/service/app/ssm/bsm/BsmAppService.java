package org.msee.slmtoolbox.modeling.service.app.ssm.bsm;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaHumanResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaITResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaMaterialResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;
import org.msee.slmtoolbox.modeling.service.app.exception.ServiceAppException;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EaDuplicateService;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgDuplicateService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.bean.MseServiceBeanREST;

/**
 * Implementation BSM service
 * @author fto
 *
 */
public class BsmAppService extends AbstractAppService {
	
	/** log */
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(BsmAppService.class);

	/**
	 * Constructor with param configuration
	 * @param serviceConfiguration	object for configuration
	 */
	public BsmAppService(Object serviceConfiguration) {
		super(serviceConfiguration);
	}
	
	/**
	 * Constructor by copie
	 * @param appService with param for service
	 */
	public BsmAppService(AbstractAppService appService) {
		super(appService);
	}

	/**
	 * Constructor
	 */
	public BsmAppService() {
		super(null);
	}

	/**
	 * 
	 * @return
	 */
	public BsmModel findModel() {
		if (null == this.resource) {
			try {
				if (null != getProject()) {
					for (IResource resource : getProject().members()) {
						// find File
						if (resource instanceof IFile
								&& ((IFile) resource).getFileExtension().equals("bsm")) {
							// Open File
							IFile file = (IFile) resource;
							ResourceSet resourceSet = new ResourceSetImpl();
							URI resourceURI = URI.createFileURI(file.getLocation().toFile().getPath());
							this.resource =  resourceSet.getResource(resourceURI, true);
							break;
						}
					}
				}
			} catch (CoreException e) {
				log.error(e);
			}
		}
		BsmModel model = null;
		if (null != this.resource) {
			// find BsmModel in file
			for (final EObject object : this.resource.getContents()) {
				if (object instanceof BsmModel) {
					model = (BsmModel) object; 
					break;
				}
			}
		}
		return model;
	}
	
	/**
	 * Save resource
	 */
	private void saveResource() {
		try {
			if (null != this.resource) {
				this.resource.save(Collections.EMPTY_MAP);
				this.resource = null;
			}
		} catch (IOException e) {
			log.error(e.getMessage());
			throw new ServiceAppException(e);
		}
	}

	/**
	 * Create a new bsm service system model
	 * @param bsmProjectName	project name
	 * @param organizationName	first organization name
	 * @param serviceName		first service name
	 * @return	a new bsm service system model
	 */
	public BsmModel createBsmModel(
			String bsmProjectName, String organizationName, String serviceName) {
		// create a BsmModel
		BsmModel bsm = BsmFactory.eINSTANCE.createBsmModel();
		bsm.setName(bsmProjectName);
		
		// create an organization
		BsmOrganization organization = BsmFactory.eINSTANCE.createBsmEnterprise();
		organization.setName(organizationName);
		bsm.getOrganizations().add(organization);
		
		// create a service
		BsmService service = BsmFactory.eINSTANCE.createBsmService();
		service.setName(serviceName);
		bsm.setService(service);
		
		// add to resource
		if (null != getResource()) {
			getResource().getContents().add(bsm);
		}
		
		return bsm;
	}

	/**
	 * Create a new bsm process in BSM file
	 * @param name	of process
	 * @return bsm process
	 */
	public BsmProcess createBsmProcess(String name) {
		BsmModel model = findModel();
		BsmProcess bsmProcess = BsmFactory.eINSTANCE.createBsmProcess();
		bsmProcess.setName(name);
		model.getProcesses().add(bsmProcess);
		bsmProcess.setBsmModel(model);
		saveResource();
		return bsmProcess;
	}

	/**
	 * Create a new bsm organization in BSM file
	 * @param name			of organization
	 * @param isEnterprise 	organization is a enterprise
	 * @return bsm organization
	 */
	public BsmOrganization createBsmOrganization(String name, boolean isEnterprise) {
		BsmModel model = findModel();
		BsmOrganization bsmOrgnization = null;
		if(isEnterprise) {
			bsmOrgnization = BsmFactory.eINSTANCE.createBsmEnterprise();
		} else {
			bsmOrgnization = BsmFactory.eINSTANCE.createBsmVirtualEnterprise();
		}
		bsmOrgnization.setName(name);
		model.getOrganizations().add(bsmOrgnization);
		bsmOrgnization.setBsmModel(model);
		saveResource();
		return bsmOrgnization;
	}

	/**
	 * Create a new bsm organization in BSM file
	 * @param eaOrganization	source data
	 * @param isEnterprise 		organization is a enterprise
	 * @return bsm organization
	 */
	public BsmOrganization createBsmOrganization(EaOrganization eaOrganization, boolean isEnterprise) {
		BsmOrganization bsmOrgnization = createBsmOrganization(eaOrganization.getName(), isEnterprise);
		addEaOrganizationToOrganization(bsmOrgnization, eaOrganization);
		return bsmOrgnization;
	}

	/**
	 * Create a new bsm resource in BSM file
	 * @param bsmEnterprise 	of resource
	 * @param name				of organization
	 * @param bsmResourceType 	resource type
	 * @return bsm resource
	 */
	public BsmResource createBsmResource(BsmEnterprise bsmEnterprise, String name, BsmResourceType resourceType) {
		BsmModel model = findModel();
		BsmResource bsmResource = BsmFactory.eINSTANCE.createBsmResource();
		bsmResource.setName(name);
		bsmResource.setType(resourceType);
		if (null != bsmEnterprise) {
			for (BsmOrganization bsmSearch :model.getOrganizations()) {
				if (bsmSearch.getId().equals(bsmEnterprise.getId())) {
					((BsmEnterprise)bsmSearch).getResources().add(bsmResource);
					bsmResource.setOrganization((BsmEnterprise)bsmSearch);
					model.getResources().add(bsmResource);
					bsmResource.setBsmModel(model);
					saveResource();
				}
			}
		}
		return bsmResource;
	}
	
	/**
	 * Create a new bsm resource in BSM file
	 * @param name				name resource
	 * @param eaOrganization 	eaOrganization
	 * @param eaResourceType 	eaResourceType
	 * @return bsm resource
	 */
	public BsmResource createBsmResource(String name, EaOrganization eaOrganization, Class<? extends EaResource> eaResourceType) {
		// find organiazation
		BsmEnterprise bsmEnterprise = (BsmEnterprise) getOrganization(eaOrganization);
		// find type
		BsmResourceType bsmResourceType = null;
		if (EaHumanResource.class.equals(eaResourceType)) {
			bsmResourceType = BsmResourceType.HUMAN;
		} else if (EaITResource.class.equals(eaResourceType)) {
			bsmResourceType = BsmResourceType.IT;
		} else if (EaMaterialResource.class.equals(eaResourceType)) {
			bsmResourceType = BsmResourceType.PHYSICAL_MEAN;
		} else {
			bsmResourceType = BsmResourceType.UNDEFINED;
		}
		return createBsmResource(bsmEnterprise, name, bsmResourceType);
	}
	
	/**
	 * Create a new bsm decision structure in BSM file
	 * @param name			of decision structure
	 * @param organization	linked
	 * @return bsm decision structure
	 */
	public BsmDecisionStructure createBsmDecisionStructure(String name,
			BsmOrganization organization) {
		BsmModel model = findModel();
		BsmDecisionStructure bsmDecisionStructure = createBsmDecisionStructure(name);
		// find organization
		if (null != organization) {
			for (BsmOrganization temp : model.getOrganizations()) {
				if (temp.getId().equals(organization.getId())) {
					// create link
					temp.getDecisionStructures().add(bsmDecisionStructure);
					bsmDecisionStructure.getOrganizations().add(temp);
					saveResource();
					break;
				}
			}
		}
		return bsmDecisionStructure;
	}
	
	/**
	 * Create a new bsm decision structure in BSM file
	 * @param name	of decision structure
	 * @return bsm decision structure
	 */
	public BsmDecisionStructure createBsmDecisionStructure(String name) {
		BsmModel model = findModel();
		BsmDecisionStructure bsmDecisionStructure = null;
		if (null != model) {
			// create a bsmDecisionStructure
			bsmDecisionStructure = BsmFactory.eINSTANCE.createBsmDecisionStructure();
			bsmDecisionStructure.setName(name);
			// add link with model
			model.getDecisionStructures().add(bsmDecisionStructure);
			bsmDecisionStructure.setBsmModel(model);
			saveResource();
		}
		return bsmDecisionStructure;
	}
	
	/**
	 * Create a new bsm decision in BSM file
	 * @param name		of decision
	 * @param graiGrid	for decision structure
	 * @return bsm decision
	 */
	public BsmDecision createBsmDecision(String name, GgGraiGrid graiGrid) {
		BsmModel model = findModel();
		BsmDecision bsmDecision = null;
		
		if (null != model && null != graiGrid) {
			// find decision structure
			for (BsmDecisionStructure bsmSearch : model.getDecisionStructures()) {
				for (GgGraiGrid ggSearch : bsmSearch.getGgGraiGrids()) {
					if (ggSearch.getId().equals(graiGrid.getId())) {
						
						// create a bsmDecision
						bsmDecision = BsmFactory.eINSTANCE.createBsmDecision();
						bsmDecision.setName(name);
						// add link with decision structure
						bsmDecision.setDecisionStructure(bsmSearch);
						bsmSearch.getDecisions().add(bsmDecision);
						// add link with model
						bsmDecision.setBsmModel(model);
						model.getDecisions().add(bsmDecision);
						// save
						saveResource();
					}
				}
			}
		}
		return bsmDecision;
	}

	/**
	 * Create a new bsm decision variable in BSM file
	 * @param decision	
	 * @return bsm decision variable
	 */
	public BsmDecisionVariable createDecisionVariable(BsmDecision decision) {
		BsmModel model = findModel();
		BsmDecisionVariable bsmCreate = null;
		
		if (null != decision && null != model) {
			// find decision
			for (BsmDecision bsmSearch : model.getDecisions()) {
				if (bsmSearch.getId().equals(decision.getId())) {
					// create a bsmDecision
					bsmCreate = BsmFactory.eINSTANCE.createBsmDecisionVariable();
					bsmCreate.setName("<new Decision Variable>");
					// add link with decision
					bsmCreate.setDecision(bsmSearch);
					bsmSearch.getVariables().add(bsmCreate);
					// save
					saveResource();
					
				}
			}
		}
		return bsmCreate;
	}

	/**
	 * Create a new bsm decision objective in BSM file
	 * @param decision	
	 * @return bsm decision variable
	 */
	public BsmDecisionObjective createDecisionObjective(BsmDecision decision) {
		BsmModel model = findModel();
		BsmDecisionObjective bsmCreate = null;
		
		if (null != decision && null != model) {
			// find decision
			for (BsmDecision bsmSearch : model.getDecisions()) {
				if (bsmSearch.getId().equals(decision.getId())) {
					// create a bsmDecision
					bsmCreate = BsmFactory.eINSTANCE.createBsmDecisionObjective();
					bsmCreate.setName("<new Decision Objective>");
					// add link with decision
					bsmCreate.setDecision(bsmSearch);
					bsmSearch.getObjectives().add(bsmCreate);
					// save
					saveResource();
					
				}
			}
		}
		return bsmCreate;
	}

	/**
	 * Create a new bsm Performance indicator in BSM file
	 * @param decision	
	 * @return bsm Performance indicator
	 */
	public BsmPerformanceIndicator createPerformanceIndicator(BsmDecision decision) {
		BsmModel model = findModel();
		BsmPerformanceIndicator bsmCreate = null;
		
		if (null != decision && null != model) {
			// find decision
			for (BsmDecision bsmSearch : model.getDecisions()) {
				if (bsmSearch.getId().equals(decision.getId())) {
					// create a bsmDecision
					bsmCreate = BsmFactory.eINSTANCE.createBsmPerformanceIndicator();
					bsmCreate.setName("<new Performance Indicator>");
					// add link with decision
					bsmCreate.setDecision(bsmSearch);
					bsmSearch.getPerformanceIndicators().add(bsmCreate);
					// save
					saveResource();
					
				}
			}
		}
		return bsmCreate;
	}
	
	/**
	 * Get BsmDecision
	 * @param ggDecisionCenter ggDecisionCenter
	 * @return null if not found
	 */
	public BsmDecision getDecision(GgDecisionCenter ggDecisionCenter) {
		if (null != ggDecisionCenter) {
			BsmModel model = findModel();
			// find decision
			for (BsmDecision bsmSearch : model.getDecisions()) {
				for (GgDecisionCenter ggSearch : bsmSearch.getGgDecisionCenters()) {
					if (ggSearch.getId().equals(ggDecisionCenter.getId())) {
						return bsmSearch;
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * Get BsmDecision
	 * @param decision	BsmDecision
	 * @return null if not found
	 */
	public BsmDecision getDecision(BsmDecision decision) {
		if (null != decision) {
			BsmModel model = findModel();
			// find decision
			for (BsmDecision bsmSearch : model.getDecisions()) {
				if (decision.getId().equals(bsmSearch.getId())) {
					return bsmSearch;
				}
			}
		}
		return null;
	}
	
	/**
	 * Get BsmPerformanceIndicator
	 * @param pi	BsmPerformanceIndicator
	 * @return null if not found
	 */
	public BsmPerformanceIndicator getPerformanceIndicator(BsmPerformanceIndicator pi) {
		if (null != pi) {
			BsmDecision decision = getDecision(pi.getDecision());
			// find decision
			for (BsmPerformanceIndicator bsmSearch : decision.getPerformanceIndicators()) {
				if (pi.getId().equals(bsmSearch.getId())) {
					return bsmSearch;
				}
			}
		}
		return null;
	}
	
	/**
	 * Get BsmDecisionObjective
	 * @param objective		BsmDecisionObjective
	 * @return null if not found
	 */
	public BsmDecisionObjective getDecisionObjective(BsmDecisionObjective objective) {
		if (null != objective) {
			BsmDecision decision = getDecision(objective.getDecision());
			// find decision
			for (BsmDecisionObjective bsmSearch : decision.getObjectives()) {
				if (objective.getId().equals(bsmSearch.getId())) {
					return bsmSearch;
				}
			}
		}
		return null;
	}
	
	/**
	 * Get BsmDecisionVariable
	 * @param variable		BsmDecisionVariable
	 * @return null if not found
	 */
	public BsmDecisionVariable getDecisionVariable(BsmDecisionVariable variable) {
		if (null != variable) {
			BsmDecision decision = getDecision(variable.getDecision());
			// find decision
			for (BsmDecisionVariable bsmSearch : decision.getVariables()) {
				if (variable.getId().equals(bsmSearch.getId())) {
					return bsmSearch;
				}
			}
		}
		return null;
	}
	
	
	/**
	 * Get BsmOrganization
	 * @param eaOrganization eaOrganization
	 * @return null if not found
	 */
	public BsmOrganization getOrganization(EaOrganization eaOrganization) {
		if (null != eaOrganization) {
			BsmModel model = findModel();
			// find organiazation
			for (BsmOrganization bsmSearch : model.getOrganizations()) {
				for (EaOrganization eaSearch : bsmSearch.getEaOrganizations()) {
					if (eaSearch.getId().equals(eaOrganization.getId())) {
						return bsmSearch;
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * Get BsmOrganization
	 * @param ggOrganization ggOrganization
	 * @return null if not found
	 */
	public BsmOrganization getOrganization(GgOrganization ggOrganization) {
		if (null != ggOrganization) {
			BsmModel model = findModel();
			// find organiazation
			for (BsmOrganization bsmSearch : model.getOrganizations()) {
				for (GgOrganization ggSearch : bsmSearch.getGgOrganizations()) {
					if (ggSearch.getId().equals(ggOrganization.getId())) {
						return bsmSearch;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Get BsmDecisionStructure
	 * @param ggGraiGrid ggGraiGrid
	 * @return null if not found
	 */
	public BsmDecisionStructure getDecisionStructure(GgGraiGrid ggGraiGrid) {
		if (null != ggGraiGrid) {
			BsmModel model = findModel();
			// find organiazation
			for (BsmDecisionStructure bsmSearch : model.getDecisionStructures()) {
				for (GgGraiGrid ggSearch : bsmSearch.getGgGraiGrids()) {
					if (ggSearch.getId().equals(ggGraiGrid.getId())) {
						return bsmSearch;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Get BsmResource
	 * @param eaResource eaResource
	 * @return null if not found
	 */
	public BsmResource getResource(EaResource eaResource) {
		if (null != eaResource) {
			BsmModel model = findModel();
			// find resource
			for (BsmResource bsmSearch : model.getResources()) {
				for (EaResource eaSearch : bsmSearch.getEaResources()) {
					if (eaSearch.getId().equals(eaResource.getId())) {
						return bsmSearch;
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * Get BsmProcess
	 * @param  eaProcess  eaProcess
	 * @return null if not found
	 */
	public  BsmProcess getProcess(EaProcess eaProcess) {
		if (null != eaProcess) {
			BsmModel model = findModel();
			// find resource
			for (BsmProcess bsmSearch : model.getProcesses()) {
				if (null!= bsmSearch.getEaProcess()
						&& eaProcess.getId().equals(bsmSearch.getEaProcess().getId())) {
					return bsmSearch;
				}
			}
		}
		return null;
	}

	/**
	 * Get a process list for a connector
	 * 
	 * @param process
	 *            root to connector
	 * @param subProcess 
	 * 			is subProcess of process in param
	 * @return a process list
	 */
	public List<BsmProcess> getProcessList(EaProcess process, boolean subProcess) {
		BsmModel model = findModel();
		List<BsmProcess> list = null;
		// find BSM process
		if (null != model) {
			list = new ArrayList<BsmProcess>();
			
			// if need all process
			if (!subProcess) {
				list.addAll(model.getProcesses());
				if (null != process) {
					// remove current
					BsmProcess mainProcess = getProcess(process);
					for (BsmProcess bsmProcess : list) {
						// remove current process
						if (null != bsmProcess.getEaProcess() &&
								bsmProcess.getId().equals(mainProcess.getId())) {
							list.add(bsmProcess);
							break;
						}
					}
				}
			} else {
				BsmProcess mainProcess = null;
				// if need sub process 
				if (null != process) {
					mainProcess = getProcess(process);
					list.addAll(mainProcess.getSubProcess());
				}
				// for process without main
				for (BsmProcess bsmProcess : model.getProcesses()) {
					// process without main
					if (null == bsmProcess.getMainProcess()
							&& (null == mainProcess || !mainProcess.getId().equals(bsmProcess.getId())) ) {
						boolean addProcessToList = true;
						
						// if current process and is current process
						if (null != mainProcess && (bsmProcess.getId().equals(mainProcess.getId()))) {
							addProcessToList = false;
						}
								
						// if current process and is main of current process
						if (null != mainProcess 
								&& null != mainProcess.getMainProcess()
								&& (bsmProcess.getId().equals(mainProcess.getMainProcess().getId()))) {
							addProcessToList = false;
						}
						
						if (addProcessToList) {
							list.add(bsmProcess);
						}
					}
				}
				
			}
		}else {
			list = new ArrayList<BsmProcess>();
		}
		return list;
	}
	
	/**
	 * Get BsmOrganization list
	 * @return list
	 */
	public List<BsmOrganization> getOrganizationList() {
		BsmModel model = findModel();
		if (null != model) {
			return new ArrayList<BsmOrganization>(model.getOrganizations());
		} else {
			return new ArrayList<BsmOrganization>();
		}
	}

	/**
	 * Get BsmEnterprise list
	 * @param	isEnterprise	true for a BsmeEnterprise, false for BsmVirtualEnterprise
	 * @return list
	 */
	public List<BsmOrganization> getOrganizationList(boolean isEnterprise) {
		BsmModel model = findModel();
		List<BsmOrganization> list = new ArrayList<BsmOrganization>();
		if (null != model) {
			for (BsmOrganization organization : model.getOrganizations()) {
				if (isEnterprise && organization instanceof BsmEnterprise) {
					// filter with bsm organization for BsmEnterprise
					list.add(organization);
				} else  if (!isEnterprise && organization instanceof BsmVirtualEnterprise) {
					// filter with bsm organization for BsmEnterprise
					list.add(organization);
				}
			}
		}
		return list;
	}

	/**
	 * Get a list resource can be created
	 * 
	 * @param process
	 *            process source
	 * @param eaOrganization 
	 * 				organization target
	 * @param eaResourceType
	 *            resource type : EaHumanResource.class, EaITResource.class or
	 *            EaMaterialResource.class
	 * @return a resource (Human, IT or Material) list
	 * @throws CoreException 
	 */
	public List<BsmResource> getResourceList(EaProcess process,
			EaOrganization eaOrganization, Class<? extends EaResource> eaResourceType) throws CoreException {
		// find organiazation
		BsmEnterprise bsmEnterprise = (BsmEnterprise) getOrganization(eaOrganization);
		//Find resource type
		BsmResourceType bsmResourceType = null;
		if (EaITResource.class.equals(eaResourceType)) {
			bsmResourceType = BsmResourceType.IT;
		} else if (EaHumanResource.class.equals(eaResourceType)) {
			bsmResourceType = BsmResourceType.HUMAN;
		} else if (EaMaterialResource.class.equals(eaResourceType)) {
			bsmResourceType = BsmResourceType.PHYSICAL_MEAN;
		} else {
			bsmResourceType = BsmResourceType.UNDEFINED;
		}
		// call service
		return getResourceList(bsmEnterprise, bsmResourceType);
	}

	/**
	 * Get BsmResource list
	 * @param bsmOrganization	source
	 * @param bsmResourceType of return element
	 * @return list
	 */
	public List<BsmResource> getResourceList(BsmEnterprise bsmEnterprise, BsmResourceType bsmResourceType) {
		List<BsmResource> list = new ArrayList<BsmResource>();
		if (null != bsmEnterprise) {
			for (BsmResource resource : bsmEnterprise.getResources()) {
				// filter with bsm resource type selected
				if (resource.getType().equals(bsmResourceType)) {
					list.add(resource);
				}
			}
		}
		return list;
	}
	
	/**
	 * Get BsmDecisionStructure list
	 * @param organization	filter BsmDecisionStructure list
	 * @return list
	 */
	public List<BsmDecisionStructure> getDecisionStructureList(BsmOrganization organization) {
		BsmModel model = findModel();
		List<BsmDecisionStructure> list = new ArrayList<BsmDecisionStructure>();
		if (null != model ) {
			for (BsmDecisionStructure decisionStructure : model.getDecisionStructures()) {
				// filter with bsm decisionStructure haven't organization
				// or organization seleted
				if (decisionStructure.getOrganizations().size() == 0) {
					list.add(decisionStructure);
				} else if (null != organization){
					for (BsmOrganization organizationTemp : decisionStructure.getOrganizations()) {
						if (organization.getId().equals(organizationTemp.getId())) {
							list.add(decisionStructure);
							break;
						}
					}
				}
			}
		}
		return list;
	}

	/**
	 * Get BsmDecision list
	 * @param graiGrid 		for select BsmDecisionStructure
	 * @param organization	filter BsmDecisionStructure list
	 * @return list
	 */
	public List<BsmDecision> getDecisionList(GgGraiGrid graiGrid, GgOrganization organization) {
		BsmModel model = findModel();
		List<BsmDecision> list = new ArrayList<BsmDecision>();
		if (null != model) {
			// find BsmDecisionStructure
			BsmDecisionStructure bsmDecisionStructure = getDecisionStructure(graiGrid);
			// for all decision select decision
			for (BsmDecision decision : bsmDecisionStructure.getDecisions()) {
				if (null == decision.getOrganization()) {
					// if decision haven't organization
					list.add(decision);
				} else {
					// if have organization in param
					for (GgOrganization ggSearch : decision.getOrganization().getGgOrganizations()) {
						if (organization.getId().equals(ggSearch.getId())) {
							list.add(decision);
							break;
						}
					}
				}
			}
		}
		return list;
	}

	/**
	 * Add a EaProcess in Ea list of BsmProcess
	 * @param bsmObject		target
	 * @param eaObject		to add
	 */
	public void addEaProcessToProcess(BsmProcess bsmObject, EaProcess eaObject) {
		BsmModel model = findModel();
		if (null != model && null != bsmObject &&  null != eaObject) {
			EaProcess duplicate = EaDuplicateService.duplicate(eaObject, model.eResource());
			// find bsm element in file
			for (BsmProcess bsmProcessSearch : model.getProcesses()) {
				if (bsmObject.getId().equals(bsmProcessSearch.getId())) {
					// add link BSM - EA
					if (null == bsmProcessSearch.getEaProcess()) {
						bsmProcessSearch.setEaProcess(duplicate);
					}
					break;
				}
			}
			saveResource();
		} else {
			log.error("Error with parameter : BsmModel - "+model+"; bsmObject - "+bsmObject+"; eaObject - "+eaObject);
		}
	}

	/**
	 * Add a EaOrganization in Ea list of BsmOrganization
	 * @param bsmObject		target
	 * @param eaObject		to add
	 */
	public void addEaOrganizationToOrganization(BsmOrganization bsmObject,
			EaOrganization eaObject) {
		BsmModel model = findModel();
		if (null != model && null != bsmObject &&  null != eaObject) {
			// find bsm element in file
			for (BsmOrganization bsmSearch : model.getOrganizations()) {
				if (bsmObject.getId().equals(bsmSearch.getId())) {
					// add link BSM - EA if not exit
					for (EaOrganization eaSearch :bsmSearch.getEaOrganizations()) {
						if (eaSearch.getId().equals(eaObject.getId())) {
							// if link exist, don't create a Ea element in Bsm file
							return;
						}
					}
					EaOrganization duplicate = EaDuplicateService.duplicate(eaObject, model.eResource());
					bsmSearch.getEaOrganizations().add(duplicate);
					break;
				}
			}
			saveResource();
		} else {
			log.error("Error with parameter : BsmModel - "+model+"; bsmObject - "+bsmObject+"; eaObject - "+eaObject);
		}
	}

	/**
	 * Add a EaResource in Ea list of BsmResource
	 * @param bsmObject			target
	 * @param eaObject			to add
	 */
	public void addEaResourceToResource(BsmResource bsmObject,
			EaResource eaObject, Class<? extends EaResource> type) {
		BsmModel model = findModel();
		if (null != model && null != bsmObject &&  null != eaObject) {
			// find bsm element in file
			for (BsmResource bsmSearch : model.getResources()) {
				if (bsmObject.getId().equals(bsmSearch.getId())) {
					// add link BSM - EA if not exit
					for (EaResource eaSearch :bsmSearch.getEaResources()) {
						if (eaSearch.getId().equals(eaObject.getId())) {
							// if link exist, don't create a Ea element in Bsm file
							return;
						}
					}
					// add link BSM - EA
					EaResource duplicate = EaDuplicateService.duplicate(eaObject, model.eResource(), type);
					bsmSearch.getEaResources().add(duplicate);
					break;
				}
			}
			saveResource();
		} else {
			log.error("Error with parameter : BsmModel - "+model+"; bsmObject - "+bsmObject+"; eaObject - "+eaObject);
		}
	}

	/**
	 * Add a GgGraiGrid in Gg list of BsmDecisionStructure
	 * @param bsmObject		target
	 * @param ggObject		to add
	 */
	public void addGgGraiGridToDecisionStructure(
			BsmDecisionStructure bsmObject, GgGraiGrid ggObject) {
		BsmModel model = findModel();
		if (null != model && null != bsmObject &&  null != ggObject) {
			// find bsm element in file
			for (BsmDecisionStructure bsmSearch : model.getDecisionStructures()) {
				if (bsmObject.getId().equals(bsmSearch.getId())) {
					// add link BSM - GG
					GgGraiGrid duplicate = GgDuplicateService.duplicate(ggObject, model.eResource());
					bsmSearch.getGgGraiGrids().add(duplicate);
					break;
				}
			}
			saveResource();
		} else {
			log.error("Error with parameter : BsmModel - "+model+"; bsmObject - "+bsmObject
					+"; ggObject - "+ggObject);
		}
	}

	/**
	 * Add a GgOrganization in Gg list of BsmOrganization
	 * @param bsmObject	target
	 * @param ggObject	to add
	 */
	public void addGgOrganizationToOrganization(BsmOrganization bsmObject,
			GgOrganization ggObject) {
		BsmModel model = findModel();
		if (null != model && null != bsmObject &&  null != ggObject) {
			// find bsm element in file
			for (BsmOrganization bsmSearch : model.getOrganizations()) {
				if (bsmObject.getId().equals(bsmSearch.getId())) {
					// add link BSM - GG if not exit
					for (GgOrganization ggSearch :bsmSearch.getGgOrganizations()) {
						if (ggSearch.getId().equals(ggObject.getId())) {
							// if link exist, don't create a Gg element in Bsm file
							return;
						}
					}
					// add link BSM - GG
					GgOrganization duplicate = GgDuplicateService.duplicate(ggObject, model.eResource());
					bsmSearch.getGgOrganizations().add(duplicate);
					break;
				}
			}
			saveResource();
		} else {
			log.error("Error with parameter : BsmModel - "+model+"; bsmObject - "+bsmObject
					+"; ggObject - "+ggObject);
		}
	}

	/**
	 * Add a GgDecisionCenter in Gg list of BsmDecision
	 * @param bsmObject	target
	 * @param ggObject	to add
	 */
	public void addGgDecisionCenterToDecision(BsmDecision bsmObject,
			GgDecisionCenter ggObject) {
		BsmModel model = findModel();
		if (null != model && null != bsmObject &&  null != ggObject) {
			// find bsm element in file
			for (BsmDecision bsmSearch : model.getDecisions()) {
				if (bsmObject.getId().equals(bsmSearch.getId())) {
					// add link BSM - GG if not exit
					for (GgDecisionCenter ggSearch :bsmSearch.getGgDecisionCenters()) {
						if (ggSearch.getId().equals(ggObject.getId())) {
							// if link exist, don't create a Gg element in Bsm file
							return;
						}
					}
					// add link BSM - GG
					GgDecisionCenter duplicate = GgDuplicateService.duplicate(ggObject, model.eResource());
					bsmSearch.getGgDecisionCenters().add(duplicate);
					break;
				}
			}
			saveResource();
		} else {
			log.error("Error with parameter : BsmModel - "+model+"; bsmObject - "+bsmObject
					+"; ggObject - "+ggObject);
		}
	}

	/**
	 * Add relation in a bsmDecisionStructure and a BsmOrganization
	 * @param bsmOrganization		organization
	 * @param bsmDecisionStructure	decisionStructure
	 */
	public void addLinkDecisionStructureAndOrganization(BsmOrganization bsmOrganization,
			BsmDecisionStructure bsmDecisionStructure) {
		BsmModel model = findModel();
		if (null != model && null != bsmDecisionStructure && null != bsmOrganization) {
			// find BsmDecisionStructure
			BsmDecisionStructure bsmDSfind = null;
			for (BsmDecisionStructure bsmSearch : model.getDecisionStructures()) {
				if (bsmDecisionStructure.getId().equals(bsmSearch.getId())) {
					bsmDSfind = bsmSearch;
					break;
				}
			}
			
			// find BsmOrganization
			BsmOrganization bsmOfind = null;
			for (BsmOrganization bsmSearch : model.getOrganizations()) {
				if (bsmOrganization.getId().equals(bsmSearch.getId())) {
					bsmOfind = bsmSearch;
					break;
				}
			}
			
			// link element
			if (null != bsmDSfind && null != bsmOfind
					&& !bsmOfind.getDecisionStructures().contains(bsmDSfind)) {
				bsmDSfind.getOrganizations().add(bsmOfind);
				bsmOfind.getDecisionStructures().add(bsmDSfind);
				saveResource();
			}
		} else {
			log.error("Error with parameter : BsmModel - "+model+"; bsmObject - "+bsmOrganization
					+"; bsmObject - "+bsmDecisionStructure);
		}
		
	}

	public void addLinkDecisionStructureAndOrganization(GgGraiGrid graiGrid,
			BsmOrganization bsmOrganization) {
		BsmModel model = findModel();
		if (null != model && null != graiGrid && null != bsmOrganization ) {
			// find BsmDecisionStructure
			BsmDecisionStructure bsmDSfind = null;
			for (BsmDecisionStructure bsmSearch : model.getDecisionStructures()) {
				for (GgGraiGrid ggSearch : bsmSearch.getGgGraiGrids()) {
					if (graiGrid.getId().equals(ggSearch.getId())) {
						bsmDSfind = bsmSearch;
						break;
					}
				}
			}
			addLinkDecisionStructureAndOrganization(bsmOrganization, bsmDSfind);
		} else {
			log.error("Error with parameter : BsmModel - "+model+"; bsmObject - "+bsmOrganization
					+"; ggObject - "+graiGrid);
		}
	}

	/**
	 * Add relation in a BsmDecision and a BsmOrganization
	 * @param ggOrganization		for find BsmOrganization
	 * @param bsmDecision			decision
	 */
	public void addLinkDecisionAndOrganization(GgOrganization ggOrganization,
			BsmDecision bsmDecision) {
		BsmModel model = findModel();
		if (null != model && null != ggOrganization && null != bsmDecision) {
			// find BsmDecision
			BsmDecision bsmDecisionfind = null;
			for (BsmDecision bsmSearch : model.getDecisions()) {
				if (bsmDecision.getId().equals(bsmSearch.getId())) {
					bsmDecisionfind = bsmSearch;
					break;
				}
			}
			
			// find BsmOrganization
			BsmOrganization bsmOrganizationfind = null;
			for (BsmOrganization bsmSearch : model.getOrganizations()) {
				for (GgOrganization ggmSearch : bsmSearch.getGgOrganizations()) {
					if (ggOrganization.getId().equals(ggmSearch.getId())) {
						bsmOrganizationfind = bsmSearch;
						break;
					}
				}
			}

			// link element
			if (null != bsmDecisionfind && null != bsmOrganizationfind
					&& !bsmOrganizationfind.getDecisions().contains(bsmDecisionfind)) {
				bsmDecisionfind.setOrganization(bsmOrganizationfind);
				bsmOrganizationfind.getDecisions().add(bsmDecisionfind);
				saveResource();
			}
		} else {
			log.error("Error with parameter : BsmModel - "+model+"; bsmObject - "+bsmDecision
					+"; ggObject - "+ggOrganization);
		}
		
	}

	/**
	 * Add relation in a BsmOrganization and a BsmProcess
	 * @param bsmOrganization		organization
	 * @param eaProcess				for find BsmProcess
	 */
	public void addLinkOrganizationAndProcess(BsmOrganization bsmOrganization,
			EaProcess eaProcess) {
		BsmModel model = findModel();
		if (null != model && null!= bsmOrganization && null != eaProcess) {
			// find BsmOrganization
			BsmOrganization bsmOrganizationfind = null;
			for (BsmOrganization bsmSearch : model.getOrganizations()) {
				if (null != bsmSearch &&
						bsmOrganization.getId().equals(bsmSearch.getId())) {
					bsmOrganizationfind = bsmSearch;
					break;
				}
			}
			
			// find BsmProcess
			BsmProcess bsmProcessfind = null;
			for (BsmProcess bsmSearch : model.getProcesses()) {
				if (null != bsmSearch.getEaProcess()
						&& eaProcess.getId().equals(bsmSearch.getEaProcess().getId())) {
					bsmProcessfind = bsmSearch;
					break;
				}
			}

			// link element
			if (null != bsmOrganizationfind && null != bsmProcessfind
					&& !bsmProcessfind.getOrganizations().contains(bsmOrganizationfind)) {
				bsmProcessfind.getOrganizations().add(bsmOrganizationfind);
				bsmOrganizationfind.getProcesses().add(bsmProcessfind);
				saveResource();
			}
		} else {
			log.error("Error with parameter : BsmModel - "+model+"; bsmObject - "+bsmOrganization
					+"; eaObject - "+eaProcess);
		}
	}

	/**
	 * Add relation in a BsmResource and a BsmProcess
	 * @param bsmResource				resource
	 * @param eaProcess				for find BsmProcess
	 */
	public void addLinkResourceAndProcess(BsmResource bsmResource,
			EaProcess eaProcess) {
		BsmModel model = findModel();
		if (null != model && null!= bsmResource && null != eaProcess) {
			// find BsmResource
			BsmResource bsmResourcefind = null;
			for (BsmResource bsmSearch : model.getResources()) {
				if (bsmResource.getId().equals(bsmSearch.getId())) {
					bsmResourcefind = bsmSearch;
					break;
				}
			}
			
			// find BsmProcess
			BsmProcess bsmProcessfind = null;
			for (BsmProcess bsmSearch : model.getProcesses()) {
				if (null != bsmSearch.getEaProcess() &&
						eaProcess.getId().equals(bsmSearch.getEaProcess().getId())) {
					bsmProcessfind = bsmSearch;
					break;
				}
			}

			// link element
			if (null != bsmResourcefind && null != bsmProcessfind
					&& !bsmProcessfind.getOrganizations().contains(bsmResourcefind)) {
				bsmProcessfind.getResources().add(bsmResourcefind);
				bsmResourcefind.getProcesses().add(bsmProcessfind);
				saveResource();
			}
		} else {
			log.error("Error with parameter : BsmModel - "+model+"; bsmObject - "+bsmResource
					+"; eaObject - "+eaProcess);
		}
	}
	
	/**
	 * Add relation in BsmProcess, main and sub
	 * @param eaMain			main
	 * @param eaSub				sub
	 */
	public void addLinkMainAndSub(EaProcess eaMain, EaProcess eaSub) {
		BsmProcess bsmMain = getProcess(eaMain);
		BsmProcess bsmSub = getProcess(eaSub);
		BsmModel model = findModel();
		if (null != model && null!= bsmMain && null != bsmSub) {
			// add link if not exist
			if (!bsmMain.getSubProcess().contains(bsmSub)) {
				bsmMain.getSubProcess().add(bsmSub);
				bsmSub.setMainProcess(bsmMain);
				//save modification
				saveResource();
			}
			
		} else {
			log.error("Error with object found : BsmModel - "+model+"; bsmObject - "+bsmMain
					+"; bsmObject - "+bsmSub);
		}
	}

	/**
	 * Update data BSM with modified  object
	 * @param object	modified  object
	 */
	public void updateData(GgOrganization object) {
		if (null != object) {
			// find bsm object
			BsmOrganization bsmObject = getOrganization(object);
			// update data
			bsmObject.setName(object.getName());
			for (GgOrganization ggsearch : bsmObject.getGgOrganizations()) {
				if (ggsearch.getId().equals(object.getId())) {
					ggsearch.setName(object.getName());
					break;
				}
			}
			//save data
			saveResource();
		} else {
			log.error("Error with parameter : GgObject - "+ object);
		}
	}

	/**
	 * Remove data BSM with removed  object
	 * @param object	removed  object
	 */
	public void remove(GgOrganization object) {
		if (null != object) {
			// find bsm object
			BsmOrganization bsmObject = getOrganization(object);
			if (null != bsmObject) {
				// remove data
				for (GgOrganization ggsearch : bsmObject.getGgOrganizations()) {
					if (ggsearch.getId().equals(object.getId())) {
						bsmObject.getGgOrganizations().remove(ggsearch);
						this.resource.getContents().remove(ggsearch);
						break;
					}
				}
				//save data
				saveResource();
			}
		} else {
			log.error("Error with parameter : GgObject - "+ object);
		}
	}
	

	/**
	 * Update data BSM with modified  object
	 * @param object	modified  object
	 */
	public void updateData(GgDecisionCenter object) {
		if (null != object) {
			// find bsm object
			BsmDecision bsmObject = getDecision(object);
			// update data
			bsmObject.setName(object.getName());
			for (GgDecisionCenter ggsearch : bsmObject.getGgDecisionCenters()) {
				if (ggsearch.getId().equals(object.getId())) {
					ggsearch.setName(object.getName());
					break;
				}
			}
			//save data
			saveResource();
		} else {
			log.error("Error with parameter : GgObject - "+ object);
		}
	}

	/**
	 * Remove data BSM with removed  object
	 * @param object	removed  object
	 */
	public void remove(GgDecisionCenter object) {
		if (null != object) {
			// find bsm object
			BsmDecision bsmObject = getDecision(object);
			if (null != bsmObject) {
				// remove data
				for (GgDecisionCenter ggsearch : bsmObject.getGgDecisionCenters()) {
					if (ggsearch.getId().equals(object.getId())) {
						bsmObject.getGgDecisionCenters().remove(ggsearch);
						this.resource.getContents().remove(ggsearch);
						break;
					}
				}
				//save data
				saveResource();
			}
		} else {
			log.error("Error with parameter : GgObject - "+ object);
		}
	}
	
	/**
	 * Update data BSM with modified  object
	 * @param object	modified  object
	 */
	public void updateData(GgGraiGrid object) {
		if (null != object) {
			// find bsm object
			BsmDecisionStructure bsmObject = getDecisionStructure(object);
			// update data
			bsmObject.setName(object.getName());
			for (GgGraiGrid ggsearch : bsmObject.getGgGraiGrids()) {
				if (ggsearch.getId().equals(object.getId())) {
					ggsearch.setName(object.getName());
					break;
				}
			}
			//save data
			saveResource();
		} else {
			log.error("Error with parameter : GgObject - "+ object);
		}
	}

	/**
	 * Update data BSM with modified  object
	 * @param object	modified  object
	 */
	public void updateData(EaResource object) {
		if (null != object) {
			// find bsm object
			BsmResource bsmObject = getResource(object);
			
			// update data
			bsmObject.setName(object.getName());
			
			for (EaResource easearch : bsmObject.getEaResources()) {
				if (easearch.getId().equals(object.getId())) {
					easearch.setName(object.getName());
					break;
				}
			}
			//save data
			saveResource();
		} else {
			log.error("Error with parameter : EaObject - "+ object);
		}
	}
	
	/**
	 * Update object BSM with data  BSM
	 * @param object	to modify
	 */
	public void updateEa(EaResource object) {
		if (null != object) {
			// find bsm object
			BsmResource bsmObject = getResource(object);
			// test data
			if (null != bsmObject) {
				object.setName(bsmObject.getName());
			}
		} else {
			log.error("Error with parameter : EaObject - "+ object);
		}
	}

	/**
	 * Update data BSM with modified  object
	 * @param object	modified  object
	 */
	public void updateOrganization(EaResource object) {
		if (null != object) {
			// find bsm object
			BsmResource bsmObject = getResource(object);
			
			// updata BsmOrganization
			BsmOrganization organizationNew = getOrganization(object.getOrganization());
			BsmOrganization organizationOld = bsmObject.getOrganization();
			if (null!=organizationNew) {
				// if organization of EaResource if not bsm organization
				if (!organizationNew.getId().equals(organizationOld.getId())
						&& organizationNew instanceof BsmEnterprise
						&& organizationOld instanceof BsmEnterprise) {
					// move BsmResource
					//BsmEnterprise enterpriseOld = (BsmEnterprise) organizationOld;
					BsmEnterprise enterpriseNew = (BsmEnterprise) organizationNew;
					//enterpriseOld.getResources().remove(bsmObject);
					enterpriseNew.getResources().add(bsmObject);
				}
			}
			//save data
			saveResource();
		} else {
			log.error("Error with parameter : EaObject - "+ object);
		}
	}

	/**
	 * Remove data BSM with removed  object
	 * @param process 	modified process
	 * @param resource	removed  object
	 */
	public void remove(EaProcess process, EaResource resource) {
		// find bsm object
		BsmResource bsmResource = getResource(resource);
		BsmProcess bsmProcess = getProcess(process);
		if (null != bsmResource && null != bsmProcess) {
			// remove data
			if (null != bsmResource && null != bsmProcess) {
				for (EaResource easearch : bsmResource.getEaResources()) {
					if (easearch.getId().equals(resource.getId())) {
						//remove ea object
						bsmResource.getEaResources().remove(easearch);
						this.resource.getContents().remove(easearch);
						//remove bsm object
						bsmProcess.getResources().remove(bsmResource);
						bsmResource.getProcesses().remove(bsmProcess);
						break;
					}
				}
			}
			//save data
			saveResource();
		} else {
			log.error("Error with finded parameter : BsmResource - "+bsmResource + " BsmProcess - "+ bsmProcess);
		}
	}

	/**
	 * Update data BSM with modified  object
	 * @param object	modified  object
	 */
	public void updateData(EaOrganization object) {
		if (null != object) {
			// find bsm object
			BsmOrganization bsmObject = getOrganization(object);
			// update data
			bsmObject.setName(object.getName());
			for (EaOrganization easearch : bsmObject.getEaOrganizations()) {
				if (easearch.getId().equals(object.getId())) {
					easearch.setName(object.getName());
					break;
				}
			}
			//save data
			saveResource();
		} else {
			log.error("Error with parameter : EaObject - "+ object);
		}
	}

	/**
	 * Remove data BSM with removed  object
	 * @param process 	modified process
	 * @param object	removed  object
	 */
	public void remove(EaProcess process, EaOrganization organization) {
		// find bsm object
		BsmOrganization bsmOrgnization = getOrganization(organization);
		BsmProcess bsmProcess = getProcess(process);
		if (null != bsmOrgnization && null != bsmProcess) {
			// remove data
			if (null != bsmOrgnization && null != bsmProcess) {
				for (EaOrganization easearch : bsmOrgnization.getEaOrganizations()) {
					if (easearch.getId().equals(organization.getId())) {
						//remove ea object
						bsmOrgnization.getEaOrganizations().remove(easearch);
						this.resource.getContents().remove(easearch);
						//remove bsm object
						bsmProcess.getResources().remove(bsmOrgnization);
						bsmOrgnization.getProcesses().remove(bsmProcess);
						break;
					}
				}
			}
			//save data
			saveResource();
		} else {
			log.error("Error with finded parameter : BsmOrganization - " + bsmOrgnization + " BsmProcess - " + bsmProcess);
		}
		
	}

	/**
	 * Update data BSM with modified  object
	 * @param object	modified  object
	 */
	public void updateData(EaProcess object) {
		if (null != object) {
			// find bsm object
			BsmProcess bsmObject = getProcess(object);
			
			if (null != bsmObject) {
				// update data
				bsmObject.setName(object.getName());
				bsmObject.getEaProcess().setName(object.getName());
				bsmObject.getEaProcess().setCode(object.getCode());
				bsmObject.getEaProcess().setDecompositionCode(object.getDecompositionCode());
				//save data
				saveResource();
			}
		} else {
			log.error("Error with parameter : EaObject - "+ object);
		}
	}
	
	/**
	 * Update data BSM with modified  object
	 * @param object	modified  object
	 */
	public void updateOrganization(EaProcess process,
			EaOrganization organization) {
		// add link in process and organization
		BsmOrganization bsmOrganization = getOrganization(organization);
		addLinkOrganizationAndProcess(bsmOrganization, process);
	}

	/**
	 * Need update data for bsm
	 * @param object
	 * @return true if object isn't synchronized with the data BSM
	 */
	public boolean needUpdate(GgBaseElement object) {
		if (null != object) {
			// find bsm object
			IBsmNamedElement bsmObject = getBsm(object);
			// test data
			if (null != bsmObject) {
				return !bsmObject.getName().equals(object.getName());
			}
		} else {
			log.error("Error with parameter : GgObject - "+ object);
		}
		return true;
	}
	
	/**
	 * Update object BSM with data  BSM
	 * @param object	to modify
	 */
	public void updateGg(GgBaseElement object) {
		if (null != object) {
			// find bsm object
			IBsmNamedElement bsmObject = getBsm(object);
			// test data
			if (null != bsmObject) {
				object.setName(bsmObject.getName());
			}
		} else {
			log.error("Error with parameter : GgObject - "+ object);
		}
	}

	/**
	 * Need update data for bsm
	 * @param object
	 * @return true if object isn't synchronized with the data BSM
	 */
	public boolean needUpdate(EaBaseElement object) {
		if (null != object) {
			// find bsm object
			IBsmNamedElement bsmObject = getBsm(object);
			// test data
			if (null != bsmObject) {
				// update EaProcess
				if (bsmObject instanceof BsmProcess && object instanceof EaProcess) {
					EaProcess eaProcess = (EaProcess)object;
					BsmProcess bsmProcess = (BsmProcess)bsmObject;
					return !bsmProcess.getName().equals(eaProcess.getName())
							|| null == bsmProcess.getEaProcess().getCode() 
								&& null != eaProcess.getCode()
							|| null != bsmProcess.getEaProcess().getCode() 
								&& !bsmProcess.getEaProcess().getCode().equals(eaProcess.getCode())
							|| null == bsmProcess.getEaProcess().getDecompositionCode() 
								&& null != eaProcess.getDecompositionCode()
							|| null != bsmProcess.getEaProcess().getDecompositionCode() 
								&& !bsmProcess.getEaProcess().getDecompositionCode().equals(eaProcess.getDecompositionCode());
				} else {
					return !bsmObject.getName().equals(object.getName());
				}
			}
		} else {
			log.error("Error with parameter : EaObject - "+ object);
		}
		return true;
	}

	/**
	 * Update object BSM with data  BSM
	 * @param object	to modify
	 */
	public void updateEa(EaBaseElement object) {
		if (null != object) {
			// find bsm object
			IBsmNamedElement bsmObject = getBsm(object);
			// test data
			if (null != bsmObject) {
				object.setName(bsmObject.getName());
				// update for EaProcess
				if (bsmObject instanceof BsmProcess && object instanceof EaProcess) {
					EaProcess eaProcess = (EaProcess)object;
					BsmProcess bsmProcess = (BsmProcess)bsmObject;
					eaProcess.setCode(bsmProcess.getEaProcess().getCode());
					eaProcess.setDecompositionCode(bsmProcess.getEaProcess().getDecompositionCode());
				}
			}
		} else {
			log.error("Error with parameter : EaObject - "+ object);
		}
	}
	
	/**
	 * Get a BsmObject for a GgBaseElement object
	 * @param object
	 * @return bull if not found
	 */
	private IBsmNamedElement getBsm(GgBaseElement object) {
		if (object instanceof GgOrganization) {
			return getOrganization((GgOrganization) object);
		} else if (object instanceof GgGraiGrid) {
			return getDecisionStructure((GgGraiGrid) object);
		} else if (object instanceof GgDecisionCenter) {
			return getDecision((GgDecisionCenter) object);
		}
		return null;
	}
	
	/**
	 * Get a BsmObject for an EaBaseElement object
	 * @param object
	 * @return bull if not found
	 */
	private IBsmNamedElement getBsm(EaBaseElement object) {
		if (object instanceof EaOrganization) {
			return getOrganization((EaOrganization) object);
		} else if (object instanceof EaProcess) {
			return getProcess((EaProcess) object);
		} else if (object instanceof EaResource) {
			return getResource((EaResource) object);
		}
		return null;
	}
	
	/**
	 * Get organization's name if eaBaseElement hav'nt good organization
	 * @param bo
	 * @return null if it is good organization
	 */
	public String getOrganizationNameIfnotGood(EaResource eaBaseElement) {
		BsmResource bsmResource = getResource(eaBaseElement);
		BsmOrganization organization = getOrganization(eaBaseElement.getOrganization());
		
		if (null != organization && null != bsmResource) {
			if (!organization.getId().equals(bsmResource.getOrganization().getId())) {
				return bsmResource.getOrganization().getName();
			}
		}
		
		return null;
	}

	/**
	 * find EaProcess, main process in bsm for EaProcess id in param
	 * @param eaProcessId		id for search
	 * @return	null if not found
	 */
	public EaProcess findMainProcess(String eaProcessId) {

		BsmModel model = findModel();
		if (null != model && null != eaProcessId) {
			// find resource
			for (BsmProcess bsmSearch : model.getProcesses()) {
				if (null!= bsmSearch.getEaProcess()
						&& eaProcessId.equals(bsmSearch.getEaProcess().getId())) {
					BsmProcess mainProcess = bsmSearch.getMainProcess();
					if (null != mainProcess
							&& null != mainProcess.getEaProcess()) {
						return mainProcess.getEaProcess();
					} else {
						return null;
					}
				}
			}
		} else {
			log.error("Error with finded parameter : BsmModel - "+model + " EaProcessId - "+ eaProcessId);
		}
		return null;
	}
	
	/**
	 * Find all variables for BsmDecision
	 * @param center	for find the BsmDecision
	 * @return 
	 */
	public List<BsmDecisionVariable> findVariables(GgDecisionCenter center) {
		List<BsmDecisionVariable> list = new ArrayList<BsmDecisionVariable>();
		// find decision
		BsmDecision decision = getDecision(center);
		// if decision return variable
		if (null != decision) {
			list.addAll(decision.getVariables());
		}
		return list;
	}
	
	/**
	 * Update variable in bsm model
	 * @param bsmDecision		 variable's decision
	 * @param elementUpdate			
	 */
	public void updateVariable(BsmDecision bsmDecision, BsmDecisionVariable elementUpdate) {
		// find decision
		BsmDecision decision = getDecision(bsmDecision);
		if (null != decision && null != elementUpdate) {
		// find variable
			for(BsmDecisionVariable bsmSearch : decision.getVariables()) {
				if (bsmSearch.getId().equals(elementUpdate.getId())) {
					// update data
					bsmSearch.setDescription(elementUpdate.getDescription());
					bsmSearch.setName(elementUpdate.getName());
					// save data
					saveResource();
					break;
				}
			}
		} else {
			log.error("Error with finded parameter : BsmObject - "+bsmDecision + " BsmObject - "+ elementUpdate);
		}
	}
	
	/**
	 * Remove variable in bsm model
	 * @param bsmDecision		 variable's decision
	 * @param deleteElement		to remove
	 */
	public void removeVariable(BsmDecision bsmDecision, BsmDecisionVariable deleteElement) {
		// find decision
		BsmDecision decision = getDecision(bsmDecision);
		if (null != decision && null != deleteElement) {
		// find variable
			for(BsmDecisionVariable bsmSearch : decision.getVariables()) {
				if (bsmSearch.getId().equals(deleteElement.getId())) {
					// remove variable all PI
					for (int i= bsmSearch.getPerformanceIndicators().size()-1;i>=0;i--) {
						BsmPerformanceIndicator bsmPI = bsmSearch.getPerformanceIndicators().get(i);
						bsmPI.getVariables().remove(bsmSearch);
					}
					// remove variable
					decision.getVariables().remove(bsmSearch);
					// save data
					saveResource();
					break;
				}
			}
		} else {
			log.error("Error with finded parameter : BsmObject - "+bsmDecision + " BsmObject - "+ deleteElement);
		}
	}
	
	/**
	 * Find all objectives for BsmDecision
	 * @param center	for find the BsmDecision
	 * @return
	 */
	public List<BsmDecisionObjective> findObjectives(GgDecisionCenter center) {
		List<BsmDecisionObjective> list = new ArrayList<BsmDecisionObjective>();
		// find decision
		BsmDecision decision = getDecision(center);
		// if decision return variable
		if (null != decision) {
			list.addAll(decision.getObjectives());
		}
		return list;
	}
	
	/**
	 * Update objective in bsm model
	 * @param bsmDecision		objective's decision
	 * @param elementUpdate 	to update
	 */
	public void updateObjective(BsmDecision bsmDecision, BsmDecisionObjective elementUpdate) {
		// find decision
		BsmDecision decision = getDecision(bsmDecision);
		if (null != decision && null != elementUpdate) {
			// find objective
			for(BsmDecisionObjective bsmSearch : decision.getObjectives()) {
				if (bsmSearch.getId().equals(elementUpdate.getId())) {
					// update data
					bsmSearch.setDescription(elementUpdate.getDescription());
					bsmSearch.setName(elementUpdate.getName());
					bsmSearch.setDescription(elementUpdate.getDescription());
					// save data
					saveResource();
					break;
				}
			}
		} else {
			log.error("Error with finded parameter : BsmObject - "+ bsmDecision + " BsmObject - "+ elementUpdate);
		}
		
	}
	
	/**
	 * Remove objective in bsm model
	 * @param bsmDecision		objective's decision
	 * @param deleteElement 	to remove
	 */
	public void removeObjective(BsmDecision bsmDecision, BsmDecisionObjective deleteElement) {
		// find decision
		BsmDecision decision = getDecision(bsmDecision);
		if (null != decision && null != deleteElement) {
		// find objective
			for(BsmDecisionObjective bsmSearch : decision.getObjectives()) {
				if (bsmSearch.getId().equals(deleteElement.getId())) {
					// remove objective all PI
					for (int i= bsmSearch.getPerformanceIndicators().size()-1;i>=0;i--) {
						BsmPerformanceIndicator bsmPI = bsmSearch.getPerformanceIndicators().get(i);
						bsmPI.getObjectives().remove(bsmSearch);
					}
					// remove objective
					decision.getObjectives().remove(bsmSearch);
					// save data
					saveResource();
					break;
				}
			}
		} else {
			log.error("Error with finded parameter : BsmObject - "+bsmDecision + " BsmObject - "+ deleteElement);
		}
	}

	/**
	 * Find all Performance indicator for BsmDecision
	 * @param center	for find the BsmDecision
	 * @return
	 */
	public List<BsmPerformanceIndicator> findPerformanceIndicator(
			GgDecisionCenter center) {
		List<BsmPerformanceIndicator> list = new ArrayList<BsmPerformanceIndicator>();
		// find decision
		BsmDecision decision = getDecision(center);
		// if decision return variable
		if (null != decision) {
			list.addAll(decision.getPerformanceIndicators());
		}
		return list;
	}
	
	/**
	 * Update Performance indicator in bsm model
	 * @param bsmDecision		objective's decision
	 * @param elementUpdate		to update
	 */
	public void updatePerformanceIndicator(BsmDecision bsmDecision, BsmPerformanceIndicator elementUpdate) {
		// find decision
		BsmDecision decision = getDecision(bsmDecision);
		if (null != decision && null != elementUpdate) {
			// find objective
			for(BsmPerformanceIndicator bsmSearch : decision.getPerformanceIndicators()) {
				if (bsmSearch.getId().equals(elementUpdate.getId())) {
					// update data
					bsmSearch.setDescription(elementUpdate.getDescription());
					bsmSearch.setName(elementUpdate.getName());
					bsmSearch.setDescription(elementUpdate.getDescription());
					// save data
					saveResource();
					break;
				}
			}
		} else {
			log.error("Error with finded parameter : BsmObject - "+ bsmDecision + " BsmObject - "+ elementUpdate);
		}
		
	}

	/**
	 * Remove Performance indicator in bsm model
	 * @param bsmDecision		objective's decision
	 * @param deleteElement		to remove
	 */
	public void removePerformanceIndicator(BsmDecision bsmDecision, BsmPerformanceIndicator deleteElement) {
		// find decision
		BsmDecision decision = getDecision(bsmDecision);
		if (null != decision && null != deleteElement) {
		// find objective
			for(BsmPerformanceIndicator bsmSearch : decision.getPerformanceIndicators()) {
				if (bsmSearch.getId().equals(deleteElement.getId())) {
					// remove PI all variable
					for (int i= bsmSearch.getVariables().size()-1;i>=0;i--) {
						BsmDecisionVariable bsmDV = bsmSearch.getVariables().get(i);
						bsmDV.getPerformanceIndicators().remove(bsmSearch);
					}
					// remove objective all variable
					for (int i= bsmSearch.getObjectives().size()-1;i>=0;i--) {
						BsmDecisionObjective bsmObjective = bsmSearch.getObjectives().get(i);
						bsmObjective.getPerformanceIndicators().remove(bsmSearch);
					}
					// remove PI
					decision.getPerformanceIndicators().remove(bsmSearch);
					// save data
					saveResource();
					break;
				}
			}
		} else {
			log.error("Error with finded parameter : BsmObject - "+bsmDecision + " BsmObject - "+ deleteElement);
		}
	}

	/**
	 * Add link in BsmPerformanceIndicator and BsmDecisionObjective
	 * @param bsmPi			BsmPerformanceIndicator target
	 * @param elementToAdd	BsmDecisionObjective target
	 */
	public void addLinkPiAndObjective(BsmPerformanceIndicator bsmPi,
			BsmDecisionObjective elementToAdd) {
		// find BsmDecision
		BsmPerformanceIndicator bsmPerformanceIndicator = getPerformanceIndicator(bsmPi);
		BsmDecisionObjective bsmDecisionObjective = getDecisionObjective(elementToAdd);
		if (null != bsmPerformanceIndicator && null != bsmDecisionObjective) {
			// if need add
			if (!bsmPerformanceIndicator.getObjectives().contains(bsmDecisionObjective)) {
				// add
				bsmPerformanceIndicator.getObjectives().add(bsmDecisionObjective);
				bsmDecisionObjective.getPerformanceIndicators().add(bsmPerformanceIndicator);
				saveResource();
			}
		} else {
			log.error("Error with parameter : BsmObject - "+bsmPerformanceIndicator
					+"; bsmObject - "+bsmDecisionObjective);
		}
		
	}

	/**
	 * Remove link in BsmPerformanceIndicator and BsmDecisionObjective
	 * @param bsmPi				BsmPerformanceIndicator target
	 * @param elementToRemove	BsmDecisionObjective target
	 */
	public void removeLinkPiAndObjective(BsmPerformanceIndicator bsmPi,
			BsmDecisionObjective elementToRemove) {
		// find elements
		BsmPerformanceIndicator bsmPerformanceIndicator = getPerformanceIndicator(bsmPi);
		BsmDecisionObjective bsmDecisionObjective = getDecisionObjective(elementToRemove);
		if (null != bsmPerformanceIndicator && null != bsmDecisionObjective) {
			// if need remove
			if (bsmPerformanceIndicator.getObjectives().contains(bsmDecisionObjective)) {
				// remove
				bsmPerformanceIndicator.getObjectives().remove(bsmDecisionObjective);
				bsmDecisionObjective.getPerformanceIndicators().remove(bsmPerformanceIndicator);
				saveResource();
			}
		} else {
			log.error("Error with parameter : BsmObject - "+bsmPerformanceIndicator
					+"; bsmObject - "+bsmDecisionObjective);
		}
		
	}

	/**
	 * Add link in BsmPerformanceIndicator and BsmDecisionVariable
	 * @param bsmPi			BsmPerformanceIndicator target
	 * @param elementToAdd	BsmDecisionVariable target
	 */
	public void addLinkPiAndVariable(BsmPerformanceIndicator bsmPi,
			BsmDecisionVariable elementToAdd) {
		// find elements
		BsmPerformanceIndicator bsmPerformanceIndicator = getPerformanceIndicator(bsmPi);
		BsmDecisionVariable bsmDecisionVariable = getDecisionVariable(elementToAdd);
		if (null != bsmPerformanceIndicator && null != bsmDecisionVariable) {
			// if need add
			if (!bsmPerformanceIndicator.getVariables().contains(bsmDecisionVariable)) {
				// add
				bsmPerformanceIndicator.getVariables().add(bsmDecisionVariable);
				bsmDecisionVariable.getPerformanceIndicators().add(bsmPerformanceIndicator);
				saveResource();
			}
		} else {
			log.error("Error with parameter : BsmObject - "+bsmPerformanceIndicator
					+"; bsmObject - "+bsmDecisionVariable);
		}
	}

	/**
	 * Remove link in BsmPerformanceIndicator and BsmDecisionVariable
	 * @param bsmPi				BsmPerformanceIndicator target
	 * @param elementToRemove	BsmDecisionVariable target
	 */
	public void removeLinkPiAndVariable(BsmPerformanceIndicator bsmPi,
			BsmDecisionVariable elementToRemove) {
		// find elements
		BsmPerformanceIndicator bsmPerformanceIndicator = getPerformanceIndicator(bsmPi);
		BsmDecisionVariable bsmDecisionVariable = getDecisionVariable(elementToRemove);
		if (null != bsmPerformanceIndicator && null != bsmDecisionVariable) {
			// if need remove
			if (bsmPerformanceIndicator.getVariables().contains(bsmDecisionVariable)) {
				// remove
				bsmPerformanceIndicator.getVariables().remove(bsmDecisionVariable);
				bsmDecisionVariable.getPerformanceIndicators().remove(bsmPerformanceIndicator);
				saveResource();
			}
		} else {
			log.error("Error with parameter : BsmObject - "+bsmPerformanceIndicator
					+"; bsmObject - "+bsmDecisionVariable);
		}
	}

	/**
	 * Add a PerformanceIndicator to Decision
	 * @param bsmDecision	target
	 * @param bsmPi			to add
	 */
	public void addPerformanceIndicatorToDecision(BsmDecision bsmDecision,
			BsmPerformanceIndicator bsmPi) {
		BsmModel model = findModel();
		
		if (null != bsmPi && null != bsmDecision && null != model) {
			// add default name if not name
			if (null == bsmPi.getName() || "".equals(bsmPi.getName())) {
				bsmPi.setName("<new Performance Indicator>");
			}
			// find decision
			for (BsmDecision bsmSearch : model.getDecisions()) {
				if (bsmSearch.getId().equals(bsmDecision.getId())) {
					// create a bsmDecision
					// add link with decision
					bsmPi.setDecision(bsmSearch);
					bsmSearch.getPerformanceIndicators().add(bsmPi);
					// save
					saveResource();
					return;
				}
			}
		} else {
			log.error("Error with parameter : BsmObject - "+ model
					+ "; bsmObject - " + bsmDecision
					+ "; bsmObject - " + bsmPi);
		}
	}

	/**
	 * Forcing reload resource
	 */
	public void reload() {
		if (null != this.resource){
			this.resource = null;
		}
	}

	/**
	 * @param businessObject business object testing
	 * @return true if businessObject can open a MseServiceWizard
	 */
	public boolean canOpenMseServiceWizard(EaProcess eaProcess) {
		IBsmNamedElement bsmElement = getBsm(eaProcess);
		if (bsmElement instanceof BsmProcess) {
			return !haveMseService(eaProcess);
		} else {
			return false;
		}
	}


	/**
	 * Save MseService in Bsm data, create an Organization if not exist.
	 * @param activity		activity for find BsmProcess and BsmOrganization
	 * @param mseService	Mse to save
	 */
	public void saveMseService(EaStructuralExtendedActivity activity,
			MseServiceBeanREST mseService) {
		BsmModel model = findModel();
		BsmProcess bsmProcess = getProcess(activity.getIsA());
		if (null != bsmProcess && null != mseService && null != model) {
			// remove Mse Service is exit
			if (null != bsmProcess.getMseService()) {
				BsmMseService oldMseService =  bsmProcess.getMseService();
				BsmOrganization oldOrgnization = oldMseService.getOrganization();
				oldOrgnization.getMseService().remove(oldMseService);
			}
			
			// find BsmOrganization with name
			BsmOrganization bsmOrganization = findOrganizationByName(mseService.owner);
			// if not exit
			if (null == bsmOrganization && null != activity.getOrganization()) {
				//create bsmOrgnization
				bsmOrganization = BsmFactory.eINSTANCE.createBsmEnterprise();
				bsmOrganization.setName(mseService.owner);
				model.getOrganizations().add(bsmOrganization);
				bsmOrganization.setBsmModel(model);
			} else if(null == activity.getOrganization()) {
				log.error("Error with parameter : EaStructuralExtendedActivity - "+ activity
						+ " not have organization");
			}
			// create BsmMseService
			BsmMseService bsmMseService = BsmFactory.eINSTANCE.createBsmMseService();
			bsmMseService.setName(mseService.name);
			bsmMseService.setOwner(mseService.owner);
			bsmMseService.setDescription(mseService.description);
			bsmMseService.setCreateDate(mseService.created);
			bsmMseService.setPublishedDate(mseService.publishedDate);
			bsmMseService.setPublished(((Long)mseService.published).intValue());
			
			// add mseService
			bsmMseService.setOrganization(bsmOrganization);
			bsmOrganization.getMseService().add(bsmMseService);
			bsmMseService.setProcess(bsmProcess);
			bsmProcess.setMseService(bsmMseService);
			// save
			saveResource();
		} else {
			log.error("Error with parameter : BsmModel - "+ model
					+ "; BsmProcess - " + bsmProcess
					+ "; BsmMseService - " + mseService);
		}
		
	}
	
	public void saveMseServiceToResource(EaResource resource,
			MseServiceBeanREST mseService) {
		BsmModel model = findModel();
		BsmResource bsmResource = getResource(resource);
		if (null != bsmResource && null != mseService && null != model) {
			// remove Mse Service is exit
			if (null != bsmResource.getMseService()) {
				BsmMseService oldMseService =  bsmResource.getMseService();
				BsmOrganization oldOrgnization = oldMseService.getOrganization();
				oldOrgnization.getMseService().remove(oldMseService);
			}
			
			// find BsmOrganization with name
			BsmOrganization bsmOrganization = findOrganizationByName(mseService.owner);
			// if not exit
			if (null == bsmOrganization && null != resource.getOrganization()) {
				//create bsmOrgnization
				bsmOrganization = BsmFactory.eINSTANCE.createBsmEnterprise();
				bsmOrganization.setName(mseService.owner);
				model.getOrganizations().add(bsmOrganization);
				bsmOrganization.setBsmModel(model);
			} else if(null == resource.getOrganization()) {
				log.error("Error with parameter : EaStructuralExtendedActivity - "+ resource
						+ " not have organization");
			}
			// create BsmMseService
			BsmMseService bsmMseService = BsmFactory.eINSTANCE.createBsmMseService();
			bsmMseService.setName(mseService.name);
			bsmMseService.setOwner(mseService.owner);
			bsmMseService.setDescription(mseService.description);
			bsmMseService.setCreateDate(mseService.created);
			bsmMseService.setPublishedDate(mseService.publishedDate);
			bsmMseService.setPublished(((Long)mseService.published).intValue());
			
			// add mseService
			bsmMseService.setOrganization(bsmOrganization);
			bsmOrganization.getMseService().add(bsmMseService);
			bsmMseService.setResource(bsmResource);
			bsmResource.setMseService(bsmMseService);
			// save
			saveResource();
		} else {
			log.error("Error with parameter : BsmModel - "+ model
					+ "; BsmProcess - " + bsmResource
					+ "; BsmMseService - " + mseService);
		}
		
	}

	/**
	 * Find a organization by name
	 * @param organizarionName
	 * @return
	 */
	private BsmOrganization findOrganizationByName(String organizarionName) {
		BsmModel model = findModel();
		if (null != organizarionName && null != model) {
			for (BsmOrganization bsmSearch : model.getOrganizations()) {
				if (organizarionName.equals(bsmSearch.getName())
						&& bsmSearch instanceof BsmEnterprise) {
					return bsmSearch;
				}
			}
		} else {
			log.error("Error with parameter : BsmModel - "+ model
					+ "; organizarionName - " + organizarionName);
		}
		return null;
	}

	/**
	 * @param eaProcess for find BsmProcess
	 * @return true if Bsm Process have au Bsm Mse service
	 */
	public boolean haveMseService(EaProcess eaProcess) {
		BsmProcess bsmProcess = getProcess(eaProcess);
		if (null != bsmProcess && null != bsmProcess.getMseService()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Get a MseService of process
	 * @param eaProcess for search
	 * @return null if not found
	 */
	public BsmMseService getMseService(EaProcess eaProcess) {
		BsmProcess bsmProcess = getProcess(eaProcess);
		if (null != bsmProcess) {
			return bsmProcess.getMseService();
		} else {
			return null;
		}
	}
	
	public BsmMseService getMseService(EaResource resource) {
		BsmResource bsmResource = getResource(resource);
		if (null != bsmResource) {
			return bsmResource.getMseService();
		} else {
			return null;
		}
	}
	
}
