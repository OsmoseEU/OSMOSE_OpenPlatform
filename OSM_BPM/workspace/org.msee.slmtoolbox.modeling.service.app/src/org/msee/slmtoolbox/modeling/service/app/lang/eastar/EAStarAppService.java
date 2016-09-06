package org.msee.slmtoolbox.modeling.service.app.lang.eastar;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAnd;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaControlFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExternalConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaHumanResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaITResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaInternalConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaMaterialResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOr;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOutputInputFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmRESTService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.bean.MseAssetClassBeanREST;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.bean.MseServiceBeanREST;
import org.msee.slmtoolbox.modeling.service.app.utils.PreferencesServices;
import org.msee.slmtoolbox.modeling.service.app.utils.PropertiesServices.RestUrl;

/**
 * Implementation Extended Actigram Star service
 * 
 * @author fto
 * 
 */
public class EAStarAppService extends AbstractAppService {

	EaFindElement findElementService;

	/**
	 * Default Constructor
	 */
	public EAStarAppService() {
	}

	/**
	 * Constructor by copie
	 * 
	 * @param appService
	 *            with param for service
	 */
	public EAStarAppService(AbstractAppService appService) {
		super(appService);
		this.findElementService = new EaFindElement();
	}

	/**
	 * Constructor with param configuration
	 * 
	 * @param serviceConfiguration
	 *            object for configuration
	 */
	public EAStarAppService(Object serviceConfiguration) {
		super(serviceConfiguration);
		this.findElementService = new EaFindElement();
	}

	/**
	 * Create a model in new diagram for a structural
	 * 
	 * @param newDiagram
	 *            target
	 * @param structuralActivity
	 *            source can be null
	 * @return a model
	 */
	public EaModel createEaModel(Diagram newDiagram,
			EaStructuralExtendedActivity structuralActivity) {
		// create EaModel and EaProcess
		EaModel model = RootFactory.eINSTANCE.createEaModel();
		EaProcess process = createEaProcess(structuralActivity.getIsA(),
				newDiagram.eResource());
		model.setProcess(process);
		process.setModel(model);
		newDiagram.eResource().getContents().add(model);

		if (null != structuralActivity) {
			// clone data
			model.setName(structuralActivity.getName());
			model.setCode(structuralActivity.getCode());
			model.setDescription(structuralActivity.getDescription());
			process.setName(structuralActivity.getName());
			process.setCode(structuralActivity.getCode());
			process.setDescription(structuralActivity.getDescription());

			// duplicate default organization
			if (null != structuralActivity.getOrganization()) {
				EaOrganization organization = EaDuplicateService
						.duplicate(structuralActivity.getOrganization());
				model.getOrganizations().add(organization);
				organization.setModel(model);
			}

			// duplicate new process
			if (null == structuralActivity.getIsA()) {
				EaProcess duplicate = EaDuplicateService.duplicate(process,
						structuralActivity.eResource());
				structuralActivity.setIsA(duplicate);
			}
		}

		return model;
	}

	/**
	 * Create a model in new diagram for a process
	 * 
	 * @param newDiagram
	 *            target
	 * @param structuralActivity
	 *            source can be null
	 * @return a model
	 */
	public EaModel createEaModel(Diagram newDiagram,
			EaProcessConnector connector) {
		// create EaModel and EaProcess
		EaModel model = RootFactory.eINSTANCE.createEaModel();
		EaProcess process = createEaProcess(connector.getProcessRef(),
				newDiagram.eResource());
		model.setProcess(process);
		process.setModel(model);
		newDiagram.eResource().getContents().add(model);

		if (null != connector) {
			// clone data
			model.setName(connector.getName());
			model.setCode(connector.getCode());
			model.setDescription(connector.getDescription());
			process.setName(connector.getName());
			process.setCode(connector.getCode());
			process.setDescription(connector.getDescription());

			// duplicate default organization
			if (null != connector.getOrganization()) {
				EaOrganization organization = EaDuplicateService
						.duplicate(connector.getOrganization());
				model.getOrganizations().add(organization);
				organization.setModel(model);
			}

			// duplicate new process
			if (null == connector.getProcessRef()) {
				EaProcess duplicate = EaDuplicateService.duplicate(process,
						connector.eResource());
				connector.setProcessRef(duplicate);
			}
		}

		return model;
	}

