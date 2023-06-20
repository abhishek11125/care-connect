package com.careconnect.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer appointmentId;
	private LocalDate appointmentDate;
	private LocalTime appointmentTime;
	private Doctor doctor;
	private Patient patient;
	private boolean paymentStatus;
	private boolean stutus;
}
