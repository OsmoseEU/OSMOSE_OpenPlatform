package org.msee.slmtoolbox.modeling.editor.graphiti;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * see https://dev.eclipse.org/svnroot/modeling/org.eclipse.mdt.sphinx/trunk/experimental/org.eclipse.sphinx.graphiti.workspace/src/org/eclipse/sphinx/graphiti/workspace/resources/GraphitiResourceFactory.java
 * @author fto
 * TODO : A conserver ?
 */
public class GraphitiResourceFactory {

	public final static String XMI_ENCODING = "UTF-8"; //$NON-NLS-1$

	// default load options.
	private static Map<Object, Object> loadOptions = null;

	// default save options.
	private static Map<Object, Object> saveOptions= null;

	static {

		// default save options.
	}
	
	/**
	 * Add specific loading options for diagram file
	 * @param resource
	 */
	public static void addLoadOptions(XMIResource resource) {
		if (null == GraphitiResourceFactory.loadOptions) {
			GraphitiResourceFactory.loadOptions = new HashMap<Object, Object>();
		}
		resource.getDefaultLoadOptions().putAll(GraphitiResourceFactory.loadOptions);
	}
	
	/**
	 * Add specific save options for diagram file
	 * @param resource
	 */
	public static void addSaveOptions(XMIResource resource) {
		if (null == GraphitiResourceFactory.saveOptions) {
			GraphitiResourceFactory.saveOptions = new HashMap<Object, Object>();
			GraphitiResourceFactory.saveOptions.put(XMLResource.OPTION_DECLARE_XML, Boolean.TRUE);
			GraphitiResourceFactory.saveOptions.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
			GraphitiResourceFactory.saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
			GraphitiResourceFactory.saveOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.TRUE);
			GraphitiResourceFactory.saveOptions.put(XMLResource.OPTION_SKIP_ESCAPE_URI, Boolean.FALSE);
			GraphitiResourceFactory.saveOptions.put(XMLResource.OPTION_ENCODING, XMI_ENCODING);
			GraphitiResourceFactory.saveOptions.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
			GraphitiResourceFactory.saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		}
		
		resource.getDefaultSaveOptions().putAll(GraphitiResourceFactory.saveOptions);
		
	}
}
