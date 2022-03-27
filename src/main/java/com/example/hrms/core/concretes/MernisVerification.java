package com.example.hrms.core.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mernis_verifications")
public class MernisVerification {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="job_seeker_id")
	private int jobSeekerId;
	
	@Column(name="verification")
	private boolean verification;
	
	public MernisVerification() {
		
	}

	public MernisVerification(int id, int jobSeekerId, boolean verification) {
		super();
		this.id = id;
		this.jobSeekerId = jobSeekerId;
		this.verification = verification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJobSeekerId() {
		return jobSeekerId;
	}

	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}

	public boolean isVerification() {
		return verification;
	}

	public void setVerification(boolean verification) {
		this.verification = verification;
	}
	
	
	
}
