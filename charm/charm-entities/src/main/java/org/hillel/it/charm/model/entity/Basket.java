package org.hillel.it.charm.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket extends BaseEntity {
	private List<Order> orders = new ArrayList<>();
	private int costOfOrders;
	private int amountOfOrders;
	
	public Basket(){
		super();
	}
	public Basket(List<Order> orders) {
		this.orders = orders;
		setCostOfOrders();
		setAmountOfOrders();
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
	//		setPerson(order.getPerson());
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
	
}
