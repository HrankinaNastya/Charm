package org.hillel.it.charm.model.entity;

public class Manager extends Person{
	
	Manager(){
		super();
	}
	Manager(String name, String surname, String patronymic,
			String phone, String address, String email, Category category) {
		super(name, surname, patronymic, phone, address, email, category);
	}

}