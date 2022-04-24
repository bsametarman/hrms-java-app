package com.example.hrms.core.emailVerification.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.hrms.entities.concretes.JobSeeker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="email_verifications")
@AllArgsConstructor
@NoArgsConstructor
public class EmailVerification {
	
	@Id
	@GeneratedValue
	@Column(name="email_verification_id")
	private int id;
	
	@Column(name="verification")
	private boolean verification;
	
	@OneToOne(mappedBy = "emailVerification")
	private JobSeeker jobSeeker;
	
	
}