	/**
	 * Create model with a structural activity
	 * 
	 * @param structuralActivity
	 *            data source
	 * @return an EA* model
	 */
	public EaModel createEaModelForStructuralActivity(
			EaStructuralExtendedActivity structuralActivity) {
		// create the process
		EaProcess process = createEaProcess(structuralActivity.getName());
		// define the model
		EaModel model = process.getModel();
		model.setCode(structuralActivity.getCode());
		model.setDescription(structuralActivity.getDescription());
		// duplicate the process
		process.setDescription(structuralActivity.getDescription());
		process.setCode(structuralActivity.getCode());
		// duplicate the structural
		EaStructuralExtendedActivity activityDuplicate = EaDuplicateService
				.duplicate(structuralActivity, null);

		process.setCanBe(activityDuplicate);
		activityDuplicate.setIsA(process);

		return model;
	}

	/**
	 * Create a EaProcess
	 * 
	 * @param bsmProcess
	 *            bsm process reference
	 * @return new process
	 */
	public EaProcess createEaProcess(BsmProcess bsmProcess) {
		// create the process
		EaProcess process = createEaProcess(bsmProcess.getName());
		if (null != bsmProcess.getEaProcess()) {
			process.setId(bsmProcess.getEaProcess().getId());
			process.setCode(bsmProcess.getEaProcess().getCode());
			process.setDecompositionCode(bsmProcess.getEaProcess()
					.getDecompositionCode());
		}

		return process;
	}

	/**
	 * Create a EaProcess
	 * 
	 * @param processName
	 *            process name
	 * @return new process
	 */
	public EaProcess createEaProcess(String processName) {
		// create model
		EaModel model = RootFactory.eINSTANCE.createEaModel();
		// create process
		EaProcess process = GeneralElementsFactory.eINSTANCE.createEaProcess();
		// set data
		process.setName(processName);
		process.setModel(model);
		model.setProcess(process);
		model.setName(processName);
		return process;
	}

	/**
	 * Create a EaProcess
	 * 
	 * @param processReference
	 *            process reference
	 * @param resource
	 *            new diagram resource
	 * @return new or duplicate process
	 */
	public EaProcess createEaProcess(EaProcess processReference,
			Resource resource) {
		// create process for EA* diagram
		EaProcess process;
		if (null != processReference) {
			process = EaDuplicateService.duplicate(processReference, resource);
		} else {
			process = GeneralElementsFactory.eINSTANCE.createEaProcess();
		}

		return process;
	}

	/**
	 * Create a EaAnd for a EaProcess
	 * 
	 * @param process
	 *            EAProcess
	 * @param eaOrganization
	 * @return EaAnd
	 */
	public EaAnd createEaAnd(EaProcess process, EaOrganization eaOrganization) {
		// item return
		EaAnd flowNode = CoreElementsFactory.eINSTANCE.createEaAnd();
		// init
		flowNode.setName("new And Operator");
		process.getFlowElements().add(flowNode);
		// add to orgnization
		if (null != eaOrganization) {
			flowNode.setOrganization(eaOrganization);
			eaOrganization.getFlowNode().add(flowNode);
		}
		// return
		return flowNode;
	}

	/**
	 * Create a EaOr for a EaProcess
	 * 
	 * @param process
	 *            EaProcess
	 * @param eaOrganization
	 *            organization
	 * @return EaOr
	 */
	public EaOr createEaOr(EaProcess process, EaOrganization eaOrganization) {
		// item return
		EaOr flowNode = CoreElementsFactory.eINSTANCE.createEaOr();
		// init
		flowNode.setName("new Or Operator");
		process.getFlowElements().add(flowNode);
		// add to orgnization
		if (null != eaOrganization) {
			flowNode.setOrganization(eaOrganization);
			eaOrganization.getFlowNode().add(flowNode);
		}
		// return
		return flowNode;
	}

