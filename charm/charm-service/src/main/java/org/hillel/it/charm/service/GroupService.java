package org.hillel.it.charm.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.hillel.it.charm.model.entity.Group;

public class GroupService {
	public List<Group> getGroups() {
		return Arrays.asList(new Group(1, "Dresses"),
				new Group(2, "Clothing"));
	}
	
	public Group getGroup(int id) {
		if(id <=0 ) {
			return null;
		}
		return new Group(1, "Dresses");
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

