package org.msee.slmtoolbox.modeling.service.app.lang.graigrid;

import java.util.HashMap;
import java.util.Map;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgCollaborativeDecision;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationFlow;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootFactory;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

/**
 * Implementation GraiGrid service
 * @author fto
 */
public class GgAppService extends AbstractAppService {
	
	/**
	 * Default Constructor
	 */
	public GgAppService() {
	}
	
	/**
	 * Constructor by copie
	 * @param appService with param for service
	 */
	public GgAppService(AbstractAppService appService) {
		super(appService);
	}

	/**
	 * Constructor with param configuration
	 * @param serviceConfiguration	object for configuration
	 */
	public GgAppService(Object serviceConfiguration) {
		super(serviceConfiguration);
	}

	/**
	 * Create a graigird
	 * @param name	graid grid name
	 * @return new graigrid
	 */
	public GgGraiGrid createGraiGrid(String name) {
		// create a model
		GgModel model = RootFactory.eINSTANCE.createGgModel();
		model.setName(name);
		// create a graigrid
		GgGraiGrid graiGrid = GeneralElementsFactory.eINSTANCE.createGgGraiGrid();
		graiGrid.setName(name);
		model.getGraiGrids().add(graiGrid);
		graiGrid.setModel(model);
		return graiGrid;
	}
	
	/**
	 * generatesGrid a gird for a graiGird
	 * @param name	graid grid name
	 * @return new graigrid
	 */
	public void generatesNewGrid(GgGraiGrid graiGrid, GgOrganization organization) {
		// element for grai grid
		// create internal information source
		GgInformationSource internalSource = CoreElementsFactory.eINSTANCE
				.createGgInternalInformationSource();
		internalSource.setName("Internal Information Source");
		internalSource.setCode("II");
		graiGrid.getInformationSources().add(internalSource);

		// create external information source
		GgInformationSource externalSource = CoreElementsFactory.eINSTANCE
				.createGgExternalInformationSource();
		externalSource.setName("External Information Source");
		externalSource.setCode("EI");
		graiGrid.getInformationSources().add(externalSource);

		graiGrid.getFunctions().clear();
		organization.getFunctions().clear();

		// create three functions and decision levels
		for (int i = 0; i < 3; i++) {
			createLevel(graiGrid, "<Level "+(i+1)+">", "L"+(i+1));
			createFunction(graiGrid,organization, "<Function "+(i+1)+">", "F"+(i+1));
		}
		
	}

	/**
	 * Create an organization
	 * @param ggGraiGrid
	 * @param name	organization name
	 * @param code	organization code
	 * @return new organization
	 */
	public GgOrganization createOrganization(GgGraiGrid ggGraiGrid, String name, String code) {
		GgOrganization organization = GeneralElementsFactory.eINSTANCE.createGgOrganization();
		organization.setName(name);
		organization.setCode(code);
		organization.setModel(ggGraiGrid.getModel());
		ggGraiGrid.getModel().getOrganizations().add(organization);
		ggGraiGrid.getOrganizations().add(organization);
		
		createFunction(ggGraiGrid, organization, "<Function>", "F");
		return organization;
	}

	/**
	 * FIXME revoir cette methode avec l'ajout d'organization dans le diagram (mutalisation possible)
	 * Create a EnterpriseFunction of GRAI model
	 * 
	 * @param graiGrid
	 *            targeted graiGrid
	 * @param organization
	 *            targeted organization
	 * @param name
	 *            function name
	 * @param code
	 *            function code
	 * @return a initialized EnterpriseFunction with ID
	 */
	public GgFunction createFunction(GgGraiGrid graiGrid, GgOrganization organization, String name,
			String code) {
		GgFunction graiObjet = CoreElementsFactory.eINSTANCE
				.createGgFunction();
		graiObjet.setName(name);
		graiObjet.setCode(code);
		// add function to grid
		graiGrid.getFunctions().add(graiObjet);
		graiObjet.setGraiGrid(graiGrid);
		// add function to enterprise
		organization.getFunctions().add(graiObjet);
		return graiObjet;
	}

	/**
	 * Create a level of GRAI model
	 * 
	 * @param graiGrid
	 *            targeted graiGrid
	 * @param name
	 *            level name
	 * @param code
	 *            level code
	 * @return a initialized DecisionLevel with ID, new Horizon, new Period and
	 *         new UnitTreatment
	 */
	public GgLevel createLevel(GgGraiGrid graiGrid, String name,
			String code) {
		GgLevel graiObjet = CoreElementsFactory.eINSTANCE
				.createGgLevel();
		graiObjet.setName(name);
		graiObjet.setCode(code);
		// add a horizon
		GgTimeValue tValue = CoreElementsFactory.eINSTANCE.createGgTimeValue();
		tValue.setUnit(GgTimeUnits.YEAR);
		tValue.setValue(0);
		graiObjet.setHorizon(tValue);
		// add a periode
		tValue = CoreElementsFactory.eINSTANCE.createGgTimeValue();
		tValue.setUnit(GgTimeUnits.MONTH);
		tValue.setValue(0);
		graiObjet.setPeriod(tValue);
		// add a processingUnit
		tValue = CoreElementsFactory.eINSTANCE.createGgTimeValue();
		tValue.setUnit(GgTimeUnits.MONTH);
		tValue.setValue(0);
		graiObjet.setProcessingUnit(tValue);
		// add level to grid
		graiGrid.getLevels().add(graiObjet);
		return graiObjet;
	}


