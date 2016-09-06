package tu.org.msee.slmtoolbox.modeling.editor.graigrid;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;

public class TestPanel extends JPanel{
	
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/**
	 * Button change for update decision center selected
	 */
	private JButton buttonChange;
	
	/** Combo for select decision center */
	private JComboBox<GgDecisionCenter> comboCenter;
	
	/**
	 * Default constructor
	 */
	public TestPanel(List<GgDecisionCenter> elementList) {
		// define layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5,5,5,5);  //top padding
		
		
	    JLabel label = new JLabel("Decision Center:", SwingConstants.RIGHT);
	    label.setPreferredSize(new Dimension(120,20));
	    constraints.gridx = 0;
	    constraints.gridy = 0;
	    constraints.gridwidth = 1;
	    constraints.fill = GridBagConstraints.NONE;
	    constraints.anchor = GridBagConstraints.FIRST_LINE_END;
	    this.add(label, constraints);
	    
		this.comboCenter = new JComboBox<GgDecisionCenter>();
	    this.comboCenter.setPreferredSize(new Dimension(400,20));
		for (GgDecisionCenter element : elementList) {
			this.comboCenter.addItem(element);
		}
		
	    constraints.gridx = 1;
	    constraints.gridy = 0;
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.PAGE_START;
	    this.add(this.comboCenter, constraints);
	    
	    this.buttonChange = new JButton("Change");
	    this.buttonChange.setPreferredSize(new Dimension(200,20));
	    constraints.gridx = 2;
	    constraints.gridy = 1;
	    constraints.gridwidth = 1;
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.anchor = GridBagConstraints.CENTER;
	    constraints.weightx = 1;
	    this.add(this.buttonChange, constraints);
	}

	/**
	 * @return the buttonChange
	 */
	public JButton getButtonChange() {
		return buttonChange;
	}

	/**
	 * @param buttonChange the buttonChange to set
	 */
	public void setButtonChange(JButton buttonChange) {
		this.buttonChange = buttonChange;
	}

	/**
	 * @return the comboCenter
	 */
	public JComboBox<GgDecisionCenter> getComboCenter() {
		return comboCenter;
	}

	/**
	 * @param comboCenter the comboCenter to set
	 */
	public void setComboCenter(JComboBox<GgDecisionCenter> comboCenter) {
		this.comboCenter = comboCenter;
	}

	/***
	 * 
	 * @return
	 */
	public GgDecisionCenter getCenter() {
		return (GgDecisionCenter) this.comboCenter.getSelectedItem();
	}

	
}
