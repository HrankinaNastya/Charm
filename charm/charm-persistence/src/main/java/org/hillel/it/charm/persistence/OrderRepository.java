package org.hillel.it.charm.persistence;

import java.util.List;

import org.hillel.it.charm.model.entity.Order;
import org.hillel.it.charm.model.entity.User;

public interface OrderRepository {
	
	public void addOrder(Order order);
	
	public Order getOrder(int id);
	public List<Order> getOrders(User user);
	public List<Order> getOrders();
	
	public void deleteOrder(int id);
	public void deleteOrders(User user);
	public void deleteOrders();

}
