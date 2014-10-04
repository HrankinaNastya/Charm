package org.hillel.it.charm.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity{
	//@Id
	//@Column(name="ENTITY_ID")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//private int id;
	//private Person createdBy;
	//private Person modifiedBy;
	
	@Column(name="CREATED_AT",updatable=false)
	private Date createdAt;
	@Column(name="MODIFIED_AT")
	private Date modifiedAt;
	
	public BaseEntity(){
		setCreatedAt(new Date());
	}
	
	//public int getId() {
	//	return id;
	//}
	
	//public void setId(int id) {
	//	this.id = id;
	//}
	
	//public Person getCreatedBy() {
	//	return createdBy;
	//}
	
	//public void setCreatedBy(Person createdBy) {
	//	this.createdBy = createdBy;
	//}
	
	//public Person getModifiedBy() {
	//	return modifiedBy;
	//}
	
//	public void setModifiedBy(Person modifiedBy) {
//		this.modifiedBy = modifiedBy;
//	}
	
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
