package com.example.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.hrms.entities.abstracts.IEntity;

@Entity
@Table(name="system_staffs")
public class SystemStaff implements IEntity{
	
	@Id
	@GeneratedValue
	@Column(name="system_staff_id")
	private int systemStaffId;
	
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
	
	@Column(name="job_start_date")
	private Date jobStartDate;
	
	public SystemStaff() {
		
	}

	public SystemStaff(int systemStaffId, String name, String lastName, String identityNumber, Date birthDate,
			String address, Date jobStartDate) {
		super();
		this.systemStaffId = systemStaffId;
		this.name = name;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
		this.address = address;
		this.jobStartDate = jobStartDate;
	}

	public int getSystemStaffId() {
		return systemStaffId;
	}

	public void setSystemStaffId(int systemStaffId) {
		this.systemStaffId = systemStaffId;
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

	public Date getJobStartDate() {
		return jobStartDate;
	}

	public void setJobStartDate(Date jobStartDate) {
		this.jobStartDate = jobStartDate;
	}
	
		
}
