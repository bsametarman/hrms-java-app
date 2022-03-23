package com.example.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.hrms.entities.abstracts.IEntity;

@Entity
@Table(name="job_seekers")
public class JobSeeker implements IEntity{
	
	@Id
	@GeneratedValue
	@Column(name="job_seeker_id")
	private int jobSeekerId;
	
	@Column(name="first_name")
	private String name;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="address")
	private String address;
	
	public JobSeeker()
	{
		
	}
	
	public JobSeeker(int jobSeekerId, String name, String lastName, String identityNumber, Date birthDate,
			String email, String password, String passwordRepeat, String address) {
		super();
		this.jobSeekerId = jobSeekerId;
		this.name = name;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
		this.address = address;
	}

	public int getJobSeekerId() {
		return jobSeekerId;
	}

	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
