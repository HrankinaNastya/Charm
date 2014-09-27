package org.hillel.it.charm.model.entity;

public class Administrator extends Person{

	Administrator(){
		super();
	}
	Administrator(int idPerson, String name, String surname, String patronymic,
			String phone, String address, String email, Category category) {
		super(idPerson, name, surname, patronymic, phone, address, email, category);
	}

}

