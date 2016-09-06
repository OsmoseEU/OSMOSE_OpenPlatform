package org.msee.slmtoolbox.modeling.service.app.utils;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;


/** Properties Class for services */
public class PropertiesServices {

	/** Name of file properties */
    public static final String FILE_PROPERTIE = "msee_services";

	/** Resource of file properties */
    public static final ResourceBundle BEANS_PROPERTIE = ResourceBundle.getBundle(FILE_PROPERTIE, Locale.ROOT); 

	/** Default constructor */
	public PropertiesServices() {
	}
	
	/** Properties for ExternalInformationSource */
	public static class ExternalInformationSource {
		
		/** Name */
		public static String NAME = findString("service.data.information.source.external.name", "Information source external");
		
		/** Name */
		public static String CODE = findString("service.data.information.source.external.code", "IE");
		
		/** Default constructor */
		public ExternalInformationSource() {
		}
		
	}
	
	/** Properties for InternalInformationSource */
	public static class InternalInformationSource {
		
		/** Name */
		public static String NAME = findString("service.data.information.source.internal.name", "Information source internal");
		
		/** Name */
		public static String CODE = findString("service.data.information.source.internal.code", "II");
		
		/** Default constructor */
		public InternalInformationSource() {
		}
		
	}
	
	/** Properties for URL REST */
	public static class RestUrl {
		
		/** Url for service root */
		public static String URL_SERVICE_ROOT = findString("url.service.root", null);
		
		/** Url for service local */
		public static String URL_SERVICE_LOCAL = findString("url.service.local", null);
		
		/** Url for service public */
		public static String URL_SERVICE_PUBLIC = findString("url.service.public", null);
		
		/** Url for service class */
		public static String URL_SERVICE_CLASS = findString("url.service.class", null);
		
		/** Default constructor */
		public RestUrl() {
		}
		
	}
	
	public static class RestKey {
		/** Key for value type */
		public static String KEY_TYPE = findString("rest.key.type", "type");
		/** Key for value name */
		public static String KEY_NAME = findString("rest.key.name", "name");
		/** Key for value description */
		public static String KEY_DESCRIPTION = findString("rest.key.description", "description");
		/** Key for value ownedBy */
		public static String KEY_OWNED_BY = findString("rest.key.ownedBy", "ownedBy");
		/** Key for value date created */
		public static String KEY_CREATED = findString("rest.key.created", "created");
		/** Key for value date published */
		public static String KEY_PUBLISHED = findString("rest.key.published", "published");
		/** Key for value publish */
		public static String KEY_PUBLISH = findString("rest.key.publish", "publish");
		/** Key for value number assets */
		public static String KEY_ASSETS = findString("rest.key.assets", "Assets");
		/** Key for value type */
		public static String KEY_PREFIX = findString("rest.key.prefix", "prefix");
		/** Key for value uri */
		public static String KEY_URI = findString("rest.key.uri", "uri");
		/** Key for value children */
		public static String KEY_CHILDREN = findString("rest.key.children", "children");
		
		/** Default constructor */
		public RestKey() {
		}
	}
	
	/** 
	 * Find a value properties for a key 
	 * @param key of value
	 * @param defaultValue for the key
	 * 
	 * @return String value link at key or defaultValue if value not found
	 * */
	protected static String findString(String key, String defaultValue) {
		try {
			if (null!=BEANS_PROPERTIE)
				return BEANS_PROPERTIE.getString(key);
		} catch (MissingResourceException exception) {
			// log with : " key [" + key + "] not found, use default value : " + defaultValue
			System.out.print(" key [" + key + "] not found, use default value : " + defaultValue + "\n");
		}
		return defaultValue;
	}
}
