package org.hillel.it.charm.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.hillel.it.charm.model.entity.Group;
import org.hillel.it.charm.model.entity.SubGroup;

public class GroupService {
	public List<Group> getGroups() {
		return Arrays.asList(new Group("Dresses"),
				new Group("Clothing"));
	}
	

	public Group getGroup(int id) {
		if(id <=0 ) {
			return null;
		}
		return new Group("Dresses");
	}
	
	public void updateGroup(Group group) {
		System.out.println("Group updated");
	}
	
	public void insertGroup(Group group) {
		System.out.println("Group inserted");
	}
	
	public void deleteGroup(int id) {
		System.out.println("Group deleted");
	}

}

