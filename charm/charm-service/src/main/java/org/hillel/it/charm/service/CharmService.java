package org.hillel.it.charm.service;

import java.util.List;

import org.hillel.it.charm.model.entity.Basket;
import org.hillel.it.charm.model.entity.Comment;
import org.hillel.it.charm.model.entity.Group;
import org.hillel.it.charm.model.entity.Order;
import org.hillel.it.charm.model.entity.Payment;
import org.hillel.it.charm.model.entity.Person;
import org.hillel.it.charm.model.entity.Product;
import org.hillel.it.charm.model.entity.SubGroup;
import org.hillel.it.charm.model.entity.User;


public interface CharmService{
	
	//Group repository
	public void addGroup(Group group);
	public void addSubGroup(SubGroup subGroup);
	public void addProduct(Product product);
	
	public void updateGroup(Group group);
	public void updateSubGroup(SubGroup subGroup);
	public void updateProduct(Product product);
	
	public Group getGroup(int id);
	public SubGroup getSubGroup(int id);
	public Product getProduct(int id);

	public List<Group> getGroups();
	public List<SubGroup> getSubGroups();
	public List<SubGroup> getSubGroups(Group group);
	public List<Product> getProducts();
	public List<Product> getProducts(SubGroup subgroup);
	
	public void deleteGroups();
	public void deleteGroup(int id);
	public void deleteSubGroups();
	public void deleteSubGroups(Group group);
	public void deleteSubGroup(int id);
	public void deleteProducts();
	public void deleteProducts(SubGroup subgroup);
	public void deleteProduct(int id);
	
	//Person repository
	public void addUser(User user);
	public List<User> getUsers();
	public User getUser(int id);
	public void deletePersons();
	public void deletePerson(int id);

	//Comment Repository
	public void addComment(Comment comment);
	
	public Comment getComment(int id);
	public List<Comment> getComments(Person user);
	public List<Comment> getComments(Product product);
	public List<Comment> getComments();
	
	public void deleteComment(int id);
	public void deleteComments(Person user);
	public void deleteComments(Product product);


	//Repository Payment
	public void addOrder(Order order);
	public void addBasket(Basket basket);
	public void addPayment(Payment payment);
	
	public List<Order> getOrders();
	public List<Basket> getBaskets();
	public List<Basket> getBaskets(Person person);
	public List<Payment> getPayments();
	
	public Order getOrder(int id);
	public Basket getBasket(int id);
	public Payment getPayment(int id);
	
	public void deleteOrder(int id);
	public void deleteBacket(int id);
	
}
