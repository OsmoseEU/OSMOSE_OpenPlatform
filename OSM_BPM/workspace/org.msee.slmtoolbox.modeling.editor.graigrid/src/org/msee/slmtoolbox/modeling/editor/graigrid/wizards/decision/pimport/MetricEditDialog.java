package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.pimport;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.IPiElement;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory1;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory2;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory3;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiDimension;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiMetric;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmPiService;

/**
 * TODO
 * @author fto
 *
 */
public class MetricEditDialog extends JDialog {


	/** serialVersionUID*/
	private static final long serialVersionUID = 1L;
	
	/** TODO */
	private ImportDialog parent;
	
	/** TODO */
	private PiMetric metricToEdit;
	
	/** Service for load PI */
	private BsmPiService service;
	
	/** Combo box for category 1 */
	private JComboBox<IPiElement> comboCategory1;

	/** Combo box for category 2 */
	private JComboBox<IPiElement> comboCategory2;

	/** Combo box for category 3 */
	private JComboBox<IPiElement> comboCategory3;

	/** Combo box for dimension */
	private JComboBox<IPiElement> comboDimension;

	/** Text area for field */
	private JTextArea jTextField;

	/** Text field for name */
	private JTextField jTextName;

	/** Text field for unit */
	private JTextField jTextUnit;
	
	/** TODO */
	private ActionListener actionComboCategory1;
	
	/** TODO */
	private ActionListener actionComboCategory2;
	
	/** TODO */
	private JButton buttonOk;

