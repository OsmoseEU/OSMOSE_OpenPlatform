package org.msee.slmtoolbox.modeling.service.app.lang.eastar.Osmose.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.core.resources.IFile;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAnd;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaControlFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExternalConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaHumanResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaITResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaInternalConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaLogicalOperator;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOr;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOutputInputFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootFactory;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.Osmose.DiagramLink;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.Osmose.IOsmoseService;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.Osmose.OsmioticRelation;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * 
 * THIS CLASS NEED ALL TO BE REFACTOR
 * 
 */
public class OsmoseService implements IOsmoseService {

	public EaProcess root = null;
	public EaModel model = null;
	private HashMap<Integer, String> orderedMap = new HashMap<Integer, String>();
	private HashMap<Integer, List<DiagramLink>> children = new HashMap<Integer, List<DiagramLink>>();
	private HashMap<Integer, List<DiagramLink>> parent = new HashMap<Integer, List<DiagramLink>>();
	private HashMap<String, EaExtendedActivity> allFinalActivities;
	public String path;
	public String directory;

	// LocalRepository Should dispose this object?
	private HashMap<String, EaAnd> eaa = new HashMap<String, EaAnd>();
	private HashMap<String, EaOr> eao = new HashMap<String, EaOr>();
	private HashMap<String, EaOutputInputFlow> oifm = new HashMap<String, EaOutputInputFlow>();
	private HashMap<String, EaStructuralExtendedActivity> asm = new HashMap<String, EaStructuralExtendedActivity>();
	private HashMap<String, EaExtendedActivity> aem = new HashMap<String, EaExtendedActivity>();
	private HashMap<String, EaConnector> aic = new HashMap<String, EaConnector>();

	public HashMap<String, EaExtendedActivity> getAllFinalActivities() {
		return allFinalActivities;
	}

	@Override
	public void buildContainer(IFile source) {
		path = source.getFullPath().toString()
				.replaceAll(source.getName().toString(), "");
		directory = source.getRawLocation().toOSString()
				.replaceAll(source.getName().toString(), "")
				+ "\\Generated\\";
		path += "Generated/" + source.getName().toString();
		readFile(source); // Read XMI File and gets the EaProcess = root
		if (root == null)
			return;
		buildStructure();

	}

