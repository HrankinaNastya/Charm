package org.hillel.it.charm.persistence.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.hillel.it.charm.model.entity.Map;
import org.hillel.it.charm.persistence.MapRepository;

@Repository
public class MapRepositoryImpl implements MapRepository{
	
	@Autowired
    private SessionFactory sessionFactory;
	
	public Map getMap(Integer id) {
		Map map = (Map) sessionFactory.getCurrentSession().load(
	                Map.class, id);
	    return map;
	}

	@SuppressWarnings("unchecked")
	public List<Map> getMaps() {
		return sessionFactory.getCurrentSession().createQuery("from Map")
	            .list();
	}
	
}