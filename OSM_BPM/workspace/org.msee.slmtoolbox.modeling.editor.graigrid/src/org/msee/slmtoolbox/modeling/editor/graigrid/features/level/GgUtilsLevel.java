package org.msee.slmtoolbox.modeling.editor.graigrid.features.level;

import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.services.IGaService;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue;

/**
 * Class utils for level
 * @author fto
 *
 */
public class GgUtilsLevel {
	
	/** id for pictogram level name */
	public static final int LEVEL_ID_NAME = 0;
	/** id for pictogram level code */
	public static final int LEVEL_ID_CODE = 4;
	/** id for pictogram level horizon */
	public static final int LEVEL_ID_HORIZON = 1;
	/** id for pictogram level period */
	public static final int LEVEL_ID_PERIOD = 2;
	/** id for pictogram level processing unit */
	public static final int LEVEL_ID_UNIT = 3;

	/**
	 * @param level	target
	 * @return text for horizon
	 */
	public static String getTextHorizon(GgLevel level) {
		return getText("H", level.getHorizon());
	}

	/**
	 * @param level	target
	 * @return text for period
	 */
	public static String getTextPeriod(GgLevel level) {
		return getText("P", level.getPeriod());
	}

	/**
	 * @param level	target
	 * @return text for processing unit
	 */
	public static String getTextProcessingUnit(GgLevel level) {
		return getText("U", level.getProcessingUnit());
	}

	/**
	 * 
	 * @param letter	for the time value
	 * @param timeValue	target
	 * @return text for a time value
	 */
	private static String getText(String letter, GgTimeValue timeValue) {
		return letter + ": " + timeValue.toString();
	}

	public static void getLocationHorizon(IGaService gaService,
			GgLevel level, AbstractText abstractText) {
		int y = -50;
		if (level.getHorizon().getValue() > 0) {
			y = 20;
		}
		gaService.setLocation(abstractText, 5, y);
	}

	public static void getLocationPeriod(IGaService gaService,
			GgLevel level, AbstractText abstractText) {
		int y = -50;
		if (level.getPeriod().getValue() > 0) {
			y = 20;
			if (level.getHorizon().getValue() > 0) {
				y+=15;
			}
		}
		gaService.setLocation(abstractText, 5, y);
	}

	public static void getLocationProcessingUnit(IGaService gaService,
			GgLevel level, AbstractText abstractText) {
		int y = -50;
		if (level.getProcessingUnit().getValue() > 0) {
			y = 20;
			if (level.getHorizon().getValue() > 0) {
				y+=15;
			}
			if (level.getPeriod().getValue() > 0) {
				y+=15;
			}
		}
		gaService.setLocation(abstractText, 5, y);
	}
}
