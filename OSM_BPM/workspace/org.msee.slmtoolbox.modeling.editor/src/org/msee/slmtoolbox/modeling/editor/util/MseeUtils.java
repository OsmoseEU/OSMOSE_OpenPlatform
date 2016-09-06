package org.msee.slmtoolbox.modeling.editor.util;


public class MseeUtils {

	public static String generateCodeForName(String name) {
		StringBuffer code = new StringBuffer();
		String[] temp = name.split(" ");
		for (int i=0; i < temp.length; i++) {
        	if (temp[i].length() > 0) {
        		code.append(temp[i].substring(0,1));
        	}
		}
		return code.toString();
	}

}
