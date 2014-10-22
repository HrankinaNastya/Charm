package org.hillel.it.charm.persistence.repository;


import java.util.Iterator;
import java.util.List;




import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hillel.it.charm.model.entity.Comment;
import org.hillel.it.charm.model.entity.Group;
import org.hillel.it.charm.model.entity.Product;
import org.hillel.it.charm.model.entity.SubGroup;
import org.hillel.it.charm.persistence.GroupRepository;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class GroupRepositoryImpl implements GroupRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addGroup(Group group) {
		em.persist(group);
	}

	@Override
	public void addSubGroup(SubGroup subGroup) {
		em.persist(subGroup);
	}

	@Override
	public void addProduct(Product product) {
		em.persist(product);
	}
	
	@Override
	@Transactional(readOnly=true)
	public Group getGroup(int id) {
		Group group = em.find(Group.class, id);
		return group;
	}

	@Override
	@Transactional(readOnly=true)
	public SubGroup getSubGroup(int id) {
		return em.find(SubGroup.class, id);
	}

	@Override
	@Transactional(readOnly=true)
	public Product getProduct(int id) {
		return em.find(Product.class, id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Group> getGroups() {
		return em.createNamedQuery(Group.GET_GROUPS,
				Group.class).getResultList();
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<SubGroup> getSubGroups() {
		return em.createNamedQuery(SubGroup.GET_SUBGROUPS,
				SubGroup.class).getResultList();
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<SubGroup> getSubGroups(Group group) {
		TypedQuery<SubGroup> query = em.createNamedQuery(
				SubGroup.GET_SUBGROUP_BY_GROUP_ID, 
				SubGroup.class);
		query.setParameter("id", group.getId());
		return query.getResultList();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Product> getProducts(SubGroup subgroup) {
		TypedQuery<Product> query = em.createNamedQuery(
				Product.GET_PRODUCT_BY_SUBGROUP_ID, 
				Product.class);
		query.setParameter("id", subgroup.getId());
		return query.getResultList();
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<Product> getProducts() {
		return em.createNamedQuery(Product.GET_PRODUCTS,
				Product.class).getResultList();
	}

	@Override
	public void deleteGroups() {
		em.createNamedQuery(Group.DELETE_GROUPS);
	}

	@Override
	public void deleteGroup(int id) {
		Query query = em.createNamedQuery(Group.DELETE_GROUP_BY_ID);
		query.setParameter("id", id);
	}
	
	@Override
	public void deleteSubGroups(){
		em.createNamedQuery(SubGroup.DELETE_SUBGROUPS);
	}
	
	@Override
	public void deleteSubGroups(Group group){
		Query query = em.createNamedQuery(SubGroup.DELETE_SUBGROUP_BY_GROUP_ID);
		query.setParameter("id", group.getId());
	}
	
	@Override
	public void deleteSubGroup(int id){
		Query query = em.createNamedQuery(SubGroup.DELETE_SUBGROUP_BY_ID);
		query.setParameter("id", id);
	}
	
	@Override
	public void deleteProducts(){
		em.createNamedQuery(Product.DELETE_PRODUCTS);
	}
	
	@Override
	public void deleteProducts(SubGroup subgroup){
		Query query = em.createNamedQuery(Product.DELETE_PRODUCT_BY_SUBGROUP_ID);
		query.setParameter("id", subgroup.getId());
	}
	
	@Override
	public void deleteProduct(int id){
		Query query = em.createNamedQuery(Product.DELETE_PRODUCT_BY_ID);
		query.setParameter("id", id);
	}
	
}
