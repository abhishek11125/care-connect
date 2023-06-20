package com.careconnect.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Prescription {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer prescriptionId;
	private Patient patient;
	private Doctor doctor;
	private List<Medication> medications = new ArrayList<>();
	private LocalDate issuedDate;
	private LocalDate endDate; 
}
