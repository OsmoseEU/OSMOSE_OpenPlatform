package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.msee.slmtoolbox.modeling.editor.ui.BsmCellRenderer;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

public abstract class AbstractElementPanel<S extends IBsmNamedElement> extends JPanel {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** elements list*/
	private List<S> elements;

	/** model element list */
	private DefaultListModel<S> modelElement;
	
	/** Graphical list */
	private JList<S> jlistElements;
	
	/** Graphical name for element selected list */
	private JTextField jtextName;

	/** Graphical description for element selected list */
	private JTextArea jtextDescription;

	/** Button for add element */
	private JButton buttonAdd;

	/** Button for delete element selected */
	private JButton buttonDelete;

	/** Button for Edit element selected */
	private JButton buttonEdit;

	/** Button for Save element selected */
	private JButton buttonSave;
	
	/** Bsm service */
	private BsmAppService bsmService;
	
	/** Bsm decision target */
	private BsmDecision decision;
	
	/**
	 * Default Constructor
	 * @param labelList		label for list
	 * @param elements		element list
	 */
	public AbstractElementPanel(GgAppService appService, GgDecisionCenter center, String labelList) {
		this.bsmService = new BsmAppService(appService);
		this.decision = bsmService.getDecision(center);
		// init data
		this.modelElement = new DefaultListModel<S>();
		this.elements = new ArrayList<S>();
		this.setMinimumSize(new Dimension(380,400));
		this.setPreferredSize(new Dimension(380,400));

		// define layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5,5,5,5);  //top padding
		
		//create graphic elements
		createList(constraints, labelList);
		
		// create Button
		createButton(constraints);
		
		// create information data
		createInformationsData(constraints);
		
	}

