package org.msee.slmtoolbox.modeling.service.data.ssm.bsm.utils;

/**
 * Utility class for processing on the SQL
 * @author fto
 *
 */
public class UtilsSql {

	/**
	 * Request processing
	 * @param data
	 * @return
	 */
	public static String convertSQL(String data) {
		return data.replaceAll("'", "''");
	}

}
