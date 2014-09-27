package org.hillel.it.charm.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GROUPS")
@XmlRootElement
public class Group {
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int idGroup;
	@Column(name = "group")
	private String nameGroup;
	private List<SubGroup> subGroups = new ArrayList<>();
	
	public Group(){
		super();
	}
	
	public Group(int idGroup, String nameGroup){
		this.idGroup = idGroup;
		this.nameGroup = nameGroup;
	}
	

	@XmlAttribute(name="ID")
	public int getIdGroup() {
		return idGroup;
	}
	
	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	@XmlElement(name="group")
	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	@XmlElement(name="subgroup")
	public List<SubGroup> getSubgroups() {
		return subGroups;
	}

	public void setSubgroups(List<SubGroup> subGroups) {
		this.subGroups = subGroups;
	}

}