	/**
	 * Create a EaAtomicExtendedActivity for a EaProcess and organization
	 * 
	 * @param process
	 * @param eaOrganization
	 *            organization
	 * @return
	 */
	public EaAtomicExtendedActivity createEaAtomicExtendedActivity(
			EaProcess process, EaOrganization eaOrganization) {
		// item return
		EaAtomicExtendedActivity flowNode = CoreElementsFactory.eINSTANCE
				.createEaAtomicExtendedActivity();
		// init
		flowNode.setName("new Atomic Extended Activity");
		process.getFlowElements().add(flowNode);
		// add to orgnization
		if (null != eaOrganization) {
			flowNode.setOrganization(eaOrganization);
			eaOrganization.getFlowNode().add(flowNode);
		}
		// return
		return flowNode;
	}

	/**
	 * Create a EaOrganization for a EaModel
	 * 
	 * @param model
	 *            EaModel
	 * @return EaOrganization
	 */
	public EaOrganization createEaOrganization(EaModel model) {
		// item return
		EaOrganization organization = CoreElementsFactory.eINSTANCE
				.createEaOrganization();
		// init
		organization.setName("new Organization");
		organization.setModel(model);
		model.getOrganizations().add(organization);
		// return
		return organization;
	}

	public EaOrganization createEaOrganization(EaModel model, String name) {
		EaOrganization organization = createEaOrganization(model);
		organization.setName(name);
		return organization;
	}

	/**
	 * Create a InternalConnector for a EaProcess
	 * 
	 * @param process
	 *            EaProcess
	 * @param eaOrganization
	 *            organization
	 * @return InternalConnector
	 */
	public EaInternalConnector createInternalConnector(EaProcess process,
			EaOrganization eaOrganization) {
		// item return
		EaInternalConnector flowNode = CoreElementsFactory.eINSTANCE
				.createEaInternalConnector();
		// init
		flowNode.setName("new Internal Connector");
		process.getFlowElements().add(flowNode);
		// add to orgnization
		if (null != eaOrganization) {
			flowNode.setOrganization(eaOrganization);
			eaOrganization.getFlowNode().add(flowNode);
		}
		// return
		return flowNode;
	}

	/**
	 * Create an ExternalConnector for a EaProcess
	 * 
	 * @param process
	 *            EaProcess
	 * @param eaOrganization
	 *            organization
	 * @return ExternalConnector
	 */
	public EaExternalConnector createExternalConnector(EaProcess process,
			EaOrganization eaOrganization) {
		// item return
		EaExternalConnector flowNode = CoreElementsFactory.eINSTANCE
				.createEaExternalConnector();
		// init
		flowNode.setName("new External Connector");
		process.getFlowElements().add(flowNode);
		// add to orgnization
		if (null != eaOrganization) {
			flowNode.setOrganization(eaOrganization);
			eaOrganization.getFlowNode().add(flowNode);
		}
		// return
		return flowNode;
	}

	/**
	 * Create a control flow
	 * 
	 * @param process
	 *            process
	 * @param source
	 *            flow source
	 * @param target
	 *            flow target
	 * @return a control flow
	 */
	public EaFlow createControlFlow(EaProcess process, EaFlowNode source,
			EaFlowNode target) {
		return createFlow(process, source, target, EaControlFlow.class);
	}

	/**
	 * Create a support flow
	 * 
	 * @param process
	 *            process
	 * @param source
	 *            flow source
	 * @param target
	 *            flow target
	 * @return a support flow
	 */
	public EaFlow createSupportFlow(EaProcess process, EaFlowNode source,
			EaFlowNode target) {
		return createFlow(process, source, target, EaSupportFlow.class);
	}

	/**
	 * Create a input output flow
	 * 
	 * @param process
	 *            process
	 * @param source
	 *            flow source
	 * @param target
	 *            flow target
	 * @return a input output flow
	 */
	public EaFlow createInputOutputFlow(EaProcess process, EaFlowNode source,
			EaFlowNode target) {
		return createFlow(process, source, target, EaOutputInputFlow.class);
	}

