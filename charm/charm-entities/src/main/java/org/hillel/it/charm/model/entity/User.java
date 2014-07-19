package org.hillel.it.charm.model.entity;

public class User extends Person{

	User(int idPerson, String name, String surname, String patronymic,
			String phone, String address, String email, Category category) {
		super(idPerson, name, surname, patronymic, phone, address, email, category);
	}
	
}