package com.careconnect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Medication {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer medicationId;
	private String medicationName;
	private String dosage;
	private String frequency;
	

}
