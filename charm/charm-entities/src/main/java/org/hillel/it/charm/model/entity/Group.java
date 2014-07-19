package org.hillel.it.charm.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private int idGroup;
	private String nameGroup;
	private List<SubGroup> subGroups = new ArrayList<>();
	
	public Group(int idGroup, String nameGroup){
		this.idGroup = idGroup;
		this.nameGroup = nameGroup;
	}
	
	public int getIdGroup() {
		return idGroup;
	}
	
	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public List<SubGroup> getSubgroups() {
		return subGroups;
	}

	public void setSubgroups(List<SubGroup> subGroups) {
		this.subGroups = subGroups;
	}

}
