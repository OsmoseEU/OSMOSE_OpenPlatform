package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.pi;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.msee.slmtoolbox.modeling.editor.ui.BsmCellRenderer;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

/**
 * Abstract panel for element associated to Performance Indicator 
 * @author fto
 *
 * @param <S> class of element associated
 */
public abstract class AbstractElementAssociatedPanel<S extends IBsmNamedElement> extends JPanel {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** Elements list of element not associated */
	private JList<S> jListUnselected;

	/** model elements unselected list */
	private DefaultListModel<S> modelElementsUnselected;

	/** Elements list of element associated */
	private JList<S> jListSelected;

	/** model elements selected list */
	private DefaultListModel<S> modelElementsSelected;
	
	/** Button add element */
	private JButton buttonAdd;
	
	/** Button remove element */
	private JButton buttonRemove;
	
	/** Service */
	private BsmAppService bsmService;
	
	/** Element for edit */
	private BsmPerformanceIndicator bsmPi;
	
	/**
	 * Default constructor
	 */
	public AbstractElementAssociatedPanel(BsmAppService bsmService, BsmPerformanceIndicator bsmPi) {
		this.bsmService = bsmService;
		this.bsmPi = bsmPi;

		createPanel();
		
		// find data for list
		List<S> elementsSelected = getElementsSelected();
		for (S element : elementsSelected) {
			this.modelElementsSelected.addElement(element);
		}
		List<S> elementUnSelected = getElementsUnselected();
		for (S element : elementUnSelected) {
			this.modelElementsUnselected.addElement(element);
		}
	}

	/**
	 * Get all elements not associated to Pi
	 * @return
	 */
	protected abstract List<S> getElementsUnselected();

	/**
	 * Get all elements associated to Pi
	 * @return
	 */
	protected abstract List<S> getElementsSelected();

