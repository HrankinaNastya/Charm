package org.hillel.it.charm.service;

import java.util.List;

import org.hillel.it.charm.model.entity.Administrator;
import org.hillel.it.charm.model.entity.Basket;
import org.hillel.it.charm.model.entity.Comment;
import org.hillel.it.charm.model.entity.Group;
import org.hillel.it.charm.model.entity.Manager;
import org.hillel.it.charm.model.entity.Order;
import org.hillel.it.charm.model.entity.Payment;
import org.hillel.it.charm.model.entity.Person;
import org.hillel.it.charm.model.entity.Product;
import org.hillel.it.charm.model.entity.SubGroup;
import org.hillel.it.charm.model.entity.User;


public interface CharmService{
	
	//Product repository
	public void addGroup(Group group);
	public void addSubGroup(SubGroup subGroup);
	public void addProduct(Product product);

	public List<Group> getGroups();
	public List<SubGroup> getSubGroups();
	public List<Product> getProducts();

	public Group getGroup(int id);
	public SubGroup getSubGroup(int id);
	public Product getProduct(int id);
	
	public void deleteGroups();
	public void deleteGroup(int id);
	public void deleteSubGroups(Group group);
	public void deleteSubGroup(Group group, int id);
	public void deleteProducts(Group group, SubGroup subgroup);
	public void deleteProduct(Group group, SubGroup subgroup, int id);
	
	//Person repository
	public void addAdministrator(Administrator administrator);
	public void addManager(Manager manager);
	public void addUser(User user);

	public List<Administrator> getAdministrators();
	public List<Manager> getManagers();
	public List<User> getUsers();

	public Administrator getAdministrator(int id);
	public Manager getManager(int id);
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
