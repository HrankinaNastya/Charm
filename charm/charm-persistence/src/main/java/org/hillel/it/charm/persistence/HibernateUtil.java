package org.hillel.it.charm.persistence;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hillel.it.charm.model.entity.Group;

public class HibernateUtil {
	private final static SessionFactory 
	INSTANCE = buildSessionFactory();

	public static SessionFactory 
	getSessionFactory() {
		return INSTANCE;
	}

	private static SessionFactory 
	buildSessionFactory() {
		try {
			Configuration configuration = 
					new Configuration().
					addAnnotatedClass(Group.class).
					configure();
			ServiceRegistry registry = new 
					StandardServiceRegistryBuilder().
					applySettings(configuration.
							getProperties()).build();
			return configuration.
					buildSessionFactory(registry);
		} catch(HibernateException ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}
	
}
