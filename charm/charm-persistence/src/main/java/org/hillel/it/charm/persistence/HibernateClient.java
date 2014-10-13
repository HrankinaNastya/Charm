package org.hillel.it.charm.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hillel.it.charm.model.entity.Group;
import org.hillel.it.charm.model.entity.Product;
import org.hillel.it.charm.model.entity.Size;
import org.hillel.it.charm.model.entity.SubGroup;
import org.hillel.it.charm.persistence.repository.GroupRepositoryImpl;

public class HibernateClient {

	public static void main(String[] args) {
		
		GroupRepository repo = new GroupRepositoryImpl();
		
		//Group group = new Group();
		//group.setNameGroup("Clothing33");
		/*
		repo.addGroup(group);
		*/
		/*		
		Group group = new Group();
		group.setNameGroup("Clothing2");
		repo.addGroup(group);
		*/
		
		Group group = new Group();
		group =(Group) repo.getGroup(1);
		System.out.println(group.getNameGroup());
		/*
		SubGroup subgroup = new SubGroup();
		subgroup.setGroup(group);
		subgroup.setNameSubGroup("SubClothing2");
		repo.addSubGroup(subgroup);
		*/
		List<SubGroup> subgroups = new ArrayList<>();
		subgroups = repo.getSubGroups(group);
		for(SubGroup subgroup: subgroups){
			System.out.println(subgroup.getGroup().getNameGroup());
			System.out.println(subgroup.getNameSubGroup());
		}
		
		//Product product = new Product(repo.getSubGroup(1), "Dress1", Size.M, "D:/image/1.jpeg", 100, "UAH");
		//repo.addProduct(product);
		System.out.println(repo.getProduct(1).getNameProduct());
		System.out.println(group.getNameGroup());
		
		Group group1 = new Group();
		group1 =(Group) repo.getGroup(1);
		group1.setNameGroup("Clothing11");
		repo.updateGroup(group1);
		
		List<Group> grs = new ArrayList<>();
		grs = repo.getGroups();
		
		for(Group groussp: repo.getGroups()){
			System.out.println(groussp.getNameGroup());
		}
	
		//repo.close_factory();
				
		/*
		SubGroup subgroup = new SubGroup();
		subgroup.setNameSubGroup("SubClothing2");
		repo.addSubGroup(subgroup);
		*/
		
		
		/*
		Group gr2 = repo.getGroup(2);
		System.out.println(gr2.getNameGroup());
		*/
		/*
		SubGroup gr2 = repo.getSubGroup(1);
		System.out.println(gr2.getNameSubGroup());
		*/
		/*
		for(Group gr : repo.getGroups())
		System.out.println(gr.getNameGroup());
		*/
		
		//repo.deleteGroup(2);
		
		/*
		SessionFactory factory = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Group group = new Group();
			group.setNameGroup("Clothing");
			Session session = factory.
					getCurrentSession();
			session.beginTransaction();
			try {
				session.save(group);
				group.setNameGroup("Dresses");
				session.update(group);
				session.getTransaction().commit();
			} catch (Exception ex) {
				session.getTransaction().rollback();
			}
		} finally {
			if (factory != null) {
				factory.close();

			}
		}*/
	}
}

