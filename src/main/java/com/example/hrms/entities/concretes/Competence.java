package com.example.hrms.entities.concretes;

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
@Table(name="competencies")
public class Competence implements IEntity{
	
	@Id
	@GeneratedValue
	@Column(name="competence_id")
	private int competenceId;
	
	@Column(name="competence_name")
	private String competenceName;
	
	@Column(name="competence_description")
	private String competenceDescription;
}
