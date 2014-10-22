package org.hillel.it.charm.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="GROUPS")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Inheritance(strategy=InheritanceType.JOINED)
@AttributeOverride(name="id", 
column = @Column(name="group_id", 
insertable=false, updatable=false))
@NamedQueries({@NamedQuery(name="getGroups", query="from Group"), 
	@NamedQuery(name="deleteGroups", query="delete Group"), 
	@NamedQuery(name="deleteGroupById", query="delete Group where group_id = :id")
})
@XmlRootElement
public class Group extends BaseEntity{
	public static final String GET_GROUPS = "getGroups";
	public static final String DELETE_GROUPS = "deleteGroups";
	public static final String DELETE_GROUP_BY_ID = "deleteGroupById";
	
	private String nameGroup;
	private List<SubGroup> subGroups = new ArrayList<>();
	
	public Group(){
		super();
	}
	
	public Group(String nameGroup){
		this.nameGroup = nameGroup;
	}
	
	@Override
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@XmlAttribute(name="group_id")
	public int getId() {
		return id;
	}
	
	@Override
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="name_group",length=32,nullable=false,
			unique=true)
	@XmlElement(name="name_group")
	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}
	
	 @OneToMany(mappedBy="group")
	//@OneToMany(cascade=CascadeType.ALL, 
	//fetch=FetchType.LAZY, mappedBy="group", 
	//orphanRemoval=true)
	@XmlAnyElement
	public List<SubGroup> getSubGroups() {
		return subGroups;
	}

	public void setSubGroups(List<SubGroup> subGroups) {
		this.subGroups = subGroups;
	}

	@Override
	public String toString() {
		return "Group [nameGroup=" + nameGroup + ", id=" + id +
				", getCreatedBy()=" + getCreatedBy().getId() + "]";
	}
	
}
