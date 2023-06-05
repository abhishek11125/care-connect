package com.careconnect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;
/**
 *This is parent class for all types of users. 
 *Used Joined Table Strategy for mapping with child classes.
 */
@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class AppUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer appUserId;
	private String email;
	private String password;
	
	

}
