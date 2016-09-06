package org.msee.slmtoolbox.modeling.service.app.ssm.bsm.bean;

import com.google.gson.annotations.SerializedName;

/**
 * TODO
 * @author fto
 *
 */
public class MseServiceBeanREST {
	
	@SerializedName("idService")
	public String idService;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("serviceDescription")
	public String description;
	
	@SerializedName("owner")
	public String owner;
	
	@SerializedName("created")
	public String created;
	
	@SerializedName("publishedDate")
	public String publishedDate;
	
	@SerializedName("published")
	public long published;
	
	@SerializedName("userId")
	public int userId;
	
	public String toString() {
		return this.name;
	}
}
