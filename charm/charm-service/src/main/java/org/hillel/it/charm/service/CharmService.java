package org.hillel.it.charm.service;

import java.util.List;

import org.hillel.it.charm.model.entity.Category;
import org.hillel.it.charm.model.entity.Comment;
import org.hillel.it.charm.model.entity.Group;
import org.hillel.it.charm.model.entity.Order;
import org.hillel.it.charm.model.entity.Product;
import org.hillel.it.charm.model.entity.SubGroup;
import org.hillel.it.charm.model.entity.User;

import org.hillel.it.charm.model.entity.Map;


public interface CharmService{
	
	//Group repository
	public void addGroup(Group group);
	public void addSubGroup(SubGroup subGroup);
	public void addProduct(Product product);

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
	
	//User repository
	public void addUser(User user);
	
	public User getUser(int id);
	public List<User> getUsers();
	public <T> List<T> getUsersByCategory(
			Class<T> choice, Category category);
	
	public void deleteUser(int id);
	public void deleteUsers();
	
	//CommentRepository
	public void addComment(Comment comment);
	
	public Comment getComment(int id);
	public List<Comment> getComments(User user);
	public List<Comment> getComments(Product product);
	public List<Comment> getComments();
	
	public void deleteComment(int id);
	public void deleteComments(User user);
	public void deleteComments(Product product);
	public void deleteComments();
	
	//Order repository
	public void addOrder(Order order);
	
	public Order getOrder(int id);
	public List<Order> getOrders(User user);
	public List<Order> getOrders();
	
	public void deleteOrder(int id);
	public void deleteOrders(User user);
	public void deleteOrders();

	public Map getMap(Integer id);
	public List<Map> getMaps();
	
}
