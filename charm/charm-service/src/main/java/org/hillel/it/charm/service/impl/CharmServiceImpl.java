package org.hillel.it.charm.service.impl;

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
import org.hillel.it.charm.persistence.GroupRepository;
import org.hillel.it.charm.service.CharmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharmServiceImpl implements CharmService{
	@Autowired
	private GroupRepository groupRepository;
	
	public CharmServiceImpl() {
		
	}
	@Override
	public void addGroup(Group group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSubGroup(SubGroup subGroup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGroup(Group group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSubGroup(Group subGroup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Group getGroup(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubGroup getSubGroup(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> getGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubGroup> getSubGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubGroup> getSubGroups(Group group) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProducts(SubGroup subgroup) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGroups() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGroup(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubGroups() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubGroups(Group group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubGroup(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProducts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProducts(SubGroup subgroup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAdministrator(Administrator administrator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addManager(Manager manager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Administrator> getAdministrators() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Manager> getManagers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administrator getAdministrator(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manager getManager(int id) {
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
