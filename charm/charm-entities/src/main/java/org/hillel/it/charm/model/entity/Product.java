package org.hillel.it.charm.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Product extends BaseEntity{
	
	@Column(name="NAME_PRODUCT",length=32,nullable=false,
			unique=true)
	private String nameProduct;
	
	@ManyToOne(fetch = FetchType.EAGER,optional = false, cascade = {})
	@JoinColumn(name = "subgroup_id")
	private SubGroup subGroup;
	
	@Enumerated(EnumType.STRING)
	private Size size;
	
	@Column(name="MATERIAL",length=32)
	private String material;
	
	@Column(name="PRODUCTION",length=32)
	private String production;
	
	@Column(name="PHOTO",length=100,nullable=false,
			unique=true)
	private String photo;
	
	@Column(name="COST",nullable=false)
	private int cost;
	
	@Column(name="CURRENCY",length=32,nullable=false)
	private String currency;
	
	//@OneToMany(fetch = FetchType.EAGER, mappedBy = "product")
	//private List<Comment> commentsOfProduct = new ArrayList<>();
	
	public Product() {
		super();
	}
	
	public Product(SubGroup subGroup, String nameProduct,
				Size size, String photo, int cost, 
				String currency) {
		super();
		this.subGroup = subGroup;
		this.nameProduct = nameProduct;
		this.size = size;
		this.photo = photo;
		this.cost = cost;
		this.currency = currency;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	
	public SubGroup getSubGroup() {
		return subGroup;
	}

	public void setSubGroup(SubGroup subGroup) {
		this.subGroup = subGroup;
	}
	
	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	//public List<Comment> getCommentsOfProduct() {
	//	return commentsOfProduct;
	//}

	//public void setCommentsOfProduct(List<Comment> commentsOfProduct) {
	//	this.commentsOfProduct = commentsOfProduct;
	//}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	

}
