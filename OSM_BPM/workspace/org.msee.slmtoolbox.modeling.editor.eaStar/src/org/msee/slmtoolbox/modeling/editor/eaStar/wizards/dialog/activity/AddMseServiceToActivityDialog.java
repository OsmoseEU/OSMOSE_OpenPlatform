package org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity.service.InfoServicePanel;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity.service.SelectServicePanel;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity.service.SelectServiceTypologyPanel;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.resource.asset.ModifyServiceURLPanel;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * Dialog for add a MseService to BsmProcess
 * @author fto
 *
 */
public class AddMseServiceToActivityDialog extends JDialog {

    /** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
    /** App service */
	private EAStarAppService service;
	
	/** activity target */
	private EaStructuralExtendedActivity activity;
	
	/** Page for select a service typology */
	private SelectServiceTypologyPanel selectServiceTypologyPanel;

	/** Page for select a service */
	private SelectServicePanel selectServicePanel;
	
	/** Page for url configuration */
	private ModifyServiceURLPanel modifyAssetUrlPanel;

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

	/** Display select service action listener for wizard */
	private ActionListener dislaySelectServiceAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			displaySelectService();
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
	private ActionListener importAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			importService();
		}
	};

	/** Import action listener for wizard */
	private ActionListener nextAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			next();
		}
	};
	/**
	 * Constructor
	 * @param parentShell
	 * @param activity		with process for add BsmMseService to BsmProcess and BsmOgranization
	 * @param service		app service
	 */
	public AddMseServiceToActivityDialog(Shell parentShell, EaStructuralExtendedActivity activity,
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
		this.modifyAssetUrlPanel = new ModifyServiceURLPanel(this.service, this.cancelAction, this.nextAction);
		
		this.selectServiceTypologyPanel = new SelectServiceTypologyPanel(cancelAction, dislaySelectServiceAction);
		this.selectServiceTypologyPanel.setMinimumSize(dimensionWindows);
		this.selectServiceTypologyPanel.setPreferredSize(dimensionWindows);
		this.selectServicePanel = new SelectServicePanel(this.service,
		this.dislaySelectServiceTypologyAction, this.dislayInfoServiceAction);
		this.infoServicePanel = new InfoServicePanel(this.service,
				this.dislaySelectServiceAction, this.importAction);
		
		this.add(this.modifyAssetUrlPanel);
		
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
	private void displaySelectService() {
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
	private void importService() {
		this.setCodeReponse(Window.OK);
		this.service.addMseServiceToProcess(this.activity,this.selectServicePanel.getMseService());
		this.dispose();
	}
	
	/**
	 * Next action
	 */
	private void next(){
		String defaultUrl = this.service.getRestRecentUrl();
		this.service.updateRestURL(modifyAssetUrlPanel.getNewUrl().getText());
		try{
			this.testConnection();
			JPanel contentPane = (JPanel) this.getContentPane();
			this.remove(modifyAssetUrlPanel);
			this.add(this.selectServiceTypologyPanel);
			contentPane.revalidate(); 
			contentPane.repaint();
		}
		catch(Exception ex){			
			this.service.updateRestURL(defaultUrl);
			modifyAssetUrlPanel.getNewUrl().setText(defaultUrl);
			JOptionPane.showMessageDialog(new JFrame(), "The requested url is not valid", "URL Error", JOptionPane.ERROR_MESSAGE);				
		}
	}

	private void testConnection() {
		this.service.getAllMseAssets();
		
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
