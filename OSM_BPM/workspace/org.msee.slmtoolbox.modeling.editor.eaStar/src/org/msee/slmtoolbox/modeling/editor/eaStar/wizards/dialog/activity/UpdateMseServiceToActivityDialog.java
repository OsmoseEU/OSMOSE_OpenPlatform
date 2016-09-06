package org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity.service.InfoServicePanel;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity.service.SelectServicePanel;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity.service.SelectServiceTypologyPanel;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * Dialog for update a MseService to BsmProcess
 * @author fto
 *
 */
public class UpdateMseServiceToActivityDialog extends JDialog {

    /** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
    /** App service */
	private EAStarAppService service;
	
	/** Activity to update */
	private EaStructuralExtendedActivity activity;

	/** Page for show service informations */
	private InfoServicePanel infoCurrentServicePanel;
	
	/** Page for select a service typology */
	private SelectServiceTypologyPanel selectServiceTypologyPanel;

	/** Page for select a service */
	private SelectServicePanel selectServicePanel;

	/** Page for show service informations */
	private InfoServicePanel infoServicePanel;
	
	/** cancel action listener for wizard */
	private ActionListener cancelAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			cancel();
		}
	};
	
	/** code response Window.CANCEL or Window.OK */
	int codeResponse;

	/** Display select service typology action listener for wizard */
	private ActionListener dislaySelectServiceTypologyAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dislaySelectServiceTypology();
		}
	};
	
	/** Display info current service action listener for wizard */
	private ActionListener dislayInfoCurrentServiceAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			displayInfoCurrentService();
		}
	};

	/** Display select service action listener for wizard */
	private ActionListener dislaySelectServiceAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dislaySelectService();
		}
	};

	/** Display info service action listener for wizard */
	private ActionListener dislayInfoServiceAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			displayInfoService();
		}
	};

	/** Import action listener for wizard */
	private ActionListener updateAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			updateService();
		}
	};

	/**
	 * Constructor
	 * @param parentShell
	 * @param activity		with process for add BsmMseService to BsmProcess and BsmOgranization
	 * @param service		app service
	 */
	public UpdateMseServiceToActivityDialog(Shell parentShell, EaStructuralExtendedActivity activity,
			EAStarAppService service) {
		// define param for Jdialog
		super();
		this.setModal(true);
		 try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setTitle("MSE Services Wizard");
		Dimension dimensionWindows = new Dimension(300,400);
		this.setMinimumSize(dimensionWindows);
		this.setPreferredSize(dimensionWindows);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getClassLoader().getResource("icons/16/eastar_mse_service.png")));
		
		// define attribute
		this.service = service;
		this.activity = activity;
		// create attribute
		// create info current service
		this.infoCurrentServicePanel =  new InfoServicePanel(this.service,
				this.cancelAction, this.dislaySelectServiceTypologyAction);
		this.infoCurrentServicePanel.getPreviousButton().setText("Close");
		this.infoCurrentServicePanel.getNextButton().setText("Edit");
		BsmMseService currentService =  this.service.getMseService(this.activity);
		if (null != currentService) {
			this.infoCurrentServicePanel.setService(currentService);
		}
		// create select typology
		this.selectServiceTypologyPanel = new SelectServiceTypologyPanel(
				this.dislayInfoCurrentServiceAction, this.dislaySelectServiceAction);
		this.selectServiceTypologyPanel.setMinimumSize(dimensionWindows);
		this.selectServiceTypologyPanel.setPreferredSize(dimensionWindows);
		// create select service
		this.selectServicePanel = new SelectServicePanel(this.service,
				this.dislaySelectServiceTypologyAction, this.dislayInfoServiceAction);
		// create info service
		this.infoServicePanel = new InfoServicePanel(this.service,
				this.dislaySelectServiceAction, this.updateAction);
		this.infoServicePanel.getNextButton().setText("Update");
		
		this.setContentPane(this.infoCurrentServicePanel);
		
		this.setResizable(false);
		this.setVisible(true);
	}

	/**
	 * Display select service typology page
	 */
	private void dislaySelectServiceTypology() {
		this.setContentPane(this.selectServiceTypologyPanel);
		this.validate();
	}

	/**
	 * Display select service page
	 */
	private void dislaySelectService() {
		this.setContentPane(this.selectServicePanel);
		if(this.selectServiceTypologyPanel.isPublicServicesSelected()) {
			this.selectServicePanel.reloadData(SelectServicePanel.PUBLIC);
		} else if (this.selectServiceTypologyPanel.isLocalServicesSelected()) {
			this.selectServicePanel.reloadData(SelectServicePanel.LOCAL);
		}
		this.validate();
	}

	/**
	 * Display info service page
	 */
	private void displayInfoCurrentService() {
		this.setContentPane(this.infoCurrentServicePanel);
		this.validate();
	}

	/**
	 * Display info service page
	 */
	private void displayInfoService() {
		this.setContentPane(this.infoServicePanel);
		this.infoServicePanel.setService(this.selectServicePanel.getMseService());
		this.validate();
	}

	/**
	 * Cancel action
	 */
	private void cancel() {
		this.setCodeReponse(Window.CANCEL);
		this.dispose();
	}

	/**
	 * Import action
	 */
	private void updateService() {
		this.setCodeReponse(Window.OK);
		this.service.addMseServiceToProcess(this.activity,this.selectServicePanel.getMseService());
		this.dispose();
	}

	/**
	 * Get code response 
	 * @return
	 */
	public int getCodeResponse() {
		return this.codeResponse;
	}
	
	public void setCodeReponse(int codeReponse) {
		this.codeResponse = codeReponse;
	}

}
