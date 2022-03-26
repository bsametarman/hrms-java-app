package com.example.hrms.core.concretes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.core.abstracts.EmailVerificationService;
import com.example.hrms.dataAccess.abstracts.EmailVerificationDao;

@Service
public class EmailVerificationManager implements EmailVerificationService{

	private EmailVerificationDao emailVerificationDao;
	
	@Autowired
	public EmailVerificationManager(EmailVerificationDao emailVerificationDao) {
		this.emailVerificationDao = emailVerificationDao;
	}
	
	@Override
	public void validate(EmailVerification emailVerification) {
		emailVerificationDao.saveAndFlush(emailVerification);
	}

}
