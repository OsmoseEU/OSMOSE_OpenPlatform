package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.pi.PiEditDialog;
import org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.pimport.ImportDialog;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

/**
 * Performance Indicator panel
 * @author fto
 *
 */
public class PerformanceIndicatorPanel extends AbstractElementPanel<BsmPerformanceIndicator> {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** Graphical unit for element selected list */
	private JTextField jtextUnit;
	
	/** Graphical formula for element selected list */
	private JTextField jtextFormula;
	
	/** Import button */
	private JButton buttonImport;

	/**
	 * Default Constructor
	 * @param appService		Graigrid service
	 * @param elements			Graigrid decision
	 */
	public PerformanceIndicatorPanel(GgAppService appService, GgDecisionCenter center) {
		super(appService, center, "Performance Indicators");
		setElements(getBsmService().findPerformanceIndicator(center));
	}
	/**
	 * Create the action buttons
	 * @param constraints	graphical constraint
	 * @param constraints
	 */
	protected JPanel createButton(GridBagConstraints constraints) {
		JPanel panelButton = super.createButton(constraints);
		if (panelButton.getLayout() instanceof GridBagLayout) {
			GridBagConstraints constraintsButton =
					((GridBagLayout)panelButton.getLayout()).getConstraints(this.getButtonAdd());
			// add button import
			this.buttonImport = new JButton("Import");
		    this.buttonImport.setMinimumSize(new Dimension(100,20));
		    this.buttonImport.setPreferredSize(new Dimension(100,20));
		    this.buttonImport.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					actionPerformedImport();
				}
			});
			constraintsButton.gridy = 4;
		    panelButton.add(this.buttonImport, constraintsButton);
			
		}
		return panelButton;
	}
	
	/**
	 * Action button of Import
	 */
	protected void actionPerformedImport() {
		ImportDialog importFrame = new ImportDialog(this);
		importFrame.setVisible(true);
	}
	
	
	/**
	 * Create graphical informations for element selected
	 * @param constraints	graphical constraint
	 * @param constraints
	 */
	protected JPanel createInformationsData(GridBagConstraints constraints) {
		JPanel panelInformation = super.createInformationsData(constraints);
		if (panelInformation.getLayout() instanceof GridBagLayout) {
			GridBagConstraints constraintsInformation =
					((GridBagLayout)panelInformation.getLayout()).getConstraints(this.getJtextName());
			//add label Unit
		    JLabel label = new JLabel("Unit:", SwingConstants.RIGHT);
		    constraintsInformation.gridx = 0;
		    constraintsInformation.gridy = 3;
		    constraintsInformation.gridwidth = 1;
		    constraintsInformation.fill = GridBagConstraints.NONE;
		    constraintsInformation.anchor = GridBagConstraints.LINE_END;
		    constraintsInformation.weightx = 0.25;
		    panelInformation.add(label, constraintsInformation);
			//add field Unit
		    this.jtextUnit = new JTextField();
		    constraintsInformation.gridx = 1;
		    constraintsInformation.gridy = 3;
		    constraintsInformation.gridwidth = GridBagConstraints.REMAINDER;
		    constraintsInformation.fill = GridBagConstraints.HORIZONTAL;
		    constraintsInformation.anchor = GridBagConstraints.CENTER;
		    constraintsInformation.weightx = 0.75;
		    this.jtextUnit.setEnabled(false);
		    panelInformation.add(this.jtextUnit, constraintsInformation);
			//add label Formula
		    label = new JLabel("Formula:", SwingConstants.RIGHT);
		    constraintsInformation.gridx = 0;
		    constraintsInformation.gridy = 4;
		    constraintsInformation.gridwidth = 1;
		    constraintsInformation.fill = GridBagConstraints.NONE;
		    constraintsInformation.anchor = GridBagConstraints.LINE_END;
		    constraintsInformation.weightx = 0.25;
		    panelInformation.add(label, constraintsInformation);
			//add field Formula
		    this.jtextFormula = new JTextField();
		    constraintsInformation.gridx = 1;
		    constraintsInformation.gridy = 4;
		    constraintsInformation.gridwidth = GridBagConstraints.REMAINDER;
		    constraintsInformation.fill = GridBagConstraints.HORIZONTAL;
		    constraintsInformation.anchor = GridBagConstraints.CENTER;
		    constraintsInformation.weightx = 0.75;
		    this.jtextFormula.setEnabled(false);
		    panelInformation.add(this.jtextFormula, constraintsInformation);
		}
	    
	    
		return panelInformation;
	}
	/**
	 * Add button action 
	 */
	protected void actionPerformedAdd() {
		// create action
		BsmPerformanceIndicator newElement = getBsmService().createPerformanceIndicator(getDecision());
		// add list
		getModelElement().addElement(newElement);
		getJlistElements().setSelectedIndex(this.getModelElement().getSize()-1);
		// open wizard
		openWizardPi();
	}

	/**
	 * Open wizard for PI and element associated
	 */
	private void openWizardPi() {
		PiEditDialog piFrame = new PiEditDialog(getBsmService(), getJlistElements().getSelectedValue(), this);
		piFrame.setVisible(true);
	}

	@Override
	protected void deleteElement(BsmPerformanceIndicator deleteElement) {
		getBsmService().removePerformanceIndicator(getDecision(), deleteElement);
	}

	/**
	 * Edit button action 
	 */
	protected void actionPerformedEdit() {
		openWizardPi();
	}
	
	/**
	 * Update data in informations part
	 */
	public void updateDataInformations() {
		super.updateDataInformations();
		BsmPerformanceIndicator elementSelect = (BsmPerformanceIndicator) getJlistElements().getSelectedValue();
		if (null != elementSelect) {
			this.getJtextDescription().setText(elementSelect.getDescription());
			this.jtextUnit.setText(elementSelect.getUnit());
			this.jtextFormula.setText(elementSelect.getFormula());
		} else {
			this.getJtextDescription().setText("");
			this.jtextUnit.setText("");
			this.jtextFormula.setText("");
		}
		this.jtextUnit.setEnabled(false);
		this.jtextFormula.setEnabled(false);
	}

	@Override
	public void setDecision(GgDecisionCenter decision) {
		setElements(getBsmService().findPerformanceIndicator(decision));
	}
	
	/**
	 * Add a PerformanceIndicator
	 * @param bsmPi	to add
	 */
	public void addBsmPerformanceIndicator(BsmPerformanceIndicator bsmPi) {
		this.getBsmService().addPerformanceIndicatorToDecision(getDecision(),bsmPi);
		// add list
		getModelElement().addElement(bsmPi);
		getJlistElements().setSelectedIndex(this.getModelElement().getSize()-1);
	}
	
}
