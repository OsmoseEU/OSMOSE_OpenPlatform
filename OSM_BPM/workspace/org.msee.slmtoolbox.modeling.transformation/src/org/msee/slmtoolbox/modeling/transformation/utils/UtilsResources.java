package org.msee.slmtoolbox.modeling.transformation.utils;



/**
 * Class utils for use Ressource
 * @author fto
 *
 */
public class UtilsResources {

	/**
	 * Get path in platform for a file in plugin
	 * @param pluginName		name of plugin target
	 * @param filePathInPlugin	file path in plugin
	 * @return	null or path
	 */
	public static String getFilePathPlugin(String pluginName, String filePathInPlugin) {
		if (null != pluginName && null != filePathInPlugin) {
			return "platform:/plugin/"+pluginName+"/"+filePathInPlugin;
		} else {
			return null;
		}
	}
}
