package org.hillel.it.charm.model.entity;

public class Comment extends BaseEntity{
	private String comment;
	private Product product;
	
	public Comment(){
		super();
	}
	
	public Comment(String comment, Product product) {
		this.comment = comment;
		this.product = product;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
