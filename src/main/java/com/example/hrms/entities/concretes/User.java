package com.example.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.hrms.entities.abstracts.IEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
public class User implements IEntity{
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int userId;
	
	@Column(name="email")
	private String userEmail;
	
	@Column(name="password")
	private String userPassword;
	
	@Column(name="password_repeat")
	private String userPasswordRepeat;
	
	@Column(name="phone_number")
	private String userPhoneNumber;
	
	//@OneToMany(mappedBy = "user")
	//private List<JobSeeker> jobSeekers;
	

}
