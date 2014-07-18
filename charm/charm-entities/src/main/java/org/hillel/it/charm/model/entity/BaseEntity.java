package org.hillel.it.charm.model.entity;

import java.util.Date;

public class BaseEntity{
	private int id;
	private Person createdBy;
	private Person modifiedBy;
	private Date createdAt;
	private Date modifiedAt;
	
	public BaseEntity(){
		setCreatedAt(new Date());
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Person getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(Person createdBy) {
		this.createdBy = createdBy;
	}
	
	public Person getModifiedBy() {
		return modifiedBy;
	}
	
	public void setModifiedBy(Person modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public Date getModifiedAt() {
		return modifiedAt;
	}
	
	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	
}
