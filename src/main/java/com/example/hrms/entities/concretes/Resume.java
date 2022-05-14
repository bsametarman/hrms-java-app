package com.example.hrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.hrms.entities.abstracts.IEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="resumes")
public class Resume implements IEntity{
	
	@Id
	@GeneratedValue
	@Column(name="resume_id")
	private int resumeId;
	
	@Column(name="resume_name")
	private String resumeName;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="employee_surname")
	private String employeeSurname;
	
	@Column(name="employee_age")
	private int employeeAge;
	
	@Column(name="employee_gender")
	private String employeeGender;
	
	@Column(name="employee_nationality")
	private String employeeNationality;
	
	@Column(name="employee_profile_image")
	private String employeeProfileImage;
	
	@OneToMany(cascade=CascadeType.MERGE)
	@JoinColumn(name="resume_id")
	private List<Language> language;
	
	@OneToMany(cascade=CascadeType.MERGE)
	@JoinColumn(name="resume_id")
	private List<SchoolInformation> schoolInformantion;
}
