package org.hillel.it.charm.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GROUPS")
@XmlRootElement
public class Group extends BaseEntity{
	
	@Column(name="NAME_GROUP",length=32,nullable=false,
			unique=true)
	private String nameGroup;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "group")
	private List<SubGroup> subGroups;
	
	public Group(){
		super();
		if (subGroups != null){
			subGroups = new ArrayList<>();
		}
	}
	
	public Group(String nameGroup){
		this.nameGroup = nameGroup;
		if (subGroups != null){
			subGroups = new ArrayList<>();
		}
	}
	

	@XmlElement(name="group")
	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}
	
	public List<SubGroup> getSubGroups() {
		return subGroups;
	}

	public void setSubGroups(List<SubGroup> subGroups) {
		this.subGroups = subGroups;
	}
	
	public void addSubGroup(SubGroup subGroup){
		if (subGroups != null){
			subGroups = new ArrayList<>();
		}
		subGroups.add(subGroup);
		subGroup.setGroup(this);
	}

}
