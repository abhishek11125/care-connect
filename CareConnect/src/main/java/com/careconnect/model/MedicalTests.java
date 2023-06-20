package com.careconnect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MedicalTests {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer testId;
	private String testName;
	private String doctorNote;
	private String testType;
	private Doctor referredDoctor;
	private Patient patient;
	private String result;
	
}
