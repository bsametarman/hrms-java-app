package com.example.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.hrms.entities.abstracts.IEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="school_informations")
public class SchoolInformation implements IEntity{
	
	@Id
	@GeneratedValue
	@Column(name="school_information_id")
	private int schoolInformationId;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="school_department")
	private String schoolDepartment;
	
	@Column(name="entry_year")
	private Date entryYear;
	
	@Column(name="graduation_year")
	private Date graduationYear;
	
}
