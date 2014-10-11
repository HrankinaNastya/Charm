package org.hillel.it.charm.persistence.repository;


import java.util.Iterator;
import java.util.List;

import org.hillel.it.charm.model.entity.Group;
import org.hillel.it.charm.model.entity.Product;
import org.hillel.it.charm.model.entity.SubGroup;
import org.hillel.it.charm.persistence.GroupRepository;
import org.hillel.it.charm.persistence.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class GroupRepositoryImpl implements GroupRepository{
	
	public void addGroup(Group group) {
		SessionFactory factory = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				session.save(group);
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
	}

	public void addSubGroup(SubGroup subGroup) {
		SessionFactory factory = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				session.save(subGroup);
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
	}

	public void addProduct(Product product) {
		SessionFactory factory = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				session.save(product);
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}		
	}
	
	public void updateGroup(Group group){
		SessionFactory factory = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				session.update(group);
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
	}
	
	public void updateSubGroup(Group subGroup){
		SessionFactory factory = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				session.update(subGroup);
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}		
	}
	
	public void updateProduct(Product product){
		SessionFactory factory = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				session.update(product);
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
	}
	
	public Group getGroup(int id) {
		SessionFactory factory = null;
		Group group = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				group = (Group) session.get(Group.class, id);
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
		
		return group;
	}

	public SubGroup getSubGroup(int id) {
		SessionFactory factory = null;
		SubGroup subgroup = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				subgroup = (SubGroup) session.get(SubGroup.class, id);
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
		
		return subgroup;
	}

	public Product getProduct(int id) {
		SessionFactory factory = null;
		Product product = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				product = (Product) session.get(Product.class, id);
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
		
		return product;
	}

	
	@SuppressWarnings("unchecked")
	public List<Group> getGroups() {
		SessionFactory factory = null;
		List<Group> groups = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				groups = session.createQuery("from Group")
			            .list();
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
		return groups;
	}
	
	@SuppressWarnings("unchecked")
	public List<SubGroup> getSubGroups() {
		SessionFactory factory = null;
		List<SubGroup> subgroups = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				subgroups = session.createQuery("from SubGroup")
			            .list();
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
		return subgroups;
	}
	
	@SuppressWarnings("unchecked")
	public List<SubGroup> getSubGroups(Group group) {
		SessionFactory factory = null;
		List<SubGroup> subgroups = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				subgroups = session.createQuery("from SubGroup "
						+ "where group_id = " + group.getId())
			            .list();
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
		return subgroups;
	}

	@SuppressWarnings("unchecked")
	public List<Product> getProducts(SubGroup subgroup) {
		SessionFactory factory = null;
		List<Product> products = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {

				products = session.createQuery("from Product "
						+ "where subgroup_id = "+ subgroup.getId())
			            .list();
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
		return products;
	}
	
	@SuppressWarnings("unchecked")
	public List<Product> getProducts() {
		SessionFactory factory = null;
		List<Product> products = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				products = session.createQuery("from Product")
			            .list();
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
		return products;
	}

	public void deleteGroups() {
		SessionFactory factory = null;
		List<Group> groups = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				groups = getGroups();
				if (null != groups) {
					deleteSubGroups();
					session.delete(groups);
					}
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
	}

	public void deleteGroup(int id) {
		SessionFactory factory = null;
		Group group = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				group = (Group) session.get(Group.class, id);
				if (null != group) {
					deleteSubGroups(group);
					session.delete(group);
					}
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
	}
	
	public void deleteSubGroups(){
		SessionFactory factory = null;
		List<SubGroup> subgroups = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				subgroups = getSubGroups();
				if (null != subgroups) {
					deleteProducts();
					session.delete(subgroups);
					}
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
	}
	
	public void deleteSubGroups(Group group){
		SessionFactory factory = null;
		List<SubGroup> subgroups = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				subgroups = getSubGroups(group);
				if (null != subgroups) {
					Iterator<SubGroup> itr = subgroups.iterator();
					while(itr.hasNext()){
						deleteProducts(itr.next());
					}
					session.delete(subgroups);
					}
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}		
	}
	
	public void deleteSubGroup(int id){
		SessionFactory factory = null;
		SubGroup subgroup = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				subgroup = (SubGroup) session.get(SubGroup.class, id);
				if (null != subgroup) {
					session.delete(subgroup);
					}
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
	}
	
	public void deleteProducts(){
		SessionFactory factory = null;
		List<Product> products = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				products = getProducts();
				if (null != products) {
					session.delete(products);
					}
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
	}
	
	public void deleteProducts(SubGroup subgroup){
		SessionFactory factory = null;
		List<Product> products = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				products = getProducts(subgroup);
				if (null != products) {
					session.delete(products);
					}
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
	}
	
	public void deleteProduct(int id){
		SessionFactory factory = null;
		Product product = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				product = (Product) session.get(Product.class, id);
				if (null != product) {
					session.delete(product);
					}
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {

		}
	}
	
}
