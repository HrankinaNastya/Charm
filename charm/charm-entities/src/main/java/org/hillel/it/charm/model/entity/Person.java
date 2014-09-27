package org.hillel.it.charm.model.entity;

public class Person extends BaseEntity{
	private int idPerson;
	private String name;
	private String surname;
	private String patronymic;
	private String phone;
	private String address;
	private String email;

	public Person() {
		super();
	}

	private Category category;
	
	Person(int idPerson, String name, String surname, String patronymic, 
			String phone, String address, String email, Category category){
		super();
		this.idPerson = idPerson;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.category = category;
	}
	
	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}