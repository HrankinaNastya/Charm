package org.hillel.it.charm.model.entity;

public class Payment extends BaseEntity{
	private Basket basket;
	private boolean isPayment;
	
	public Payment(Basket basket) {
		this.basket = basket;
		this.isPayment = false;
	}

	public Payment() {
		super();
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

}
