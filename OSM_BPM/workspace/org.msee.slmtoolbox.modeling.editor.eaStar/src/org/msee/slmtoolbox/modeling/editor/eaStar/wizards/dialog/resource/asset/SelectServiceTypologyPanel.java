package org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.resource.asset;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 * Panel for selete mse service type
 * @author fto
 *
 */
public class SelectServiceTypologyPanel extends JPanel {
	
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** radio button for select public service */
	private JRadioButton publicService;

	/** radio button for select local service */
	private JRadioButton localService;

	/**
	 * Default constructor
	 * @param actionPrevious	previous action
	 * @param actionNext		next action
	 */
	public SelectServiceTypologyPanel(ActionListener actionPrevious,
			ActionListener actionNext) {

		// define dim
		Dimension dimesionButton = new Dimension(100,20);
		// define layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(2,5,2,5); 
		

	    JLabel label = new JLabel("Select a service typology :", SwingConstants.RIGHT);
	    Font font = label.getFont();
		// same font but bold
		Font boldFont = new Font(font.getFontName(), Font.BOLD, font.getSize());
		label.setFont(boldFont);
	    constraints.gridx = 0;
	    constraints.gridy = 0;
	    constraints.weightx = 1;
	    constraints.weighty = 0;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.fill = GridBagConstraints.NONE;
	    constraints.anchor = GridBagConstraints.LINE_START;
	    this.add(label, constraints);
	    
	    this.publicService = new JRadioButton("Public services");
	    this.publicService.setMnemonic(KeyEvent.VK_P);
	    this.publicService.setSelected(true);
	    constraints.gridy = 1;
	    this.add(publicService, constraints);
	    
	    this.localService = new JRadioButton("Local services");
	    this.localService.setMnemonic(KeyEvent.VK_L);
	    constraints.gridy = 2;
	    this.add(localService, constraints);

	    //Group the radio buttons.
	    ButtonGroup group = new ButtonGroup();
	    group.add(this.publicService);
	    group.add(this.localService);
	    
	    // add button
	    JButton cancelButton = new JButton("Cancel");
	    cancelButton.setMinimumSize(dimesionButton);
	    cancelButton.setPreferredSize(dimesionButton);
	    cancelButton.addActionListener(actionPrevious);
	    constraints.gridx = 0;
	    constraints.gridy = 3;
	    constraints.weightx = 0;
	    constraints.weighty = 1;
	    constraints.gridwidth = 1;
	    constraints.anchor = GridBagConstraints.LAST_LINE_START;
	    constraints.fill = GridBagConstraints.LINE_START;
	    this.add(cancelButton, constraints);
	    
	    JButton nextButton = new JButton("Next");
	    nextButton.setMinimumSize(dimesionButton);
	    nextButton.setPreferredSize(dimesionButton);
	    nextButton.addActionListener(actionNext);
	    constraints.gridx = 3;
	    constraints.gridy = 3;
	    constraints.weightx = 0;
	    constraints.weighty = 1;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.anchor = GridBagConstraints.LAST_LINE_END;
	    constraints.fill = GridBagConstraints.LINE_END;
	    this.add(nextButton, constraints);
	    
	}
	
	/**
	 * @return true if public service is selected
	 */
	public boolean isPublicServicesSelected() {
		return this.publicService.isSelected();
	}
	
	/**
	 * @return true if local service is selected
	 */
	public boolean isLocalServicesSelected() {
		return this.localService.isSelected();
	}

}
