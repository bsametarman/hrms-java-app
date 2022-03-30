package com.example.hrms.core.emailVerification.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.core.emailVerification.abstracts.EmailVerificationService;
import com.example.hrms.core.emailVerification.entities.EmailVerification;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.EmailVerificationDao;

@Service
public class EmailVerificationManager implements EmailVerificationService{

	private EmailVerificationDao emailVerificationDao;
	
	@Autowired
	public EmailVerificationManager(EmailVerificationDao emailVerificationDao) {
		this.emailVerificationDao = emailVerificationDao;
	}
	
	@Override
	public Result validate(EmailVerification emailVerification) {
		this.emailVerificationDao.save(emailVerification);
		return new SuccessResult("email successfully verificated!");
	}

}

