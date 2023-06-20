package com.careconnect.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class MedicalHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer casePaperNumber;
	private Prescription prescription;
	private List<MedicalTests> tests = new ArrayList<>();

}
