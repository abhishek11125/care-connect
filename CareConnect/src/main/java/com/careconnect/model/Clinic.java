package com.careconnect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "clinicId")
public class Clinic extends AppUser{
	
	private String clinicName;
	private String address;
	private String phone;
	private String registrationNumber;

}