	/**
	 * Create panel
	 */
	private void createPanel() {
	    // define layout panel informations
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5,5,5,5);  //top padding
		//add list unselected
		this.modelElementsUnselected = new DefaultListModel<>();
		this.jListUnselected = new JList<S>(this.modelElementsUnselected);
		this.jListUnselected.setCellRenderer(new BsmCellRenderer());
		Dimension dimensionList = new Dimension(150,300);
	    JScrollPane scrollUnselected = new JScrollPane(this.jListUnselected,
	    		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    scrollUnselected.setMinimumSize(dimensionList);
	    scrollUnselected.setPreferredSize(dimensionList);
	    constraints.gridx = 0;
	    constraints.gridy = 0;
	    constraints.gridwidth = 1;
	    constraints.gridheight = 2;
	    constraints.weighty = 1;
	    constraints.weightx = 0.5;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.CENTER;
	    this.add(scrollUnselected, constraints);
		//add list selected
		this.modelElementsSelected = new DefaultListModel<>();
	    this.jListSelected = new JList<S>(this.modelElementsSelected);
		this.jListSelected.setCellRenderer(new BsmCellRenderer());
	    JScrollPane scrollSelected = new JScrollPane(this.jListSelected,
	    		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    scrollSelected.setMinimumSize(dimensionList);
	    scrollSelected.setPreferredSize(dimensionList);
	    constraints.gridx = 2;
	    constraints.gridy = 0;
	    constraints.gridwidth = 1;
	    constraints.gridheight = 2;
	    constraints.weighty = 1;
	    constraints.weightx = 0.5;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.CENTER;
	    this.add(scrollSelected, constraints);
		//add button add
		Dimension dimensionButton = new Dimension(100,20);
	    this.buttonAdd = new JButton("Add");
	    this.buttonAdd.setMinimumSize(dimensionButton);
	    this.buttonAdd.setPreferredSize(dimensionButton);
	    constraints.gridx = 1;
	    constraints.gridy = 0;
	    constraints.gridwidth = 1;
	    constraints.gridheight = 1;
	    constraints.weighty = 0.5;
	    constraints.weightx = 0;
	    constraints.fill = GridBagConstraints.LINE_START;
	    constraints.anchor = GridBagConstraints.PAGE_END;
	    this.add(this.buttonAdd, constraints);
	    this.buttonAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addActionPerformed();
			}
		});
	    
		//add button remove
	    this.buttonRemove = new JButton("Remove");
	    this.buttonRemove.setMinimumSize(dimensionButton);
	    this.buttonRemove.setPreferredSize(dimensionButton);
	    constraints.gridx = 1;
	    constraints.gridy = 1;
	    constraints.gridwidth = 1;
	    constraints.gridheight = 1;
	    constraints.weighty = 0.5;
	    constraints.weightx = 0;
	    constraints.fill = GridBagConstraints.LINE_START;
	    constraints.anchor = GridBagConstraints.PAGE_START;
	    this.add(this.buttonRemove, constraints);
	    this.buttonRemove.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				removeActionPerformed();
			}
		});
	}
	
	/**
	 * Add element
	 */
	protected void addActionPerformed() {
		S element = this.jListUnselected.getSelectedValue();
		this.modelElementsUnselected.removeElement(element);
		this.modelElementsSelected.addElement(element);
	}
	

	/**
	 * Remove element
	 */
	protected void removeActionPerformed() {
		S element = this.jListSelected.getSelectedValue();
		this.modelElementsSelected.removeElement(element);
		this.modelElementsUnselected.addElement(element);
	}

	/**
	 * Save element
	 */
	public void save() {
		Enumeration<S> elementsSelected = getModelElementsSelected().elements();
		while (elementsSelected.hasMoreElements()) {
			addLink(elementsSelected.nextElement());
		}
		
		Enumeration<S> elementsUnselected = getModelElementsUnselected().elements();
		while (elementsUnselected.hasMoreElements()) {
			removeLink(elementsUnselected.nextElement());
		}
	}
	
	abstract protected void removeLink(S nextElement);

	abstract protected void addLink(S nextElement);

	/**
	 * @return the bsmService
	 */
	public BsmAppService getBsmService() {
		return bsmService;
	}

	/**
	 * @param bsmService the bsmService to set
	 */
	public void setBsmService(BsmAppService bsmService) {
		this.bsmService = bsmService;
	}

	/**
	 * @return the bsmPi
	 */
	public BsmPerformanceIndicator getBsmPi() {
		return bsmPi;
	}

	/**
	 * @param bsmPi the bsmPi to set
	 */
	public void setBsmPi(BsmPerformanceIndicator bsmPi) {
		this.bsmPi = bsmPi;
	}

	/**
	 * @return the modelElementsUnselected
	 */
	public DefaultListModel<S> getModelElementsUnselected() {
		return modelElementsUnselected;
	}

	/**
	 * @param modelElementsUnselected the modelElementsUnselected to set
	 */
	public void setModelElementsUnselected(
			DefaultListModel<S> modelElementsUnselected) {
		this.modelElementsUnselected = modelElementsUnselected;
	}

	/**
	 * @return the modelElementsSelected
	 */
	public DefaultListModel<S> getModelElementsSelected() {
		return modelElementsSelected;
	}

	/**
	 * @param modelElementsSelected the modelElementsSelected to set
	 */
	public void setModelElementsSelected(DefaultListModel<S> modelElementsSelected) {
		this.modelElementsSelected = modelElementsSelected;
	}

	/**
	 * @return the jListUnselected
	 */
	public JList<S> getjListUnselected() {
		return jListUnselected;
	}

	/**
	 * @param jListUnselected the jListUnselected to set
	 */
	public void setjListUnselected(JList<S> jListUnselected) {
		this.jListUnselected = jListUnselected;
	}

	/**
	 * @return the jListSelected
	 */
	public JList<S> getjListSelected() {
		return jListSelected;
	}

	/**
	 * @param jListSelected the jListSelected to set
	 */
	public void setjListSelected(JList<S> jListSelected) {
		this.jListSelected = jListSelected;
	}
	
	

	
}
