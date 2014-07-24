package org.hillel.it.charm.persistence;

import java.util.List;

import org.hillel.it.charm.model.entity.Administrator;
import org.hillel.it.charm.model.entity.Manager;
import org.hillel.it.charm.model.entity.User;

public interface PersonRepository {
	
	public void addAdministrator(Administrator administrator);
	public void addManager(Manager manager);
	public void addUser(User user);

	public List<Administrator> getAdministrators();
	public List<Manager> getManagers();
	public List<User> getUsers();

	public Administrator getAdministrator(int id);
	public Manager getManager(int id);
	public User getUser(int id);

	public void deletePersons();
	public void deletePerson(int id);

}
