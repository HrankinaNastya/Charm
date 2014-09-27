package org.hillel.it.charm.model.entity;

import java.util.ArrayList;
import java.util.List;

public class SubGroup {
	private int idSubGroup;
	private Group group;
	private String nameSubGroup;
	private List<Product> products = new ArrayList<>();;
	
	public SubGroup() {
		super();
	}

	public SubGroup(int idSubGroup, String nameSubGroup){
		this.idSubGroup = idSubGroup;
		this.nameSubGroup = nameSubGroup;
	}
	
	public SubGroup(Group group, int idSubGroup, String nameSubGroup){
		this.group = group;
		this.idSubGroup = idSubGroup;
		this.nameSubGroup = nameSubGroup;
	}
	
	public int getIdSubGroup() {
		return idSubGroup;
	}
	
	public void setIdSubGroup(int idSubGroup) {
		this.idSubGroup = idSubGroup;
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
