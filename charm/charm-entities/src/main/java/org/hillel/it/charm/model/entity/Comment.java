package org.hillel.it.charm.model.entity;

public class Comment {
	private int idComment;
	private String comment;
	private Person person;
	private Product product;
	
	public Comment(){
		super();
	}
	
	public Comment(int idComment, String comment, Person person, Product product) {
		this.idComment = idComment;
		this.comment = comment;
		this.person = person;
		this.product = product;
	}

	public int getIdComment() {
		return idComment;
	}

	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	

}
