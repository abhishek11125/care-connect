package com.careconnect.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

/**
 *This is a child class of AppUser class and its foreign key referring to appUserId. 
 */

@Entity
@Data
@PrimaryKeyJoinColumn(name = "dotorId")
public class Doctor extends AppUser{

	private String firstName;
	private String lastName;
	private String Specialization;
	private String gender;
	private String address;
	private String mobile;
	private LocalDate dateOfBirth;
	private String medicalLicenseNumber;
	private Integer Yearsofexperience;
}
