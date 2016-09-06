package org.msee.slmtoolbox.modeling.transformation.bsm;
import java.util.HashMap;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.transformation.utils.UtilsResources;
//import org.msee.slmtoolbox.modeling.app.transform.CDOInjector;

/**
 * @author HBA6
 * 
 */
public class Bsm2TimTransformation {

	public static IModel bsmModel;
	public static IModel timModel;
	private final static String bsmMetaModelPath =  UtilsResources.getFilePathPlugin("org.msee.slmtoolbox.modeling.model", "model/bsm.ecore");
	private final static String timMetaModelPath =  UtilsResources.getFilePathPlugin("org.msee.slmtoolbox.modeling.model", "model/tim.ecore");
	public final static String atlFilePath = "atl/bsm/BSM-TIM.asm";

	
	public static void transform(String inputFile, String outputFile) {
		
		try {
			/*
			 * Initializations
			 */
			ILauncher transformationLauncher = new EMFVMLauncher();
			ModelFactory modelFactory = new EMFModelFactory();
			IInjector injector = new EMFInjector();
			IExtractor extractor = new EMFExtractor();

			/*
			 * Load metamodels
			 */
			IReferenceModel bsmMetamodel = modelFactory.newReferenceModel();
			injector.inject(bsmMetamodel, bsmMetaModelPath);
			IReferenceModel timMetamodel = modelFactory.newReferenceModel();
			injector.inject(timMetamodel, timMetaModelPath);

			/*
			 * Run transformation
			 */	
			EPackage.Registry.INSTANCE.put(CoreElementsPackage.eNS_URI, CoreElementsPackage.eINSTANCE);
			EPackage.Registry.INSTANCE.put(GeneralElementsPackage.eNS_URI, GeneralElementsPackage.eINSTANCE);
			
			// input model
			bsmModel = modelFactory.newModel(bsmMetamodel);	
			
			((EMFInjector)injector).inject(bsmModel, inputFile);
	
			//	// print the resourc's contents of the bsmModel
			System.out.println("xmi input contents: "+((EMFModel)bsmModel).getResource().getContents().get(0).getClass());
			
			//transform input model (bsmModel) to timModel
			transformationLauncher.initialize(new HashMap<String, Object>());
			transformationLauncher.addInOutModel(bsmModel, "IN", "BSM");
			
			timModel = modelFactory.newModel(timMetamodel);
			
			transformationLauncher
					.addOutModel(timModel, "OUT", "TIM");
			// create an option hash map
			HashMap<String, Object> options = new HashMap<String, Object>();
			options.put("allowInterModelReferences", true);
			transformationLauncher.launch(ILauncher.RUN_MODE,
					new NullProgressMonitor(), options,
					Bsm2TimTransformation.class.getClassLoader().getResourceAsStream(atlFilePath));

			extractor.extract(timModel, outputFile);
			
			// print the resource's contents of the timModel
			System.out.println("xmi result contents: "+((EMFModel)timModel).getResource().getContents());
			
			/*
			 * Unload all models and metamodels (EMF-specific)
			 */
	
			EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
			emfModelFactory.unload((EMFModel) timModel);
			emfModelFactory.unload((EMFReferenceModel) bsmMetamodel);
			emfModelFactory.unload((EMFReferenceModel) timMetamodel);

		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}

	public static IModel getBsmModel() {
		return bsmModel;
	}

	public static void setBsmModel(IModel bsmModel) {
		Bsm2TimTransformation.bsmModel = bsmModel;
	}

	public static IModel getTimModel() {
		return timModel;
	}

	public static void setTimModel(IModel timModel) {
		Bsm2TimTransformation.timModel = timModel;
	}
}
