package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.pimport;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.PerformanceIndicatorPanel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.IPiElement;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory1;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory2;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory3;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiDimension;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiField;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiMetric;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmPiService;

/**
 * Import PI fram
 * @author fto
 *
 */
public class ImportDialog extends JDialog {

	/** serialVersionUID*/
	private static final long serialVersionUID = 1L;
	
	/** Combo box for category 1 filter */
	private JComboBox<IPiElement> comboCategory1;

	/** Combo box for category 2 filter */
	private JComboBox<IPiElement> comboCategory2;

	/** Combo box for category 3 filter */
	private JComboBox<IPiElement> comboCategory3;

	/** Combo box for dimension filter */
	private JComboBox<IPiElement> comboDimension;

	/** Combo box for field filter */
	private JComboBox<IPiElement> comboField;

	/** Text field for name filter */
	private JTextField jTextName;
	
	/** Elements table */
	private JTable table;
	
	/** Table model */
	private MetricModel tableModel;
	
	/** Description of element selected in table */
	private JTextArea jTextDescription;
	
	/** Service for load PI */
	private BsmPiService service;
	
	/** panel applicants  */
	private PerformanceIndicatorPanel piPanel;
	
	/** Action listener for Combo Category 1 */
	private ActionListener actionComboCategory1;

	/** Action listener for Combo Category 2 */
	private ActionListener actionComboCategory2;

	/** Action listener for Combo Category 3 */
	private ActionListener actionComboCategory3;

	/** Action listener for Combo Dimension or Field 2 */
	private ActionListener actionComboDimOrField;
	
	/** Button delete PI */
	private JButton buttonDelete;
	
	/** Button edit PI */
	private JButton buttonEdit;
	
	/** Button import PI */
	private JButton buttonImportPI;
	
	/** Button export PI */
	private JButton buttonExportPI;
	
