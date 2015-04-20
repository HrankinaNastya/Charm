package org.hillel.it.charm.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MAPS")
public class Map{
	
	@Id
    @Column(name = "id")
    @GeneratedValue
	private Integer id;
	
	@Column(name="latitude")
	private String latitude;
	
	@Column(name="longitude")
	private String longitude;
	
	@Column(name="city")
	private String city;
	
	@Column(name="address")
	private String address;
	
	public Map(){
		super();
	}
	
	public Map(String latitude, String longitude, String city, String address) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.city = city;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}


