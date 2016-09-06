package org.msee.slmtoolbox.modeling.transformation;


/**
 * Service class for transformation Eastar file
 * @author fto
 *
 */
public class EastarTransformation {
	
	/**
	 * Service for transformation Eastar to BPMN for a process diagram
	 * @param inputFile		source file
	 * @param outputFile	target file
	 * @param projectPath	project path
	 */
	public static void toBpmnProcess(String inputFile, String outputFile, String projectPath) {
		// create an atl transformation object
		ATLTransformation atlTransformation = new ATLTransformation();
		// init the atl transformation object
		atlTransformation.setSourceMetaModePath(ATLTransformation.META_MODEL_EA_PATH);
		atlTransformation.setSourceModelReferenceName("EA");
		atlTransformation.setTargetMetaModePath(ATLTransformation.META_MODEL_BPMN_PATH);
		atlTransformation.setTargetModelReferenceName("BPMN");
		atlTransformation.setAtlPath(ATLTransformation.ATL_EA_BPMN_PROCESS_PATH);
		//add transformation xlt
		atlTransformation.setNeedXsltTranformation(true);
		atlTransformation.setXltPath(ATLTransformation.XSLT_BPMN_PATH);
		atlTransformation.initIntermediateFilePath(projectPath);
		
		// execute transformation
		atlTransformation.transform(inputFile, outputFile);
	}
	
	/**
	 * Service for transformation Eastar to BPMN for a collaboration diagram
	 * @param inputFile		source file
	 * @param outputFile	target file
	 * @param projectPath	project path
	 */
	public static void toBpmnCollaboration(String inputFile, String outputFile, String projectPath) {
		// create an atl transformation object
		ATLTransformation atlTransformation = new ATLTransformation();
		// init the atl transformation object
		atlTransformation.setSourceMetaModePath(ATLTransformation.META_MODEL_EA_PATH);
		atlTransformation.setSourceModelReferenceName("EA");
		atlTransformation.setTargetMetaModePath(ATLTransformation.META_MODEL_BPMN_PATH);
		atlTransformation.setTargetModelReferenceName("BPMN");
		atlTransformation.setAtlPath(ATLTransformation.ATL_EA_BPMN_COLLABORATION_PATH);
		//add transformation xlt
		atlTransformation.setNeedXsltTranformation(true);
		atlTransformation.setXltPath(ATLTransformation.XSLT_BPMN_PATH);
		atlTransformation.initIntermediateFilePath(projectPath);
		
		// execute transformation
		atlTransformation.transform(inputFile, outputFile);
	}
	
	/**
	 * Service for transformation Eastar to BPMN for a digitalization diagram
	 * @param inputFile		source file
	 * @param outputFile	target file
	 * @param projectPath	project path
	 */
	public static void toBpmnOsmosisProcess(String inputFile, String outputFile, String projectPath, String processType) {
		// create an atl transformation object
		ATLTransformation atlTransformation = new ATLTransformation();
		// init the atl transformation object
		atlTransformation.setSourceMetaModePath(ATLTransformation.META_MODEL_EA_PATH);
		atlTransformation.setSourceModelReferenceName("EA");
		atlTransformation.setTargetMetaModePath(ATLTransformation.META_MODEL_BPMN_PATH);
		atlTransformation.setTargetModelReferenceName("BPMN");
		if (processType.toUpperCase().equals("DIGITALIZATION"))
			atlTransformation.setAtlPath(ATLTransformation.ATL_EA_BPMN_DIGITALIZATION_PATH);
		else if (processType.toUpperCase().equals("ACTUATION"))
			atlTransformation.setAtlPath(ATLTransformation.ATL_EA_BPMN_ACTUATION_PATH);
		else if (processType.toUpperCase().equals("VIRTUALIZATION"))
			atlTransformation.setAtlPath(ATLTransformation.ATL_EA_BPMN_VIRTUALIZATION_PATH);
		else if (processType.toUpperCase().equals("AUGMENTATION"))
			atlTransformation.setAtlPath(ATLTransformation.ATL_EA_BPMN_AUGMENTATION_PATH);
		else if (processType.toUpperCase().equals("ENRICHMENT"))
			atlTransformation.setAtlPath(ATLTransformation.ATL_EA_BPMN_ENRICHMENT_PATH);
		else if (processType.toUpperCase().equals("SIMULATION"))
			atlTransformation.setAtlPath(ATLTransformation.ATL_EA_BPMN_SIMULATION_PATH);
		//add transformation xlt
		atlTransformation.setNeedXsltTranformation(true);
		atlTransformation.setXltPath(ATLTransformation.XSLT_BPMN_PATH);
		atlTransformation.initIntermediateFilePath(projectPath);
		
		// execute transformation
		atlTransformation.transform(inputFile, outputFile);
	}
}
