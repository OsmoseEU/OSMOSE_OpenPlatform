package org.msee.slmtoolbox.modeling.app.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.msee.slmtoolbox.modeling.app.service.OsmoseWorldObject;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAnd;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaControlFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOr;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOutputInputFlow;

//THIS CLASS IS JUST FOR PROOF OF CONCEPT
public class EaStarProjectManagerImpl {

	private static EaProcess root;
	
	public static List<OsmoseWorldObject> osmoseWorlds; 

    public static void validateFile(IFile source) {
            XMIResourceImpl resource = new XMIResourceImpl();
            int index;
            
            try {
				resource.load( new FileInputStream(source.getLocation().toOSString()), new HashMap<Object,Object>());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            index = resource.getContents().size()-1;
            root = ((EaModel)resource.getContents().get(index)).getProcess();
            osmoseWorlds = new ArrayList<OsmoseWorldObject>();
            buildOsmoticLinks();
            printOsmoticLinks(); //DEBUG LINE
      }

    public static int ValidateModel(){
    	int ret = -1, aux;
    	for( OsmoseWorldObject i : osmoseWorlds){
    		
    		switch(i.getTransformation()){
    			case "DIGITALIZATION" : aux = 0; break;
    			case "VIRTUALIZATION": aux = 1; break;
    			case "ACTUATION": aux = 2;break;
    			case "SIMULATION": aux = 3;break;
    			case "AUGMENTATION": aux = 4;break;
    			case "ENRICHMENT": aux = 5;break;
    			default: aux=-1;
    		}
    		
    		if(aux == -1) continue;
    		if(ret >= 0 && aux >= 0 && aux!=ret ) return -2;
    		ret = aux;
    	}
    	
    	return ret;
    }
    
    private static void buildOsmoticLinks(){
    	Map<String,EaOutputInputFlow> supFlow = new HashMap<String,EaOutputInputFlow>();
    	Map<String,EaControlFlow> controlFlow = new HashMap<String,EaControlFlow>();
    	Map<String,EaAtomicExtendedActivity> acFlow = new HashMap<String,EaAtomicExtendedActivity>();
    	Map<String,EaAnd> andFlow = new HashMap<String,EaAnd>();
    	Map<String,EaOr> orFlow = new HashMap<String,EaOr>();
    	
    	EList<EaFlowElement> aux = root.getFlowElements();
    	EaFlowElement myAux;
    	EaAtomicExtendedActivity EaAtomicTo,EaAtomicFrom;
    	OsmoseWorldObject osmoseObject;
    	
    	
    	for(Iterator<EaFlowElement> i = aux.iterator();i.hasNext() ; ){
    		myAux = (EaFlowElement)i.next();
    		
    		if(myAux.getId().contains("EaOutputInputFlowImpl")){
    			supFlow.put(myAux.getId(),(EaOutputInputFlow)myAux);
    		}else if(myAux.getId().contains("EaAtomicExtendedActivityImpl")){
    			acFlow.put(myAux.getId(),(EaAtomicExtendedActivity)myAux);
    		}
    		else if(myAux.getId().contains("EaAndImpl")){
    			andFlow.put(myAux.getId(),(EaAnd)myAux);
    		}
    		else if(myAux.getId().contains("EaOrImpl")){
    			orFlow.put(myAux.getId(),(EaOr)myAux);
    		}else if(myAux.getId().contains("EaControlFlowImpl")){
    			controlFlow.put(myAux.getId(),(EaControlFlow)myAux);
    		}
    	}
    	
    	//validation it self
    	for(EaOutputInputFlow i : supFlow.values()){
    		if(i.getSource() == null || i.getTarget() == null ||
    				!i.getSource().getId().toString().contains("EaAtomicExtendedActivityImpl") || 
    				!i.getTarget().getId().toString().contains("EaAtomicExtendedActivityImpl")) continue;
    		osmoseObject = new OsmoseWorldObject();
    		
        	EaAtomicTo = acFlow.get(i.getTarget().getId().toString());
    		EaAtomicFrom = acFlow.get(i.getSource().getId().toString());
    		osmoseObject.from = EaAtomicFrom.getName();
    		osmoseObject.fromWorld = (EaAtomicFrom.getOsmoseWorld().isEmpty())? "REAL" : EaAtomicFrom.getOsmoseWorld();
    		osmoseObject.to = EaAtomicTo.getName();
    		osmoseObject.toWorld= (EaAtomicTo.getOsmoseWorld().isEmpty())? "REAL" : EaAtomicTo.getOsmoseWorld();
    		osmoseObject.setTransformation();   
    		osmoseWorlds.add(osmoseObject);
    	}
    	
    	//CONTROL FLOW
    	for(EaControlFlow i : controlFlow.values()){
    		if(i.getSource() == null || i.getTarget() == null ||
    				!i.getSource().getId().toString().contains("EaAtomicExtendedActivityImpl") || 
    				!i.getTarget().getId().toString().contains("EaAtomicExtendedActivityImpl")) continue;
    		osmoseObject = new OsmoseWorldObject();

        	EaAtomicTo = acFlow.get(i.getTarget().getId().toString());
    		EaAtomicFrom = acFlow.get(i.getSource().getId().toString());
    		osmoseObject.from = EaAtomicFrom.getName();
    		osmoseObject.fromWorld = (EaAtomicFrom.getOsmoseWorld().isEmpty())? "REAL" : EaAtomicFrom.getOsmoseWorld();
    		osmoseObject.to = EaAtomicTo.getName();
    		osmoseObject.toWorld= (EaAtomicTo.getOsmoseWorld().isEmpty())? "REAL" : EaAtomicTo.getOsmoseWorld();
    		osmoseObject.setTransformation();   
    		osmoseWorlds.add(osmoseObject);
    	}
    	
    	//Validate EaAnd and EaOr should be inside
    	for(EaAnd i : andFlow.values()){
    		for(EaFlow j: i.getInFlows()){
    			for(EaFlow k : i.getOutFlows()){
    				osmoseObject = new OsmoseWorldObject();    				
    				EaAtomicTo = acFlow.get(k.getTarget().getId().toString());
    	    		EaAtomicFrom = acFlow.get(j.getSource().getId().toString());
    	    		osmoseObject.from = EaAtomicFrom.getName();
    	    		osmoseObject.fromWorld = (EaAtomicFrom.getOsmoseWorld().isEmpty())? "REAL" : EaAtomicFrom.getOsmoseWorld();
    	    		osmoseObject.to = EaAtomicTo.getName();
    	    		osmoseObject.toWorld= (EaAtomicTo.getOsmoseWorld().isEmpty())? "REAL" : EaAtomicTo.getOsmoseWorld();
    	    		osmoseObject.setTransformation();   
    	    		osmoseWorlds.add(osmoseObject);
    			}
    		}   	
    	}
    	
    	for(EaOr i : orFlow.values()){
    		for(EaFlow j: i.getInFlows()){
    			for(EaFlow k : i.getOutFlows()){
    				osmoseObject = new OsmoseWorldObject();
    				
    				EaAtomicTo = acFlow.get(k.getTarget().getId().toString());
    	    		EaAtomicFrom = acFlow.get(j.getSource().getId().toString());
    	    		osmoseObject.from = EaAtomicFrom.getName();
    	    		osmoseObject.fromWorld = (EaAtomicFrom.getOsmoseWorld().isEmpty())? "REAL" : EaAtomicFrom.getOsmoseWorld();
    	    		osmoseObject.to = EaAtomicTo.getName();
    	    		osmoseObject.toWorld= (EaAtomicTo.getOsmoseWorld().isEmpty())? "REAL" : EaAtomicTo.getOsmoseWorld();
    	    		osmoseObject.setTransformation();   
    	    		osmoseWorlds.add(osmoseObject);
    			}
    		}   	
    	}
    	
    }
    
    private static void printOsmoticLinks()
    {
    	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n*********************");
    	for(OsmoseWorldObject i : osmoseWorlds)
    		System.out.println("From: " + i.from + " World : " + i.fromWorld + " Transformation: " + i.getTransformation() 
    				+ " To: " + i.to + " World: " + i.toWorld);
    	
    	System.out.println("*********************\n");
    }
}
 