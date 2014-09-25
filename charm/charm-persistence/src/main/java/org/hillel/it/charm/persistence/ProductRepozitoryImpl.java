package org.hillel.it.charm.persistence;

import java.util.List;

import org.hillel.it.charm.model.entity.Group;
import org.hillel.it.charm.model.entity.Product;
import org.hillel.it.charm.model.entity.SubGroup;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepozitoryImpl implements ProductRepository{
	@Autowired
    private SessionFactory sessionFactory;
	
	public void addGroup(Group group) {
		sessionFactory.getCurrentSession().save(group);
	}

	public void addSubGroup(SubGroup subGroup) {
		sessionFactory.getCurrentSession().save(subGroup);
	}

	public void addProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);		
	}

	@SuppressWarnings("unchecked")
	public List<Group> getGroups() {
		return sessionFactory.getCurrentSession().createQuery("from Group")
	            .list();
	}
	
	@SuppressWarnings("unchecked")
	public List<SubGroup> getSubGroups() {
		return sessionFactory.getCurrentSession().createQuery("from SubGroup")
	            .list();
	}

	@SuppressWarnings("unchecked")
	public List<Product> getProducts() {
		return sessionFactory.getCurrentSession().createQuery("from Product")
	            .list();
	}

	public Group getGroup(int id) {
        Group group = (Group) sessionFactory.getCurrentSession().load(
        		Group.class, id);
        
        return group;
	}

	public SubGroup getSubGroup(int id) {
		SubGroup subGroup = (SubGroup) sessionFactory.getCurrentSession().load(
        		SubGroup.class, id);
        
        return subGroup;
	}

	public Product getProduct(int id) {
		Product product = (Product) sessionFactory.getCurrentSession().load(
        		Product.class, id);
        
        return product;
	}

	public void deleteGroups() {
		// TODO Auto-generated method stub
		
	}

	public void deleteGroup(int id) {
		Group group = (Group) sessionFactory.getCurrentSession().load(
        		Group.class, id);
 
        if (null != group) {
            sessionFactory.getCurrentSession().delete(group);
        }
		
	}

	public void deleteSubGroups(Group group) {
		// TODO Auto-generated method stub
		
	}

	public void deleteSubGroup(Group group, int id) {
		// TODO Auto-generated method stub
		
	}

	public void deleteProducts(Group group, SubGroup subgroup) {
		// TODO Auto-generated method stub
		
	}

	public void deleteProduct(Group group, SubGroup subgroup, int id) {
		// TODO Auto-generated method stub
		
	}
		

}
