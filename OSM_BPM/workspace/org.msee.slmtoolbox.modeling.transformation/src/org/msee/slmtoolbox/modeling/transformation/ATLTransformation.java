package org.msee.slmtoolbox.modeling.transformation;

import java.util.HashMap;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
import org.msee.slmtoolbox.modeling.transformation.utils.UtilsResources;

/**
 * Object for transformation ATL
 * @author fto
 */
public class ATLTransformation {
	
	/** Meta model Eastar path in plugin org.msee.slmtoolbox.modeling.model */
	public final static String META_MODEL_EA_PATH = 
			UtilsResources.getFilePathPlugin("org.msee.slmtoolbox.modeling.model", "model/eaStar.ecore");
	/** Meta model BPMN path in plugin org.msee.slmtoolbox.modeling.model */
	public final static String META_MODEL_BPMN_PATH = 
			UtilsResources .getFilePathPlugin("org.msee.slmtoolbox.modeling.model", "model/BPMN20.ecore");
	/** Meta model BSM path in plugin org.msee.slmtoolbox.modeling.model */
	public final static String META_MODEL_BSM_PATH =  
			UtilsResources.getFilePathPlugin("org.msee.slmtoolbox.modeling.model", "model/bsm.ecore");
	/** Meta model TIM path in plugin org.msee.slmtoolbox.modeling.model */
	public final static String META_MODEL_TIM_PATH =
			UtilsResources.getFilePathPlugin("org.msee.slmtoolbox.modeling.model", "model/tim.ecore");
	
	//########################## BPMN Designer Model #############################
	/** Meta model BPMN DI */
	public final static String META_MODEL_BPMN_DI_PATH =
			UtilsResources.getFilePathPlugin("org.msee.slmtoolbox.modeling.model", "model/di.ecore");
	/** Meta model BPMN DC */
	public final static String META_MODEL_BPMN_DC_PATH =
			UtilsResources.getFilePathPlugin("org.msee.slmtoolbox.modeling.model", "model/dc.ecore");
	/** Meta model BPMN DI */
	public final static String META_MODEL_BPMNDI_PATH =
			UtilsResources.getFilePathPlugin("org.msee.slmtoolbox.modeling.model", "model/bpmndi.ecore");
	/** Meta model BPMN DROOLS */
	
	//########################## BPMN jBPM #############################
	public final static String META_MODEL_BPMN_DROOLS_PATH =
			UtilsResources.getFilePathPlugin("org.msee.slmtoolbox.modeling.model", "model/drools.ecore");
	
	//############################################################################

	/** ATL path file : transformation BSM to TIM */
	public final static String ATL_BSM_TIM_PATH = "atl/bsm/BSM-TIM.asm";
	/** ATL path file : transformation Eastar to BSM (collaboration) */
	public final static String ATL_EA_BPMN_COLLABORATION_PATH = "atl/eastar/EAStar-BPMN2.0-Collaboration.asm";
	/** ATL path file : transformation Eastar to BSM (process) */
	public final static String ATL_EA_BPMN_PROCESS_PATH = "atl/eastar/EAStar-BPMN2.0-Process.asm";
	/** ATL path file : transformation Eastar to BSM (collaboration) */
	public final static String ATL_EA_BPMN_DIGITALIZATION_PATH = "atl/eastar/Digitalization.asm";
	/** ATL path file : transformation Eastar to BSM (collaboration) */
	public final static String ATL_EA_BPMN_ACTUATION_PATH = "atl/eastar/Actuation.asm";
	/** ATL path file : transformation Eastar to BSM (collaboration) */
	public final static String ATL_EA_BPMN_VIRTUALIZATION_PATH = "atl/eastar/Virtualization.asm";
	/** ATL path file : transformation Eastar to BSM (collaboration) */
	public final static String ATL_EA_BPMN_AUGMENTATION_PATH = "atl/eastar/Augmentation.asm";
	/** ATL path file : transformation Eastar to BSM (collaboration) */
	public final static String ATL_EA_BPMN_ENRICHMENT_PATH = "atl/eastar/Enrichment.asm";
	/** ATL path file : transformation Eastar to BSM (collaboration) */
	public final static String ATL_EA_BPMN_SIMULATION_PATH = "atl/eastar/Simulation.asm";
	/** XSLT path file : transformation XMI to BPMN */
	public final static String XSLT_BPMN_PATH = "xslt/TransformationXmiToBpmn.xslt";
	
