package com.example.hrms.core.systemVerification.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="hrms_verifications")
@AllArgsConstructor
@NoArgsConstructor
public class SystemVerification {
	@Id
	@GeneratedValue
	@Column(name="system_verification_id")
	private int id;
	
	@Column(name="employer_id")
	private int employerId;
	
	@Column(name="systemVerification")
	private boolean verification;
	
}
