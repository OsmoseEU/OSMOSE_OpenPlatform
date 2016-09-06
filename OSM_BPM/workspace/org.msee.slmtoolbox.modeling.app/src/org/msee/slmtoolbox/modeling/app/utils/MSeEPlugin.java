package org.msee.slmtoolbox.modeling.app.utils;

/**
 * Class constant for SLM Toolbox
 * @author fto
  */
public class MSeEPlugin {

	/** SSM PROJECT NATURE ID */
	public final static String ID_NATURE_SSM_PROJECT = "org.msee.slmtoolbox.modeling.nature";
	
	/** SSM PROJECT PLUGIN_ ID */
	public final static String ID_PLUGIN_SSM_PROJECT = "org.msee.slmtoolbox.modeling";
	
	/** MSEE PERSPECTIVE ID */
	public static final String MSEE_PERSPECTIVE_ID = "org.msee.slmtoolbox.modeling.app.perspectives.MSeEPerspective";
	/** PAPYRUS PERSPECTIVE ID */
	public static final String PAPYRUS_PERSPECTIVE_ID = "org.eclipse.papyrus.infra.core.perspective";

	
	/** Page layout constants */
	public class SsmPageLayout {

		/** MODEL EXPLORER VIEW ID */
		public static final String ID_MODEL_EXPLORER = "org.msee.slmtoolbox.modeling.app.view.modelexplorer";
		/** MODEL REPOSITORY VIEW ID */
		public static final String ID_MODEL_REPOSITORY = "org.msee.modelrepos.browser.views.ModelRepositoryView";
		
		/** Default constructor */
		private SsmPageLayout(){
		}
	}
	
	/** Project file constants */
	public class SsmProjectFile {

		/** bsm project type  **/
		public static final String BSM_PROJECT_TYPE= "project.bsm";

		/** Name for bsm project  **/
		public static final String BSM_PROJECT_TYPE_NAME= "BSM project";

		/** tim project type **/
		public static final String TIM_PROJECT_TYPE= "project.tim";

		/** Name for tim project **/
		public static final String TIM_PROJECT_TYPE_NAME= "TIM project";
		
		/** File name **/
		public static final String FILE_NAME = ".confmsse";
		
		/** Key to properties ssm id **/
		public static final String KEY_BSM_ID = "bsm.id";

		/** Seprator of properties key and value */
		public static final String SEPARATOR = " = ";

		public static final String KEY_TIM_ID = "tim.id";

		/** Default constructor */
		private SsmProjectFile(){
		}
	}
}
