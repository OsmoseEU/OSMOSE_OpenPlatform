package org.msee.slmtoolbox.modeling.model.utils.dialog;

import java.lang.reflect.Array;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * 
 * @author FTO
 *
 * @param <T>	MSeE element to be completed
 * @param <S>	MSeE element to add
 */
public abstract class AbstractMSeEElementDialog<T, S> extends ElementListSelectionDialog {

	// element to be completed
	private T elementBeCompleted;
	
	private Class<S> classInput;

	// the resources which can be added to the resources of element to be completed
	private S[] input;

	// list of resources belonging to the organization attached to the element to be completed
	private List<S> listSource;

	// list of resources belonging to the element to be completed
	private List<S> listFilter;

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
	public AbstractMSeEElementDialog(Shell parentShell, ILabelProvider labelProvider,
			T elementBeCompleted, String title, String message, Class<S> classInput) {
		super(parentShell, labelProvider);
		setTitle(title);
		setMessage(message); //"Select a String (* = any string, ? = any char):"
		this.setMultipleSelection(true);
		this.elementBeCompleted = elementBeCompleted;
		this.classInput = classInput;
		filter();
		this.setElements(input);
	}

	@SuppressWarnings("unchecked")
	public void filter() {
		listSource = getListSource();
		listFilter = getListFiltre();
		
		int sizeInput = listSource.size() - listFilter.size();
		if (sizeInput < 0) {sizeInput=0;}
		input = (S[]) Array.newInstance(classInput,sizeInput);
		int counter = 0;

		// for all source element
		for (int i = 0; i < listSource.size(); i++) {
			// add to input if not contains in filter
			if (!listFilter.contains(listSource.get(i))) {
				input[counter] = listSource.get(i);
				counter++;
			}
		}
	}

	abstract protected List<S> getListSource();
	
	abstract protected List<S> getListFiltre();

	/**
	 * The buttonPressed method is fired when a button is clicked.
	 * 
	 */

	@SuppressWarnings("unchecked")
	protected void buttonPressed(int buttonId) {
		// check if the OK button is clicked
		if (buttonId == IDialogConstants.OK_ID) {
			Object[] selectedBsmResources = this.getSelectedElements();
			for (int i = 0; i < selectedBsmResources.length; i++) {
				addNewElementToElementTarget((S)selectedBsmResources[i]);
			}
		}
		super.buttonPressed(buttonId);
	}

	/**
	 * Add to element to be completed a new element
	 * @param newElement	to add to element to be completed
	 */
	abstract protected void addNewElementToElementTarget(S newElement);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.Dialog#createButtonsForButtonBar(org.eclipse
	 * .swt.widgets.Composite)
	 */
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
	}

	/**
	 * @return the element to be completed
	 */
	protected T getElementBeCompleted() {
		return elementBeCompleted;
	}

	/**
	 * @param elementBeCompleted the element to be completed to set
	 */
	protected void setElementBeCompleted(T elementBeCompleted) {
		this.elementBeCompleted = elementBeCompleted;
	}
}
