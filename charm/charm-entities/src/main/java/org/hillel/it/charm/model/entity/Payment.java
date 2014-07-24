package org.hillel.it.charm.model.entity;

public class Payment {
	private int idPayment;
	private Basket basket;
	private boolean isPayment;
	private Person person;
	
	public Payment(int idPayment, Basket basket) {
		this.idPayment = idPayment;
		this.basket = basket;
		this.isPayment = false;
	}

	public int getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(int idPayment) {
		this.idPayment = idPayment;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}

	public boolean isPayment() {
		return isPayment;
	}

	public void setPayment(boolean isPayment) {
		this.isPayment = isPayment;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = basket.getPerson();
	}
		
}
