package org.msee.slmtoolbox.modeling.editor.eaStar.util;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Properties class for eastar
 * @author nco
 *
 */
public class PropertiesEAStar {

	 private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(PropertiesEAStar.class);

	/** Name of file properties */
    public static final String FILE_PROPERTIE = "eastar_editor";

	/** Resource of file properties */
    public static final ResourceBundle BEANS_PROPERTIE = ResourceBundle.getBundle(FILE_PROPERTIE, Locale.ROOT); 


	/**
	 * eaStar properties 
	 * @author nco
	 */
    public static class EAStarProperties {

		/** Prefix of the Hibernate key properties */
		protected static String prefix = "eastar.core.";

    	/** Default constructor */
    	private EAStarProperties() {
    		
    	}
    }
    
	/**
	 * Wizard properties for eaStar editor
	 * @author nco
	 */
    public static class EAStarEditorWizardProperties {

		/** Wizard text when eaStar name is required*/
		public static final String REQUIRED_NAME_TEXT = 
    			 findString("eastar.wizard.required.name.text", "Extended actigram star name must be specified");

		/** Wizard text when eaStar organization is required*/
		public static final String REQUIRED_NAME_ORGANIZATION_TEXT = 
   			 findString("eastar.wizard.required.name.organization.text", "Organization name must be specified");

		/** Wizard text when eaStar code is required*/
		public static final String REQUIRED_CODE_TEXT = 
	   		findString("eastar.wizard.required.decomposition.code.text", "Code must be specified");

		/** Wizard text when eaStar decomposition code is required*/
		public static final String REQUIRED_DECOMPO_TEXT = 
		   	findString("eastar.wizard.required.decomposition.code.text", "Decomposition code must be specified");
		
		/** Diagram uri in project */
		public static final String DIAGRAM_NAME = 
    			 findString("eastar.wizard.project.diagram.name", "EAStar");

		/** Diagram extension */
		public static final String DIAGRAM_EXTENSION = 
   			 findString("eastar.wizard.diagram.file.extension", ".eastar");

		/** Diagram type */
		public static final String DIAGRAM_TYPE_ID = 
	   			 findString("eastar.wizard.diagram.type.id", "eaStar");

		/** title dialog for create a material resource */
		public static final String RESOURCE_MATERIAL_TITLE =
	   			 findString("eastar.wizard.resource.material.title", "Create a material resource");

		/** error text for create a material resource */
		public static final String RESOURCE_MATERIAL_ERROR =
	   			 findString("eastar.wizard.resource.material.error", "The material resource name is required");
		
		/** user question name for create a material resource */
		public static final String RESOURCE_MATERIAL_QUESTION =
	   			 findString("eastar.wizard.resource.material.question", "Enter new material resource name");

		/** title dialog for create a human resource */
		public static final String RESOURCE_HUMAN_TITLE =
	   			 findString("eastar.wizard.resource.human.title", "Create a human resource");

		/** error text for create a human resource */
		public static final String RESOURCE_HUMAN_ERROR =
	   			 findString("eastar.wizard.resource.human.error", "The human resource name is required");
		
		/** user question name for create a human resource */
		public static final String RESOURCE_HUMAN_QUESTION =
	   			 findString("eastar.wizard.resource.human.question", "Enter new human resource name");

		/** title dialog for create a IT resource */
		public static final String RESOURCE_IT_TITLE =
	   			 findString("eastar.wizard.resource.IT.title", "CreIT IT resource");

		/** error text for create a IT resource */
		public static final String RESOURCE_IT_ERROR =
	   			 findString("eastar.wizard.resource.IT.error", "The IT resource name is required");
		
		/** user question name for create a IT resource */
		public static final String RESOURCE_IT_QUESTION =
	   			 findString("eastar.wizard.resource.IT.question", "Enter new IT resource name");

		/** title dialog name for create a process connector */
		public static final String CONNECTOR_PROCESS_TITLE = 
	   			 findString("eastar.wizard.connector.process.title", "Create a process connector");

		/** error text for create a process connector */
		public static final String CONNECTOR_PROCESS_ERROR = 
	   			 findString("eastar.wizard.connector.process.error", "The process name is required");

		/** user question name for create a process connector */
		public static final String CONNECTOR_PROCESS_QUESTION = 
	   			 findString("eastar.wizard.connector.process.question", "Enter process name");
		
		/** title dialog name for create an organization */
		public static final String ORGANIZATION_TITLE = 
	   			 findString("eastar.wizard.organization.title", "Create an organization");

		/** error text for create a process connector */
		public static final String ORGANIZATION_ERROR = 
	   			 findString("eastar.wizard.organization.error", "The organization name is required");

		/** user question name for create a process connector */
		public static final String ORGANIZATION_QUESTION = 
	   			 findString("eastar.wizard.organization.question", "Enter organization name");

		/** Default constructor */
    	private EAStarEditorWizardProperties() {
    		
    	}
    }

    /**
	 * Style properties for eastar editor
	 * @author fto
	 */
    public static class EAStarStyle {

    	/** Text size for graphical style */
		public static final int TEXT_SIZE =  findInt("eastar.style.text.size", 10);

    	/** Default font for graphical style */
		public static final String DEFAULT_FONT = findString("eastar.style.text.font", "Arial");

		/** Default constructor */
    	private EAStarStyle() {
    		
    	}
    }
    
	/** 
	 * Find a value properties for a key 
	 * @param key of value
	 * @param defaultValue for the key
	 * 
	 * @return String value link at key or defaultValue if value not found
	 * */
	protected static String findString(String key, String defaultValue) {
		try {
			if (null!=BEANS_PROPERTIE)
				return BEANS_PROPERTIE.getString(key);
		} catch (MissingResourceException exception) {
			log.warn(" key [" + key + "] not found, use default value : " + defaultValue + "\n");
		}
		return defaultValue;
	}
	
	/** 
	 * Find a value properties for a key 
	 * @param key of value
	 * @param defaultValue for the key
	 * 
	 * @return int value link at key or defaultValue if value not found
	 * */
	protected static int findInt(String key, int defaultValue) {
		String valueString = findString(key, null);
		if (null != valueString) {
			try {
				return Integer.valueOf(valueString).intValue();
			} catch (NumberFormatException exception) {
				log.warn(" key [" + key + "] not found, use default value : " + defaultValue + "\n");
			}
		}
		return defaultValue;
	}

	/** Default constructor */
	private PropertiesEAStar() {
		
	}
}