	/**
	 * Create a flow
	 * 
	 * @param process
	 *            process
	 * @param source
	 *            flow source
	 * @param target
	 *            flow target
	 * @param flowClass
	 *            flow class
	 * @return a EaFlow
	 */
	private EaFlow createFlow(EaProcess process, EaFlowNode source,
			EaFlowNode target, Class<? extends EaFlow> flowType) {
		// item return

		EaFlow flow = null;
		EList<EaFlow> inFlows = null;
		boolean responsibleExists = false;
		// test is OutputInput Flow
		if (EaOutputInputFlow.class.equals(flowType))
			flow = CoreElementsFactory.eINSTANCE.createEaOutputInputFlow();
		// test if Control flow
		else if (EaControlFlow.class.equals(flowType))
			flow = CoreElementsFactory.eINSTANCE.createEaControlFlow();
		// else it is a Support flow
		else {
			flow = CoreElementsFactory.eINSTANCE.createEaSupportFlow();
			// test if a resource is responsible for the target EaFlowNode
			inFlows = target.getInFlows();
			for (EaFlow eaFlow : inFlows) {
				if (eaFlow instanceof EaSupportFlow) {
					if (((EaSupportFlow) eaFlow).getResourceRole().equals(
							EaResourceRole.RESPONSIBLE_FOR)) {
						responsibleExists = true;
						break;
					}
				}
			}
			if (responsibleExists)
				((EaSupportFlow) flow)
						.setResourceRole(EaResourceRole.PARTICIPATES_IN);
		}
		// init
		flow.setName("new flow");
		flow.setSource(source);
		flow.setTarget(target);
		process.getFlowElements().add(flow);
		// return
		return flow;
	}

	/**
	 * Create a ProcessConnector for a EaProcess
	 * 
	 * @param process
	 *            diagram process
	 * @param processReference
	 *            process target
	 * @param eaOrganization
	 *            organization
	 * @return ProcessConnector
	 */
	public EaProcessConnector createEaProcessConnector(EaProcess process,
			BsmProcess processReference, EaOrganization eaOrganization) {
		// find process connector in process for a processref
		EaProcessConnector flowNode = this.findElementService
				.findProcessConnector(process, processReference);
		if (null == flowNode) {
			// if not exit create a process connector
			flowNode = CoreElementsFactory.eINSTANCE.createEaProcessConnector();
			// create a process for connector
			EaProcess newProcess = null;
			// find EaProcess
			if (null != processReference.getEaProcess()) {
				newProcess = EaDuplicateService.duplicate(
						processReference.getEaProcess(), process.eResource());
			} else {
				// if not exit create and add to bsm
				newProcess = GeneralElementsFactory.eINSTANCE.createEaProcess();
				newProcess.setName(processReference.getName());
				process.eResource().getContents().add(newProcess);
			}

			// set data structural
			flowNode.setProcessRef(newProcess);
			flowNode.setName(processReference.getName());
			// set element to diagram
			process.getFlowElements().add(flowNode);

			// add to orgnization
			if (null != eaOrganization) {
				flowNode.setOrganization(eaOrganization);
				eaOrganization.getFlowNode().add(flowNode);
			}
		}
		return flowNode;
	}

	/**
	 * Create a ExtendedActivity for a EAProcess
	 * 
	 * @param process
	 *            diagram process
	 * @param processReference
	 *            process target
	 * @param eaOrganization
	 *            organization
	 * @return ExtendedActivity
	 */
	public EaStructuralExtendedActivity getOrCreateEaStructuralExtendedActivity(
			EaProcess process, BsmProcess processReference,
			EaOrganization eaOrganization) {
		// find process connector in process for a processref
		EaStructuralExtendedActivity flowNode = this.findElementService
				.findStructuralExtendedActivity(process, processReference);
		if (null == flowNode) {
			// if not exit create a structural activity
			flowNode = CoreElementsFactory.eINSTANCE
					.createEaStructuralExtendedActivity();
			// create a process for structural
			EaProcess newProcess = null;
			// find EaProcess
			if (null != processReference.getEaProcess()) {
				newProcess = EaDuplicateService.duplicate(
						processReference.getEaProcess(), process.eResource());
			} else {
				// if not exit create and add to bsm
				newProcess = GeneralElementsFactory.eINSTANCE.createEaProcess();
				newProcess.setName(processReference.getName());
				process.eResource().getContents().add(newProcess);
			}
			newProcess.setCanBe(flowNode);
			// set data structural
			flowNode.setIsA(newProcess);
			flowNode.setName(processReference.getName());
			// set element to diagram
			process.getFlowElements().add(flowNode);

			// add to orgnization
			if (null != eaOrganization) {
				flowNode.setOrganization(eaOrganization);
				eaOrganization.getFlowNode().add(flowNode);
			}
		}
		return flowNode;
	}

