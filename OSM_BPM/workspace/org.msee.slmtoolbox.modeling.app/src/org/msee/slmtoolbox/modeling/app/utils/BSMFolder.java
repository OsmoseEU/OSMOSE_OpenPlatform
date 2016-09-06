package org.msee.slmtoolbox.modeling.app.utils;

import java.util.ArrayList;
import java.util.List;

import org.msee.slmtoolbox.modeling.app.properties.MseeProperties.FolderMSeE;

public class BSMFolder {

	private String name;
	
	private List<BSMFolder> folders;
	
	public BSMFolder () {
		this.folders = new ArrayList<>();
		//folders.add(new BSMFolder(FolderMSeE.BSM_FOLDER_GG));
		folders.add(new BSMFolder(FolderMSeE.BSM_FOLDER_EA));
	};
	
	public BSMFolder (String name) {
		this(name, new ArrayList<BSMFolder>());
	}
	
	public BSMFolder (String name, List<BSMFolder> folders) {
		this.name = name;
		this.folders = folders;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the folders
	 */
	public List<BSMFolder> getFolders() {
		return folders;
	}

	/**
	 * @param folders the folders to set
	 */
	public void setFolders(List<BSMFolder> folders) {
		this.folders = folders;
	}
	
	
	
}
