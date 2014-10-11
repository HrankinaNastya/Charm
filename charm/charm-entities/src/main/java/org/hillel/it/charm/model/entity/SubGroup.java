package org.hillel.it.charm.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SUBGROUPS")
public class SubGroup extends BaseEntity {

	@ManyToOne(fetch = FetchType.EAGER,optional = false, cascade = {})
	@JoinColumn(name = "group_id")
	private Group group;

	@Column(name="NAME_SUBGROUP",length=32,nullable=false,
			unique=true)
	private String nameSubGroup;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "subGroup")
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
	
	public Group getGroup() {
		return group;
	}
	
	public void setGroup(Group group) {
		this.group = group;
	}
	
	public String getNameSubGroup() {
		return nameSubGroup;
	}
	
	public void setNameSubGroup(String nameSubGroup) {
		this.nameSubGroup = nameSubGroup;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
