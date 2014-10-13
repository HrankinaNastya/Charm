package org.hillel.it.charm.model.entity;

public class Order extends BaseEntity{
	private Product product;
	private String name;
	private int amount;
	private int cost;
	private Person person;
	private String dataOfPerson;
	
	public Order(){
		super();
	}
	
	public Order(int amount, Product product){
		this.product = product;
		setName();
		this.amount = amount;
		setCost();
		//this.person = person;
		//setDataOfPerson();
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = getProduct().getNameProduct();
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getCost() {
		return cost;
	}

	public void setCost() {
	//	this.cost = getProduct().getCost();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getDataOfPerson() {
		return dataOfPerson;
	}

//	public void setDataOfPerson() {
	//	this.dataOfPerson = getPerson().getId() + ": " + getPerson().getSurname() 
	//			+ " " + getPerson().getName();
	//}
	
}
