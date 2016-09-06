package org.msee.slmtoolbox.modeling.editor.graigrid.utils;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Properties class for grai grid
 * @author fto
 *
 */
public class PropertiesGraiGrid {
	
	/** log */
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(PropertiesGraiGrid.class);

	/** Name of file properties */
    public static final String FILE_PROPERTIE = "grai_grid_editor";

	/** Resource of file properties */
    public static final ResourceBundle BEANS_PROPERTIE = ResourceBundle.getBundle(FILE_PROPERTIE, Locale.ROOT); 


	/**
	 * Grai grid properties 
	 * @author fto
	 */
    public static class GraiGridProperties {

		/** Prefix of the Hibernate key properties */
		protected static String prefix = "graigrid.core.";

    	/** Default constructor */
    	private GraiGridProperties() {
    		
    	}
    }

	/**
	 * Decision Framework properties 
	 * @author nco
	 */
	public static class DecisionFrameProperties {

		/** Menu : name */
		public static final String MENU_ENTRY_NAME = findString("graigrid.decision.framework.menu.entry.name", "Decision frame");

		/** Menu : tooltip */
		public static final String MENU_ENTRY_TOOLTIP = findString("graigrid.decision.framework.menu.entry.tooltip", 
				"Create a Decision framework");
		
		
		/** Default constructor */
		private DecisionFrameProperties() {
			
		}

	}

	/**
	 * Collaborative Decision properties 
	 * @author fto
	 */
	public static class CollaborativeDecisionProperties {

		/** Menu : name */
		public static final String MENU_ENTRY_NAME = findString("graigrid.collaborative.decision.menu.entry.name", "Collaborative decision");

		/** Menu : tooltip */
		public static final String MENU_ENTRY_TOOLTIP = findString("graigrid.collaborative.decision.menu.entry.tooltip", 
				"Create a Collaborative decision");
		
		
		/** Default constructor */
		private CollaborativeDecisionProperties() {
			
		}

	}
	
	

	/**
	 * Information Flow properties 
	 * @author nco
	 */
	public static class InformationFlowProperties {

		/** Menu : name */
		public static final String MENU_ENTRY_NAME = findString("graigrid.information.flow.menu.entry.name", "Information flow");

		/** Menu : tooltip */
		public static final String MENU_ENTRY_TOOLTIP = findString("graigrid.information.flow.menu.entry.tooltip", 
				"Create Information flow");
		
		
		/** Default constructor */
		private InformationFlowProperties() {
			
		}

	}

	/**
	 * Center properties 
	 * @author fto
	 */
	public static class CenterProperties {

		/** wizard title */
		public static final String TITLE_DECISION = findString("graigrid.center.decision.wizard.title", "Create decision center");
		
		/** wizard question for decision center */
		public static final String USER_QUESTION_NAME_DECISION = findString("graigrid.center.decision.wizard.question", 
				"Enter new decision center name");

		/** wizard question for function grai */
		public static final String USER_QUESTION_SELECT_FUNCTION = findString("graigrid.center.decision.wizard.question.function", 
				"Function grai");

		/** wizard question for decision level */
		public static final String USER_QUESTION_SELECT_LEVEL = findString("graigrid.center.decision.wizard.question.decision.level", 
				"Level");

		/** wizard error message for name decision */
		public static final String WIZARD_ERROR_NAME_DECISION = findString("graigrid.center.decision.wizard.error.decision.center", 
				"The decision center name is required");
		/** wizard default function name */
		public static final String DEFAULT_NAME_DECISION = findString("graigrid.center.decision.wizard.default.value", "<decision center name>");

		/** Menu : name */
		public static final String MENU_ENTRY_NAME_DECISION = findString("graigrid.center.decision.menu.entry.name", "Decision center");

		/** Menu : tooltip */
		public static final String MENU_ENTRY_TOOLTIP_DECISION = findString("graigrid.center.decision.menu.entry.tooltip", 
				"Create decision center");

		/** wizard title for information center */
		public static final String TITLE_INFORMATION = findString("graigrid.center.information.wizard.title", "Create an information center");
		
		/** wizard question for information center */
		public static final String USER_QUESTION_NAME_INFORMATION = findString("graigrid.center.information.wizard.question", 
				"Enter new information center name");
		
		public static final String USER_QUESTION_SELECT_INFORMATION = findString("graigrid.center.information.wizard.question.source", 
				"Information source grai");

		/** information center name required */
		public static final String WIZARD_ERROR_NAME_INFORMATION = findString("graigrid.center.information.wizard.error.decision.center", 
				"The decision center name is required");
		
		/** wizard default information center name */
		public static final String DEFAULT_NAME_INFORMATION = findString("graigrid.center.information.wizard.default.value", "<information center name>");

		/** Menu : name */
		public static final String MENU_ENTRY_NAME_INFORMATION = findString("graigrid.center.information.menu.entry.name", "Information center");

		/** Menu : tooltip */
		public static final String MENU_ENTRY_TOOLTIP_INFORMATION = findString("graigrid.center.information.menu.entry.tooltip", 
				"Create an information center");


		
		/** Default constructor */
		private CenterProperties() {
			
		}

	}
	
	/**
	 * Organization properties 
	 * @author fto
	 */
	public static class OrganizationProperties {

		/** wizard title */
		public static final String TITLE = findString("graigrid.organization.wizard.title", "Create Organization");
		
		/** wizard question*/
		public static final String USER_QUESTION_NAME = findString("graigrid.organization.wizard.question", "Enter new organization name");

		/** wizard default function name */
		public static final String DEFAULT_NAME = findString("graigrid.organization.wizard.default.value", "<organization name>");

