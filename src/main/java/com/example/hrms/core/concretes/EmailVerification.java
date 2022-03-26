package com.example.hrms.core.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="email_verifications")
public class EmailVerification {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="verification")
	private boolean verification;
	
	public EmailVerification() {
		
	}
	
	public EmailVerification(int id, int userId, boolean verification) {
		super();
		this.id = id;
		this.userId = userId;
		this.verification = verification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean isVerification() {
		return verification;
	}

	public void setVerification(boolean verification) {
		this.verification = verification;
	}
	
	
}
