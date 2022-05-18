package com.example.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.hrms.entities.abstracts.IEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="school_informations")
@AllArgsConstructor
@NoArgsConstructor
public class SchoolInformation implements IEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
