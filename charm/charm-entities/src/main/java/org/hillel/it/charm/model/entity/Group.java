package org.hillel.it.charm.model.entity;

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
public class Group extends BaseEntity{
	@Id
	@Column(name = "GROUP_ID")
	@GeneratedValue
	private int idGroup;
	
	@Column(name="NAME",length=32,nullable=false,
			unique=true)
	private String nameGroup;
	
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

}
