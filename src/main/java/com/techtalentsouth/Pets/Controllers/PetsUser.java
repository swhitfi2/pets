package com.techtalentsouth.Pets.Controllers;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;


@Entity
public class PetsUser {

	public PetsUser() { 

		 
	}
	
	
	@Id 

	@GeneratedValue(strategy=GenerationType.AUTO) 

	private Long id; 

	private String name; 

	private String petName; 

	private String desc; 

	//private String password; 	 

	@Column 

	@CreationTimestamp 

	private Date dateCreated; 	 
	 
	 


	public PetsUser(String name, String petName, String desc, Date dateCreated) { 

	this.name = name; 

	this.petName = petName; 
    
	this.desc = desc; 

	this.dateCreated = dateCreated; 

	} 
	 
	public String getName() { 

	return name; 

	} 
	 
	public void setName(String name) { 

	this.name = name; 

	} 
	 
	public String getPetName() { 

	return petName; 

	} 	 

	public void setPetName(String petName) { 

	this.petName = petName; 

	} 	 

	public String getDesc() { 

		return desc; 

		} 
	
	public void setDesc(String desc) { 

	this.desc = desc; 

	} 	 

	public Date getDateCreated() { 

	return dateCreated; 

	} 
 

	@Override 

	public String toString() { 

	return "petUser [id=" + id + ", name=" + name + ", petName=" + petName + ", desc=" + desc

						+ ", dateCreated=" + dateCreated + "]"; 

	} 
	
}
