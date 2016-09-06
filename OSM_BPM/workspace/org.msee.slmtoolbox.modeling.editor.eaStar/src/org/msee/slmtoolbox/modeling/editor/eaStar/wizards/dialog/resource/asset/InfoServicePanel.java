package org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.resource.asset;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.bean.MseServiceBeanREST;

/**
 * Information mse service panel
 * @author fto
 *
 */
public class InfoServicePanel extends JPanel {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** Field for data type */
	private JLabel idServiceField;

	/** Field for data name */
	private JLabel nameField;

	/** Field for data ownedby */
	private JLabel ownedByField;

	/** Field for data created date */
	private JLabel dateCreateField;

	/** Field for data publish date */
	private JLabel datePublishField;
	
	/** Field for published */
	private JLabel publishedField;

	/** Field for data description */
	private JTextArea description;
	
	/** Button previous (or cancel for show MseService of BsmProcess)*/
	private JButton previousButton;
	
	/** Button next : "import" for a BsmProcess without MseService, 
	 * "edit" for BsmProcess with MseService or "update" for change MseService of BsmProcess
	 * */
	private JButton nextButton;
	
	public InfoServicePanel(EAStarAppService appService,
			ActionListener actionPrevious,
			ActionListener actionNext) {

		// define dim
		Dimension dimesionButton = new Dimension(100,20);
		Dimension dimesionLabel = new Dimension(100,20);
		// define layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(2,5,2,5); 
		
		// Add type
		this.idServiceField = new JLabel();
		createTextField(this.idServiceField, constraints, "ID", 0,dimesionLabel);
		
		// Add name
		this.nameField = new JLabel();
		createTextField(this.nameField, constraints, "Name", 1,dimesionLabel);
		
		// Add Owned by
		this.ownedByField = new JLabel();
		createTextField(this.ownedByField, constraints, "Owner", 2,dimesionLabel);
		
		// Add Create by
		this.dateCreateField = new JLabel();
		createTextField(this.dateCreateField, constraints, "Created on", 3,dimesionLabel);
		
		// Add Create by
		this.datePublishField = new JLabel();
		createTextField(this.datePublishField, constraints, "Published on", 4,dimesionLabel);
		
		// Add Create by
		this.publishedField = new JLabel();
		createTextField(this.publishedField, constraints, "Published", 5,dimesionLabel);
		
		// add Description
		JLabel label = new JLabel( "Description :", SwingConstants.RIGHT);
	    label.setMinimumSize(dimesionLabel);
	    label.setPreferredSize(dimesionLabel);
	    constraints.gridx = 0;
	    constraints.gridy = 6;
	    constraints.gridwidth = 1;
	    constraints.weightx = 0;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.LINE_START;
	    this.add(label, constraints);
	    
	    this.description = new JTextArea();
	    constraints.gridx = 0;
	    constraints.gridy = 7;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.anchor = GridBagConstraints.LINE_START;
	    constraints.weightx = 1;
	    constraints.weighty = 1;
	    this.description.setRows(10);
	    this.description.setForeground(new Color(128,128,128));
	    this.description.setEnabled(false);
	    this.description.setLineWrap(true);
	    JScrollPane scroll = new JScrollPane(this.description,
	    		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    scroll.setMinimumSize(new Dimension(275,400));
	    scroll.setPreferredSize(new Dimension(275,400));
	    this.add(scroll, constraints);
	    
	    // add button
	    this.previousButton = new JButton("Previous");
	    this.previousButton.setMinimumSize(dimesionButton);
	    this.previousButton.setPreferredSize(dimesionButton);
	    this.previousButton.addActionListener(actionPrevious);
	    constraints.gridx = 0;
	    constraints.gridy = 8;
	    constraints.weightx = 0;
	    constraints.weighty = 0;
	    constraints.gridwidth = 1;
	    constraints.fill = GridBagConstraints.LINE_START;
	    constraints.anchor = GridBagConstraints.LAST_LINE_START;
	    this.add(this.previousButton, constraints);
	    
	    this.nextButton = new JButton("Import");
	    this.nextButton.setMinimumSize(dimesionButton);
	    this.nextButton.setPreferredSize(dimesionButton);
	    this.nextButton.addActionListener(actionNext);
	    constraints.gridx = 3;
	    constraints.gridy = 8;
	    constraints.weightx = 0;
	    constraints.weighty = 0;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.fill = GridBagConstraints.LINE_END;
	    constraints.anchor = GridBagConstraints.LAST_LINE_END;
	    this.add(this.nextButton, constraints);
	}
	
	/**
	 * Create a text field (label + field)
	 * @param textField
	 * @param constraints
	 * @param labelName
	 * @param line
	 * @param dimesionLabel 
	 */
	private void createTextField (JLabel textField, GridBagConstraints constraints, String labelName, int line, Dimension dimesionLabel) {
		JLabel label = new JLabel( labelName + " :", SwingConstants.RIGHT);
	    constraints.gridx = 0;
	    constraints.gridy = line;
	    constraints.gridwidth = 1;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.LINE_START;
	    constraints.weightx = 0;
	    label.setMinimumSize(dimesionLabel);
	    label.setPreferredSize(dimesionLabel);
	    this.add(label, constraints);
	    
	    textField.setText("<"+labelName+">");
	    constraints.gridx = 1;
	    constraints.gridy = line;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.anchor = GridBagConstraints.LINE_START;
	    constraints.weightx = 1;
	    textField.setForeground(new Color(128,128,128));
	    this.add(textField, constraints);
	}

	/* ***********************************
	 * G E T T E R S   /   S E T T E R S 
	 * **********************************/
	/**
	 * 
	 * @param mseService
	 */
	public void setService(BsmMseService mseService) {
		this.idServiceField.setText(mseService.getId());
		this.nameField.setText(mseService.getName());
		if (null != mseService.getOrganization()) {
			this.ownedByField.setText(mseService.getOrganization().getName());
		}
		this.dateCreateField.setText(mseService.getCreateDate());
		this.datePublishField.setText(mseService.getPublishedDate());
		this.publishedField.setText(mseService.getPublished().toString());
		this.description.setText(mseService.getDescription());
		
	}

	/**
	 * 
	 * @param mseService
	 */
	public void setService(MseServiceBeanREST mseService) {
		this.idServiceField.setText(mseService.idService);
		this.nameField.setText(mseService.name);
		this.ownedByField.setText(mseService.owner);
		this.dateCreateField.setText(mseService.created);
		this.datePublishField.setText(mseService.publishedDate);
		this.publishedField.setText(Long.toString(mseService.published));
		this.description.setText(mseService.description);
	}

	/**
	 * @return the previousButton
	 */
	public JButton getPreviousButton() {
		return previousButton;
	}

	/**
	 * @return the nextButton
	 */
	public JButton getNextButton() {
		return nextButton;
	}
	
	
	

}
