package org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.resource.asset;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.msee.slmtoolbox.modeling.editor.ui.BsmCellRenderer;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.bean.MseServiceBeanREST;

/**
 * list mse service panel
 * @author fto
 *
 */
public class SelectServicePanel extends JPanel {
	
	/** code for update date with public service */
	public static final int PUBLIC = 0;
	/** code for update date with local service */
	public static final int LOCAL = 1;  
	
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** app service */
	private EAStarAppService appService;
	
	/** Graphical list */
	private JList<MseServiceBeanREST> jlistElements;

	/** model element list */
	private DefaultListModel<MseServiceBeanREST> modelElement;
	
	/** button next */
	private JButton nextButton;

	/**
	 * Default constructor
	 * @param actionPrevious	previous action
	 * @param actionNext		next action
	 */
	public SelectServicePanel(EAStarAppService appService,
			ActionListener actionPrevious,
			ActionListener actionNext) {
		this.appService = appService;

		// define dim
		Dimension dimesionButton = new Dimension(100,20);
		// define layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(2,5,2,5); 

	    JLabel label = new JLabel("Available public services", SwingConstants.RIGHT);
	    Font font = label.getFont();
		// same font but bold
		Font boldFont = new Font(font.getFontName(), Font.BOLD, font.getSize());
		label.setFont(boldFont);
	    constraints.gridx = 0;
	    constraints.gridy = 0;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.fill = GridBagConstraints.NONE;
	    constraints.anchor = GridBagConstraints.LINE_START;
	    constraints.weightx = 1;
	    this.add(label, constraints);
	    
	    // element list
	    this.modelElement = new DefaultListModel<MseServiceBeanREST>();
		this.jlistElements = new JList<MseServiceBeanREST>(this.modelElement);
	    JScrollPane scroll = new JScrollPane(this.jlistElements,
	    		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    scroll.setMinimumSize(new Dimension(275,400));
	    scroll.setPreferredSize(new Dimension(275,400));
		this.jlistElements.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent event) {
				if (!event.getValueIsAdjusting()) {
					actionChangeListSelect(event);
				}
			}
		});
		this.jlistElements.setCellRenderer(new BsmCellRenderer());
	    constraints.gridx = 0;
	    constraints.gridy = 1;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.PAGE_START;
	    constraints.weightx = 1;
	    constraints.weighty = 1;
	    this.add(scroll, constraints);
	    
	    // add button
	    JButton previousButton = new JButton("Previous");
	    previousButton.setMinimumSize(dimesionButton);
	    previousButton.setPreferredSize(dimesionButton);
	    previousButton.addActionListener(actionPrevious);
	    constraints.gridx = 0;
	    constraints.gridy = 3;
	    constraints.weightx = 0;
	    constraints.weighty = 0;
	    constraints.gridwidth = 1;
	    constraints.fill = GridBagConstraints.LINE_START;
	    constraints.anchor = GridBagConstraints.LAST_LINE_START;
	    this.add(previousButton, constraints);
	    
	    this.nextButton = new JButton("Next");
	    this.nextButton.setMinimumSize(dimesionButton);
	    this.nextButton.setPreferredSize(dimesionButton);
	    this.nextButton.addActionListener(actionNext);
	    this.nextButton.setEnabled(false);
	    constraints.gridx = 3;
	    constraints.gridy = 3;
	    constraints.weightx = 0;
	    constraints.weighty = 0;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.fill = GridBagConstraints.LINE_END;
	    constraints.anchor = GridBagConstraints.LAST_LINE_END;
	    this.add(this.nextButton, constraints);
	}
	
	/**
	 * Action for change list select
	 * @param event
	 */
	protected void actionChangeListSelect(ListSelectionEvent event) {
		MseServiceBeanREST elementSelect = jlistElements.getSelectedValue();
		if (null != elementSelect) {
			this.nextButton.setEnabled(true);
		} else {
			this.nextButton.setEnabled(false);
		}
	}
	
	public void reloadData(int codeService) {
		MseServiceBeanREST[] arrayService = null;
		if (PUBLIC == codeService) {
			// call service for get list
			arrayService = this.appService.getAllServicesPublic();
		} else if (LOCAL == codeService) {
			// call service for get list
			arrayService = this.appService.getAllServicesLocal();
		}
		this.modelElement.removeAllElements();
		if(null != arrayService) {
			for (int i = 0 ; i <  arrayService.length; i++) {
				this.modelElement.addElement(arrayService[i]);
			}
		}
	}
	
	/**
	 * @return mse service selected
	 */
	public MseServiceBeanREST getMseService() {
		return this.jlistElements.getSelectedValue();
	}

}
