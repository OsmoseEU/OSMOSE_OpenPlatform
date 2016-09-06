package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

/**
 * Main frame for KPI wizard
 * @author fto
 *
 */
public class DecisionDialog extends JDialog {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** Decisions Objectives panel */
	private ObjectivesPanel objective;
	
	/** Decisions Variable panel */
	private VariablePanel variable;
	
	/** Performance Indicator panel */
	private PerformanceIndicatorPanel pi;
	
	/**
	 * Default constructor
	 * @param bsmService
	 * @param bsmPi
	 * @param panelCall
	 */
	public DecisionDialog(GgAppService appService, GgDecisionCenter center) {  
		super();
		this.setModal(true);
		
		 try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		this.setTitle("Define Performance Indicators");
		
		this.setMinimumSize(new Dimension(600,500));
		this.setPreferredSize(new Dimension(600,500));
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getClassLoader().getResource("icons/16/action_pi.png")));
		
	    // define layout panel
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5,5,5,5);  //top padding

		//create panels
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setMinimumSize(new Dimension(580,420));
		tabbedPane.setPreferredSize(new Dimension(580,420));
	    constraints.gridx = 0;
	    constraints.gridy = 0;
	    constraints.gridwidth = 1;
	    constraints.fill = GridBagConstraints.CENTER;
	    constraints.anchor = GridBagConstraints.LINE_START;
		this.getContentPane().add(tabbedPane,constraints);
		
		this.objective = new ObjectivesPanel(appService, center);
		tabbedPane.addTab("Objective", null, this.objective, "Objectives define");
		this.variable = new VariablePanel(appService, center);
		tabbedPane.addTab("Decision variable", null, this.variable, "Decisions variables define");
		this.pi = new PerformanceIndicatorPanel(appService, center);
		tabbedPane.addTab("Performance Indicators", null, this.pi, "Performance Indicators define");
		
		for (int i =0; i < tabbedPane.getTabCount(); i++) {
			tabbedPane.getComponent(i).addComponentListener(new ComponentListener() {
				
				@Override
				public void componentShown(ComponentEvent arg0) {
					if (arg0.getComponent() instanceof AbstractElementPanel<?>) {
						((AbstractElementPanel<?>) arg0.getComponent()).updateService();
					}
				}
				
				@Override
				public void componentResized(ComponentEvent arg0) {
					
				}
				
				@Override
				public void componentMoved(ComponentEvent arg0) {
				}
				
				@Override
				public void componentHidden(ComponentEvent arg0) {
				}
			});
		}
		
		// add button exit
		//add button close
		JButton button = new JButton("Exit");
		button.setPreferredSize(new Dimension(100,20));
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				exitAction();
			}
		});
	    constraints.gridx = 0;
	    constraints.gridy = 1;
	    constraints.weighty = 1;
	    constraints.fill = GridBagConstraints.LINE_END;
	    constraints.anchor = GridBagConstraints.LINE_END;
		this.getContentPane().add(button,constraints);

		this.pack();
		this.setResizable(false);
	}

	/**
	 * Close element
	 */
	protected void exitAction() {
		this.dispose();
	}
}