	// ################## EXPORT ########################
	/** ATL path file : Export single BPMN process to multi BPMN process (collaboration) */
	public final static String ATL_BPMN_BPMN_EXPORT_world1_PATH = "atl/exportBpmn/World1ExportBPMN.ASM";
	public final static String ATL_BPMN_BPMN_EXPORT_world2_PATH = "atl/exportBpmn/World2ExportBPMN.ASM";
	public final static String ATL_BPMN_BPMN_EXPORT_osmioticWorld_PATH = "atl/exportBpmn/OsmioticWorldExportBPMN.ASM";
	/** XSLT path file : transformation BPMN to XMI */
	public final static String XSLT_XMI_PATH = "xslt/BPMN20-ToXMI_No_Diagram.xslt";
	/** XSLT path file : transformation XMI to BPMN withoun Diagram */
	public final static String XSLT_BPMN_No_Diagram_PATH = "xslt/TransformationXmiToBpmn_No_Diagram.xslt";
	
	// ##################################################

	/** Intermediate file name for a xlt transformation */
	private final static String INTERMEDIATE_FILE_NAME= "intermediateResult.xmi";
	/** Intermediate file path for a xlt transformation */
	private String intermediateFilePath;
	/** true if transformation need a xlst transformation */
	private boolean needXsltTranformation;
	/** Path for xlt file */
	private String xltPath;
	
	/** Path for atl file */
	private String atlPath;

	private IReferenceModel sourceReferenceModel;
	/** Path for source meta model */
	private String sourceMetaModePath;
	/** source reference model name for the transformationLauncher */
	private String sourceModelReferenceName;

	private IReferenceModel targetReferenceModel;
	/** Path for target meta model */
	private String targetMetaModePath;
	/** target reference model name for the transformationLauncher */
	private String targetModelReferenceName;

	/* ****************************************
	 * C O N S T R U C T O R
	 * ***************************************/
	/**
	 * Default constructor
	 */
	public ATLTransformation() {
		this.needXsltTranformation = false;
	}
	
	/**
	 * Constructor with param
	 * @param sourceMetaModePath		path for source meta model
	 * @param sourceReferenceModelName	name for source reference in transformation
	 * @param targetMetaModePath		path for target meta model
	 * @param targetReferenceModelName	name for target reference in transformation
	 * @param atlPath
	 */
	public ATLTransformation(String sourceMetaModePath, String sourceReferenceModelName,
			String targetMetaModePath, String targetReferenceModelName,
			String atlPath) {
		this.needXsltTranformation = false;
		
		this.sourceMetaModePath = sourceMetaModePath;
		this.targetMetaModePath = targetMetaModePath;
		this.sourceModelReferenceName = sourceReferenceModelName;
		this.targetModelReferenceName = targetReferenceModelName;
	}

