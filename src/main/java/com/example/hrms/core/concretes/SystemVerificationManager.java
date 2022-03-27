package com.example.hrms.core.concretes;

import org.springframework.stereotype.Service;

import com.example.hrms.core.abstracts.SystemVerificationService;
import com.example.hrms.dataAccess.abstracts.SystemVerificationDao;

@Service
public class SystemVerificationManager implements SystemVerificationService{
	
	private SystemVerificationDao systemVerificationDao;
	
	public SystemVerificationManager(SystemVerificationDao systemVerificationDao) {
		super();
		this.systemVerificationDao = systemVerificationDao;
	}
	
	@Override
	public void verificate(SystemVerification systemVerification) {
		systemVerificationDao.save(systemVerification);
		
	}

}
