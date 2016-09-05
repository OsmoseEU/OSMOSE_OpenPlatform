package org.msee.slmtoolbox.modeling.app.service;

public class OsmoseWorldObject{
	public OsmoseWorldObject(){
	}
	public String from;
	public String fromWorld;
	public String to;
	private String Transformation;
	public String toWorld;
	
	public String getTransformation(){
		return Transformation;
	}
	
	public void setTransformation(){
		if(fromWorld.equalsIgnoreCase("REAL") && toWorld.equalsIgnoreCase("DIGITAL")){
			Transformation = "DIGITALIZATION";
		}else 
			if(fromWorld.equalsIgnoreCase("REAL") && toWorld.equalsIgnoreCase("VIRTUAL")){
				Transformation = "VIRTUALIZATION";
			}else
				if(fromWorld.equalsIgnoreCase("DIGITAL") && toWorld.equalsIgnoreCase("REAL")){
					 Transformation = "ACTUATION";
				} else 
					if(fromWorld.equalsIgnoreCase("DIGITAL") && toWorld.equalsIgnoreCase("VIRTUAL")){
						Transformation = "SIMULATION";
					}else
						if(fromWorld.equalsIgnoreCase("VIRTUAL") && toWorld.equalsIgnoreCase("REAL")){
							Transformation = "AUGMENTATION";
						}
						else if(fromWorld.equalsIgnoreCase("VIRTUAL") && toWorld.equalsIgnoreCase("DIGITAL")){
							Transformation = "ENRICHMENT";
						}
						else{
							Transformation = "N/a";
						}
	}
	
}