package org.hillel.it.charm.persistence;

import java.util.List;

import org.hillel.it.charm.model.entity.Category;
import org.hillel.it.charm.model.entity.User;

public interface UserRepository {
	
	public void addUser(User user);
	
	public User getUser(int id);
	public List<User> getUsers();
	public <T> List<T> getUsersByCategory(
			Class<T> choice, Category category);
	
	public void deleteUser(int id);
	public void deleteUsers();

}
