package org.msee.slmtoolbox.modeling.service.app.lang.eastar.Osmose;

public class OsmioticRelation {
	
	public OsmioticRelation(String osmioticProcess,String sourceName,
			String targetName,String sourceId,String targetId,int sourceInternalId, int targetInternalId){
	
		this.osmioticProcess = osmioticProcess;
		this.sourceName = sourceName;
		this.targetId = targetId;
		this.sourceId = sourceId;
		this.targetName = targetName;
		this.sourceInternalId = sourceInternalId;
		this.targetInternalId = targetInternalId;
	}
	
	private String osmioticProcess;
	private String sourceName;
	private String targetName;
	private String sourceId;
	private String targetId;
	private int targetInternalId;
	private int sourceInternalId;
	
	public int getTargetInternalId() {
		return targetInternalId;
	}
	
	public int getSourceInternalId() {
		return sourceInternalId;
	}
	
	public String getTargetId() {
		return targetId;
	}

	public String getSourceId() {
		return sourceId;
	}

	public String getTargetName() {
		return targetName;
	}

	public String getSourceName() {
		return sourceName;
	}

	public String getOsmioticProcess() {
		return osmioticProcess;
	}

	@Override
	public String toString(){
		return "Process: " + osmioticProcess + " Source: " + sourceName +
				" Target: " + targetName;
	}
}
