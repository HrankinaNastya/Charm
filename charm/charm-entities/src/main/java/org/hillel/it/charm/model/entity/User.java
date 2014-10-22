package org.hillel.it.charm.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="USERS")
@AttributeOverride(name="id", column=@Column(
		name="user_id", insertable=false, updatable=false))
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@NamedQueries({@NamedQuery(name="getUsers", query="from User"), 
	@NamedQuery(name="deleteUsers", query="delete User"),
	@NamedQuery(name="deleteUser", query="delete User where user_id = :id"),
	@NamedQuery(name="getUsersByCategory", query="from User "
			+ "where category = :category")})
public class User extends BaseEntity{
	public final static String GET_USERS = "getUsers";
	public final static String DELETE_USERS = "deleteUsers";
	public final static String DELETE_USER = "deleteUser";
	public final static String GET_USERS_BY_CATEGORY ="getUsersByCategory";
	
	private String name;
	private String surname;
	private String phone;
	private String address;
	private String email;
	private Category category;
	private String login;
	private String pass;
	
	public User() {
		super();
	}
	
	public User(String phone, String login, String pass){
		super();
		this.phone = phone;
		this.login = login;
		this.pass = pass;
	}

	@Override
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	
	@Override
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="name",length=32)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="surname",length=32)
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Column(name="phone",length=32,nullable=false)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name="address",length=50)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="email",length=32)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="category")
	@Enumerated(EnumType.STRING)
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(name="pass",length=32,nullable=false)
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Column(name="login",length=32,nullable=false,
			unique=true)
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", phone="
				+ phone + ", address=" + address + ", email=" + email
				+ ", category=" + category + ", login=" + login + ", pass="
				+ pass + ", id=" + id + ", getCreatedBy()=" + getCreatedBy()
				+ "]";
	}
	
}