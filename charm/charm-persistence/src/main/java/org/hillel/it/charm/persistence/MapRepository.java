package org.hillel.it.charm.persistence;

import java.util.List;

import org.hillel.it.charm.model.entity.Map;

public interface MapRepository {
	
	public Map getMap(Integer id);
	public List<Map> getMaps();
	
}
