package org.msee.slmtoolbox.modeling.editor.ui;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement;

/**
 * TODO
 * @author fto
 *
 * @param <E>
 */
public class BsmCellRenderer extends DefaultListCellRenderer {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	@Override
	public Component getListCellRendererComponent(JList<?> list,
			Object value, int index, boolean isSelected, boolean cellHasFocus) {
		super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		
		if (value instanceof IBsmNamedElement) {
			this.setText(((IBsmNamedElement) value).getName());
		}

        return this;
	}
}
