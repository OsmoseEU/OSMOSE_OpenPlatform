package org.msee.slmtoolbox.modeling.service.app.ssm.bsm.bean;

import java.util.Enumeration;
import java.util.List;

import javax.swing.tree.TreeNode;

import com.google.gson.annotations.SerializedName;

/**
 * TODO
 * @author fto
 *
 */
public class MseAssetClassBeanREST implements TreeNode {

	@SerializedName("name")
	public String name;
	@SerializedName("namespace")
	public String namespace;
	@SerializedName("nameClassReference")
	public String nameClassReference;

	@SerializedName("children")
	public List<MseAssetClassBeanREST> children;
	
	public MseAssetClassBeanREST parent;

	@Override
	public Enumeration children() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return this.name;
	}

	@Override
	public boolean getAllowsChildren() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TreeNode getChildAt(int index) {
		if (null != this.children && index < this.children.size()) {
			return this.children.get(index);
		} else {
			return null;
		}
	}

	@Override
	public int getChildCount() {
		if (null != this.children) {
			return this.children.size();
		} else {
			return 0;
		}
	}

	@Override
	public int getIndex(TreeNode child) {
		return this.children.indexOf(child);
	}

	@Override
	public TreeNode getParent() {
		// TODO Auto-generated method stub
		return this.parent;
	}

	@Override
	public boolean isLeaf() {
		return getChildCount() == 0;
	}
	
}