	/**
	 * Get or create resource
	 * 
	 * @param process
	 *            eaStar process
	 * @param eaOrganization
	 *            resource's organization
	 * @param resourceType
	 *            resource type : EaHumanResource.class, EaITResource.class or
	 *            EaMaterialResource.class
	 * @param bsmResource
	 *            resource (bsm and eaStar) name
	 * @return a EaResource (EaHumanResource, EaITResource or
	 *         EaMaterialResource)
	 */
	public EaResource getOrCreateResource(EaProcess process,
			EaOrganization eaOrganization,
			Class<? extends EaResource> resourceType, BsmResource bsmResource) {

		EaResource resource = this.findElementService.findResource(process,
				bsmResource);
		// if not exist,
		if (null == resource) {
			// create element
			if (EaHumanResource.class.equals(resourceType)) {
				resource = CoreElementsFactory.eINSTANCE
						.createEaHumanResource();
			} else if (EaITResource.class.equals(resourceType)) {
				resource = CoreElementsFactory.eINSTANCE.createEaITResource();
			} else if (EaMaterialResource.class.equals(resourceType)) {
				resource = CoreElementsFactory.eINSTANCE
						.createEaMaterialResource();
			} else {
				// TODO create an exception
			}

			if (null != resource) {
				resource.setName(bsmResource.getName());
				process.getFlowElements().add(resource);

				if (null != eaOrganization) {
					eaOrganization.getFlowNode().add(resource);
					resource.setOrganization(eaOrganization);
				}
			}

		}

		return resource;
	}

	/**
	 * Get organization existing in process or create a new process
	 * 
	 * @param process
	 *            process source
	 * @param bsmReference
	 *            bsm element reference
	 * @param name
	 *            name for new element
	 * @return a organization
	 */
	public EaOrganization getOrCreateOrganization(EaProcess process,
			BsmOrganization bsmReference, String name) {

		EaOrganization orgnization = null;
		if (null != bsmReference) {
			// find element if exist in process
			orgnization = this.findElementService.findOrgnization(process,
					bsmReference);
		}
		// if not exist
		if (null == orgnization) {
			// create element
			orgnization = CoreElementsFactory.eINSTANCE.createEaOrganization();
			orgnization.setName(name);
			if (null != process.getModel()) {
				process.getModel().getOrganizations().add(orgnization);
			}
		}

		return orgnization;
	}

	/**
	 * Find a eaStar element in ressource
	 * 
	 * @param bo
	 *            object business
	 * @return null if bo isn't a EAStarBaseElement
	 * @author fto
	 * @param bo
	 */
	public static EaBaseElement findBOEAStarInRessourceDiagram(Diagram diagram,
			EObject bo) {
		// For a uriBO
		URI uriBo = EcoreUtil.getURI(bo);
		// In diagram's ressource
		ResourceSet resourceSetDiagram = diagram.eResource().getResourceSet();
		// find a EAStar element
		EObject element = resourceSetDiagram.getEObject(uriBo, true);
		if (element instanceof EaBaseElement) {
			return (EaBaseElement) element;
		} else {
			return null;
		}
	}

