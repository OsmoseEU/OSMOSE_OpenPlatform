package org.msee.slmtoolbox.modeling.app.wizards;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class ConstantsMseeWizard {

	public static Color getColorTextDefault(Display display) {
		return new Color(display,0, 0, 0);
	}
	
	public static Color getColorTextUndefined(Display display) {
		return new Color(display,128,128,128);
	}
	
	public static Color getColorTextGenerated(Display display) {
		return new Color(display,0,0,128);
	}
}
