package org.hillel.it.charm.model.entity;

import java.util.ArrayList;
import java.util.List;

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "SUBGROUPS")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Inheritance(strategy=InheritanceType.JOINED)
@AttributeOverride(name="id", 
column = @Column(name="subgroup_id", 
insertable=false, updatable=false))
@NamedQueries({@NamedQuery(name="getSubGroups", query="from SubGroup"), 
	@NamedQuery(name="deleteSubGroups", query="delete SubGroup"), 
	@NamedQuery(name="deleteSubGroupById", query="delete SubGroup "
			+ "where subgroup_id = :id"),
	@NamedQuery(name="deleteSubGroupByGroupId", query="delete SubGroup "
			+ "where group_id = :id")
})
public class SubGroup extends BaseEntity {
	public static final String GET_SUBGROUPS = "getSubGroups";
	public static final String DELETE_SUBGROUPS = "deleteSubGroups";
	public static final String DELETE_SUBGROUP_BY_ID = "deleteSubGroupById";
	public static final String DELETE_SUBGROUP_BY_GROUP_ID = 
			"deleteSubGroupByGroupId";
	private Group group;
	private String nameSubGroup;
	private List<Product> products;
	
	public SubGroup() {
		super();
		if (products != null){
			products = new ArrayList<>();
		}
	}

	public SubGroup(Group group, String nameSubGroup){
		this.group = group;
		this.nameSubGroup = nameSubGroup;
		if (products != null){
			products = new ArrayList<>();
		}
	}
	
	@Override
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	
	@Override
	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="groupId", referencedColumnName="group_id")
	public Group getGroup() {
		return group;
	}
	
	public void setGroup(Group group) {
		this.group = group;
	}
	
	@Column(name="name_subgroup",length=32,nullable=false,
			unique=true)
	public String getNameSubGroup() {
		return nameSubGroup;
	}
	
	public void setNameSubGroup(String nameSubGroup) {
		this.nameSubGroup = nameSubGroup;
	}
	
	@OneToMany(cascade=CascadeType.ALL, 
			fetch=FetchType.LAZY, mappedBy="subGroup", 
			orphanRemoval=true)
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
