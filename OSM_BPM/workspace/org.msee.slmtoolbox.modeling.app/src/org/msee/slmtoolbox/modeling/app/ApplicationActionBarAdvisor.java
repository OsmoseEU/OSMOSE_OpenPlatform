package org.msee.slmtoolbox.modeling.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarContributionItem;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.dialogs.WorkbenchWizardElement;
import org.eclipse.ui.internal.registry.ActionSetRegistry;
import org.eclipse.ui.internal.registry.IActionSetDescriptor;
import org.eclipse.ui.internal.wizards.AbstractExtensionWizardRegistry;
import org.eclipse.ui.wizards.IWizardCategory;
import org.eclipse.ui.wizards.IWizardDescriptor;

/**
 * manage tge configuration of the action bar
 */
@SuppressWarnings("restriction")
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	// Declaring all the Workbench Actions
	private IWorkbenchAction newAction;
	private IWorkbenchAction saveAction;
	private IWorkbenchAction exportAction;
	private IWorkbenchAction importAction;
	private IWorkbenchAction quitAction;
	private IWorkbenchAction aboutAction;
	private IWorkbenchAction preferencesAction;
	
    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    protected void makeActions(IWorkbenchWindow window) {
    	//All the actions are defined here.
    	newAction=ActionFactory.NEW.create(window);
    	newAction.setText("New");
    	register(newAction);
    	saveAction=ActionFactory.SAVE.create(window);
    	register(saveAction);
    	exportAction=ActionFactory.EXPORT.create(window);
    	register(exportAction);
    	importAction=ActionFactory.IMPORT.create(window);
    	register(importAction);
    	quitAction=ActionFactory.QUIT.create(window);
    	register(quitAction);
    	aboutAction=ActionFactory.ABOUT.create(window);
    	register(aboutAction);
    	preferencesAction = ActionFactory.PREFERENCES.create(window);
    	register(preferencesAction);
    	
    	
    	// Removing all action sets
    	//clearActionSets();
    	
    	// Removing wizard
    	AbstractExtensionWizardRegistry wizardRegistry = (AbstractExtensionWizardRegistry)WorkbenchPlugin.getDefault().getNewWizardRegistry();
    	IWizardCategory[] categories = WorkbenchPlugin.getDefault().getNewWizardRegistry().getRootCategory().getCategories();
    	// for all wizard categories
    	for(IWizardDescriptor wizard : getAllWizards(categories)){
    		WorkbenchWizardElement wizardElement = (WorkbenchWizardElement) wizard;
    		// If wizard isn't allowed 
    		if(!allowedWizard(wizardElement.getId())){
    			// remove it
    			wizardRegistry.removeExtension(wizardElement.getConfigurationElement().getDeclaringExtension(), new Object[]{wizardElement});
    		}
    	}
    }
    
    /**
     * Get all wizard for categories
     * @param categories target
     * @return wizard descriptor table
     */
    private IWizardDescriptor[] getAllWizards(IWizardCategory[] categories) {
		List<IWizardDescriptor> results = new ArrayList<IWizardDescriptor>();
		for(IWizardCategory wizardCategory : categories){
			results.addAll(Arrays.asList(wizardCategory.getWizards()));
			results.addAll(Arrays.asList(getAllWizards(wizardCategory.getCategories())));
		}
		return results.toArray(new IWizardDescriptor[0]);
	}
	
