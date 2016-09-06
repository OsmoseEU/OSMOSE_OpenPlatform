package org.msee.slmtoolbox.modeling.transformation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAnd;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOr;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOutputInputFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;

public class BpmnTransformation {
	/**
	 * Service for transformation BPMM to Export BPMN
	 * @param inputFile		source file
	 * @param outputFile	target file
	 * @param projectPath	project path
	 */
	public static void toBpmnProcess(String inputFile, String outputFile, String projectPath) {
		toBpmnProcessAuxiliar(inputFile, outputFile, projectPath, "world1");
//		toBpmnProcessAuxiliar(inputFile, outputFile, projectPath, "world2");
//		toBpmnProcessAuxiliar(inputFile, outputFile, projectPath, "osmioticWorld");
	}
	
	public static void toBpmnProcessAuxiliar(String inputFile, String outputFile, String projectPath, String world) {
		String newOutputFile = outputFile;
		// create an atl transformation object
		ATLTransformation atlTransformation = new ATLTransformation();
		// init the atl transformation object
		atlTransformation.setSourceMetaModePath(ATLTransformation.META_MODEL_BPMN_PATH);
		atlTransformation.setSourceModelReferenceName("BPMN");
		atlTransformation.setTargetMetaModePath(ATLTransformation.META_MODEL_BPMN_DROOLS_PATH);
		atlTransformation.setTargetModelReferenceName("BPMN");
		
		if (world == "world1") {
			atlTransformation.setAtlPath(ATLTransformation.ATL_BPMN_BPMN_EXPORT_world1_PATH);
			newOutputFile = outputFile + "_world1.bpmn";
		}
		if (world == "world2") {
			atlTransformation.setAtlPath(ATLTransformation.ATL_BPMN_BPMN_EXPORT_world2_PATH);
			newOutputFile = outputFile + "_world2.bpmn";
		}
		if (world == "osmioticWorld") {
			atlTransformation.setAtlPath(ATLTransformation.ATL_BPMN_BPMN_EXPORT_osmioticWorld_PATH);
			newOutputFile = outputFile + "_osmioticWorld.bpmn";
		}
		
		//add transformation xlt
		atlTransformation.setNeedXsltTranformation(true);
		atlTransformation.setXltPath(ATLTransformation.XSLT_XMI_PATH);
		atlTransformation.initIntermediateFilePath(projectPath);
		
		// execute transformation
		atlTransformation.transformTest(inputFile, newOutputFile);
	}
	/*
	private void readFile(IFile source) {
        XMIResourceImpl resource = new XMIResourceImpl();        
        try {
			resource.load( new FileInputStream(source.getLocation().toOSString()), new HashMap<Object,Object>());
			model =((EaModel)resource.getContents().get(resource.getContents().size()-1));
	        root = model.getProcess();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
  }
	
	
	private void buildStructure() {   	
		HashMap<String,EaAnd> eaa = new HashMap<String, EaAnd>();
		HashMap<String,EaOr> eao = new HashMap<String, EaOr>();
		HashMap<String,EaOutputInputFlow> oifm = new HashMap<String,EaOutputInputFlow>();
		
		
    	//Filtering the process
    	for(EaFlowElement i : root.getFlowElements() ){
    		if(i instanceof EaOutputInputFlow){
    			oifm.put(i.getId(),(EaOutputInputFlow)i);
    		}else 
    			if(i instanceof EaAtomicExtendedActivity){ 
    				aem.put(i.getId(),(EaAtomicExtendedActivity)i);
    				if(((EaAtomicExtendedActivity)i).isIsStarting()){
    					orderedMap.put(1, i.getId());
    			}
    		}else 
    			if(i instanceof EaOr){
    				eao.put(i.getId(),(EaOr)i);
    		} else 
    			if(i instanceof EaAnd){
    				eaa.put(i.getId(), (EaAnd)i);
    			}
    	}*/
}
