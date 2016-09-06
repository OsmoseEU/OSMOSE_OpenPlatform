package org.msee.slmtoolbox.modeling.service.app.ssm.bsm;

import java.io.Reader;
import java.io.StringReader;

import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.bean.MseAssetClassBeanREST;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.bean.MseServiceBeanREST;
import org.msee.slmtoolbox.modeling.service.app.utils.PreferencesServices;
import org.msee.slmtoolbox.modeling.service.app.utils.PropertiesServices.RestUrl;

import com.google.gson.Gson;

/**
 * Bsm service for use call REST
 * @author fto
 *
 */
public class BsmRESTService {
	

	/**
	 * call REST on HTTP:GET:/service/public/
	 * @return a public service list
	 */
	public MseServiceBeanREST[] getAllPublicService() {
		return getListBsmMseService(RestUrl.URL_SERVICE_PUBLIC);
	}

	/**
	 * call REST on HTTP:GET:/service/local/
	 * @return a local service list
	 */
	public MseServiceBeanREST[] getAllLocalService() {
		return getListBsmMseService(RestUrl.URL_SERVICE_LOCAL);
	}

	/**
	 * @param restClient restClient
	 * @return get a bean array Mse's Object 
	 */
	private MseServiceBeanREST[] getListBsmMseService(String url) {
		RESTClient restClient = getRestClient(url);
		// call service
		String reponseJson = restClient.call();
		// parse JSON
		Gson gson = new Gson();
		Reader reader = new StringReader(reponseJson);
		MseServiceBeanREST[] results = gson.fromJson(reader, MseServiceBeanREST[].class);
		return results;
	}

	/**
	 * call REST on HTTP:GET:/classes/
	 * @return a class list
	 */
	public MseAssetClassBeanREST getAllMseAssets() {
		RESTClient restClient = getRestClient(RestUrl.URL_SERVICE_CLASS);
		// call service
		String reponseJson = restClient.call();
		// parse JSON
		Gson gson = new Gson();
		Reader reader = new StringReader(reponseJson);
		MseAssetClassBeanREST assets = gson.fromJson(reader, MseAssetClassBeanREST.class);
		completeParent(assets);

		return assets;
	}
	
	public RESTClient getRestClient(String serviceUrl){
		PreferencesServices prefsServices = new PreferencesServices();
		String url = prefsServices.findString("URL_SERVICE_ROOT");
		RESTClient restClient;
		if ( null != url)
		// create client
			restClient = new RESTClient(url + serviceUrl);
		else
			restClient = new RESTClient(RestUrl.URL_SERVICE_ROOT+ serviceUrl);
		return restClient;
	}

	/**
	 * Complete parent data of element's children
	 * @param element to completed
	 */
	private void completeParent(MseAssetClassBeanREST element) {
		if (null != element.children) {
			for (MseAssetClassBeanREST child : element.children) {
				child.parent = element;
				completeParent(child);
			}
		}
	}

	public String getRestServiceUrl() {
		PreferencesServices prefsServices = new PreferencesServices();
		String url = prefsServices.findString("URL_SERVICE_ROOT");
		if (null != url)
			return url;
		else
			return RestUrl.URL_SERVICE_ROOT;
	}
	
	public String testRestServiceUrl(String url){
		// create client
		RESTClient restClient = new RESTClient(url);
		return restClient.call();
	}


}
