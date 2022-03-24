package com.example.hrms.business.abstracts;

import java.util.List;
import java.util.Optional;

import com.example.hrms.entities.concretes.Employer;

public interface EmployerService {
	List<Employer> getAll();
	Optional<Employer> getById(int employer_id);
}
