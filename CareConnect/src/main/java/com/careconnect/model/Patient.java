package com.careconnect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

/**
 *This is a child class of AppUser class and its foreign key referring to appUserId. 
 */
@Entity
@PrimaryKeyJoinColumn(name = "patientId")
@Data
public class Patient extends AppUser{
	
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	private String mobile;
	private String address;
	
	
	

}
