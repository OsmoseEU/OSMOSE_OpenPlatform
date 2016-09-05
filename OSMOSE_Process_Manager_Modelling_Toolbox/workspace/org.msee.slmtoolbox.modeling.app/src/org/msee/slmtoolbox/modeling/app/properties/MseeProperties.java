package org.msee.slmtoolbox.modeling.app.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.eclipse.core.runtime.Platform;
import org.msee.slmtoolbox.modeling.app.exception.MseeConfigurationException;


public class MseeProperties {
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(MseeProperties.class);

    // Constants ----------------------------------------------------------------------------------

    private static final Properties PROPERTIES = new Properties();
    private static String CONFIG_FILE;
   
    static {
        try {
        	// use -DConfigfile in JVM for define the config file (name and path).
        	CONFIG_FILE = Platform.getInstallLocation().getURL().getPath() 
        			+System.getProperty("Configfile");
        	PROPERTIES.load(new FileInputStream(CONFIG_FILE));
        } catch (IOException e) {
        	log.error(e);
            throw new MseeConfigurationException(
                "Cannot load properties file '" + CONFIG_FILE + "'.", e);
        }
    }

    /**
     * Get a string value for properties
     * @param key			of value
     * @param mandatory		if the value is
     * @return	string value
     * @throws MseeConfigurationException if not find mandatory value
     */
    public static String getStringProperty(String key, boolean mandatory) throws MseeConfigurationException {
        String property = PROPERTIES.getProperty(key);
        if (property == null || property.trim().length() == 0) {
            if (mandatory) {
                throw new MseeConfigurationException("Required property '" + key + "'"
                    + " is missing in properties file '" + CONFIG_FILE + "'.");
            } else {
                property = null;
            }
        }
        return property;
    }
    
    /**
     * Properties for project folder
     */
    public static class FolderMSeE {
    	
    	/** folder name for an EaStar diagram in BSM project */
    	public static String BSM_FOLDER_EA = getStringProperty("folder.bsm.ea", true);

    	/** folder name for a GraiGird diagram in BSM project */
    	public static String BSM_FOLDER_GG = getStringProperty("folder.bsm.gg", true);

    	/** folder name for processes in TIM project */
    	public static String TIM_FOLDER_PROCESS = getStringProperty("folder.tim.processes", true);

    	/**
    	 * Default constructor
    	 */
    	private FolderMSeE() {
    	}
    	
    }
    

}
