package org.hillel.it.charm.persistence.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hillel.it.charm.model.entity.Order;
import org.hillel.it.charm.model.entity.User;
import org.hillel.it.charm.persistence.OrderRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void addOrder(Order order) {
		em.persist(order);		
	}

	@Override
	public Order getOrder(int id) {
		return em.find(Order.class, id);
	}

	@Override
	public List<Order> getOrders(User user) {
		TypedQuery<Order> query = em.createNamedQuery(
				Order.GET_ORDERS_BY_USER_ID, Order.class);
		query.setParameter("id", user.getId());
		return query.getResultList();
	}

	@Override
	public List<Order> getOrders() {
		return em.createNamedQuery(
				Order.GET_ORDERS, Order.class).getResultList();
	}

	@Override
	public void deleteOrder(int id) {
		Query query = em.createNamedQuery(Order.DELETE_ORDER_BY_ID);
		query.setParameter("id", id);		
	}

	@Override
	public void deleteOrders(User user) {
		Query query = em.createNamedQuery(
				Order.DELETE_ORDER_BY_USER_ID);
		query.setParameter("id", user.getId());
	}

	@Override
	public void deleteOrders() {
		em.createNamedQuery(Order.DELETE_ORDERS);
	}

}
