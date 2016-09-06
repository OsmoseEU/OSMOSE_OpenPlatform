/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts;

/**
 * 
 * 
 */
public class ITRelatedPartViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * TimEnterpriseApplicationResource view descriptor
	 * 
	 */
	public static class TimEnterpriseApplicationResource {
		public static class Properties {
	
			
			public static String name = "ITRelatedPart::TimEnterpriseApplicationResource::properties::name";
			
			
			public static String function = "ITRelatedPart::TimEnterpriseApplicationResource::properties::function";
			
			
			public static String type = "ITRelatedPart::TimEnterpriseApplicationResource::properties::type";
			
			
			public static String processes = "ITRelatedPart::TimEnterpriseApplicationResource::properties::processes";
			
			
			public static String model = "ITRelatedPart::TimEnterpriseApplicationResource::properties::model";
			
			
			public static String organizationUnit = "ITRelatedPart::TimEnterpriseApplicationResource::properties::organizationUnit";
			
			
			public static String services = "ITRelatedPart::TimEnterpriseApplicationResource::properties::services";
			
			
			public static String description = "ITRelatedPart::TimEnterpriseApplicationResource::properties::description";
			
			
			public static String functionality = "ITRelatedPart::TimEnterpriseApplicationResource::properties::functionality";
			
			
			public static String characteristics = "ITRelatedPart::TimEnterpriseApplicationResource::properties::characteristics";
			
			
			public static String informations = "ITRelatedPart::TimEnterpriseApplicationResource::properties::informations";
			
	
		}
	
	}

	/**
	 * TimInformationSet view descriptor
	 * 
	 */
	public static class TimInformationSet {
		public static class Properties {
	
			
			public static String name = "ITRelatedPart::TimInformationSet::properties::name";
			
			
			public static String entrepriseApplications = "ITRelatedPart::TimInformationSet::properties::entrepriseApplications";
			
			
			public static String model = "ITRelatedPart::TimInformationSet::properties::model";
			
	
		}
	
	}

	/**
	 * TimInformationEntity view descriptor
	 * 
	 */
	public static class TimInformationEntity {
		public static class Properties {
	
			
			public static String name = "ITRelatedPart::TimInformationEntity::properties::name";
			
			
			public static String outRelations = "ITRelatedPart::TimInformationEntity::properties::outRelations";
			
			
			public static String inRelations = "ITRelatedPart::TimInformationEntity::properties::inRelations";
			
			
			public static String information = "ITRelatedPart::TimInformationEntity::properties::information";
			
	
		}
	
	}

	/**
	 * TimInformationRelationship view descriptor
	 * 
	 */
	public static class TimInformationRelationship {
		public static class Properties {
	
			
			public static String name = "ITRelatedPart::TimInformationRelationship::properties::name";
			
			
			public static String type = "ITRelatedPart::TimInformationRelationship::properties::type";
			
			
			public static String sourceEntity = "ITRelatedPart::TimInformationRelationship::properties::sourceEntity";
			
			
			public static String targetEntity = "ITRelatedPart::TimInformationRelationship::properties::targetEntity";
			
			
			public static String information = "ITRelatedPart::TimInformationRelationship::properties::information";
			
	
		}
	
	}

	/**
	 * TimInformationAttribute view descriptor
	 * 
	 */
	public static class TimInformationAttribute {
		public static class Properties {
	
			
			public static String name = "ITRelatedPart::TimInformationAttribute::properties::name";
			
			
			public static String type = "ITRelatedPart::TimInformationAttribute::properties::type";
			
			
			public static String informationEntity = "ITRelatedPart::TimInformationAttribute::properties::informationEntity";
			
	
		}
	
	}

}
