package org.hillel.it.charm.service.impl;

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
import org.hillel.it.charm.persistence.GroupRepository;
import org.hillel.it.charm.service.CharmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CharmServiceImpl implements CharmService{
	
	@Autowired
	private GroupRepository groupRepository;
	
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
	public void updateGroup(Group group) {
		groupRepository.updateGroup(group);		
	}

	@Override
	public void updateSubGroup(SubGroup subGroup) {
		groupRepository.updateSubGroup(subGroup);
	}

	@Override
	public void updateProduct(Product product) {
		groupRepository.updateProduct(product);
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePersons() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addComment(Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comment getComment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> getComments(Person user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> getComments(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> getComments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteComment(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComments(Person user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComments(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBasket(Basket basket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPayment(Payment payment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Basket> getBaskets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Basket> getBaskets(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrder(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Basket getBasket(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment getPayment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrder(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBacket(int id) {
		// TODO Auto-generated method stub
		
	}

}
