package org.hillel.it.charm.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Product extends BaseEntity{
	private int idProduct;
	private String nameProduct;
	private Group group;
	private SubGroup subGroup;
	private String article;
	private List<Size> sizes = new ArrayList<>();
	private String material;
	private String production;
	private String description;
	private int cost;
	private final String currency = "грн";
	private List<Comment> commentsOfProduct = new ArrayList<>();
	
	public Product(int idProduct, String nameProduct, Group group, SubGroup subGroup, 
			String article, List<Size> sizes, String material, String production, 
			String description, int cost){
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.group = group;
		this.subGroup = subGroup;
		this.article = article;
		this.sizes = sizes;
		this.material = material;
		this.production = production;
		this.description = description;
		this.cost = cost;
	}
	
	public int getIdProduct() {
		return idProduct;
	}
	
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public SubGroup getSubGroup() {
		return subGroup;
	}

	public void setSubGroup(SubGroup subGroup) {
		this.subGroup = subGroup;
	}
	
	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public List<Size> getSizes() {
		return sizes;
	}

	public void setSizes(List<Size> sizes) {
		this.sizes = sizes;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public List<Comment> getCommentsOfProduct() {
		return commentsOfProduct;
	}

	public void setCommentsOfProduct(List<Comment> commentsOfProduct) {
		this.commentsOfProduct = commentsOfProduct;
	}

	
}
