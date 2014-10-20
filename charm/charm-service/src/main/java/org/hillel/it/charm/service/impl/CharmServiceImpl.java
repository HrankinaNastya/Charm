package org.hillel.it.charm.service.impl;

import java.util.List;

import org.hillel.it.charm.model.entity.Category;
import org.hillel.it.charm.model.entity.Comment;
import org.hillel.it.charm.model.entity.Group;
import org.hillel.it.charm.model.entity.Order;
import org.hillel.it.charm.model.entity.Product;
import org.hillel.it.charm.model.entity.SubGroup;
import org.hillel.it.charm.model.entity.User;
import org.hillel.it.charm.persistence.CommentRepository;
import org.hillel.it.charm.persistence.GroupRepository;
import org.hillel.it.charm.persistence.OrderRepository;
import org.hillel.it.charm.persistence.UserRepository;
import org.hillel.it.charm.service.CharmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CharmServiceImpl implements CharmService{
	
	@Autowired
	private GroupRepository groupRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CommentRepository commentRepository;
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void addGroup(Group group) {
		groupRepository.addGroup(group);
	}

	@Override
	public void addSubGroup(SubGroup subGroup) {
		groupRepository.addSubGroup(subGroup);
	}

	@Override
	public void addProduct(Product product) {
		groupRepository.addProduct(product);
	}

	@Override
	public Group getGroup(int id) {
		return groupRepository.getGroup(id);
	}

	@Override
	public SubGroup getSubGroup(int id) {
		return groupRepository.getSubGroup(id);
	}

	@Override
	public Product getProduct(int id) {
		return groupRepository.getProduct(id);
	}

	@Override
	public List<Group> getGroups() {
		return groupRepository.getGroups();
	}

	@Override
	public List<SubGroup> getSubGroups() {
		return groupRepository.getSubGroups();
	}

	@Override
	public List<SubGroup> getSubGroups(Group group) {
		return groupRepository.getSubGroups(group);
	}

	@Override
	public List<Product> getProducts() {
		return groupRepository.getProducts();
	}

	@Override
	public List<Product> getProducts(SubGroup subgroup) {
		return groupRepository.getProducts(subgroup);
	}

	@Override
	public void deleteGroups() {
		groupRepository.deleteGroups();
	}

	@Override
	public void deleteGroup(int id) {
		groupRepository.deleteGroup(id);
	}

	@Override
	public void deleteSubGroups() {
		groupRepository.deleteSubGroups();
	}

	@Override
	public void deleteSubGroups(Group group) {
		groupRepository.deleteSubGroups(group);
	}

	@Override
	public void deleteSubGroup(int id) {
		groupRepository.deleteSubGroup(id);
	}

	@Override
	public void deleteProducts() {
		groupRepository.deleteProducts();		
	}

	@Override
	public void deleteProducts(SubGroup subgroup) {
		groupRepository.deleteProducts(subgroup);
	}

	@Override
	public void deleteProduct(int id) {
		groupRepository.deleteProduct(id);
	}

	@Override
	public void addUser(User user) {
		userRepository.addUser(user);
		
	}

	@Override
	public User getUser(int id) {
		return userRepository.getUser(id);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.getUsers();
	}

	@Override
	public <T> List<T> getUsersByCategory(Class<T> choice, Category category) {
		return userRepository.getUsersByCategory(choice, category);
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteUser(id);		
	}

	@Override
	public void deleteUsers() {
		userRepository.deleteUsers();
	}

	@Override
	public void addComment(Comment comment) {
		commentRepository.addComment(comment);
		
	}

	@Override
	public Comment getComment(int id) {
		return commentRepository.getComment(id);
	}

	@Override
	public List<Comment> getComments(User user) {
		return commentRepository.getComments(user);
	}

	@Override
	public List<Comment> getComments(Product product) {
		return commentRepository.getComments(product);
	}

	@Override
	public List<Comment> getComments() {
		return commentRepository.getComments();
	}

	@Override
	public void deleteComment(int id) {
		commentRepository.deleteComment(id);	
	}

	@Override
	public void deleteComments(User user) {
		commentRepository.deleteComments(user);
	}

	@Override
	public void deleteComments(Product product) {
		commentRepository.deleteComments(product);	
	}

	@Override
	public void deleteComments() {
		commentRepository.deleteComments();
	}

	@Override
	public void addOrder(Order order) {
		orderRepository.addOrder(order);
	}

	@Override
	public Order getOrder(int id) {
		return orderRepository.getOrder(id);
	}

	@Override
	public List<Order> getOrders(User user) {
		return orderRepository.getOrders(user);
	}

	@Override
	public List<Order> getOrders() {
		return orderRepository.getOrders();
	}

	@Override
	public void deleteOrder(int id) {
		orderRepository.deleteOrder(id);		
	}

	@Override
	public void deleteOrders(User user) {
		orderRepository.deleteOrders(user);
	}

	@Override
	public void deleteOrders() {
		orderRepository.deleteOrders();
	}

}
