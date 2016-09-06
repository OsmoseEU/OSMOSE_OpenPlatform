package org.msee.slmtoolbox.modeling.service.data.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement;

/**
 * Utility class for translation data
 * @author fto
 */
public class UtilTranslation {

	/**
	 * Translation a list to Map<id,value>
	 * @param list		list of GraiBaseElement Object
	 * @return a  Map<id,value>
	 */
	public static Map<String, String> listGraiBaseElementToMapKeyValue(List<? extends GgBaseElement> list) {
		Map<String, String> map = new HashMap<String, String>();
		if (null != list) {
			for (Object object : list) {
				if (object instanceof GgBaseElement) {
					GgBaseElement graiObject = (GgBaseElement) object;
					map.put(graiObject.getId(), graiObject.getName());
				}
			}
		}
		return map;
	}

	/**
	 * Translation a list to Map<id,value>
	 * @param list		list of BsmBaseElement Object
	 * @return a  Map<id,value>
	 */
	public static Map<String, String> listBsmBaseElementToMapKeyValue(List<? extends IBsmNamedElement> list) {
		Map<String, String> map = new HashMap<String, String>();
		if (null != list) {
			for (Object object : list) {
				if (object instanceof IBsmNamedElement) {
					IBsmNamedElement bsmObject = (IBsmNamedElement) object;
					map.put(bsmObject.getId(), bsmObject.getName());
				}
			}
		}
		return map;
	}

	/**
	 * Translation a list to Map<id,value>
	 * @param list		list of EAStarBaseElement Object
	 * @return a  Map<id,value>
	 */
	public static Map<String, String> listEAStarBaseElementToMapKeyValue(List<? extends EaBaseElement> list) {
		Map<String, String> map = new HashMap<String, String>();
		if (null != list) {
			for (Object object : list) {
				if (object instanceof EaBaseElement) {
					EaBaseElement eaStarObject = (EaBaseElement) object;
					map.put(eaStarObject.getId(), eaStarObject.getName());
				}
			}
		}
		return map;
	}

	/**
	 * Remove, in map, the grai gird element in list, on comparing id
	 * @param map			map of element selected
	 * @param listGraiGrid	list element to remove
	 */
	public static void removeElementGraiGridById(
			Map<String, String> map, EList<? extends GgBaseElement> listGraiGrid) {
		for (GgBaseElement elementToRemove : listGraiGrid) {
			if (map.containsKey(elementToRemove.getId()))
				map.remove(elementToRemove.getId());
		}
	}

}
