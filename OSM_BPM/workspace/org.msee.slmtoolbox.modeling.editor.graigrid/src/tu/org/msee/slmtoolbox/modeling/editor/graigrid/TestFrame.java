package tu.org.msee.slmtoolbox.modeling.editor.graigrid;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.VariablePanel;
import org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.ObjectivesPanel;
import org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.PerformanceIndicatorPanel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

public class TestFrame extends JFrame{
	
	private TestPanel testpanel;
	
	private ObjectivesPanel objective;
	
	private VariablePanel variable;
	
	private PerformanceIndicatorPanel pi;
	
	/** serialVersionUID  */
	private static final long serialVersionUID = 1L;
	
	public TestFrame(BsmAppService bsmService) {
		//create panles
		JTabbedPane tabbedPane = new JTabbedPane();
		this.setContentPane(tabbedPane);//
		
		createComponentSelectDecisionCenter(bsmService,tabbedPane);
		
		GgAppService appService = new GgAppService(bsmService);
		
		this.objective = new ObjectivesPanel(appService, this.testpanel.getCenter());
		tabbedPane.addTab("Objective", null, this.objective, "Objectives define");
		this.variable = new VariablePanel(appService, this.testpanel.getCenter());
		tabbedPane.addTab("Decision variable", null, this.variable, "Decisions variables define");
		this.pi = new PerformanceIndicatorPanel(appService, this.testpanel.getCenter());
		tabbedPane.addTab("Performance Indicators", null, this.pi, "Performance Indicators define");
	}

	/**
	 * Create component for select decision center
	 */
	private void createComponentSelectDecisionCenter(BsmAppService bsmService, JTabbedPane tabbedPane) {
		List<GgDecisionCenter> elementList = new ArrayList<GgDecisionCenter>();
		BsmModel model = bsmService.findModel();
		for(BsmDecision bsmElement : model.getDecisions()) {
			if (null != bsmElement.getGgDecisionCenters()
					&& bsmElement.getGgDecisionCenters().size() > 0 ){
				elementList.addAll(bsmElement.getGgDecisionCenters());
			}
		}
		
		this.testpanel = new TestPanel(elementList);
		this.testpanel.getButtonChange().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				changeDecisionCenter();
			}
		});
		tabbedPane.addTab("Decision center", null, this.testpanel, "Selected decision center");
	}

	/**
	 * TODO
	 */
	protected void changeDecisionCenter() {
		GgDecisionCenter center = this.testpanel.getCenter();
		this.objective.setDecision(center);
		this.variable.setDecision(center);
		this.pi.setDecision(center);
	}

	/**
	 * Close frame
	 */
	protected void exit() {
        this.dispose();
	}
}