	/**
	 * Create a GgDecisionCenter of GRAI model
	 * 
	 * @param graiGrid	targeted
	 * @param function	targeted
	 * @param level		targeted
	 * @param name		decision center name
	 * @param code		decision center code
	 * @return a GgDecisionCenter
	 */
	public GgDecisionCenter createDecisionCenter(GgGraiGrid graiGrid,
			GgFunction function, GgLevel level, String name, String code) {
		// create element
		GgDecisionCenter center = CoreElementsFactory.eINSTANCE.createGgDecisionCenter();
		center.setName(name);
		center.setCode(code);
		// add in model
		graiGrid.getNodes().add(center);
		center.setGraiGrid(graiGrid);
		// add in grid
		function.getDecisionCenters().add(center);
		center.setFunction(function);
		level.getNodes().add(center);
		center.setLevel(level);
		return center;
	}

	/**
	 * Create an information flow
	 * 
	 * @param source
	 *            element source for research or creation
	 * @param target
	 *            element target for research or creation
	 * @return an information flow
	 */
	public GgInformationFlow createInformationFlow(
			GgNode source, GgNode target) {
		GgInformationFlow flow = CoreElementsFactory.eINSTANCE
				.createGgInformationFlow();
		source.getGraiGrid().getFlows().add(flow);
		flow.setSource(source);
		source.getInFlows().add(flow);
		flow.setTarget(target);
		target.getOutFlows().add(flow);
		return flow;
	}

	/**
	 * Create a decision frame
	 * 
	 * @param source
	 *            element source for research or creation
	 * @param target
	 *            element target for research or creation
	 * @return a decision frame
	 */
	public GgDecisionFrame createDecisionFrame(GgNode source,
			GgNode target) {
		GgDecisionFrame flow = CoreElementsFactory.eINSTANCE.createGgDecisionFrame();
		source.getGraiGrid().getFlows().add(flow);
		flow.setSource(source);
		source.getInFlows().add(flow);
		flow.setTarget(target);
		target.getOutFlows().add(flow);
		return flow;
	}


	/**
	 * Create a collaborative decision
	 * 
	 * @param source
	 *            element source for research or creation
	 * @param target
	 *            element target for research or creation
	 * @return a collaborative decision
	 */
	public GgFlow createCollaborativeDecision(GgNode source, GgNode target) {
		GgCollaborativeDecision flow = CoreElementsFactory.eINSTANCE.createGgCollaborativeDecision();
		source.getGraiGrid().getFlows().add(flow);
		flow.setSource(source);
		source.getInFlows().add(flow);
		flow.setTarget(target);
		target.getOutFlows().add(flow);
		return flow;
	}

	/**
	 * create an information center
	 * 
	 * @param graigrid
	 *            grid
	 * @param informationSource
	 *            target of the research or the creation
	 * @param level
	 *            for research and create
	 * @param nameCenter
	 *            information center name to create
	 * @param code
	 *            information center code to create
	 * @return an information center
	 */
	public GgInformationCenter createInformationCenter(
			GgGraiGrid graigrid, GgInformationSource informationSource,
			GgLevel level, String nameCenter, String code) {
		// item return
		GgInformationCenter center = CoreElementsFactory.eINSTANCE
					.createGgInformationCenter();
		center.setName(nameCenter);
		center.setCode(code);
		center.setInformationSource(informationSource);
		center.setLevel(level);
		graigrid.getNodes().add(center);
		informationSource.getInformationCenters().add(center);
		level.getNodes().add(center);
		return center;
	}

	/**
	 * Get function list not in graigrid, but link to graigrid's enterprise
	 * 
	 * @param graigird
	 *            function not link to graigrid
	 * @return a function list <id, name>
	 */
	public Map<String, String> getFunctionListNotInGraiGird(GgGraiGrid graigrid) {
		return new HashMap<String, String>();
	}

	/**
	 * Update data bsm
	 * @param decisionCenter
	 */
	public void updateBsm(GgDecisionCenter decisionCenter) {
		BsmAppService bsmService = new BsmAppService(this);
		bsmService.updateData(decisionCenter);
	}
	
	/**
	 * Remove data for bsm
	 * @param decisionCenter
	 */
	public void removeBsm(GgDecisionCenter decisionCenter) {
		BsmAppService bsmService = new BsmAppService(this);
		bsmService.remove(decisionCenter);
	}

	/**
	 * Update data with data bsm
	 * @param graiGrid
	 */
	public void updateBsm(GgGraiGrid graiGrid) {
		BsmAppService bsmService = new BsmAppService(this);
		bsmService.updateData(graiGrid);
	}

	/**
	 * Update data with data bsm
	 * @param organization
	 */
	public void updateBsm(GgOrganization organization) {
		BsmAppService bsmService = new BsmAppService(this);
		bsmService.updateData(organization);
	}
	
	/**
	 * Remove data for bsm
	 * @param organization
	 */
	public void removeBsm(GgOrganization organization) {
		BsmAppService bsmService = new BsmAppService(this);
		bsmService.remove(organization);
	}
	
	/**
	 * Need update data with data bsm
	 * @param ggBaseElement
	 * @return true if organization isn't synchronized with the data BSM
	 */
	public boolean needUpdate(GgBaseElement ggBaseElement) {
		BsmAppService bsmService = new BsmAppService(this);
		return bsmService.needUpdate(ggBaseElement);
	}

	/**
	 * Update data for bsm
	 * @param ggBaseElement
	 */
	public void updateGg(GgBaseElement ggBaseElement) {
		BsmAppService bsmService = new BsmAppService(this);
		bsmService.updateGg(ggBaseElement);
	}
}
