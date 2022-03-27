package com.example.hrms.core.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hrms_verifications")
public class SystemVerification {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="employer_id")
	private int employerId;
	
	@Column(name="verification")
	private boolean verification;
	
	public SystemVerification() {
		
	}

	public SystemVerification(int id, int employerId, boolean verification) {
		super();
		this.id = id;
		this.employerId = employerId;
		this.verification = verification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public boolean isVerification() {
		return verification;
	}

	public void setVerification(boolean verification) {
		this.verification = verification;
	}
	
	
}
