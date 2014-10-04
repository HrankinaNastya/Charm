package org.hillel.it.charm.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hillel.it.charm.model.entity.Group;

public class HibernateClient {

	public static void main(String[] args) {
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
		}
	}

}

