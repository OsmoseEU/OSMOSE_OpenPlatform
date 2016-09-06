package org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.resource.asset;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * tree mse asset class panel
 * @author fto
 *
 */
public class ModifyServiceURLPanel extends JPanel {
	
	/** code for update date with public service */
	public static final int PUBLIC = 0;
	/** code for update date with local service */
	public static final int LOCAL = 1;  
	
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** app service */
	private EAStarAppService appService;
	
	/** text field new url */
	private JTextField newUrl;
	
	/** text Area connection message */
	private JLabel connectionMsg;
		
	/** button next */
	private JButton nextButton;
	
	/** button previous */
	private JButton previousButton;
	
	/** button test connection */
	private JButton testConnectionButton;
	
	/** Panel panel*/
	private JPanel panel;
	
	private ActionListener actionTestConnection = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			testConnection(getNewUrl().getText());			
		}
	};

	/**
	 * Default constructor
	 * @param actionPrevious	previous action
	 * @param actionNext		next action
	 */
	public ModifyServiceURLPanel(EAStarAppService appService,
			ActionListener actionPrevious,
			ActionListener actionNext) {
		this.appService = appService;

		// define dim
		Dimension dimesionButton = new Dimension(90,20);
		// define layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(2,5,2,5); 

	    JLabel label = new JLabel("Asset repository Configuration", SwingConstants.RIGHT);
	    final Font font = label.getFont();
		// same font but bold
		final Font boldFont = new Font(font.getFontName(), Font.BOLD, font.getSize());
		label.setFont(boldFont);
	    constraints.gridx = 0;
	    constraints.gridy = 0;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.fill = GridBagConstraints.NONE;
	    constraints.anchor = GridBagConstraints.LINE_START;
	    constraints.weightx = 1;
	    this.add(label, constraints);
	    
	   	    
	    // recent URL 
	    panel = new JPanel();
	    panel.setLayout(new GridBagLayout());
	    
	    constraints.gridx = 0;
	    constraints.gridy = 1;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.PAGE_START;
	    constraints.weightx = 1;
	    constraints.weighty = 1;
	    this.add(panel, constraints);
	    
	    GridBagConstraints panelConstraints = new GridBagConstraints();
	    panelConstraints.fill = GridBagConstraints.HORIZONTAL;
	    panelConstraints.anchor = GridBagConstraints.PAGE_START;
	    panelConstraints.weightx = 1;
	    panelConstraints.weighty = 1;
	    panelConstraints.insets = new Insets(2, 5, 2, 5);
	    
	    // new URL 
	    JLabel newLabel = new JLabel("Asset Repository API URL:");
	    panelConstraints.gridx = 0;
	    panelConstraints.gridy = 0;
	    panel.add(newLabel, panelConstraints);	
	    
	    newUrl = new JTextField(appService.getRestRecentUrl());
	    newUrl.setEditable(true);	    
	    panelConstraints.gridx = 0;
	    panelConstraints.gridy = 1;
	    panel.add(newUrl, panelConstraints);  
	    

	    
	    // connection message
	    this.connectionMsg = new JLabel("");
	    panelConstraints.gridx = 0;
	    panelConstraints.gridy = 2;
	    panel.add(connectionMsg, panelConstraints);
	    
	    // add button
	    this.previousButton = new JButton("Cancel");
	    this.previousButton.setMinimumSize(dimesionButton);
	    this.previousButton.setPreferredSize(dimesionButton);
	    this.previousButton.addActionListener(actionPrevious);
	    constraints.gridx = 0;
	    constraints.gridy = 2;
	    constraints.weightx = 0;
	    constraints.weighty = 0;
	    constraints.gridwidth = 1;
	    constraints.fill = GridBagConstraints.LINE_START;
	    constraints.anchor = GridBagConstraints.LAST_LINE_START;
	    this.add(this.previousButton, constraints);
	    
	    this.testConnectionButton = new JButton("Test");
	    this.testConnectionButton.setMinimumSize(dimesionButton);
	    this.testConnectionButton.setPreferredSize(dimesionButton);
	    this.testConnectionButton.addActionListener(actionTestConnection);
	    this.testConnectionButton.setEnabled(true);
	    constraints.gridx = 1;
	    constraints.gridy = 2;
	    constraints.weightx = 0;
	    constraints.weighty = 0;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.fill = GridBagConstraints.LINE_START;
	    constraints.anchor = GridBagConstraints.LAST_LINE_START;
	    this.add(this.testConnectionButton, constraints);
	    
	    this.nextButton = new JButton("Next");
	    this.nextButton.setMinimumSize(dimesionButton);
	    this.nextButton.setPreferredSize(dimesionButton);
	    this.nextButton.addActionListener(actionNext);
	    this.nextButton.setEnabled(true);
	    constraints.gridx = 3;
	    constraints.gridy = 2;
	    constraints.weightx = 0;
	    constraints.weighty = 0;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.fill = GridBagConstraints.LINE_END;
	    constraints.anchor = GridBagConstraints.LAST_LINE_END;
	    this.add(this.nextButton, constraints);
	    
	    
	}
		
	private boolean testConnection(String url) {
		String response = this.appService.testRESTConnection(url);
		if (null != response){
			getConnectionMsg().setText("Connection success");
//			this.appService.updateRestURL(url);
//			getTestConnectionButton().setEnabled(false);
			return true;
		} 
		else {
			getConnectionMsg().setText("Connection failure");
			return false;
		}
		
	}
	/* ***********************************
	 *  G E T T E R S   /   S E T T E R S 
	 * **********************************/

	/**
	 * @return the nextButton
	 */
	public JButton getNextButton() {
		return nextButton;
	}

	/**
	 * @return the previousButton
	 */
	public JButton getPreviousButton() {
		return previousButton;
	}
	
	/**
	 * @return the testConnectionButton
	 */
	public JButton getTestConnectionButton(){
		return testConnectionButton;
	}
	
	/**
	 * @return newUrl
	 */
	public JTextField getNewUrl(){
		return newUrl;
	}

	/**
	 * @return the connectionMsg
	 */
	public JLabel getConnectionMsg() {
		return connectionMsg;
	}
	
	public JPanel getPanel(){
		return panel;
	}
		
}
