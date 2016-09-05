package org.msee.slmtoolbox.modeling.app.utils;

import java.util.ArrayList;
import java.util.List;

import org.msee.slmtoolbox.modeling.app.properties.MseeProperties.FolderMSeE;

public class TIMFolder {

	private String name;
	
	private List<TIMFolder> folders;
	
	public TIMFolder () {
		this.folders = new ArrayList<>();
		folders.add(new TIMFolder(FolderMSeE.TIM_FOLDER_PROCESS));
		
	};
	
	public TIMFolder (String name) {
		this(name, new ArrayList<TIMFolder>());
	}
	
	public TIMFolder (String name, List<TIMFolder> folders) {
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
	public List<TIMFolder> getFolders() {
		return folders;
	}

	/**
	 * @param folders the folders to set
	 */
	public void setFolders(List<TIMFolder> folders) {
		this.folders = folders;
	}
	
	
	
}
