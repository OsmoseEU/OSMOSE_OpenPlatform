package org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement;
import org.msee.slmtoolbox.modeling.model.utils.dialog.AbstractMSeEElementDialog;

/**
 * 
 * @author FTO
 *
 * @param <T>	Tim element to be completed
 * @param <S>	Tim element to add
 */
public abstract class AbstractTimElementDialog<T extends iTimNamedElement, S extends iTimNamedElement> extends AbstractMSeEElementDialog<T, S> {

	/**
	 * Creates an input dialog with OK and Cancel buttons. Note that the dialog
	 * will have no visual representation (no widgets) until it is told to open.
	 * <p>
	 * Note that the <code>open</code> method blocks for input dialogs.
	 * </p>
	 * 
	 * @param parentShell
	 *            the parent shell, or <code>null</code> to create a top-level
	 *            shell
	 * @param elementBeCompleted
	 *            element to be completed
	 * @param labelProvider
	 *            labelProvider
	 * 
	 */
	public AbstractTimElementDialog(Shell parentShell, ILabelProvider labelProvider,
			T elementBeCompleted, String title, String message, Class<S> classInput) {
		super(parentShell, labelProvider, elementBeCompleted, title, message, classInput);
	}

}
