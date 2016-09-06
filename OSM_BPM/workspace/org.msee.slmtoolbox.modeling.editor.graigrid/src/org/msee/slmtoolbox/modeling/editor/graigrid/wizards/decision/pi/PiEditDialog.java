package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.pi;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.AbstractElementPanel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

/**
 * Frame for Performance Indicator edit
 * @author fto
 *
 */
public class PiEditDialog extends JDialog {
	
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** Service */
	private BsmAppService bsmService;
	
	/** Element in BSM */
	private BsmPerformanceIndicator bsmPi;
	
	/** Element for edit */
	private BsmPerformanceIndicator piInMainFrame;
	
	/** Panel call this frame (for update) */
	private AbstractElementPanel<?> panelCall;
	
	/** Graphical name for element selected */
	private JTextField jtextName;

	/** Graphical description for element selected */
	private JTextArea jtextDescription;
	
	/** Graphical unit for element selected list */
	private JTextField jtextUnit;
	
	/** Graphical formula for element selected list */
	private JTextField jtextFormula;
	
	/** TODO */
	private ObjectivesAssociatedPanel panelObjectives;
	
	/** TODO */
	private VariablesAssociatedPanel panelVariables;
	
	/**
	 * Default constructor
	 * @param bsmService
	 * @param bsmPi
	 * @param panelCall
	 */
	public PiEditDialog(BsmAppService bsmService, BsmPerformanceIndicator bsmPi, AbstractElementPanel<?> panelCall) {
		super();
		this.setTitle("Edit Performance Indicator");
		this.setModal(true);
		
		this.bsmService = bsmService;
		this.piInMainFrame = bsmPi;
		this.bsmPi = this.bsmService.getPerformanceIndicator(bsmPi);
		this.panelCall = panelCall;

		this.setMinimumSize(new Dimension(400,400));
		this.setPreferredSize(new Dimension(400,400));
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getClassLoader().getResource("icons/16/action_pi.png")));

	    // define layout panel
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5,5,5,5);  //top padding

		//create panels
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setMinimumSize(new Dimension(380,320));
		tabbedPane.setPreferredSize(new Dimension(380,320));
	    constraints.gridx = 0;
	    constraints.gridy = 0;
	    constraints.gridwidth = 2;
	    constraints.fill = GridBagConstraints.CENTER;
	    constraints.anchor = GridBagConstraints.LINE_START;
		this.getContentPane().add(tabbedPane,constraints);
		
		// add panel PI
		JPanel panelPi = createPanelPi();
		tabbedPane.addTab("Informations", null, panelPi, "Performance Indicators informations");
		
		// add panel Add/Remove Objectives
		this.panelObjectives = new ObjectivesAssociatedPanel(this.bsmService,this.bsmPi);
		tabbedPane.addTab("Objectives", null, panelObjectives, "Objectives associated");
		
		// add panel Add/Remove Variable
		this.panelVariables = new VariablesAssociatedPanel(this.bsmService,this.bsmPi);
		tabbedPane.addTab("Decisions Variables", null, panelVariables, "Decisions Variables associated");
		
	    // add button save
	    JButton buttonOk = new JButton("Ok");
	    buttonOk.setPreferredSize(new Dimension(100,20));
	    buttonOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				updateAction();
				exitAction();
			}
		});
	    constraints.gridx = 0;
	    constraints.gridy = 1;
	    constraints.gridwidth = 1;
	    constraints.fill = GridBagConstraints.LINE_END;
	    constraints.anchor = GridBagConstraints.LINE_END;
	    constraints.weightx=1;
	    constraints.weighty=0;
	    this.getContentPane().add(buttonOk, constraints);
		
		//add button close
		JButton buttonCancel = new JButton("Cancel");
		buttonCancel.setPreferredSize(new Dimension(100,20));
		buttonCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				exitAction();
			}
		});
	    constraints.gridx = 1;
	    constraints.gridy = 1;
	    constraints.gridwidth = 1;
	    constraints.fill = GridBagConstraints.LINE_END;
	    constraints.anchor = GridBagConstraints.LINE_END;
	    constraints.weightx=0;
	    constraints.weighty=0;
		this.getContentPane().add(buttonCancel,constraints);
		
		this.setResizable(false);
	}

	/**
	 * Create panel for data element
	 * @return
	 */
	private JPanel createPanelPi() {
		JPanel panelPi = new JPanel();

	    // define layout panel informations
		panelPi.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5,5,5,5);  //top padding
		//add label Name
	    JLabel label = new JLabel("Name:", SwingConstants.RIGHT);
	    Dimension dimensionLabel = new Dimension(100,20);
	    Dimension dimensionField = new Dimension(150,20);
	    label.setMinimumSize(dimensionLabel);
	    label.setPreferredSize(dimensionLabel);
	    constraints.gridx = 0;
	    constraints.gridy = 0;
	    constraints.gridwidth = 1;
	    constraints.weightx = 0;
	    constraints.weighty = 0;
	    constraints.fill = GridBagConstraints.NONE;
	    constraints.anchor = GridBagConstraints.LINE_END;
	    panelPi.add(label, constraints);
		//add field Name
	    this.jtextName = new JTextField();
	    this.jtextName.setMinimumSize(dimensionField);
	    this.jtextName.setPreferredSize(dimensionField);
	    this.jtextName.setText(this.bsmPi.getName());
	    constraints.gridx = 1;
	    constraints.gridy = 0;
	    constraints.gridwidth = 2;
	    constraints.weightx = 1;
	    constraints.weighty = 0;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.CENTER;
	    panelPi.add(this.jtextName, constraints);
		//add label Description
	    label = new JLabel("Description:", SwingConstants.RIGHT);
	    label.setMinimumSize(dimensionLabel);
	    label.setPreferredSize(dimensionLabel);
	    constraints.gridx = 0;
	    constraints.gridy = 1;
	    constraints.gridwidth = 1;
	    constraints.weightx = 0;
	    constraints.weighty = 0;
	    constraints.fill = GridBagConstraints.NONE;
	    constraints.anchor = GridBagConstraints.LINE_END;
	    panelPi.add(label, constraints);
		//add field Description
	    this.jtextDescription = new JTextArea();
	    this.jtextDescription.setRows(3);
	    this.jtextDescription.setText(this.bsmPi.getDescription());
	    JScrollPane scroll = new JScrollPane(this.jtextDescription,
	    		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    scroll.setMinimumSize(new Dimension(300,100));
	    scroll.setPreferredSize(new Dimension(100,100));
	    constraints.gridx = 0;
	    constraints.gridy = 2;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.weightx = 1;
	    constraints.weighty = 0;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.CENTER;
	    this.jtextDescription.setLineWrap(true);
	    panelPi.add(scroll, constraints);

		//add label Unit
	    label = new JLabel("Unit:", SwingConstants.RIGHT);
	    label.setMinimumSize(dimensionLabel);
	    label.setPreferredSize(dimensionLabel);
	    constraints.gridx = 0;
	    constraints.gridy = 3;
	    constraints.gridwidth = 1;
	    constraints.weightx = 0;
	    constraints.weighty=0;
	    constraints.fill = GridBagConstraints.NONE;
	    constraints.anchor = GridBagConstraints.LINE_END;
	    panelPi.add(label, constraints);
		//add field Unit
	    this.jtextUnit = new JTextField();
	    this.jtextUnit.setMinimumSize(dimensionField);
	    this.jtextUnit.setPreferredSize(dimensionField);
	    this.jtextUnit.setText(this.bsmPi.getUnit());
	    constraints.gridx = 1;
	    constraints.gridy = 3;
	    constraints.gridwidth = 2;
	    constraints.weightx = 1;
	    constraints.weighty = 0;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.CENTER;
	    panelPi.add(this.jtextUnit, constraints);
		//add label Formula
	    label = new JLabel("Formula:", SwingConstants.RIGHT);
	    label.setMinimumSize(dimensionLabel);
	    label.setPreferredSize(dimensionLabel);
	    constraints.gridx = 0;
	    constraints.gridy = 4;
	    constraints.gridwidth = 1;
	    constraints.weightx = 0;
	    constraints.weighty = 1;
	    constraints.fill = GridBagConstraints.NONE;
	    constraints.anchor = GridBagConstraints.FIRST_LINE_END;
	    panelPi.add(label, constraints);
		//add field Formula
	    this.jtextFormula = new JTextField();
	    this.jtextFormula.setMinimumSize(dimensionField);
	    this.jtextFormula.setPreferredSize(dimensionField);
	    this.jtextFormula.setText(this.bsmPi.getFormula());
	    constraints.gridx = 1;
	    constraints.gridy = 4;
	    constraints.gridwidth = 2;
	    constraints.weightx = 1;
	    constraints.weighty = 1;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.PAGE_START;
	    panelPi.add(this.jtextFormula, constraints);
		
		return panelPi;
	}
	
	/**
	 * Update data element
	 */
	protected void updateAction() {
		// update BSM
		this.bsmPi.setName(this.jtextName.getText());
		this.bsmPi.setDescription(this.jtextDescription.getText());
		this.bsmPi.setUnit(this.jtextUnit.getText());
		this.bsmPi.setFormula(this.jtextFormula.getText());
		
		this.bsmService.updatePerformanceIndicator(this.bsmPi.getDecision(), this.bsmPi);
		// update main frame
		this.piInMainFrame.setName(this.jtextName.getText());
		this.piInMainFrame.setDescription(this.jtextDescription.getText());
		this.piInMainFrame.setUnit(this.jtextUnit.getText());
		this.piInMainFrame.setFormula(this.jtextFormula.getText());
		this.panelCall.getJlistElements().updateUI();
		this.panelCall.updateDataInformations();
		
		// update Objectives
		this.panelObjectives.save();
		
		// update Decision Variables
		this.panelVariables.save();
	}
	
	/**
	 * Close element
	 */
	protected void exitAction() {
		this.dispose();
	}

}