//    /** Wizard allowed list*/
//    protected static final List<String> FILE_NEW__ALLOWED_WIZARDS = Collections.unmodifiableList(Arrays.asList(new String[]{
//    		"org.msee.slmtoolbox.modeling.app.wizards.BsmModelingWizard", // BSM
//    		"org.msee.slmtoolbox.modeling.editor.eaStar.wizards.CreateEAStarWizard",  // EAStar
//    		"org.msee.slmtoolbox.modeling.editor.devs.wizards.CreateDevsWizard",  // Devs
//    		"org.msee.slmtoolbox.modeling.editor.graigrid.wizards.CreateGraiGridWizard", // GRAI GIRD
//    		"org.msee.slmtoolbox.modeling.app.wizards.TIMModelingWizard", // TIM
//    		"org.msee.slmtoolbox.modeling.app.wizards.EaToBpmngWizard", // EA to BPMN
//    		"org.msee.slmtoolbox.modeling.bpmn2.modeler.ui.diagram",	// BPMN
//    		"org.msee.slmtoolbox.modeling.uml.diagram.wizards.createmodel", // Papyrus
//    		"com.sap.research.msee.slmtoolbox.uml.wizards.activity", // SAP : This wizard creates a SLM Activity diagram.
//    		"com.sap.research.msee.slmtoolbox.uml.wizards.class", // SAP : This wizard creates a SLM Class diagram.
//    		"com.sap.research.msee.slmtoolbox.uml.wizards.state", // SAP : This wizard creates a SLM State diagram.
//    		"com.sap.research.msee.slmtoolbox.uml.wizards.sequence", // SAP : This wizard creates a SLM Sequence diagram.
//	}));
    
    /**
     * Test if wizard is allowed
     * @param wizardId	wizard id
     * @return true if id is in wizard allowed list
     */
    protected boolean allowedWizard(String wizardId) {
    	return wizardId.matches("org.msee.slmtoolbox.modeling.editor.eaStar.wizards.CreateEAStarWizard") ||
    			wizardId.matches("org.msee.slmtoolbox.modeling.app.wizards.EaToOsmosisProcessBpmngWizard") ||
    			wizardId.matches("org.msee.slmtoolbox.modeling.editor.eaStar.wizards.EaToOsmosisProcessBpmngWizard") ||
    			wizardId.matches("org.msee.slmtoolbox.modeling.app.wizards.TIMModelingWizard") ||
    			wizardId.matches("org.msee.slmtoolbox.modeling.app.wizards.BsmModelingWizard") ||
    			wizardId.matches("org.msee.slmtoolbox.modeling.bpmn2.modeler.ui.diagram");
    			
    			
    			//wizardId.matches("org.msee..*");
    			//|| wizardId.matches("com.sap..*")
    			//|| wizardId.matches("org.slmtoolbox..*");

//		return FILE_NEW__ALLOWED_WIZARDS.contains(wizardId);
	}
    
    /**
     * Remove actions automatically added by eclipse plug-ins
     * @param actionSetIds List of Ids
     */
    @SuppressWarnings("unused")
	private void clearActionSets() {
		ActionSetRegistry reg = WorkbenchPlugin.getDefault().getActionSetRegistry();
    	IActionSetDescriptor[] actionSets = reg.getActionSets();
        // remove unwanted UI contributions that eclipse makes by default
        IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
        for (int i = 0; i < windows.length; ++i) {
            IWorkbenchPage page = windows[i].getActivePage();
	
	    	for (int j = 0; j < actionSets.length; j++)
	    	{
	    		page.hideActionSet(actionSets[j].getId());
	    	}
        }
    }
    
    protected void fillCoolBar(ICoolBarManager coolBar) {
    	// adding the Actions to the CoolBar.
    	IToolBarManager toolbar = new ToolBarManager(SWT.FLAT | SWT.LEFT);
    	coolBar.add(new ToolBarContributionItem(toolbar, "main"));
    	toolbar.add(newAction);
    	toolbar.add(saveAction);
   	}

    protected void fillMenuBar(IMenuManager menuBar) {
    	// adding the Actions to the Menu Bar.
    	MenuManager fileMenu = new MenuManager("&File", IWorkbenchActionConstants.M_FILE);
    	menuBar.add(fileMenu);

    	fileMenu.add(newAction);
    	fileMenu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    	fileMenu.add(new Separator());
    	fileMenu.add(saveAction);
    	fileMenu.add(new Separator());
    	fileMenu.add(importAction);
    	fileMenu.add(exportAction);
    	fileMenu.add(new Separator());
    	
    	// for compatibility purpose, add an invisible "export" item
    	// example : a default GRAPHITI editor will try to add a menu after this element
    	ActionContributionItem exportItem = new ActionContributionItem(exportAction);
    	exportItem.setVisible(false);
    	fileMenu.add(exportItem);
    	
    	fileMenu.add(new Separator());
    	fileMenu.add(quitAction);

    	// for compatibility purpose, add an invisible "additions" separator
    	// example : a default EMF editor will try to add a "XXX Editor" menu after this separator
    	Separator addSep = new Separator();
    	addSep.setId("additions");
    	addSep.setVisible(false);
    	menuBar.add(addSep);
    	
    	//Window - Preferences
    	MenuManager WindowMenu = new MenuManager("&Window", IWorkbenchActionConstants.M_WINDOW);
    	menuBar.add(WindowMenu);
    	WindowMenu.add(preferencesAction);
    	
    	//Help & About
    	MenuManager helpMenu = new MenuManager("&Help", IWorkbenchActionConstants.M_HELP);
    	menuBar.add(helpMenu);
    	helpMenu.add(aboutAction);
    	
    	
    }
}