	/**
	 * Create a graphical list
	 * @param constraints	graphical constraint
	 * @param elements		element list
	 */
	protected void createList(GridBagConstraints constraints, String labelList) {
	    JLabel label = new JLabel(labelList + ":", SwingConstants.RIGHT);
	    label.setPreferredSize(new Dimension(120,20));
	    constraints.gridx = 0;
	    constraints.gridy = 0;
	    constraints.gridwidth = 1;
	    constraints.fill = GridBagConstraints.NONE;
	    constraints.anchor = GridBagConstraints.FIRST_LINE_END;
	    constraints.weightx = 0.25;
	    this.add(label, constraints);
	    
		this.jlistElements = new JList<S>(this.modelElement);
	    JScrollPane scroll = new JScrollPane(this.jlistElements,
	    		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    scroll.setMinimumSize(new Dimension(250,150));
	    scroll.setPreferredSize(new Dimension(250,150));
		this.jlistElements.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent event) {
				if (!event.getValueIsAdjusting()) {
					actionChangeListSelect(event);
				}
				
			}
		});
		this.jlistElements.setCellRenderer(new BsmCellRenderer());
	    constraints.gridx = 1;
	    constraints.gridy = 0;
	    constraints.gridwidth = 1;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.PAGE_START;
	    constraints.weightx = 0.50;
	    this.add(scroll, constraints);
	}

	/**
	 * Create the action buttons
	 * @param constraints	graphical constraint
	 * @param constraints
	 */
	protected JPanel createButton(GridBagConstraints constraints) {
		Dimension dimesionButton = new Dimension(100,20);
		// create panel
		JPanel panelButton = new JPanel();
	    constraints.gridx = 2;
	    constraints.gridy = 0;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.PAGE_START;
	    constraints.weightx = 0.25;
	    this.add(panelButton, constraints);

	    // define layout panel informations
	    panelButton.setLayout(new GridBagLayout());
		GridBagConstraints constraintsButton = new GridBagConstraints();
		constraintsButton.insets = new Insets(5,5,5,5);  //top padding
	    // create button Add
	    this.buttonAdd = new JButton("Add");
	    this.buttonAdd.setMinimumSize(dimesionButton);
	    this.buttonAdd.setPreferredSize(dimesionButton);
	    this.buttonAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedAdd();
			}
		});
		constraintsButton.gridx = 0;
		constraintsButton.gridy = 0;
		constraintsButton.gridwidth = GridBagConstraints.REMAINDER;
	    constraintsButton.fill = GridBagConstraints.HORIZONTAL;
	    constraintsButton.anchor = GridBagConstraints.LINE_END;
	    panelButton.add(this.buttonAdd, constraintsButton);
	    
	    // create button deleted
	    this.buttonDelete = new JButton("Deleted");
	    this.buttonDelete.setMinimumSize(dimesionButton);
	    this.buttonDelete.setPreferredSize(dimesionButton);
	    this.buttonDelete.setEnabled(false);
	    this.buttonDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedDelete();
			}
		});
		constraintsButton.gridy = 1;
	    panelButton.add(this.buttonDelete, constraintsButton);
	    
	    // create button Modify
	    this.buttonEdit = new JButton("Edit");
	    this.buttonEdit.setMinimumSize(dimesionButton);
	    this.buttonEdit.setPreferredSize(dimesionButton);
	    this.buttonEdit.setEnabled(false);
	    this.buttonEdit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedEdit();
			}
		});
		constraintsButton.gridy = 2;
	    panelButton.add(this.buttonEdit, constraintsButton);
	    
	    // create button Save
	    this.buttonSave = new JButton("Save");
	    this.buttonSave.setMinimumSize(dimesionButton);
	    this.buttonSave.setPreferredSize(dimesionButton);
	    this.buttonSave.setEnabled(false);
	    this.buttonSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedSave();
			}
		});
		constraintsButton.gridy = 3;
	    panelButton.add(this.buttonSave, constraintsButton);
		
		return panelButton;
	}
	
	/**
	 * Create graphical informations for element selected
	 * @param constraints	graphical constraint
	 * @param constraints
	 */
	protected JPanel createInformationsData(GridBagConstraints constraints) {
		// create panel
		JPanel panelInformation = new JPanel();
		panelInformation.setBorder(BorderFactory.createTitledBorder("Informations"));
	    constraints.gridx = 0;
	    constraints.gridy = 1;
	    constraints.weighty = 1;
	    constraints.weightx = 1;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.PAGE_START;
	    this.add(panelInformation, constraints);
	    
	    // define layout panel informations
	    panelInformation.setLayout(new GridBagLayout());
		GridBagConstraints constraintsInformation = new GridBagConstraints();
		constraintsInformation.insets = new Insets(5,5,5,5);  //top padding
		//add label Name
	    JLabel label = new JLabel("Name:", SwingConstants.RIGHT);
	    label.setPreferredSize(new Dimension(120,20));
	    constraintsInformation.gridx = 0;
	    constraintsInformation.gridy = 0;
	    constraintsInformation.gridwidth = 1;
	    constraintsInformation.fill = GridBagConstraints.NONE;
	    constraintsInformation.anchor = GridBagConstraints.LINE_END;
	    constraintsInformation.weightx = 0.25;
	    panelInformation.add(label, constraintsInformation);
		//add field Name
	    this.jtextName = new JTextField();
	    this.jtextName.setPreferredSize(new Dimension(400,20));
	    constraintsInformation.gridx = 1;
	    constraintsInformation.gridy = 0;
	    constraintsInformation.gridwidth = GridBagConstraints.REMAINDER;
	    constraintsInformation.fill = GridBagConstraints.HORIZONTAL;
	    constraintsInformation.anchor = GridBagConstraints.CENTER;
	    constraintsInformation.weightx = 0.75;
	    this.jtextName.setEnabled(false);
	    panelInformation.add(this.jtextName, constraintsInformation);
		//add label Description
	    label = new JLabel("Description:");
	    constraintsInformation.gridx = 0;
	    constraintsInformation.gridy = 1;
	    constraintsInformation.fill = GridBagConstraints.NONE;
	    constraintsInformation.anchor = GridBagConstraints.LINE_END;
	    constraintsInformation.weightx = 0.25;
	    constraintsInformation.gridwidth = 1;
	    panelInformation.add(label, constraintsInformation);
		//add field Description
	    this.jtextDescription = new JTextArea();
	    this.jtextDescription.setRows(3);
	    JScrollPane scroll = new JScrollPane(this.jtextDescription,
	    		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    scroll.setMinimumSize(new Dimension(400,40));
	    scroll.setPreferredSize(new Dimension(400,60));
	    constraintsInformation.gridx = 0;
	    constraintsInformation.gridy = 2;
	    constraintsInformation.gridwidth = GridBagConstraints.REMAINDER;
	    constraintsInformation.fill = GridBagConstraints.HORIZONTAL;
	    constraintsInformation.anchor = GridBagConstraints.CENTER;
	    constraintsInformation.weightx = 1;
	    constraintsInformation.weighty = 1;
	    this.jtextDescription.setEnabled(false);
	    this.jtextDescription.setLineWrap(true);
	    panelInformation.add(scroll, constraintsInformation);
	    
	    return panelInformation;
	}
	
	/**
	 * Action for change list select
	 * @param event
	 */
	protected void actionChangeListSelect(ListSelectionEvent event) {
		updateDataInformations();
	}
	
	/**
	 * Update data in informations part
	 */
	public void updateDataInformations() {
		S elementSelect = jlistElements.getSelectedValue();
		if (null != elementSelect) {
			this.getJtextName().setText(elementSelect.getName());
			this.buttonDelete.setEnabled(true);
			this.buttonEdit.setEnabled(true);
		} else {
			this.getJtextName().setText("");
			this.buttonDelete.setEnabled(false);
			this.buttonEdit.setEnabled(false);
		}
		this.buttonSave.setEnabled(false);
		this.jtextName.setEnabled(false);
		this.jtextDescription.setEnabled(false);
		
	}
	
	/**
	 * Add button action 
	 */
	protected void actionPerformedAdd() {
		// create action
		S newElement = addElement();
		// add list
		this.modelElement.addElement(newElement);
		this.jlistElements.setSelectedIndex(this.getModelElement().getSize()-1);
		// update form
		this.jtextName.setEnabled(true);
		this.jtextDescription.setEnabled(true);
		this.buttonSave.setEnabled(true);
	}
	
	/**
	 * Add element at list
	 * @return
	 */
	protected S addElement() {
		return null;
	}
	
	/**
	 * Delete button action 
	 */
	protected  void actionPerformedDelete() {
		// remove list
		S deleteElement = this.jlistElements.getSelectedValue();
		this.jlistElements.clearSelection();
		this.modelElement.removeElement(deleteElement);
		// update form
		this.jtextName.setEnabled(false);
		this.jtextDescription.setEnabled(false);
		// delete action
		
		deleteElement(deleteElement);
	}
	
	/**
	 * Delete element selected
	 * @param deleteElement		element selected
	 */
	protected void deleteElement(S deleteElement) {}

	/**
	 * Edit button action 
	 */
	protected void actionPerformedEdit() {
		this.jtextName.setEnabled(true);
		this.jtextDescription.setEnabled(true);
		this.buttonSave.setEnabled(true);
	}
	
	/**
	 * Update button action 
	 */
	protected  void actionPerformedSave() {
		// Update element list
		S updateElement = this.jlistElements.getSelectedValue();
		updateElement(updateElement);
		this.jlistElements.updateUI();
	}
	
	/**
	 * Update element selected
	 * @param updateElement		element selected
	 */
	protected void updateElement(S updateElement) {}

	
	/* *****************************************
	 * G E T T E R S / S E T T E R S
	 * ****************************************/
	/**
	 * @return the elements
	 */
	public List<S> getElements() {
		return elements;
	}

	/**
	 * @param elements the elements to set
	 */
	public void setElements(List<S> elements) {
		this.modelElement.removeAllElements();
		if (null != elements) {
			this.elements = elements;
			for (S element : elements) {
				this.modelElement.addElement(element);
			}
		} else {
			this.elements = new ArrayList<S>();
		}
	}

	/**
	 * @return the jlistElements
	 */
	public JList<S> getJlistElements() {
		return jlistElements;
	}

	/**
	 * @param jlistElements the jlistElements to set
	 */
	protected void setJlistElements(JList<S> jlistElements) {
		this.jlistElements = jlistElements;
	}

	/**
	 * @return the jtextName
	 */
	protected JTextField getJtextName() {
		return jtextName;
	}

	/**
	 * @param jtextName the jtextName to set
	 */
	protected void setJtextName(JTextField jtextName) {
		this.jtextName = jtextName;
	}

	/**
	 * @return the jtextDescription
	 */
	protected JTextArea getJtextDescription() {
		return jtextDescription;
	}

	/**
	 * @param jtextDescription the jtextDescription to set
	 */
	protected void setJtextDescription(JTextArea jtextDescription) {
		this.jtextDescription = jtextDescription;
	}

	/**
	 * @return the buttonAdd
	 */
	protected JButton getButtonAdd() {
		return buttonAdd;
	}

	/**
	 * @param buttonAdd the buttonAdd to set
	 */
	protected void setButtonAdd(JButton buttonAdd) {
		this.buttonAdd = buttonAdd;
	}

	/**
	 * @return the buttonDelete
	 */
	protected JButton getButtonDelete() {
		return buttonDelete;
	}

	/**
	 * @param buttonDelete the buttonDelete to set
	 */
	protected void setButtonDelete(JButton buttonDelete) {
		this.buttonDelete = buttonDelete;
	}

	/**
	 * @return the buttonEdit
	 */
	protected JButton getButtonEdit() {
		return buttonEdit;
	}

	/**
	 * @param buttonEdit the buttonEdit to set
	 */
	protected void setButtonEdit(JButton buttonEdit) {
		this.buttonEdit = buttonEdit;
	}

	/**
	 * @return the modelElement
	 */
	protected DefaultListModel<S> getModelElement() {
		return modelElement;
	}

	/**
	 * @param modelElement the modelElement to set
	 */
	protected void setModelElement(DefaultListModel<S> modelElement) {
		this.modelElement = modelElement;
	}

	/**
	 * @return the buttonSave
	 */
	protected JButton getButtonSave() {
		return buttonSave;
	}

	/**
	 * @param buttonSave the buttonSave to set
	 */
	protected void setButtonSave(JButton buttonSave) {
		this.buttonSave = buttonSave;
	}

	/**
	 * @return the bsmService
	 */
	public BsmAppService getBsmService() {
		return bsmService;
	}

	/**
	 * @param bsmService the bsmService to set
	 */
	protected void setBsmService(BsmAppService bsmService) {
		this.bsmService = bsmService;
	}

	/**
	 * @return the decision
	 */
	protected BsmDecision getDecision() {
		return decision;
	}

	/**
	 * @param decision the decision to set
	 */
	protected void setDecision(BsmDecision decision) {
		this.decision = decision;
	}

	/**
	 * Set decision (use for test panel)
	 * @param decision GgDecision
	 */
	public abstract void setDecision(GgDecisionCenter decision);

	public void updateService() {
		this.bsmService.reload();
	}
	

}