	private void readFile(IFile source) {
		XMIResourceImpl resource = new XMIResourceImpl();
		try {
			resource.load(
					new FileInputStream(source.getLocation().toOSString()),
					new HashMap<Object, Object>());
			model = ((EaModel) resource.getContents().get(1));
			root = model.getProcess();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void buildStructure() {
		// Filtering the process
		for (EaFlowElement i : root.getFlowElements()) {
			if (i instanceof EaOutputInputFlow) {
				oifm.put(i.getId(), (EaOutputInputFlow) i);
			} else if (i instanceof EaStructuralExtendedActivity) {
				aem.put(i.getId(), (EaExtendedActivity) i);
				if (((EaStructuralExtendedActivity) i).isIsStarting()) {
					orderedMap.put(1, i.getId());
				}
				asm.put(i.getId(), (EaStructuralExtendedActivity) i);
			} else if (i instanceof EaAtomicExtendedActivity) {
				aem.put(i.getId(), (EaAtomicExtendedActivity) i);
				if (((EaAtomicExtendedActivity) i).isIsStarting()) {
					orderedMap.put(1, i.getId());
				}
			} else if (i instanceof EaOr) {
				eao.put(i.getId(), (EaOr) i);
			} else if (i instanceof EaAnd) {
				eaa.put(i.getId(), (EaAnd) i);
			} else if (i instanceof EaInternalConnector
					|| i instanceof EaExternalConnector
					|| i instanceof EaProcessConnector) {
				aic.put(i.getId(), (EaConnector) i);
			}
		}

		// Building HasMaps
		String var, var2;
		ArrayList<DiagramLink> neighbors;
		EaExtendedActivity atomicAux;

		for (int index = 1;; index++) {
			if ((var = orderedMap.get(index)) == null)
				break;
			neighbors = new ArrayList<>();

			for (EaFlow f : aem.get(var).getOutFlows()) {
				if (!oifm.containsKey(f.getId()))
					continue;
				try {
					var = oifm.get(f.getId()).getTarget().getId();
				} catch (NullPointerException e) {
					continue;
				}

				if (eao.containsKey(var)) {
					for (EaFlow f2 : eao.get(var).getOutFlows()) {
						if (!oifm.containsKey(f2.getId()))
							continue;
						var2 = oifm.get(f2.getId()).getTarget().getId();
						if ((atomicAux = aem.get(var2)) == null)
							continue;

						if (!orderedMap.containsValue(var2)) {
							orderedMap.put(orderedMap.size() + 1, var2);
							neighbors.add(new DiagramLink(orderedMap.size(),
									aem.get(orderedMap.get(index))
											.getOsmoseWorld(), atomicAux
											.getOsmoseWorld()));
						} else {
							for (Entry<Integer, String> entry : orderedMap
									.entrySet()) {
								if (var2 == entry.getValue()) {
									neighbors.add(new DiagramLink(entry
											.getKey(), aem.get(
											orderedMap.get(index))
											.getOsmoseWorld(), atomicAux
											.getOsmoseWorld()));
									break;
								}
							}
						}
					}
				} else if (eaa.containsKey(var)) {
					for (EaFlow f2 : eaa.get(var).getOutFlows()) {
						if (!oifm.containsKey(f2.getId()))
							continue;
						var2 = oifm.get(f2.getId()).getTarget().getId();
						if ((atomicAux = aem.get(var2)) == null)
							continue;
						if (!orderedMap.containsValue(var2)) {
							orderedMap.put(orderedMap.size() + 1, var2);
							neighbors.add(new DiagramLink(orderedMap.size(),
									aem.get(orderedMap.get(index))
											.getOsmoseWorld(), atomicAux
											.getOsmoseWorld()));
						} else {

							for (Entry<Integer, String> entry : orderedMap
									.entrySet()) {
								if (var2 == entry.getValue()) {
									neighbors.add(new DiagramLink(entry
											.getKey(), aem.get(
											orderedMap.get(index))
											.getOsmoseWorld(), atomicAux
											.getOsmoseWorld()));
									break;
								}
							}
						}
					}
				} else {
					if ((atomicAux = aem.get(var)) == null)
						continue;

					if (!orderedMap.containsValue(var)) {
						orderedMap.put(orderedMap.size() + 1, var);
						neighbors.add(new DiagramLink(orderedMap.size(), aem
								.get(orderedMap.get(index)).getOsmoseWorld(),
								atomicAux.getOsmoseWorld()));
					} else {
						for (Entry<Integer, String> entry : orderedMap
								.entrySet()) {
							if (var == entry.getValue()) {
								neighbors.add(new DiagramLink(entry.getKey(),
										aem.get(orderedMap.get(index))
												.getOsmoseWorld(), atomicAux
												.getOsmoseWorld()));
								break;
							}
						}
					}

				}
			}
			children.put(index, neighbors);
		}

		// This build parents HashMap

		for (Entry<Integer, List<DiagramLink>> a : children.entrySet()) {
			if (!parent.containsKey(a.getKey())) {
				parent.put(a.getKey(), new ArrayList<DiagramLink>());
			}

			for (DiagramLink dl : a.getValue()) {
				if (!parent.containsKey(dl.getTarget())) {
					parent.put(dl.getTarget(), new ArrayList<DiagramLink>());
				}
				parent.get(dl.getTarget()).add(
						new DiagramLink(a.getKey(), dl.getTransformation()));
			}
		}

		debugMode();
	}

	@Override
	public HashMap<String, OsmioticRelation> getOsmioticProcess() {
		if (orderedMap.size() == 0)
			return null;
		HashMap<String, OsmioticRelation> myList = new HashMap<String, OsmioticRelation>();

		String source, target;
		for (int i = 1; i <= children.size(); i++) {
			for (DiagramLink a : children.get(i)) {
				if (a.getTransformation().equalsIgnoreCase("N/A"))
					continue;
				source = orderedMap.get(i);
				target = orderedMap.get(a.getTarget());

				myList.put(
						aem.get(source).getName() + " -> "
								+ aem.get(target).getName(),
						new OsmioticRelation(a.getTransformation(), aem.get(
								source).getName(), aem.get(target).getName(),
								source, target, i, a.getTarget()));

			}
		}

		return myList;
	}

	public void buildPath(final OsmioticRelation osmioticRelation) {
		final LinkedList<Integer> myBackList = new LinkedList<Integer>();
		final CopyOnWriteArrayList<Integer> myFrontList = new CopyOnWriteArrayList<Integer>();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				myBackList.add(osmioticRelation.getSourceInternalId());
				int a;
				for (int i = 0; i < myBackList.size(); i++) {
					a = myBackList.get(i);
					if (aem.get(orderedMap.get(a)).isIsStarting())
						continue;
					for (DiagramLink dl : parent.get(a)) {
						if (!dl.getTransformation().equalsIgnoreCase("N/A")
								|| myBackList.contains(dl.getTarget()))
							continue;
						myBackList.add(dl.getTarget());
					}
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				myFrontList.add(osmioticRelation.getTargetInternalId());
				int a;

				for (int i = 0; i < myFrontList.size(); i++) {
					a = myFrontList.get(i);
					if (aem.get(orderedMap.get(a)).isIsEnding())
						continue;
					for (DiagramLink dl : children.get(a)) {
						if (!dl.getTransformation().equalsIgnoreCase("N/A")
								|| myFrontList.contains(dl.getTarget()))
							continue;
						myFrontList.add(dl.getTarget());
					}
				}

			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		myFrontList.addAllAbsent(myBackList);
		allFinalActivities = new HashMap<String, EaExtendedActivity>();
		EaExtendedActivity temp;
		for (int aux : myFrontList) {
			temp = aem.get(orderedMap.get(aux));
			allFinalActivities.put(temp.getId(), temp);
		}
	}

	@Override
	public EaModel rebuildModel(String osmioticEvent) {
		HashSet<String> eaOutFlows = new HashSet<String>();

		HashMap<String, EaOrganization> eaOrgList = new HashMap<String, EaOrganization>();
		HashMap<String, EaExtendedActivity> eaam = new HashMap<String, EaExtendedActivity>();
		HashMap<String, EaResource> aer = new HashMap<String, EaResource>();
		HashMap<String, EaLogicalOperator> ael = new HashMap<String, EaLogicalOperator>();
		EaOrganization org;

		EaModel model = RootFactory.eINSTANCE.createEaModel();
		model.setCode(this.model.getCode());
		model.setDescription(this.model.getDescription());
		model.setId(this.model.getId());
		model.setName(this.model.getName());
		
		for (EaOrganization o : this.model.getOrganizations()) {
			org = CoreElementsFactory.eINSTANCE.createEaOrganization();
			org.setCode(o.getCode());
			org.setDescription(o.getDescription());
			org.setId(o.getId());
			org.setModel(model);
			org.setName(o.getName());
			model.getOrganizations().add(org);
			eaOrgList.put(org.getId(), org);
		}

		EaProcess process = GeneralElementsFactory.eINSTANCE.createEaProcess();
		process.setCanBe(this.root.getCanBe());
		process.setCode(this.root.getCode());
		process.setDecompositionCode(this.root.getDecompositionCode());
		process.setDescription(this.root.getDescription());
		process.setId(this.root.getId());
		process.setModel(model);
		process.setName(this.root.getName());
		process.setOsmioticProcess(osmioticEvent);
		model.setProcess(process);

		EaExtendedActivity newAt;
		for (Entry<String, EaExtendedActivity> et : allFinalActivities
				.entrySet()) {
			newAt = copyEaAtomicExtendedActivity(et.getValue(), eaOutFlows,
					aer, ael, eaOrgList, process);
			newAt.setProcess(process);
			eaam.put(newAt.getId(), newAt);
		}

		EaOutputInputFlow eao;
		for (String outflow : eaOutFlows) {
			eao = oifm.get(outflow);
			copyEaOutputInputFlow(eao, eaam.get(eao.getTarget().getId()),
					eaam.get(eao.getSource().getId()), process);
		}

		return model;
	}

	private EaExtendedActivity copyEaAtomicExtendedActivity(
			EaExtendedActivity copy, HashSet<String> eaOutFlows,
			HashMap<String, EaResource> aer,
			HashMap<String, EaLogicalOperator> ael,
			HashMap<String, EaOrganization> eaOrgList, EaProcess process) {
		EaExtendedActivity newAt;
		if (asm.containsKey(copy.getId())) {
			newAt = CoreElementsFactory.eINSTANCE
					.createEaStructuralExtendedActivity();
			//((EaStructuralExtendedActivity)newAt).setIsA(((EaStructuralExtendedActivity) copy).getIsA()); need to be re-check with Transformations
		} else {

			newAt = CoreElementsFactory.eINSTANCE
					.createEaAtomicExtendedActivity();
		}
		newAt.setAverageCost(copy.getAverageCost());
		newAt.setAverageTimeDelay(copy.getAverageTimeDelay());
		newAt.setCode(copy.getCode());
		newAt.setDecompositionCode(copy.getDecompositionCode());
		newAt.setDescription(copy.getDescription());
		newAt.setFunctionalRules(copy.getFunctionalRules());
		newAt.setId(copy.getId());
		newAt.setIsEnding(copy.isIsEnding());
		newAt.setIsStarting(copy.isIsStarting());
		newAt.setMaxCost(copy.getMaxCost());
		newAt.setMaxTimeDelay(copy.getMaxTimeDelay());
		newAt.setMinCost(copy.getMinCost());
		newAt.setMinTimeDelay(copy.getMinTimeDelay());
		newAt.setMission(copy.getMission());
		newAt.setName(copy.getName());
		newAt.setOrganization(eaOrgList.get(copy.getOrganization().getId()));
		newAt.setOsmoseWorld(copy.getOsmoseWorld());

		EaConnector eic;
		EaResource er;
		EaLogicalOperator el;
		// Validar flows
		for (EaFlow a : copy.getInFlows()) {
			if (a instanceof EaControlFlow) {
				continue;
			}

			if (a instanceof EaSupportFlow
					&& a.getSource() instanceof EaResource) {
				if (!aer.containsKey(a.getSource().getId())) {
					er = copyEaResource((EaResource) a.getSource(), process,
							eaOrgList.get(((EaResource) a.getSource())
									.getOrganization().getId()));
					aer.put(er.getId(), er);
				} else
					er = aer.get(a.getSource().getId());
				copyEaSuportFlow((EaSupportFlow) a, newAt, er, process);
				continue;
			}

			if (a instanceof EaOutputInputFlow
					&& a.getSource() instanceof EaConnector) {
				eic = copyEaInternalConnector((EaConnector) a.getSource(),
						process, eaOrgList.get(((EaConnector) a.getSource())
								.getOrganization().getId()));
				copyEaOutputInputFlow((EaOutputInputFlow) a, newAt, eic,
						process);
				continue;
			}

			if (a instanceof EaOutputInputFlow
					&& a.getSource() instanceof EaAnd) {
				if (!ael.containsKey(a.getSource().getId())) {
					el = copyEaAnd(
							(EaAnd) a.getSource(),
							process,
							eaOrgList.get(a.getSource().getOrganization()
									.getId()));
					ael.put(el.getId(), el);
				}
				copyEaOutputInputFlow((EaOutputInputFlow) a, newAt,
						ael.get(a.getSource().getId()), process);
				continue;
			}

			if (a instanceof EaOutputInputFlow && a.getSource() instanceof EaOr) {
				if (!ael.containsKey(a.getSource().getId())) {
					el = copyEaOr(
							(EaOr) a.getSource(),
							process,
							eaOrgList.get(a.getSource().getOrganization()
									.getId()));
					ael.put(el.getId(), el);
				}
				copyEaOutputInputFlow((EaOutputInputFlow) a, newAt,
						ael.get(a.getSource().getId()), process);
				continue;
			}

			if (allFinalActivities.containsKey(a.getSource().getId())) {
				eaOutFlows.add(a.getId());
			}
		}

		for (EaFlow a : copy.getOutFlows()) {

			if (a instanceof EaControlFlow) {
				continue;
			}

			if (a instanceof EaOutputInputFlow
					&& a.getTarget() instanceof EaConnector) {
				eic = copyEaInternalConnector((EaConnector) a.getTarget(),
						process, eaOrgList.get(((EaConnector) a.getTarget())
								.getOrganization().getId()));
				copyEaOutputInputFlow((EaOutputInputFlow) a, eic, newAt,
						process);
				continue;
			}

			if (a instanceof EaOutputInputFlow
					&& a.getTarget() instanceof EaAnd) {
				if (!ael.containsKey(a.getTarget().getId())) {
					el = copyEaAnd(
							(EaAnd) a.getTarget(),
							process,
							eaOrgList.get(a.getTarget().getOrganization()
									.getId()));
					ael.put(el.getId(), el);
				}
				copyEaOutputInputFlow((EaOutputInputFlow) a,
						ael.get(a.getTarget().getId()), newAt, process);
				continue;
			}

			if (a instanceof EaOutputInputFlow && a.getTarget() instanceof EaOr) {
				if (!ael.containsKey(a.getTarget().getId())) {
					el = copyEaOr(
							(EaOr) a.getTarget(),
							process,
							eaOrgList.get(a.getTarget().getOrganization()
									.getId()));
					ael.put(el.getId(), el);
				}
				copyEaOutputInputFlow((EaOutputInputFlow) a,
						ael.get(a.getTarget().getId()), newAt, process);
				continue;
			}

			if (allFinalActivities
					.containsKey(a.getTarget().getId().toString())) {
				eaOutFlows.add(a.getId());
			}
		}

		return newAt;
	}

	private EaAnd copyEaAnd(EaAnd copy, EaProcess process, EaOrganization org) {
		EaAnd var = CoreElementsFactory.eINSTANCE.createEaAnd();
		var.setCode(copy.getCode());
		var.setDescription(copy.getDescription());
		var.setId(copy.getId());
		var.setName(copy.getName());
		var.setOrganization(org);
		var.setProcess(process);
		return var;
	}

	private EaOr copyEaOr(EaOr copy, EaProcess process, EaOrganization org) {
		EaOr var = CoreElementsFactory.eINSTANCE.createEaOr();
		var.setCode(copy.getCode());
		var.setDescription(copy.getDescription());
		var.setId(copy.getId());
		var.setName(copy.getName());
		var.setOrganization(org);
		var.setProcess(process);
		return var;
	}

	private void copyEaOutputInputFlow(EaOutputInputFlow eao,
			EaFlowNode target, EaFlowNode source, EaProcess process) {
		EaOutputInputFlow eaon;

		eaon = CoreElementsFactory.eINSTANCE.createEaOutputInputFlow();
		eaon.setCode(eao.getCode());
		eaon.setDescription(eao.getDescription());
		eaon.setId(eao.getId());
		eaon.setIsTrigger(eao.isIsTrigger());
		eaon.setName(eao.getName());
		eaon.setProcess(process);
		eaon.setSource(source);
		eaon.setTarget(target);
		eaon.setTriggerInfo(eao.getTriggerInfo());

		source.getOutFlows().add(eaon);
		target.getInFlows().add(eaon);
	}

	private EaConnector copyEaInternalConnector(EaConnector eic,
			EaProcess process, EaOrganization org) {
		EaConnector var;

		if (eic instanceof EaInternalConnector) {
			var = CoreElementsFactory.eINSTANCE.createEaInternalConnector();
		} else if (eic instanceof EaProcessConnector) {
			var = CoreElementsFactory.eINSTANCE.createEaProcessConnector();
		} else {
			var = CoreElementsFactory.eINSTANCE.createEaExternalConnector();
		}

		var.setCode(eic.getCode());
		var.setDescription(eic.getDescription());
		var.setId(eic.getId());
		var.setName(eic.getName());
		var.setOrganization(org);
		var.setProcess(process);
		process.getFlowElements().add(var);
		return var;
	}

	private EaResource copyEaResource(EaResource copy, EaProcess process,
			EaOrganization org) {
		EaResource var;

		if (copy instanceof EaITResource) {
			var = CoreElementsFactory.eINSTANCE.createEaITResource();
		} else if (copy instanceof EaHumanResource) {
			var = CoreElementsFactory.eINSTANCE.createEaHumanResource();
		} else {
			var = CoreElementsFactory.eINSTANCE.createEaMaterialResource();
		}
		var.setCapabilities(copy.getCapabilities());
		var.setCode(copy.getCode());
		var.setDescription(copy.getDescription());
		var.setId(copy.getId());
		var.setLocation(copy.getLocation());
		var.setName(copy.getName());
		var.setProcess(process);
		var.setOrganization(org);
		var.setUnitaryCost(copy.getUnitaryCost());
		process.getFlowElements().add(var);
		return var;
	}

	private void copyEaSuportFlow(EaSupportFlow eao, EaFlowNode target,
			EaFlowNode source, EaProcess process) {
		EaSupportFlow eaon;

		eaon = CoreElementsFactory.eINSTANCE.createEaSupportFlow();
		eaon.setCode(eao.getCode());
		eaon.setDescription(eao.getDescription());
		eaon.setId(eao.getId());
		eaon.setIsTrigger(eao.isIsTrigger());
		eaon.setName(eao.getName());
		eaon.setProcess(process);
		if (eao.getResourceRole().equals(EaResourceRole.PARTICIPATES_IN)) {
			eaon.setResourceRole(EaResourceRole.PARTICIPATES_IN);
		}
		eaon.setResponsibility(eao.getResponsibility());
		eaon.setSource(source);
		eaon.setTarget(target);
		eaon.setTriggerInfo(eao.getTriggerInfo());

		source.getOutFlows().add(eaon);
		target.getInFlows().add(eaon);
	}

	private void debugMode() {
		System.out
				.println("=============================================== DEBUG MODE ==================================================");
		for (Entry<Integer, String> entry : orderedMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		for (Entry<String, EaExtendedActivity> entry : aem.entrySet()) {
			System.out.println(entry.getKey() + " "
					+ entry.getValue().getName());
		}

		System.out.println("CHILDREN :");
		for (Entry<Integer, List<DiagramLink>> aux : children.entrySet()) {
			System.out.print(aux.getKey() + " - ");
			for (DiagramLink link : aux.getValue()) {
				System.out.print(link.getTarget() + ",");
			}
			System.out.println();
		}

		System.out.println("PARENT :");
		for (Entry<Integer, List<DiagramLink>> aux : parent.entrySet()) {
			System.out.print(aux.getKey() + " - ");
			for (DiagramLink link : aux.getValue()) {
				System.out.print(link.getTarget() + ",");
			}
			System.out.println();
		}
	}
}