		/** Menu : name */
		public static final String MENU_ENTRY_NAME = findString("graigrid.organization.menu.entry.name", "Organization");

		/** Menu : tooltip */
		public static final String MENU_ENTRY_TOOLTIP = findString("graigrid.organization.menu.entry.tooltip", "Create Organization");
		
		/** wizard error decision level name required */
		public static final String ERROR_NAME_REQUIRED = findString("graigrid.organization.wizard.error.name.required", "Organization name must be specified");
		
		/** Default constructor */
		private OrganizationProperties() {
			
		}

	}

	/**
	 * Function properties 
	 * @author fto
	 */
	public static class FunctionProperties {

		/** wizard title */
		public static final String TITLE = findString("graigrid.function.wizard.title", "Create Enterprise function");
		
		/** wizard question*/
		public static final String USER_QUESTION_NAME = findString("graigrid.function.wizard.question", "Enter new enterprise function name");

		/** wizard default function name */
		public static final String DEFAULT_NAME = findString("graigrid.function.wizard.default.value", "<enterprise function name>");

		/** Menu : name */
		public static final String MENU_ENTRY_NAME = findString("graigrid.function.menu.entry.name", "Enterprise function");

		/** Menu : tooltip */
		public static final String MENU_ENTRY_TOOLTIP = findString("graigrid.function.menu.entry.tooltip", "Create Enterprise function");
		
		/** wizard error decision level name required */
		public static final String ERROR_NAME_REQUIRED = findString("graigrid.function.wizard.error.name.required", "Function name must be specified");
		
		/** Default constructor */
		private FunctionProperties() {
			
		}

	}

	/**
	 * Decision Level properties 
	 * @author nco
	 */
	public static class LevelProperties {

		/** wizard title */
		public static final String TITLE = findString("graigrid.level.wizard.title", "Create level");
		
		/** wizard question*/
		public static final String USER_QUESTION_NAME = findString("graigrid.level.wizard.question", "Enter new level name and code");

		/** wizard default decision level name */
		public static final String DEFAULT_NAME = findString("graigrid.level.wizard.default.value", "<level name>");

		/** wizard decision level name */
		public static final String DECISION_NAME = findString("graigrid.level.wizard.decision.name", "Name");

		/** wizard decision level code */
		public static final String DECISION_CODE = findString("graigrid.level.wizard.decision.code", "Code");

		/** wizard error decision level name required */
		public static final String ERROR_NAME_REQUIRED = findString("graigrid.level.wizard.error.name.required", "Level name must be specified");

		/** wizard error decision level name is default value */
		public static final String ERROR_NAME_DEFAULT = findString("graigrid.level.wizard.error.name.default", "Level name must not be default value");

		/** wizard default decision level code */
		public static final String DEFAULT_CODE = findString("graigrid.level.wizard.default.code", "<level code>");

		/** wizard error decision level code is default value */
		public static final String ERROR_CODE_DEFAULT = findString("graigrid.level.wizard.error.code.default", "Level code must not be default value");

		/** Menu : name */
		public static final String MENU_ENTRY_NAME = findString("graigrid.level.menu.entry.name", "Level");

		/** Menu : tooltip */
		public static final String MENU_ENTRY_TOOLTIP = findString("graigrid.level.menu.entry.tooltip", "Create level");
		
		/** Default constructor */
		private LevelProperties() {
			
		}
	}
	
	/**
	 * Wizard properties for grai grid editor
	 * @author fto
	 */
    public static class GraiGridEditorWizardProperties {
		
		/** Wizard title for create a graigrid */
    	public static final String GRAI_GRID_TITLE =  
   			 findString("graigrid.wizard.title", "Create a GRAI grid");

		/** Wizard description for create a graigrid */
		public static final String GRAI_GRID_DESCRIPTION = 
	   			 findString("graigrid.wizard.description", "This wizard creates a new GRAI grid for a Service System Modeling.");

		/** Wizard icon for create a graigrid */
		public static final String GRAI_GRID_ICON_PATH = 
	   			 findString("graigrid.wizard.icon.path", "icons/64/riggrai_logo.64.png");
		
		/** Wizard text when enterprise name is required*/
    	public static final String REQUIRED_NAME_ENTERPRISE_TEXT = 
    			 findString("graigrid.wizard.required.enterprise.text", "The enterprise name must be specified");

		/** Wizard text when grai grid name is required*/
		public static final String REQUIRED_NAME_GRAIGRID_TEXT = 
    			 findString("graigrid.wizard.required.graigrid.text", "The grai grid name must be specified");

		/** Wizard text when grai grid name is required*/
		public static final String DIAGRAM_NAME = 
    			 findString("graigrid.wizard.diagram.name", "Grai grid");

		/** Diagram extension */
		public static final String DIAGRAM_EXTENSION = 
   			 findString("graigrid.wizard.diagram.file.extension", ".graigrid");

		public static final String DIAGRAM_TYPE_ID = 
	   			 findString("graigrid.wizard.diagram.type.id", "graiGrid");

		/** Default constructor */
    	private GraiGridEditorWizardProperties() {
    		
    	}
    }
    
    /**
	 * Style properties for grai grid editor
	 * @author fto
	 */
    public static class GraiGridStyle {

    	/** text size for graphical style */
		public static final int TEXT_SIZE =  findInt("graigrid.style.text.size", 10);

    	/** default font for graphical style */
		public static final String DEFAULT_FONT = findString("graigrid.style.text.font", "Arial");

		/** Default constructor */
    	private GraiGridStyle() {
    		
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
	private PropertiesGraiGrid() {
		
	}
}