	/**
	 * Default constructor
	 * @param parent	call edit 
	 * @param metric 	to edit
	 */
	public MetricEditDialog(ImportDialog parent, PiMetric metric) {
		super();
		
		this.parent = parent;
		this.metricToEdit = metric;
		this.service = new BsmPiService();

		this.setTitle("Edit Performance Indicator reference");
		this.setModal(true);
		
		//this.setResizable(false);
		this.setMinimumSize(new Dimension(300,350));
		this.setPreferredSize(new Dimension(300,350));
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getClassLoader().getResource("icons/16/action_pi.png")));
		
	    // define layout panel
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5,5,5,5);  //top padding
		
		Dimension dimensionLabel = new Dimension(75,20);
		Dimension dimensionField = new Dimension(200,20);
		Dimension dimensionArea = new Dimension(200,60);
		Dimension dimesionButton = new Dimension(100,20);
		// create Label Category 1
		JLabel label = new JLabel("Category 1:", SwingConstants.RIGHT);
		label.setMinimumSize(dimensionLabel);
		label.setPreferredSize(dimensionLabel);
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.LINE_END;
		constraints.weightx = 0;
		this.add(label,constraints);
		// create Combo Category 1
		this.comboCategory1 = new JComboBox<IPiElement>();
		this.comboCategory1.setMinimumSize(dimensionField);
		this.comboCategory1.setPreferredSize(dimensionField);
		// complete list
		addElementList(this.comboCategory1, this.service.getListCategory1());
		// add action in list
		this.actionComboCategory1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateListCategory2();
				updateListCategory3();
			}
		};
		this.comboCategory1.addActionListener(this.actionComboCategory1);
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 0.5;
		this.add(this.comboCategory1,constraints);
		
		// create Label Category 2
		label = new JLabel("Category 2:", SwingConstants.RIGHT);
		label.setMinimumSize(dimensionLabel);
		label.setPreferredSize(dimensionLabel);
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.LINE_END;
		constraints.weightx = 0;
		this.add(label,constraints);
		// create Combo Category 2
		this.comboCategory2 = new JComboBox<IPiElement>();
		this.comboCategory2.setMinimumSize(dimensionField);
		this.comboCategory2.setPreferredSize(dimensionField);
		// add action in list
		this.actionComboCategory2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateListCategory3();
			}
		};
		this.comboCategory2.addActionListener(this.actionComboCategory2);
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 0.5;
		this.add(this.comboCategory2,constraints);
		
		// create Label Category 3
		label = new JLabel("Category 3:", SwingConstants.RIGHT);
		label.setMinimumSize(dimensionLabel);
		label.setPreferredSize(dimensionLabel);
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.LINE_END;
		constraints.weightx = 0;
		this.add(label,constraints);
		// create Combo Category 3
		this.comboCategory3 = new JComboBox<IPiElement>();
		this.comboCategory3.setMinimumSize(dimensionField);
		this.comboCategory3.setPreferredSize(dimensionField);
		this.comboCategory3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				validateButtonOk();
			}
		});
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 0.5;
		this.add(this.comboCategory3,constraints);
		
		// create Label Dimension
		label = new JLabel("Dimension:", SwingConstants.RIGHT);
		label.setMinimumSize(dimensionLabel);
		label.setPreferredSize(dimensionLabel);
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.LINE_END;
		constraints.weightx = 0;
		this.add(label,constraints);
		// create Combo Dimension
		this.comboDimension = new JComboBox<IPiElement>();
		this.comboDimension.setMinimumSize(dimensionField);
		this.comboDimension.setPreferredSize(dimensionField);
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 0.5;
		this.add(this.comboDimension,constraints);
		// complete list
		List<PiDimension> listDimention = new ArrayList<PiDimension>();
		listDimention.add(new PiDimension(null, ""));
		listDimention.addAll(this.service.getListDimension());
		addElementList(this.comboDimension, listDimention);
		
		// create Label Name
		label = new JLabel("Name:", SwingConstants.RIGHT);
		label.setMinimumSize(dimensionLabel);
		label.setPreferredSize(dimensionLabel);
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.LINE_END;
		constraints.weightx = 0;
		this.add(label,constraints);
		// create Name
		this.jTextName = new JTextField();
		this.jTextName.setMinimumSize(dimensionField);
		this.jTextName.setPreferredSize(dimensionField);
		constraints.gridx = 1;
		constraints.gridy = 4;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 0.5;
		this.add(this.jTextName,constraints);
		
		// create Label Field
		label = new JLabel("Field:", SwingConstants.RIGHT);
		label.setMinimumSize(dimensionLabel);
		label.setPreferredSize(dimensionLabel);
		constraints.gridx = 0;
		constraints.gridy = 5;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.FIRST_LINE_END;
		this.add(label,constraints);
		
		this.jTextField = new JTextArea();
		this.jTextField.setLineWrap(true);
		JScrollPane scrollPane = new JScrollPane(this.jTextField,
	    		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setMinimumSize(dimensionArea);
		scrollPane.setPreferredSize(dimensionArea);
		constraints.gridx = 1;
		constraints.gridy = 5;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 0;
		this.add(scrollPane,constraints);

		// create Label Unit:
		label = new JLabel("Unit:", SwingConstants.RIGHT);
		label.setMinimumSize(dimensionLabel);
		label.setPreferredSize(dimensionLabel);
		constraints.gridx = 0;
		constraints.gridy = 6;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.LINE_END;
		this.add(label,constraints);
		// create combo Unit:
		this.jTextUnit = new JTextField();
		this.jTextUnit.setMinimumSize(dimensionField);
		this.jTextUnit.setPreferredSize(dimensionField);
		constraints.gridx = 1;
		constraints.gridy = 6;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 0;
		this.add(this.jTextUnit,constraints);
		
		// add button Import
		this.buttonOk = new JButton("Ok");
		this.buttonOk.setMinimumSize(dimesionButton);
		this.buttonOk.setPreferredSize(dimesionButton);
		constraints.gridx = 1;
		constraints.gridy = 7;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.LINE_END;
		constraints.anchor = GridBagConstraints.LAST_LINE_END;
		constraints.weighty = 1;
		this.buttonOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				saveActionPerformed();
			}
		});
		this.add(buttonOk,constraints);
		
		// add button exit
		JButton buttonCancel = new JButton("Cancel");
		buttonCancel.setMinimumSize(dimesionButton);
		buttonCancel.setPreferredSize(dimesionButton);
		constraints.gridx = 2;
		constraints.gridy = 7;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.LINE_END;
		constraints.anchor = GridBagConstraints.LAST_LINE_END;
		buttonCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				exitActionPerformed();
			}
		});
		this.add(buttonCancel,constraints);

		// update data
		updateListCategory2();
		updateListCategory3();
		
		// init data
		// select category 3
		if (null != this.metricToEdit.getCategory3()) {
			PiCategory3 cat3 = this.metricToEdit.getCategory3();
			// select category 2
			if (null != cat3.getCategory2()) {
				PiCategory2 cat2 = cat3.getCategory2();
				// select category 1
				if (null != cat2.getCategory1()) {
					this.comboCategory1.setSelectedItem(cat2.getCategory1());
				}
				this.comboCategory2.setSelectedItem(cat2);
			}
			this.comboCategory3.setSelectedItem(cat3);
		}
		// select dimention
		if (null != this.metricToEdit.getDimension()) {
			this.comboDimension.setSelectedItem(this.metricToEdit.getDimension());
		}
		this.jTextField.setText(this.metricToEdit.getFields());
		if (null != this.metricToEdit.getName()) {
			this.jTextName.setText(this.metricToEdit.getName());
		}
		if (null != this.metricToEdit.getUnit()) {
			this.jTextUnit.setText(this.metricToEdit.getUnit());
		}
	}

	/**
	 * Add element in a combo
	 * @param combo		target
	 * @param list		object list
	 */
	private void addElementList(JComboBox<IPiElement> combo,
			List<?> list) {
		for (Object element : list) {
			combo.addItem((IPiElement)element);
		}
	}

	/** Update category 2 combo */
	private void updateListCategory2() {
		this.comboCategory2.removeActionListener(this.actionComboCategory2);
		this.comboCategory2.removeAllItems();
		List<IPiElement> listCategory2 = new ArrayList<IPiElement>();
		listCategory2.add(new PiCategory2(null, ""));
		if (null !=  this.comboCategory1.getSelectedItem()) {
			listCategory2.addAll(this.service.getListCategory2((PiCategory1) this.comboCategory1.getSelectedItem()));
		}
		addElementList(this.comboCategory2, listCategory2);
		this.comboCategory2.addActionListener(this.actionComboCategory2);
	}

	/** Update category 3 combo */
	private void updateListCategory3() {
		this.comboCategory3.removeAllItems();
		List<IPiElement> listCategory3 = new ArrayList<IPiElement>();
		listCategory3.add(new PiCategory3(null, ""));
		if (null !=  this.comboCategory2.getSelectedItem()) {
			listCategory3.addAll(this.service.getListCategory3((PiCategory2) this.comboCategory2.getSelectedItem()));
		}
		addElementList(this.comboCategory3, listCategory3);
	}
	
	/**
	 * TODO
	 */
	public void validateButtonOk() {
		if (!(this.comboCategory3.getSelectedItem() instanceof PiCategory3)
				|| null == ((PiCategory3)this.comboCategory3.getSelectedItem()).getId()){
			this.buttonOk.setEnabled(false);
		} else {
			this.buttonOk.setEnabled(true);
		}
	}
	
	/**
	 * Save element and exit
	 */
	protected void saveActionPerformed() {
		// Save element
		this.metricToEdit.setName(this.jTextName.getText());
		this.metricToEdit.setCategory3((PiCategory3) this.comboCategory3.getSelectedItem());
		this.metricToEdit.setFieldsList(this.service.getListField(this.jTextField.getText()));
		this.metricToEdit.setUnit(this.jTextUnit.getText());
		if ((this.comboDimension.getSelectedItem() instanceof PiDimension)
				&& null != ((PiDimension)this.comboDimension.getSelectedItem()).getId()){
			this.metricToEdit.setDimension((PiDimension) this.comboDimension.getSelectedItem());
		}
		this.service.saveMetric(this.metricToEdit);
		// Update table
		this.parent.updateTable();
		this.dispose();
	}
	
	/**
	 * Close element
	 */
	protected void exitActionPerformed() {
		this.dispose();
	}
}
