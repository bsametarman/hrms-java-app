package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.EmployerDao;
import com.example.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(employerDao.findAll(), "İş verenler eklendi");
	}

	@Override
	public DataResult<Employer>getById(int employer_id) {
		return new SuccessDataResult<Employer>(employerDao.getEmployerByEmployerId(employer_id), "İş veren listelendi");
	}

	@Override
	public DataResult<Employer> add(Employer employer) {
		return new SuccessDataResult<Employer>(employerDao.save(employer), "İş veren eklendi!");
	}
	

	
}
