package com.example.hrms.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.hrms.core.emailVerification.entities.EmailVerification;
import com.example.hrms.core.mernisVerification.entities.MernisVerification;
import com.example.hrms.entities.abstracts.IEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker implements IEntity{
	
	@Id
	@GeneratedValue
	@Column(name="job_seeker_id")
	private int id;
	
	@Column(name="first_name")
	private String jobSeekerName;
	
	@Column(name="last_name")
	private String jobSeekerLastName;
	
	@Column(name="identity_number")
	private String jobSeekerIdentityNumber;
	
	@Column(name="birth_date")
	private String jobSeekerBirthDate;
	
	@Column(name="address")
	private String jobSeekerAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="mernis_verification_id")
	private MernisVerification mernisVerification;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="email_verification_id")
	private EmailVerification emailVerification;
	
	
}
