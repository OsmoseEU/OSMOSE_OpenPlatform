package org.msee.slmtoolbox.modeling.app.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin.SsmPageLayout;

/**
 * This class is meant to serve as an example for how various contributions are
 * made to a perspective. Note that some of the extension point id's are
 * referred to as API constants while others are hardcoded and may be subject to
 * change.
 */
public class MSeEPerspective implements IPerspectiveFactory {
	
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(MSeEPerspective.class);
	
	/** Page factory */
	private IPageLayout factory;

	/** Default construct */
	public MSeEPerspective() {
		super();
	}

	/**
	 * Initialize the perspective's layout
	 */
	public void createInitialLayout(IPageLayout factory) {
		
		log.debug("Initialization of the 'MSeEPerspective' layout");
		
		this.factory = factory;
		addViews();
		addActionSets();
		addNewWizardShortcuts();
		addPerspectiveShortcuts();
		addViewShortcuts();
	}

	/**
	 * add views
	 */
	private void addViews() {
		// Creates the overall folder layout.
		// Note that each new Folder uses a percentage of the remaining
		// EditorArea.

		String editorArea = factory.getEditorArea();
		
		// explorer : left screen
		IFolderLayout left = factory.createFolder("left", // NON-NLS-1
				IPageLayout.LEFT, 0.26f, editorArea);
		left.addView(IPageLayout.ID_PROJECT_EXPLORER);

		// properties : bottom screen
		IFolderLayout bottom = factory.createFolder("bottom", // NON-NLS-1
				IPageLayout.BOTTOM, 0.74f, editorArea);
		bottom.addView(IPageLayout.ID_PROP_SHEET);

		// Model Repository : left bottom screen
		IFolderLayout leftBottom = factory.createFolder("leftBottom", // NON-NLS-1
				IPageLayout.BOTTOM, 0.74f, "left");
		leftBottom.addView(SsmPageLayout.ID_MODEL_REPOSITORY);
		
		// model explorer : bottom right screen
		//IFolderLayout bottomRight = factory.createFolder("bottomRight", // NON-NLS-1
		//		IPageLayout.RIGHT, 0.74f, "bottom");
		
		//bottomRight.addView(SsmPageLayout.ID_MODEL_EXPLORER);
	}

	/**
	 * Add the actions set specific to this perspective
	 */
	private void addActionSets() {
		/*factory.addActionSet(JavaUI.ID_ACTION_SET);
		factory.addActionSet(JavaUI.ID_ELEMENT_CREATION_ACTION_SET);
		factory.addActionSet(IPageLayout.ID_NAVIGATE_ACTION_SET);*/
	}

	/**
	 * Add the perspectives shortcuts set to perspective
	 */
	private void addPerspectiveShortcuts() {
	}

	/**
	 * Add the new wizard shortcuts set to perspective
	 */
	private void addNewWizardShortcuts() {
		//factory.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");// NON-NLS-1
		//factory.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");// NON-NLS-1
	}

	/**
	 * Add the view shortcuts set to perspective
	 */
	private void addViewShortcuts() {
		factory.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
		factory.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
		factory.addShowViewShortcut(SsmPageLayout.ID_MODEL_EXPLORER);
	}

}