	/* ****************************************
	 * M E T H O D E S   P U B L I C 
 	 * ***************************************/
	/**
	 * Transformation ATL
	 * @param inputFile		source file
	 * @param outputFile	target file
	 */
	public void transform(String inputFile, String outputFile) {
		// TODO vérification des paramètres
		try {
			/** Initializations **/
			EMFVMLauncher transformationLauncher = new EMFVMLauncher();
			EMFModelFactory modelFactory = new EMFModelFactory();
			EMFInjector injector = new EMFInjector();
			EMFExtractor extractor = new EMFExtractor();
			
			//Load metamodels
			this.sourceReferenceModel = modelFactory.newReferenceModel();
			injector.inject(this.sourceReferenceModel, this.sourceMetaModePath);
			IModel sourceModel = modelFactory.newModel(this.sourceReferenceModel);
	
			this.targetReferenceModel = modelFactory.newReferenceModel();
			injector.inject(this.targetReferenceModel, this.targetMetaModePath);
			IModel targetModel = modelFactory.newModel(this.targetReferenceModel);

			/** Run transformation **/
			((EMFInjector) injector).inject(sourceModel, inputFile);

			// init transforamation launcher
			HashMap<String, Object> options = new HashMap<String, Object>();
			options.put("allowInterModelReferences", true);
			transformationLauncher.initialize(new HashMap<String, Object>());
			transformationLauncher.addInOutModel(sourceModel, "IN", this.sourceModelReferenceName);
			transformationLauncher.addOutModel(targetModel, "OUT", this.targetModelReferenceName);
			transformationLauncher.launch(ILauncher.RUN_MODE,
					new NullProgressMonitor(), options,
					ATLTransformation.class.getClassLoader().getResourceAsStream(this.atlPath));
			
			if (this.needXsltTranformation) {
				extractor.extract(targetModel, this.intermediateFilePath);
				transformationAtl(outputFile);
			} else {
				extractor.extract(targetModel, outputFile);
			}

			/** Clear model ne meta model loaded **/
			unloadModelsAndMetamodels(modelFactory, targetModel);

		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}
	
	public void transform2(String inputFile, String outputFile) {
		// TODO vérification des paramètres
		try {
			/** Initializations **/
			EMFVMLauncher transformationLauncher = new EMFVMLauncher();
			EMFModelFactory modelFactory = new EMFModelFactory();
			EMFInjector injector = new EMFInjector();
			EMFExtractor extractor = new EMFExtractor();
			
			//Load metamodels
			this.sourceReferenceModel = modelFactory.newReferenceModel();
			injector.inject(this.sourceReferenceModel, this.sourceMetaModePath);
			IModel sourceModel = modelFactory.newModel(this.sourceReferenceModel);
	
			this.targetReferenceModel = modelFactory.newReferenceModel();
			injector.inject(this.targetReferenceModel, META_MODEL_BPMN_PATH);
			//IModel targetModel = modelFactory.newModel(this.targetReferenceModel);
			
			this.targetReferenceModel = modelFactory.newReferenceModel();
			injector.inject(this.targetReferenceModel, META_MODEL_BPMN_DROOLS_PATH);
			IModel targetModel = modelFactory.newModel(this.targetReferenceModel);

			/** Run transformation **/
			((EMFInjector) injector).inject(sourceModel, inputFile);

			// init transforamation launcher
			HashMap<String, Object> options = new HashMap<String, Object>();
			options.put("allowInterModelReferences", true);
			transformationLauncher.initialize(new HashMap<String, Object>());
			transformationLauncher.addInOutModel(sourceModel, "IN", this.sourceModelReferenceName);
			transformationLauncher.addOutModel(targetModel, "OUT", this.targetModelReferenceName);
			transformationLauncher.launch(ILauncher.RUN_MODE,
					new NullProgressMonitor(), options,
					ATLTransformation.class.getClassLoader().getResourceAsStream(this.atlPath));
			
			if (this.needXsltTranformation) {
				extractor.extract(targetModel, this.intermediateFilePath);
				transformationAtl(outputFile);
			} else {
				extractor.extract(targetModel, outputFile);
			}

			/** Clear model ne meta model loaded **/
			unloadModelsAndMetamodels(modelFactory, targetModel);

		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}

	/* ****************************************
	 * M E T H O D E S   P R I V A T E 
 	 * ***************************************/
	/**
	 * TODO
	 * @param outputFile
	 */
	private void transformationAtl(String outputFile) {
		// prepare the xml input file
		IFile fileIntermediate =  ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(this.intermediateFilePath));
		Source xmlInput = new StreamSource(fileIntermediate.getLocationURI().getPath());
		// prepare the xsl file
		Source xsl = new StreamSource(
				ATLTransformation.class.getClassLoader().getResourceAsStream(this.xltPath));
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
		try {
			fileOut.refreshLocal(IResource.DEPTH_ZERO, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Clear model and meta model loaded
	 * @param modelFactory		model factory
	 * @param targetModel		target model
	 */
	private void unloadModelsAndMetamodels(EMFModelFactory modelFactory, IModel targetModel) {
		// Unload all models and metamodels (EMF-specific)
		modelFactory.unload((EMFModel) targetModel);
		modelFactory.unload((EMFReferenceModel) this.sourceReferenceModel);
		modelFactory.unload((EMFReferenceModel) this.targetReferenceModel);

		// if need XSLT transformation, delete intermediate file
		if (this.needXsltTranformation) {
			// find file in workspace
			IFile fileIntermediate =  ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(this.intermediateFilePath));
			try {
				fileIntermediate.delete(true, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/* ****************************************
	 * G E T T E R S   A N D   S E T T E R S
	 * ***************************************/
	/**
	 * @return the xltPath
	 */
	public String getXltPath() {
		return xltPath;
	}

	/**
	 * @param xltPath the xltPath to set
	 */
	public void setXltPath(String xltPath) {
		this.xltPath = xltPath;
	}

	/**
	 * @return the needXsltTranformation
	 */
	public boolean isNeedXsltTranformation() {
		return needXsltTranformation;
	}

	/**
	 * @param needXsltTranformation the needXsltTranformation to set
	 */
	public void setNeedXsltTranformation(boolean needXsltTranformation) {
		this.needXsltTranformation = needXsltTranformation;
	}

	/**
	 * @return the atlPath
	 */
	public String getAtlPath() {
		return atlPath;
	}

	/**
	 * @param atlPath the atlPath to set
	 */
	public void setAtlPath(String atlPath) {
		this.atlPath = atlPath;
	}

	/**
	 * @return the sourceMetaModePath
	 */
	public String getSourceMetaModePath() {
		return sourceMetaModePath;
	}

	/**
	 * @param sourceMetaModePath the sourceMetaModePath to set
	 */
	public void setSourceMetaModePath(String sourceMetaModePath) {
		this.sourceMetaModePath = sourceMetaModePath;
	}

	
	/**
	 * @return the targetMetaModePath
	 */
	public String getTargetMetaModePath() {
		return targetMetaModePath;
	}

	/**
	 * @param targetMetaModePath the targetMetaModePath to set
	 */
	public void setTargetMetaModePath(String targetMetaModePath) {
		this.targetMetaModePath = targetMetaModePath;
	}

	/**
	 * @return the sourceModelReferenceName
	 */
	public String getSourceModelReferenceName() {
		return sourceModelReferenceName;
	}

	/**
	 * @param sourceModelReferenceName the sourceModelReferenceName to set
	 */
	public void setSourceModelReferenceName(String sourceModelReferenceName) {
		this.sourceModelReferenceName = sourceModelReferenceName;
	}

	/**
	 * @return the targetModelReferenceName
	 */
	public String getTargetModelReferenceName() {
		return targetModelReferenceName;
	}

	/**
	 * @param targetModelReferenceName the targetModelReferenceName to set
	 */
	public void setTargetModelReferenceName(String targetModelReferenceName) {
		this.targetModelReferenceName = targetModelReferenceName;
	}

	public void initIntermediateFilePath(String projectPath) {
		if (null != projectPath) {
			this.intermediateFilePath = "/" + projectPath + "/" + INTERMEDIATE_FILE_NAME;
		}
	}

// ##################################
	/* ****************************************
	 * M E T H O D E S   P U B L I C 
		 * ***************************************/
	/**
	 * Transformation ATL
	 * @param inputFile		source file
	 * @param outputFile	target file
	 */
	public void transformTest(String inputFile, String outputFile) {
		// TODO vérification des paramètres
		try {
			/** Initializations **/
			EMFVMLauncher transformationLauncher = new EMFVMLauncher();
			EMFModelFactory modelFactory = new EMFModelFactory();
			EMFInjector injector = new EMFInjector();
			EMFExtractor extractor = new EMFExtractor();
			
			//Load metamodels
			this.sourceReferenceModel = modelFactory.newReferenceModel();
			injector.inject(this.sourceReferenceModel, this.sourceMetaModePath);
//			this.targetReferenceModel = modelFactory.newReferenceModel();
//			injector.inject(this.targetReferenceModel, this.targetMetaModePath);
			
//			IReferenceModel test1 = modelFactory.newReferenceModel();
//			injector.inject(test1, META_MODEL_BPMN_DROOLS_PATH);
			
			this.targetReferenceModel = modelFactory.newReferenceModel();
			injector.inject(this.targetReferenceModel, META_MODEL_BPMN_PATH);
			
			
			
			IFile fileIntermediate =  ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(inputFile));
			Source xmlInput = new StreamSource(fileIntermediate.getLocationURI().getPath());
			// prepare the xsl file
			Source xsl = new StreamSource(ATLTransformation.class.getClassLoader().getResourceAsStream(this.xltPath));
			// prepare the xslt transformation's result file
			IFile fileOut =  ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(this.intermediateFilePath));
			Result xmlOutput = new StreamResult(fileOut.getLocationURI().getPath());
			// apply xslt transformation
			try {
				Transformer transformer = TransformerFactory.newInstance().newTransformer(xsl);
				transformer.transform(xmlInput, xmlOutput);
			} catch (TransformerException e) {
				// Handle.
			}
			
			IModel sourceModel = modelFactory.newModel(this.sourceReferenceModel);
			IModel targetModel = modelFactory.newModel(this.targetReferenceModel);
			
			/** Run transformation **/
			((EMFInjector) injector).inject(sourceModel, this.intermediateFilePath);
			
			// init transforamation launcher
			HashMap<String, Object> options = new HashMap<String, Object>();
			options.put("allowInterModelReferences", true);
			transformationLauncher.initialize(new HashMap<String, Object>());
			transformationLauncher.addInOutModel(sourceModel, "IN", this.intermediateFilePath);
			transformationLauncher.addOutModel(targetModel, "OUT", this.targetModelReferenceName);
			transformationLauncher.launch(ILauncher.RUN_MODE,
					new NullProgressMonitor(), options,
					ATLTransformation.class.getClassLoader().getResourceAsStream(this.atlPath));
			
			setNeedXsltTranformation(true);
			setXltPath(ATLTransformation.XSLT_BPMN_No_Diagram_PATH);
			
			if (this.needXsltTranformation) {
				extractor.extract(targetModel, this.intermediateFilePath);
				transformationAtl(outputFile);
			} else {
				extractor.extract(targetModel, outputFile);
			}
	
			/** Clear model ne meta model loaded **/
			unloadModelsAndMetamodels(modelFactory, targetModel);
	
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}
}