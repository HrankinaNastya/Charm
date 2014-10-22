package org.hillel.it.charm.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "PRODUCTS")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Inheritance(strategy=InheritanceType.JOINED)
@AttributeOverride(name="id", 
column = @Column(name="product_id", 
insertable=false, updatable=false))
@NamedQueries({@NamedQuery(name="getProducts", query="from Product"), 
	@NamedQuery(name="getProductBySubGroupId", query="from Product "
			+ "where subgroup_id = :id"),
	@NamedQuery(name="deleteProducts", query="delete Product"), 
	@NamedQuery(name="deleteProductById", query="delete Product "
			+ "where product_id = :id"),
	@NamedQuery(name="deleteProductBySubGroupId", query="delete Product "
			+ "where subgroup_id = :id")
})
public class Product extends BaseEntity{
	public static final String GET_PRODUCTS = "getProducts";
	public static final String GET_PRODUCT_BY_SUBGROUP_ID = 
			"getProductBySubGroupId";
	public static final String DELETE_PRODUCTS = "deleteProducts";
	public static final String DELETE_PRODUCT_BY_ID = "deleteProductById";
	public static final String DELETE_PRODUCT_BY_SUBGROUP_ID = 
			"deleteProductBySubGroupId";
	
	private String nameProduct;
	private SubGroup subGroup;
	private Size size;
	private String material;
	private String production;
	private String photo;
	private int cost;
	private String currency;
	private List<Comment> commentsOfProduct = new ArrayList<>();
	
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

	@Column(name="name_product",length=32,nullable=false,
			unique=true)
	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="subgroupId", referencedColumnName="subgroup_id")
	public SubGroup getSubGroup() {
		return subGroup;
	}

	public void setSubGroup(SubGroup subGroup) {
		this.subGroup = subGroup;
	}
	
	@Enumerated(EnumType.STRING)
	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	@Column(name="material",length=32)
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Column(name="production",length=32)
	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	@Column(name="cost",nullable=false)
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Column(name="currency",length=32,nullable=false)
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@OneToMany(mappedBy="product")
	public List<Comment> getCommentsOfProduct() {
		return commentsOfProduct;
	}

	public void setCommentsOfProduct(List<Comment> commentsOfProduct) {
		this.commentsOfProduct = commentsOfProduct;
	}
	
	@Column(name="photo",length=100,nullable=false,
			unique=true)
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Product [nameProduct=" + nameProduct + ", subGroup=" 
				+ subGroup.getId() + ", size=" + size + ", material=" 
				+ material + ", production=" + production + ", photo="
				+ photo + ", cost=" + cost + ", currency=" + currency
				+ ", id=" + id + ", getCreatedBy()="+ getCreatedBy().
				getId()+ "]";
	}
	
	
}