	/**
	 * Find Process in file
	 * 
	 * @param resourceSet
	 *            resource set
	 * @param processId
	 *            id process
	 * @return null or the file with a diagram for a process with id
	 */
	public IFile findProcessFile(ResourceSet resourceSet, String processId) {
		// for all element in folder
		try {
			for (IResource resource : getFolder().members()) {
				// for element file
				if (resource instanceof IFile) {
					// select resource
					IFile file = (IFile) resource;
					URI resourceURI = URI.createFileURI(file.getLocation()
							.toFile().getPath());
					Resource resourceTemp = resourceSet.getResource(
							resourceURI, true);
					if (resourceTemp != null) {
						// does resource contain a diagram as root object?
						for (final EObject object : resourceTemp.getContents()) {
							if (object instanceof Diagram) {
								// for object Diagram
								Diagram diagram = (Diagram) object;
								// find BO linked
								EList<EObject> listBo = diagram.getLink()
										.getBusinessObjects();
								// For all BO
								for (final EObject bo : listBo) {
									// find a EAStarBaseElement
									EaBaseElement eaStarElement = EAStarAppService
											.findBOEAStarInRessourceDiagram(
													diagram, bo);
									// and compare id with idActivity
									if (eaStarElement instanceof EaProcess
											&& ((EaProcess) eaStarElement)
													.getId().equals(processId)) {
										return file;
									}
								}
							}
						}
					}
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Find File for main process
	 * 
	 * @param resourceSet
	 *            resource set
	 * @param processId
	 *            id process
	 * @return
	 */
	public IFile findMainProcessFile(ResourceSet resourceSet, String processId) {
		BsmAppService bsmService = new BsmAppService(this);
		// find EaProcess main
		EaProcess process = bsmService.findMainProcess(processId);
		// find file for all EaProcess
		if (null != process) {
			return findProcessFile(resourceSet, process.getId());
		}
		return null;
	}

	/**
	 * Test organization
	 * 
	 * @param organization
	 *            for test
	 * @return true if organization can have resource
	 */
	public boolean canHaveResource(EaOrganization organization) {
		BsmAppService service = new BsmAppService(this);
		BsmOrganization bsmOrgnization = service.getOrganization(organization);
		// organization can have a resource if it is a BsmEnterprise.
		return bsmOrgnization instanceof BsmEnterprise;
	}

	/**
	 * Update data bsm
	 * 
	 * @param eaResource
	 */
	public void update(EaResource eaResource) {
		BsmAppService service = new BsmAppService(this);
		service.updateData(eaResource);
	}

	/**
	 * Update organization for bsm
	 * 
	 * @param eaResource
	 */
	public void updateOrganization(EaResource eaResource) {
		BsmAppService service = new BsmAppService(this);
		service.updateOrganization(eaResource);
	}

	/**
	 * Remove data for bsm
	 * 
	 * @param process
	 *            modified
	 * @param resource
	 *            to remove
	 */
	public void remove(EaProcess process, EaResource resource) {
		BsmAppService bsmService = new BsmAppService(this);
		bsmService.remove(process, resource);
	}

	/**
	 * Update data bsm
	 * 
	 * @param EaOrganization
	 */
	public void update(EaOrganization organization) {
		BsmAppService bsmService = new BsmAppService(this);
		bsmService.updateData(organization);
	}

	/**
	 * Remove data for bsm
	 * 
	 * @param process
	 *            modified
	 * @param organization
	 *            to remove
	 */
	public void remove(EaProcess process, EaOrganization organization) {
		BsmAppService bsmService = new BsmAppService(this);
		bsmService.remove(process, organization);
	}

	/**
	 * Update data bsm
	 * 
	 * @param EaProcess
	 */
	public void update(EaProcess process) {
		BsmAppService bsmService = new BsmAppService(this);
		bsmService.updateData(process);
	}

	/**
	 * Update organization for bsm
	 * 
	 * @param process
	 * @param organization
	 */
	public void updateOrganization(EaProcess process,
			EaOrganization organization) {
		BsmAppService service = new BsmAppService(this);
		service.updateOrganization(process, organization);
	}

	/**
	 * Need update data with data bsm
	 * 
	 * @param eaBaseElement
	 * @return true if organization isn't synchronized with the data BSM
	 */
	public boolean needUpdate(EaBaseElement eaBaseElement) {
		BsmAppService bsmService = new BsmAppService(this);
		return bsmService.needUpdate(eaBaseElement);
	}

	/**
	 * Update data for bsm
	 * 
	 * @param ggBaseElement
	 */
	public void updateEa(EaBaseElement eaBaseElement) {
		BsmAppService bsmService = new BsmAppService(this);
		bsmService.updateEa(eaBaseElement);
	}

	/**
	 * Get organization's name if eaBaseElement hav'nt good organization
	 * 
	 * @param bo
	 * @return null if it is good organization
	 */
	public String getOrganizationNameIfnotGood(EaResource eaBaseElement) {
		BsmAppService bsmService = new BsmAppService(this);
		return bsmService.getOrganizationNameIfnotGood(eaBaseElement);
	}

	/**
	 * Copy oldActivity data in newActivity
	 * 
	 * @param oldActivity
	 * @param newActivity
	 */
	public void coptyData(EaExtendedActivity source, EaExtendedActivity target) {
		target.setCode(source.getCode());
		target.setDecompositionCode(source.getDecompositionCode());
		target.setOsmoseWorld(source.getOsmoseWorld());
		target.setMission(source.getMission());
		target.setFunctionalRules(source.getFunctionalRules());
		target.setMinCost(source.getMinCost());
		target.setMaxCost(source.getMaxCost());
		target.setAverageCost(source.getAverageCost());
		target.setMinTimeDelay(source.getMinTimeDelay());
		target.setMaxTimeDelay(source.getMaxTimeDelay());
		target.setAverageTimeDelay(source.getAverageTimeDelay());
		target.setIsStarting(source.isIsStarting());
		target.setIsEnding(source.isIsEnding());

		for (int i = source.getOutFlows().size() - 1; i >= 0; i--) {
			((EaFlow) source.getOutFlows().get(i)).setSource(target);
		}

		for (int i = source.getInFlows().size() - 1; i >= 0; i--) {
			((EaFlow) source.getInFlows().get(i)).setTarget(target);
		}

	}

	/**
	 * @return all service public
	 */
	public MseServiceBeanREST[] getAllServicesPublic() {
		BsmRESTService service = new BsmRESTService();
		return service.getAllPublicService();
	}

	/**
	 * @return all service local
	 */
	public MseServiceBeanREST[] getAllServicesLocal() {
		BsmRESTService service = new BsmRESTService();
		return service.getAllLocalService();
	}

	/**
	 * Add Mse service to Process
	 * 
	 * @param activity
	 * @param mseService
	 */
	public void addMseServiceToProcess(EaStructuralExtendedActivity activity,
			MseServiceBeanREST mseService) {
		BsmAppService service = new BsmAppService(this);
		service.saveMseService(activity, mseService);
	}
	
	public void addMseServiceToResource(EaResource resource,
			MseServiceBeanREST mseService) {
		BsmAppService service = new BsmAppService(this);
		service.saveMseServiceToResource(resource, mseService);
	}

	/**
	 * @param activity
	 *            to test
	 * @return true if process, linked to activity, have a MseService
	 */
	public boolean haveMseService(EaExtendedActivity activity) {
		BsmAppService service = new BsmAppService(this);
		if (activity instanceof EaStructuralExtendedActivity) {
			return service
					.haveMseService(((EaStructuralExtendedActivity) activity)
							.getIsA());
		} else {
			return false;
		}
	}

	/**
	 * Get a MseService of process, linked to activity
	 * 
	 * @param activity
	 *            for search
	 * @return null if not found
	 */
	public BsmMseService getMseService(EaStructuralExtendedActivity activity) {
		BsmAppService service = new BsmAppService(this);
		return service.getMseService(activity.getIsA());
	}
	
	public BsmMseService getMseServiceToResource(EaResource resource) {
		BsmAppService service = new BsmAppService(this);
		return service.getMseService(resource);
	}

	/**
	 * @return all MseAssetClass
	 */
	public MseAssetClassBeanREST getAllMseAssets() {
		BsmRESTService service = new BsmRESTService();
		return service.getAllMseAssets();
	}

	
	public String getRestRecentUrl() {
		BsmRESTService service = new BsmRESTService();
		return service.getRestServiceUrl();
	}

	public String testRESTConnection(String url) {
		BsmRESTService service = new BsmRESTService();
		return service.testRestServiceUrl(url + RestUrl.URL_SERVICE_CLASS);
	}

	public void updateRestURL(String url) {
		PreferencesServices prefServices = new PreferencesServices();
		prefServices.updateString("URL_SERVICE_ROOT", url);
	}

}
