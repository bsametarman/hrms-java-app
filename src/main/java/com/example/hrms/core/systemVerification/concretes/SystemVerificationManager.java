package com.example.hrms.core.systemVerification.concretes;

import org.springframework.stereotype.Service;

import com.example.hrms.core.systemVerification.abstracts.SystemVerificationService;
import com.example.hrms.core.systemVerification.entities.SystemVerification;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.SystemVerificationDao;

@Service
public class SystemVerificationManager implements SystemVerificationService{
	
	private SystemVerificationDao systemVerificationDao;
	
	public SystemVerificationManager(SystemVerificationDao systemVerificationDao) {
		super();
		this.systemVerificationDao = systemVerificationDao;
	}
	
	@Override
	public Result verificate(SystemVerification systemVerification) {
		systemVerificationDao.save(systemVerification);
		return new SuccessResult("successfully verificated!");
		
	}

}
