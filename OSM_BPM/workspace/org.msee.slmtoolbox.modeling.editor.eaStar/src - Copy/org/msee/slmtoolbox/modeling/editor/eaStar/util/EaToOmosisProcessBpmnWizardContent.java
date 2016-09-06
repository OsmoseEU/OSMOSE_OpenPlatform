package org.msee.slmtoolbox.modeling.editor.eaStar.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.Osmose.OsmioticRelation;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.Osmose.impl.OsmoseService;

public class EaToOmosisProcessBpmnWizardContent {
	public OsmoseService osmoseService;
	public HashMap<String,OsmioticRelation> osmioticProcess;

	public String selectedProcess; //OsmioticProcess
	public String selectedRelation; //Activity
	public String selectedEvent; //OsmioticEvent
	
	
	public String buildStatus(){		 
		osmoseService.buildPath(osmioticProcess.get(selectedRelation));
		StringBuilder builder = new StringBuilder();
		builder.append("Activities : \n");
		for(String a : osmoseService.getAllFinalActivities().keySet()){
			builder.append(a+"\n");
		}
		return builder.toString();
	}
	
	public String[] listOfProcess(){
		 List<String> where = new ArrayList<String>();
		 for (Entry<String, OsmioticRelation> entry : osmioticProcess.entrySet()) {			 
	 			if (selectedProcess.equalsIgnoreCase(entry.getValue().getOsmioticProcess())) {
	 				where.add(entry.getKey());
	 			}
			}
		 
		 String[] simpleArray = new String[ where.size() ];
		 where.toArray( simpleArray );
		 
		 return simpleArray;
	}
}
