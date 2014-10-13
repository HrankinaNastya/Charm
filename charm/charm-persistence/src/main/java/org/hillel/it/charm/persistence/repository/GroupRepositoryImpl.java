package org.hillel.it.charm.persistence.repository;


import java.util.Iterator;
import java.util.List;

import org.hillel.it.charm.model.entity.Group;
import org.hillel.it.charm.model.entity.Product;
import org.hillel.it.charm.model.entity.SubGroup;
import org.hillel.it.charm.persistence.GroupRepository;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GroupRepositoryImpl implements GroupRepository{

	@Autowired
	private SessionFactory factory;
	
	public void addGroup(Group group) {
		Session session = factory.
				getCurrentSession();
		session.save(group);
	}

	public void addSubGroup(SubGroup subGroup) {
		Session session = factory.
				getCurrentSession();
		session.save(subGroup);
	}

	public void addProduct(Product product) {
		Session session = factory.
				getCurrentSession();
		session.save(product);
	}
	
	public void updateGroup(Group group){
		Session session = factory.
				getCurrentSession();
		session.update(group);
	}
	
	public void updateSubGroup(SubGroup subGroup){
		Session session = factory.
				getCurrentSession();
		session.update(subGroup);	
	}
	
	public void updateProduct(Product product){
		Session session = factory.
				getCurrentSession();
			session.update(product);
	}
	
	public Group getGroup(int id) {
		Session session = factory.
				getCurrentSession();
		Group group = (Group) session.get(Group.class, id);
		return group;
	}

	public SubGroup getSubGroup(int id) {
		Session session = factory.
				getCurrentSession();
		SubGroup subgroup = (SubGroup) session.get(SubGroup.class, id);		
		return subgroup;
	}

	public Product getProduct(int id) {
		Session session = factory.
				getCurrentSession();
		Product product = (Product) session.get(Product.class, id);		
		return product;
	}

	
	@SuppressWarnings("unchecked")
	public List<Group> getGroups() {
		List<Group> groups = null;
		Session session = factory.
				getCurrentSession();
		//Criteria criteria = session.createCriteria(Group.class);
		//groups = criteria.list();
		groups = session.createQuery("from Group")
			      		.list();
		return groups;
	}
	
	@SuppressWarnings("unchecked")
	public List<SubGroup> getSubGroups() {
		List<SubGroup> subgroups = null;
		Session session = factory.
				getCurrentSession();
		subgroups = session.createQuery("from SubGroup")
			      		.list();
		return subgroups;
	}
	
	@SuppressWarnings("unchecked")
	public List<SubGroup> getSubGroups(Group group) {
		List<SubGroup> subgroups = null;
		Session session = factory.
				getCurrentSession();
		subgroups = session.createQuery("from SubGroup "
				+ "where group_id = " + group.getId())
			            .list();
		return subgroups;
	}

	@SuppressWarnings("unchecked")
	public List<Product> getProducts(SubGroup subgroup) {
		List<Product> products = null;
		Session session = factory.
				getCurrentSession();
		products = session.createQuery("from Product "
				+ "where subgroup_id = "+ subgroup.getId())
						.list();
		return products;
	}
	
	@SuppressWarnings("unchecked")
	public List<Product> getProducts() {
		List<Product> products = null;
		Session session = factory.
				getCurrentSession();
		products = session.createQuery("from Product")
			            .list();
		return products;
	}

	public void deleteGroups() {
		List<Group> groups = null;
		Session session = factory.
				getCurrentSession();
		groups = getGroups();
			if (null != groups) {
				deleteSubGroups();
				session.delete(groups);
			}
	}

	public void deleteGroup(int id) {
		Group group = null;
		Session session = factory.
				getCurrentSession();
		group = (Group) session.get(Group.class, id);
			if (null != group) {
				deleteSubGroups(group);
				session.delete(group);
			}
	}
	
	public void deleteSubGroups(){
		List<SubGroup> subgroups = null;
		Session session = factory.
				getCurrentSession();
		subgroups = getSubGroups();
			if (null != subgroups) {
				deleteProducts();
				session.delete(subgroups);
			}
	}
	
	public void deleteSubGroups(Group group){
		List<SubGroup> subgroups = null;
		Session session = factory.
				getCurrentSession();
		subgroups = getSubGroups(group);
			if (null != subgroups) {
				Iterator<SubGroup> itr = subgroups.iterator();
				while(itr.hasNext()){
					deleteProducts(itr.next());
				}
				session.delete(subgroups);
			}
	}
	
	public void deleteSubGroup(int id){
		SubGroup subgroup = null;
		Session session = factory.
				getCurrentSession();
		subgroup = (SubGroup) session.get(SubGroup.class, id);
			if (null != subgroup) {
				session.delete(subgroup);
			}		
	}
	
	public void deleteProducts(){
		List<Product> products = null;
		Session session = factory.
				getCurrentSession();
		products = getProducts();
			if (null != products) {
				session.delete(products);
			}
	}
	
	public void deleteProducts(SubGroup subgroup){
		List<Product> products = null;
		Session session = factory.
				getCurrentSession();
		products = getProducts(subgroup);
			if (null != products) {
				session.delete(products);
			}
	}
	
	public void deleteProduct(int id){
		Product product = null;
		Session session = factory.
				getCurrentSession();
		product = (Product) session.get(Product.class, id);
			if (null != product) {
				session.delete(product);
			}
	}
	
}