	/**
	 * Default constructor
	 * @param PerformanceIndicatorPanel 
	 */
	public ImportDialog(PerformanceIndicatorPanel PerformanceIndicatorPanel) {
		super();
		this.setTitle("Import Performance Indicator");
		this.setModal(true);
		
		this.piPanel = PerformanceIndicatorPanel;
		this.service = new BsmPiService();
		
		this.setMinimumSize(new Dimension(600,500));
		this.setPreferredSize(new Dimension(600,500));
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getClassLoader().getResource("icons/16/action_pi.png")));
		
	    // define layout panel
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5,5,5,5);  //top padding
		
		Dimension dimensionLabel = new Dimension(75,20);
		Dimension dimensionField = new Dimension(180,20);
		Dimension dimensionTable = new Dimension(180,200);
		Dimension dimensionDescription = new Dimension(200,80);
		Dimension dimesionButton = new Dimension(90,20);
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
		List<IPiElement> listCategory1 = new ArrayList<IPiElement>();
		listCategory1.add(new PiCategory1(null, ""));
		listCategory1.addAll(this.service.getListCategory1());
		addElementList(this.comboCategory1, listCategory1);
		// add action in list
		this.actionComboCategory1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateListCategory2();
				updateListCategory3();
				updateListDimension();
				updateListField();
				updateTable();
			}
		};
		this.comboCategory1.addActionListener(this.actionComboCategory1);
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 0.5;
		this.add(this.comboCategory1,constraints);
		
		// create Label Category 2
		label = new JLabel("Category 2:", SwingConstants.RIGHT);
		label.setMinimumSize(dimensionLabel);
		label.setPreferredSize(dimensionLabel);
		constraints.gridx = 2;
		constraints.gridy = 0;
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
				updateListDimension();
				updateListField();
				updateTable();
			}
		};
		this.comboCategory2.addActionListener(this.actionComboCategory2);
		constraints.gridx = 3;
		constraints.gridy = 0;
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
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.LINE_END;
		constraints.weightx = 0;
		this.add(label,constraints);
		// create Combo Category 3
		this.comboCategory3 = new JComboBox<IPiElement>();
		this.comboCategory3.setMinimumSize(dimensionField);
		this.comboCategory3.setPreferredSize(dimensionField);
		// add action in list
		this.actionComboCategory3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateListDimension();
				updateListField();
				updateTable();
			}
		};
		this.comboCategory3.addActionListener(this.actionComboCategory3);
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 0.5;
		this.add(this.comboCategory3,constraints);
		
		// create Label Dimension
		label = new JLabel("Dimension:", SwingConstants.RIGHT);
		label.setMinimumSize(dimensionLabel);
		label.setPreferredSize(dimensionLabel);
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.LINE_END;
		constraints.weightx = 0;
		this.add(label,constraints);
		// create Combo Dimension
		this.comboDimension = new JComboBox<IPiElement>();
		this.comboDimension.setMinimumSize(dimensionField);
		this.comboDimension.setPreferredSize(dimensionField);
		// add action in list
		this.actionComboDimOrField = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateTable();
			}
		};
		this.comboDimension.addActionListener(this.actionComboDimOrField);
		constraints.gridx = 3;
		constraints.gridy = 1;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 0.5;
		this.add(this.comboDimension,constraints);
		
		// create Label Name
		label = new JLabel("Name:", SwingConstants.RIGHT);
		label.setMinimumSize(dimensionLabel);
		label.setPreferredSize(dimensionLabel);
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.LINE_END;
		constraints.weightx = 0;
		this.add(label,constraints);
		// create Name
		this.jTextName = new JTextField();
		this.jTextName.setMinimumSize(dimensionField);
		this.jTextName.setPreferredSize(dimensionField);
		this.jTextName.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				updateTable();
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				updateTable();
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
			}
		});
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 0.5;
		this.add(this.jTextName,constraints);
		
		// create Label Field
		label = new JLabel("Field:", SwingConstants.RIGHT);
		label.setMinimumSize(dimensionLabel);
		label.setPreferredSize(dimensionLabel);
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.LINE_END;
		this.add(label,constraints);
		// create combo Feild
		this.comboField = new JComboBox<IPiElement>();
		this.comboField.setMinimumSize(dimensionField);
		this.comboField.setPreferredSize(dimensionField);
		// add action in list
		this.comboField.addActionListener(this.actionComboDimOrField);
		constraints.gridx = 3;
		constraints.gridy = 2;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 0;
		this.add(this.comboField,constraints);
		
		// Add table
		this.tableModel = new MetricModel();
		this.table = new JTable(this.tableModel);
		// complete list
		JScrollPane scrollPane = new JScrollPane(this.table,
	    		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setMinimumSize(dimensionTable);
		//scrollPane.setPreferredSize(dimensionTable);
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = GridBagConstraints.REMAINDER ;
		constraints.weighty = 1;
		constraints.weightx = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.PAGE_START;
	    scrollPane.repaint();
		this.add(scrollPane,constraints);
	    this.table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
	    	/**
	    	 * When change value selected in table
	    	 */
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					updateDescription(e);
				    buttonEdit.setEnabled(true);
				    buttonDelete.setEnabled(true);
				}
				
			}
		});
	    
	    /* *************************
	     * BUTTON FOR PI'S TABLE
	     * ************************/
	    JPanel panelButton = new JPanel();
	    panelButton.setLayout(new GridBagLayout());

		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridwidth = GridBagConstraints.REMAINDER ;
		constraints.weighty = 1;
		constraints.weightx = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.PAGE_START;
		
		this.add(panelButton,constraints);
		
		GridBagConstraints constraintsPanelButton = new GridBagConstraints();
		constraintsPanelButton.insets = new Insets(5,5,5,5);  //top padding
		
	    // button for admin reference Pi : add Pi
	    JButton buttonAdd = new JButton("Add");
	    buttonAdd.setMinimumSize(dimesionButton);
	    buttonAdd.setPreferredSize(dimesionButton);
	    constraintsPanelButton.gridx = 0;
	    constraintsPanelButton.gridy = 0;
	    constraintsPanelButton.gridwidth = 1;
	    constraintsPanelButton.weighty = 0;
	    constraintsPanelButton.weightx = 0;
		constraintsPanelButton.fill = GridBagConstraints.LINE_START;
		constraintsPanelButton.anchor = GridBagConstraints.CENTER;
		buttonAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				openEditMetric(new PiMetric());
			}
		});
		panelButton.add(buttonAdd,constraintsPanelButton);

	    // button for admin reference Pi : edit Pi
	    this.buttonEdit = new JButton("Edit");
	    this.buttonEdit.setMinimumSize(dimesionButton);
	    this.buttonEdit.setPreferredSize(dimesionButton);
	    this.buttonEdit.setEnabled(false);
	    constraintsPanelButton.gridx = 1;
	    constraintsPanelButton.gridy = 0;
	    constraintsPanelButton.gridwidth = 1;
	    constraintsPanelButton.weighty = 0;
	    constraintsPanelButton.weightx = 0;
	    constraintsPanelButton.fill = GridBagConstraints.LINE_START;
	    constraintsPanelButton.anchor = GridBagConstraints.CENTER;
		this.buttonEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int indexSelected = table.getSelectedRow();
				openEditMetric(tableModel.getData(indexSelected));
			}
		});
		panelButton.add(this.buttonEdit,constraintsPanelButton);

	    // button for admin reference Pi : delete Pi
		this.buttonDelete = new JButton("Delete");
		this.buttonDelete.setMinimumSize(dimesionButton);
		this.buttonDelete.setPreferredSize(dimesionButton);
	    this.buttonDelete.setEnabled(false);
	    constraintsPanelButton.gridx = 2;
	    constraintsPanelButton.gridy = 0;
		constraintsPanelButton.gridwidth = 1;
		constraintsPanelButton.weighty = 0;
		constraintsPanelButton.weightx = 0;
		constraintsPanelButton.fill = GridBagConstraints.LINE_START;
		constraintsPanelButton.anchor = GridBagConstraints.CENTER;
		this.buttonDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int indexSelected = table.getSelectedRow();
				service.deleteMetric(tableModel.getData(indexSelected));
				updateTable();
			}
		});
		panelButton.add(this.buttonDelete,constraintsPanelButton);
		
	    // button for admin reference Pi : import Pi
		this.buttonImportPI = new JButton("Import File");
		this.buttonImportPI.setMinimumSize(dimesionButton);
		this.buttonImportPI.setPreferredSize(dimesionButton);
	    constraintsPanelButton.gridx = 3;
	    constraintsPanelButton.gridy = 0;
		constraintsPanelButton.gridwidth = 1;
		constraintsPanelButton.weighty = 0;
		constraintsPanelButton.weightx = 0;
		constraintsPanelButton.fill = GridBagConstraints.LINE_START;
		constraintsPanelButton.anchor = GridBagConstraints.CENTER;
		this.buttonImportPI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				actionImportDialog();
			}
		});
		panelButton.add(this.buttonImportPI,constraintsPanelButton);
		
	    // button for admin reference Pi : export Pi
		this.buttonExportPI = new JButton("Export File");
		this.buttonExportPI.setMinimumSize(dimesionButton);
		this.buttonExportPI.setPreferredSize(dimesionButton);
	    constraintsPanelButton.gridx = 4;
	    constraintsPanelButton.gridy = 0;
		constraintsPanelButton.gridwidth = 1;
		constraintsPanelButton.weighty = 0;
		constraintsPanelButton.weightx = 0;
		constraintsPanelButton.fill = GridBagConstraints.LINE_START;
		constraintsPanelButton.anchor = GridBagConstraints.CENTER;
		this.buttonExportPI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				actionExportDialog();
			}
		});
		panelButton.add(this.buttonExportPI,constraintsPanelButton);
		
		updateTable();
		
		// create Label Description
		label = new JLabel("Description:", SwingConstants.RIGHT);
		constraints.gridx = 0;
		constraints.gridy = 5;
		constraints.gridwidth = 1;
		constraints.weighty = 0;
		constraints.weightx = GridBagConstraints.NONE;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.LINE_END;
		this.add(label,constraints);
		// create test Desciption
		this.jTextDescription = new JTextArea();
		scrollPane = new JScrollPane(this.jTextDescription,
	    		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		this.jTextDescription.setEnabled(false);
		scrollPane.setMinimumSize(dimensionDescription);
		scrollPane.setPreferredSize(dimensionDescription);
		constraints.gridx = 0;
		constraints.gridy = 6;
		constraints.gridwidth = GridBagConstraints.REMAINDER ;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.CENTER;
		this.add(scrollPane,constraints);
		
		// add button Import
		JButton buttonImport = new JButton("Import");
		buttonImport.setMinimumSize(dimesionButton);
		buttonImport.setPreferredSize(dimesionButton);
		constraints.gridx = 3;
		constraints.gridy = 7;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.LINE_END;
		constraints.anchor = GridBagConstraints.LINE_END;
		buttonImport.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Find Metric
				int indexSelected = table.getSelectedRow();
				PiMetric metricSelected = tableModel.getData(indexSelected);
				// PiMetric to BsmPi
				BsmPerformanceIndicator bsmPi = service.piMetricToBsmPi(metricSelected);
				
				piPanel.addBsmPerformanceIndicator(bsmPi);
			}
		});
		this.add(buttonImport,constraints);
		
		// add button exit
		JButton buttonExit = new JButton("Exit");
		buttonExit.setMinimumSize(dimesionButton);
		buttonExit.setPreferredSize(dimesionButton);
		constraints.gridx = 4;
		constraints.gridy = 7;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.LINE_END;
		constraints.anchor = GridBagConstraints.LINE_END;
		buttonExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				exitAction();
			}
		});
		this.add(buttonExit,constraints);

		// update data
		updateListCategory2();
		updateListCategory3();
		updateListDimension();
		updateListField();
		updateTable();
		
		//this.setResizable(false);
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
		this.comboCategory3.removeActionListener(this.actionComboCategory3);
		this.comboCategory3.removeAllItems();
		List<IPiElement> listCategory3 = new ArrayList<IPiElement>();
		listCategory3.add(new PiCategory3(null, ""));
		if (null !=  this.comboCategory2.getSelectedItem()) {
			listCategory3.addAll(this.service.getListCategory3((PiCategory2) this.comboCategory2.getSelectedItem()));
		}
		addElementList(this.comboCategory3, listCategory3);
		this.comboCategory3.addActionListener(this.actionComboCategory3);
	}

	/** Update field combo */
	private void updateListField() {
		this.comboField.removeActionListener(this.actionComboDimOrField);
		this.comboField.removeAllItems();
		List<IPiElement> listField = new ArrayList<IPiElement>();
		listField.add(new PiField(PiField.ID_ALL, "<All>"));
		listField.add(new PiField(PiField.ID_EMPTY, "<Empty>"));
		if (null != this.comboCategory1.getSelectedItem()
				&& null != this.comboCategory2.getSelectedItem()
				&& null != this.comboCategory3.getSelectedItem()) {
			listField.addAll(this.service.getListField(
					(PiCategory1) this.comboCategory1.getSelectedItem(),
					(PiCategory2) this.comboCategory2.getSelectedItem(),
					(PiCategory3) this.comboCategory3.getSelectedItem()));
		}
		addElementList(this.comboField, listField);
		this.comboField.addActionListener(this.actionComboDimOrField);
	}

	/** Update dimension combo */
	private void updateListDimension() {
		this.comboDimension.removeActionListener(this.actionComboDimOrField);
		this.comboDimension.removeAllItems();
		List<IPiElement> listDimension = new ArrayList<IPiElement>();
		listDimension.add(new PiDimension(null, ""));
		if (null != this.comboCategory1.getSelectedItem()
				&& null != this.comboCategory2.getSelectedItem()
				&& null != this.comboCategory3.getSelectedItem()) {
			listDimension.addAll(this.service.getListDimension((PiCategory1) this.comboCategory1.getSelectedItem(),
							(PiCategory2) this.comboCategory2.getSelectedItem(),
							(PiCategory3) this.comboCategory3.getSelectedItem()));
		}
		addElementList(this.comboDimension, listDimension);
		this.comboDimension.addActionListener(this.actionComboDimOrField);
	}

	/** Update element in table */
	public void updateTable() {
		List<PiMetric> listMetric =  this.service.getListMetrics((PiCategory1) this.comboCategory1.getSelectedItem(), 
				(PiCategory2) this.comboCategory2.getSelectedItem(),
				(PiCategory3) this.comboCategory3.getSelectedItem(),
				(PiDimension) this.comboDimension.getSelectedItem(),
				(PiField) this.comboField.getSelectedItem(),
				this.jTextName.getText());

		this.tableModel.clear();
		this.tableModel.addAll(listMetric);
		this.buttonEdit.setEnabled(false);
		this.buttonDelete.setEnabled(false);
	}

	/**
	 * Update description field
	 * @param event		event for update
	 */
	private void updateDescription(ListSelectionEvent event) {
		if (event.getSource() instanceof DefaultListSelectionModel) {
			DefaultListSelectionModel selectionModel = (DefaultListSelectionModel) event.getSource();
			PiMetric metric = this.tableModel.getData(selectionModel.getMaxSelectionIndex());
			if (null != metric) {
				this.jTextDescription.setText(metric.getDescription());
			}
		}
	}
	
	/**
	 * Import file action
	 */
	private void actionImportDialog(){
		JFileChooser chooser = new JFileChooser();
	    FileNameExtensionFilter filter = new FileNameExtensionFilter(
	            "CSV file", "csv");
		chooser.setDialogTitle("Import File");
	    chooser.setFileFilter(filter);
		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			InputStream inputStream = null;
			try {
				inputStream = new FileInputStream(chooser.getSelectedFile());
				Object[] message = this.service.importPi(inputStream);
				if (message.length > 0) {
					StringBuffer messageAfterImport = new StringBuffer();
					for (int i = 0; i < message.length ; i++) {
						if (i != 0 ) {
							messageAfterImport.append("\n");
						}
						messageAfterImport.append(message[i]);
					}
					JOptionPane.showMessageDialog( null,
							messageAfterImport.toString(),
					                     "Error in import file",
					                     JOptionPane.ERROR_MESSAGE);
				}
			} catch (FileNotFoundException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			} finally {
				if (null != inputStream) {
					try {
						inputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	

	
	/**
	 * Export file action
	 */
	private void actionExportDialog(){
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Export File");
	    FileNameExtensionFilter filter = new FileNameExtensionFilter(
	            "CSV file", "csv");
	    chooser.setFileFilter(filter);
		if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
			
			Object[] message = this.service.exportPi(chooser.getSelectedFile().getPath());
			if (message.length > 0) {
				StringBuffer messageAfterImport = new StringBuffer();
				for (int i = 0; i < message.length ; i++) {
					if (i != 0 ) {
						messageAfterImport.append("\n");
					}
					messageAfterImport.append(message[i]);
				}
				JOptionPane.showMessageDialog( null,
						messageAfterImport.toString(),
				                     "Error in export file",
				                     JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	/**
	 * TODO
	 * @param piMetric
	 */
	private void openEditMetric(PiMetric piMetric) {
		MetricEditDialog dialog = new MetricEditDialog(this, piMetric);
		dialog.setVisible(true);
	}
	
	/**
	 * Close element
	 */
	protected void exitAction() {
		this.dispose();
	}

}
