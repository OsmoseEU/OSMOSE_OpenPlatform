package org.msee.slmtoolbox.modeling.service.app.lang.eastar.Osmose;

public class DiagramLink {
	
	public DiagramLink(int target, String fromWorld, String toWorld){
		this.target = target;
		this.transformation = selectTransformation(fromWorld,toWorld);
	}
	
	public DiagramLink(int target, String transformation){
		this.transformation = transformation;
		this.target = target;
	}
	
	private int target;
	private String transformation;
	
	public int getTarget(){
		return target;
	}
	
	
	public String getTransformation(){
		return transformation;
	}
	
	private String selectTransformation(String fromWorld, String toWorld){
		if(fromWorld.equalsIgnoreCase("REAL") && toWorld.equalsIgnoreCase("DIGITAL")){
			return "DIGITALIZATION";
		}else 
			if(fromWorld.equalsIgnoreCase("REAL") && toWorld.equalsIgnoreCase("VIRTUAL")){
				return "VIRTUALIZATION";
			}else
				if(fromWorld.equalsIgnoreCase("DIGITAL") && toWorld.equalsIgnoreCase("REAL")){
					return "ACTUATION";
				} else 
					if(fromWorld.equalsIgnoreCase("DIGITAL") && toWorld.equalsIgnoreCase("VIRTUAL")){
						return "SIMULATION";
					}else
						if(fromWorld.equalsIgnoreCase("VIRTUAL") && toWorld.equalsIgnoreCase("REAL")){
							return "AUGMENTATION";
						}
						else if(fromWorld.equalsIgnoreCase("VIRTUAL") && toWorld.equalsIgnoreCase("DIGITAL")){
							return "ENRICHMENT";
						}
						else{
							return "N/a";
						}
	}
}
