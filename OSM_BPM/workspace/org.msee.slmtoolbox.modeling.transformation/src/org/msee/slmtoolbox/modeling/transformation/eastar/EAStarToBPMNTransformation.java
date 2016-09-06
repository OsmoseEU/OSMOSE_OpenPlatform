package org.msee.slmtoolbox.modeling.transformation.eastar;

import java.util.HashMap;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
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
import org.msee.slmtoolbox.modeling.transformation.utils.UtilsResources;
//import org.msee.slmtoolbox.modeling.app.transform.CDOInjector;

/**
 * @author HBA6
 * 
 */
public class EAStarToBPMNTransformation {

	public static IModel eaStarModel;
	public static IModel bpmnModel;
	public static IReferenceModel eaStarMetamodel;
	public static IReferenceModel bpmnMetamodel;
	public static ILauncher transformationLauncher;
	public static IExtractor extractor;
	public static IInjector injector;
	public static ModelFactory modelFactory;
	private final static String eaStarMetaModelPath = UtilsResources
			.getFilePathPlugin("org.msee.slmtoolbox.modeling.model",
					"model/eaStar.ecore");
	private final static String bpmnMetaModelPath = UtilsResources
			.getFilePathPlugin("org.msee.slmtoolbox.modeling.model",
					"model/BPMN20.ecore");
	public final static String collaborationAtlFilePath = "atl/eastar/EAStar-BPMN2.0-Collaboration.asm";
	public final static String processAtlFilePath = "atl/eastar/EAStar-BPMN2.0-Process.asm";
	public static String intermediatePath;
	public final static String xsltFilePath = "xslt/TransformationXmiToBpmn.xslt";

	public static void initializeModels(String inputFile) {
		try {
			/*
			 * Initializations
			 */
			transformationLauncher = new EMFVMLauncher();
			modelFactory = new EMFModelFactory();
			injector = new EMFInjector();
			extractor = new EMFExtractor();

			/*
			 * Load metamodels
			 */
			eaStarMetamodel = modelFactory.newReferenceModel();
			injector.inject(eaStarMetamodel, eaStarMetaModelPath);

			bpmnMetamodel = modelFactory.newReferenceModel();
			injector.inject(bpmnMetamodel, bpmnMetaModelPath);

			/*
			 * Run transformation
			 */

			// input model
			eaStarModel = modelFactory.newModel(eaStarMetamodel);
			((EMFInjector) injector).inject(eaStarModel, inputFile);

			// output model
			bpmnModel = modelFactory.newModel(bpmnMetamodel);

			// init transforamation launcher
			transformationLauncher.initialize(new HashMap<String, Object>());
			transformationLauncher.addInOutModel(eaStarModel, "IN", "EA");

		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void transformToCollaboration(String inputFile, String outputFile, String rootProject) {

		initializeModels(inputFile);

		intermediatePath = rootProject + "/intermediateResult.xmi";
		
		try {

			transformationLauncher.addOutModel(bpmnModel, "OUT", "BPMN");
			transformationLauncher.launch(ILauncher.RUN_MODE,
					new NullProgressMonitor(), new HashMap<String, Object>(),
					EAStarToBPMNTransformation.class.getClassLoader().getResourceAsStream(collaborationAtlFilePath));
			extractor.extract(bpmnModel, intermediatePath);

			transformationAtl(outputFile);
			unloadModelsAndMetamodels();

		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}

	public static void unloadModelsAndMetamodels() {
		/*
		 * Unload all models and metamodels (EMF-specific)
		 */

		EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
		emfModelFactory.unload((EMFModel) bpmnModel);
		emfModelFactory.unload((EMFReferenceModel) eaStarMetamodel);
		emfModelFactory.unload((EMFReferenceModel) bpmnMetamodel);

	}

	public static void transformToProcess(String inputFile, String outputFile, String rootProject) {

		initializeModels(inputFile);

		intermediatePath = rootProject + "/intermediateResult.xmi";

		try {

			transformationLauncher.addOutModel(bpmnModel, "OUT", "BPMN");
			transformationLauncher.launch(ILauncher.RUN_MODE,
					new NullProgressMonitor(), new HashMap<String, Object>(),
					EAStarToBPMNTransformation.class.getClassLoader().getResourceAsStream(processAtlFilePath));
			extractor.extract(bpmnModel, intermediatePath);

			transformationAtl(outputFile);
			unloadModelsAndMetamodels();

		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}

	private static void transformationAtl(String outputFile) {
		// prepare the xml input file
		IFile fileIntermediate =  ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(intermediatePath));
		Source xmlInput = new StreamSource(fileIntermediate.getLocationURI().getPath());
		// prepare the xsl file
		Source xsl = new StreamSource(
				EAStarToBPMNTransformation.class.getClassLoader().getResourceAsStream(xsltFilePath));
		// prepare the xslt transformation's result file
		IFile fileOut =  ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(outputFile));
		Result xmlOutput = new StreamResult(fileOut.getLocationURI().getPath());
		// apply xslt transformation
		try {
			Transformer transformer = TransformerFactory.newInstance()
					.newTransformer(xsl);
			transformer.transform(xmlInput, xmlOutput);
		} catch (TransformerException e) {
			// Handle.
		}

	}

	public static IModel getEaStarModel() {
		return eaStarModel;
	}

	public static void setEaStarModel(IModel eaStarModel) {
		EAStarToBPMNTransformation.eaStarModel = eaStarModel;
	}

	public static IModel getBpmnModel() {
		return bpmnModel;
	}

	public static void setBpmnModel(IModel bpmnModel) {
		EAStarToBPMNTransformation.bpmnModel = bpmnModel;
	}
}
