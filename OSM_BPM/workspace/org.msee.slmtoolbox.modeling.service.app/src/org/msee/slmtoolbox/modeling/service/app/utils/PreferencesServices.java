/**
 * 
 */
package org.msee.slmtoolbox.modeling.service.app.utils;

import java.util.prefs.Preferences;

/**
 * @author HBA6
 *
 */
public class PreferencesServices {
	
	private static Preferences prefs;
	
	public PreferencesServices(){
		prefs = Preferences.userRoot().node(this.getClass().getName());	
	}
	
	public void init(){
	}
	
	public String findString(String key){
		try{
		return prefs.get(key, null);
		}
		catch(Exception ex){
			return null;
		}
	}
	
	public void updateString(String Key, String updateValue){
		prefs.put(Key, updateValue);
		try{
			prefs.flush();
		}catch(Exception ex){
				ex.printStackTrace();
		}
	}		
	
}
