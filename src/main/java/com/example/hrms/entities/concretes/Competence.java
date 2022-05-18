package com.example.hrms.entities.concretes;

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
@Table(name="competencies")
@AllArgsConstructor
@NoArgsConstructor
public class Competence implements IEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="competence_id")
	private int competenceId;
	
	@Column(name="competence_name")
	private String competenceName;
	
	@Column(name="competence_description")
	private String competenceDescription;	

}
