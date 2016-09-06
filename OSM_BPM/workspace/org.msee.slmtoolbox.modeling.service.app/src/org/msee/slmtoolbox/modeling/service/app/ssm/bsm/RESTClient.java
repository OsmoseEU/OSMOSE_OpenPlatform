package org.msee.slmtoolbox.modeling.service.app.ssm.bsm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Class client for REST
 * @author fto
 *
 */
public class RESTClient {
	
	/** url */
	private String url;
	
	/** request method */
	private String methode;
	
	/* ************************************
	 * C O N S T R U C T O R S
	 * ***********************************/
	/**
	 * Default constructor
	 * @param url
	 */
	public RESTClient(String url) {
		this.url = url;
		this.methode = "GET";
		
	}

	/* ************************************
	 * M E T H O D E S
	 * ***********************************/

	public String call() {

		URL url;
		try {
			url = new URL(this.url);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod(methode);
			conn.setRequestProperty("Accept", "application/json");
	 
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader reader = new BufferedReader( new InputStreamReader(conn.getInputStream()));
			StringBuffer buffer = new StringBuffer();
			String output;
			while ((output = reader.readLine()) != null) {
				buffer.append(output);
			}
	 		return buffer.toString();
		} catch (Exception ex){
			JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "HTTP Error", JOptionPane.ERROR_MESSAGE);				
			return null;
		}
	}
	
	
	/* ************************************
	 * G E T T E R S   /   S E T T E R S
	 * ***********************************/
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the methode
	 */
	public String getMethode() {
		return methode;
	}

	/**
	 * Set request method to GET
	 */
	public void setMethodeGET() {
		this.methode = "GET";
	}

	/**
	 * Set request method to POST
	 */
	public void setMethodePOST() {
		this.methode = "POST";
	}

}
