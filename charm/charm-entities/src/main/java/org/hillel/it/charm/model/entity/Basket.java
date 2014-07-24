package org.hillel.it.charm.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	private int idBasket;
	private List<Order> orders = new ArrayList<>();
	private int costOfOrders;
	private int amountOfOrders;
	private Person person;
	

	public Basket(int idBasket, List<Order> orders) {
		this.idBasket = idBasket;
		this.orders = orders;
		setCostOfOrders();
		setAmountOfOrders();
	}
	
	public int getIdBasket() {
		return idBasket;
	}
	
	public void setIdBasket(int idBasket) {
		this.idBasket = idBasket;
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	public int getCostOfOrders() {
		return costOfOrders;
	}
	
	public void setCostOfOrders() {
		for (Order order : orders)
        {
			this.costOfOrders += order.getAmount() * order.getCost();
			setPerson(order.getPerson());
        }
	}
	public int getAmountOfOrders() {
		return amountOfOrders;
	}
	public void setAmountOfOrders() {
		for (Order order : orders)
        {
			this.amountOfOrders += order.getAmount();
        }
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
