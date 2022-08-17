package com.example.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_advertisements")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {
	@Id
	@GeneratedValue
	@Column(name="job_advertisement_id")
	private int jobAdvertisementId;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="city")
	private String city;
	
	@Column(name="salary")
	private String salary;
	
	@Column(name="job_position_number")
	private String jobPositionNumber;
	
	@Column(name="last_apply_date")
	private Date lastApplyDate;
	
	@Column(name="job_advertisement_state")
	private boolean jobAdvertisementState;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="job_position_id")
	private JobPosition jobPositionId;
	
}
