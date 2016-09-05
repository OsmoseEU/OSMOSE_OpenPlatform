package org.msee.slmtoolbox.modeling.app.wizards;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement;

/**
 * Class support management wizards
 * @author fto
 *
 */
public class UtilsWizards {

	/**
	 * Returns the currently active Shell.
	 * 
	 * @return The currently active Shell.
	 */
	public static Shell getShell() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}

	/**
	 * Get a String[] for a combo with name of Map<id,name>
	 * @param tabEntry		entry table of <id,name> 
	 * @return a String[]
	 */
	public static String[] convertEntryValuesToArray(Object[] tabEntry) {
		String[] itemsCombo;
		if (null == tabEntry) {
			itemsCombo = new String[0];
		} else {
			itemsCombo = new String[tabEntry.length];
		
			for (int i = 0; i < tabEntry.length; i++) {
				Entry<?, ?> entry = (Entry<?, ?>) tabEntry[i];
				if (null != entry.getValue()) {
					itemsCombo[i] = (String) entry.getValue();
				} else {
					itemsCombo[i] = "";
				}
			}
		}
		return itemsCombo;
	}

	/**
	 * Get a String[] for a combo with name of List<?>
	 * @param list	element EaBaseElement or GgBaseElement 
	 * @return
	 */
	public static String[] convertListToArrayName(List<?> list) {
		List<String> listName = new ArrayList<String>();
		for (Object element : list) {
			if (element instanceof EaBaseElement) {
				listName.add(((EaBaseElement)element).getName());
			} else if (element instanceof GgBaseElement) {
				listName.add(((GgBaseElement)element).getName());
			} else if (element instanceof IBsmNamedElement) {
				listName.add(((IBsmNamedElement)element).getName());
			}
		}
		return listName.toArray(new String[0]);
	}

	/**
	 * Convert a Map to Array
	 * @param mapElements	with type value EaBaseElement or GgBaseElement
	 * @return Array with name of EaBaseElement element or GgBaseElement element
	 */
	public static String[] convertMapEaToArray(Map<String, ?> mapElements) {
		String[] itemsCombo;
		if (null == mapElements) {
			itemsCombo = new String[0];
		} else {
			Object[] tabEntry = mapElements.entrySet().toArray();
			itemsCombo = new String[tabEntry.length];
		
			for (int i = 0; i < tabEntry.length; i++) {
				Entry<?, ?> entry = (Entry<?, ?>) tabEntry[i];
				if (null != entry.getValue() && entry.getValue() instanceof EaBaseElement) {
					itemsCombo[i] = ((EaBaseElement) entry.getValue()).getName();
				} else  if (null != entry.getValue() && entry.getValue() instanceof GgBaseElement) {
					itemsCombo[i] = ((GgBaseElement) entry.getValue()).getName();
				} else {
					itemsCombo[i] = "";
				}
			}
		}
		return itemsCombo;
	}
	
	/**
	 * Select index item from text input
	 * @param combo source
	 * @deprecated
	 */
	public static int getIndexSelectFromText(Combo combo) {
		String text = combo.getText();
		for (int i = 0; combo.getItems().length > i ; i++) {
			if (combo.getItems()[i].equalsIgnoreCase(text)){
				combo.select(i);
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Select item from text input
	 * @param index			of entry
	 * @param tabEntry		entry table of <id,name> 
	 * @return id of entry table or null
	 */
	public static String findEntryKey(int index, Object[] tabEntry) {
		String objectReturn = null;
		if (-1 != index && index < tabEntry.length) {
			Entry<?, ?> entry = (Entry<?, ?>) tabEntry[index];
			objectReturn = (String) entry.getKey();
		}
		return objectReturn;
	}
	
	/**
	 * Select Item for a id
	 * FIXME FTO : est-ce vraiment utile
	 * @param combo		
	 * @param tabEntry
	 * @param id
	 */
	public static void selectItemForAId(Combo combo, Object[] tabEntry, String id) {
		int index = -1;
		if (null != id) {
			for (int i = 0; i < tabEntry.length; i++) {
				Entry<?, ?> entry = (Entry<?, ?>) tabEntry[i];
				if (id.equals((String) entry.getKey())) {
					index = i;
					break;
				}
			}
		}
		// Stop modify listener
		Listener[] temp = combo.getListeners(SWT.Modify);
		for (int i=0; i< temp.length; i++)
			combo.removeListener(SWT.Modify, temp[i]);
		// modify combo
		combo.select(index);
		// active modify listener combo
		for (int i=0; i< temp.length; i++)
			combo.addListener(SWT.Modify, temp[i]);
	}
}
