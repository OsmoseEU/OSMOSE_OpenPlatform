package org.msee.slmtoolbox.modeling.editor.graigrid.features.grid;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstractGgCreateFeature;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

public class GgCreateGridFeature extends AbstractGgCreateFeature {

	public GgCreateGridFeature(IFeatureProvider fp) {
		super(fp, "GraiGrid", "Create a GraiGrid");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return getDiagram().getChildren().size() == 0;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// Create new DecisionCenter
		GgGraiGrid newGrid = GeneralElementsFactory.eINSTANCE.createGgGraiGrid();
		newGrid.setName("Grai Grid");
		newGrid.setCode("GG");
		
		// create internal information source 
		GgInformationSource internalSource = CoreElementsFactory.eINSTANCE.createGgInternalInformationSource();
		internalSource.setName("Internal Information Source"); //TODO FTO : Properties
		internalSource.setCode("II");
		newGrid.getInformationSources().add(internalSource);

		// create external information source 
		GgInformationSource externalSource = CoreElementsFactory.eINSTANCE.createGgExternalInformationSource();
		externalSource.setName("External Information Source"); //TODO FTO : Properties
		externalSource.setCode("EI");
		newGrid.getInformationSources().add(externalSource);

		// create three functions and decision levels
		for (int i = 0; i < 3; i++) {
			GgLevel decision = createLevel(newGrid);
			decision.setName("<new Level>");
			decision.setCode("<L>");
			for (GgOrganization organization : newGrid.getOrganizations()) {
				GgFunction function = createFunction(newGrid, organization);
				function.setName("<new Function>");
				function.setCode("<F>");
			}
		}
		
		// do the add
		addGraphicalRepresentation(context, newGrid);
		// return newly created business object(s)
		return new Object[] { newGrid };
	}

	
	/** 
	 * Create a function for a organization of GRAI model
	 * @param graiGrid targeted graiGrid
	 * @param organization targeted graiGrid
	 * @return a initialized EnterpriseFunction with ID
	 */
	public GgFunction createFunction(GgGraiGrid graiGrid, GgOrganization organization) {
		GgFunction graiObjet = CoreElementsFactory.eINSTANCE.createGgFunction();
		graiObjet.setOrganization(organization);
		organization.getFunctions().add(graiObjet);
		graiGrid.getFunctions().add(graiObjet);
		return graiObjet;
	}

	/** 
	 * Create a DecisionLevel of GRAI model
	 * @param graiGrid targeted graiGrid
	 * @return a initialized DecisionLevel with ID, new Horizon, new Period and new UnitTreatment
	 */
	public GgLevel createLevel(GgGraiGrid graiGrid) {
		GgLevel graiObjet = CoreElementsFactory.eINSTANCE.createGgLevel();
		GgTimeValue tValue = CoreElementsFactory.eINSTANCE.createGgTimeValue();
		tValue.setUnit(GgTimeUnits.YEAR);
		tValue.setValue(1);
		graiObjet.setHorizon(tValue);
		tValue = CoreElementsFactory.eINSTANCE.createGgTimeValue();
		tValue.setUnit(GgTimeUnits.MONTH);
		tValue.setValue(1);
		graiObjet.setPeriod(tValue);

		graiGrid.getLevels().add(graiObjet);
		return graiObjet;
	}

}
