package org.hillel.it.charm.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "GROUPS")
@XmlRootElement
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@NamedQueries(@NamedQuery(name = Group.QUERY_GROUPS,
query="from Group")
)
public class Group extends BaseEntity{
	public static final String QUERY_GROUPS = "findGroups";
	
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
