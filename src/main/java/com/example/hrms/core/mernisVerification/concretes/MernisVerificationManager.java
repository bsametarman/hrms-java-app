package com.example.hrms.core.mernisVerification.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.core.mernisVerification.abstracts.MernisVerificationService;
import com.example.hrms.core.mernisVerification.entities.MernisVerification;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.MernisVerificationDao;

@Service
public class MernisVerificationManager implements MernisVerificationService{
	
	public MernisVerificationDao mernisVerificationDao;
	
	@Autowired
	public MernisVerificationManager(MernisVerificationDao mernisVerificationDao) {
		super();
		this.mernisVerificationDao = mernisVerificationDao;
	}
	
	@Override
	public Result validate(MernisVerification mernisVerification) {
		mernisVerificationDao.save(mernisVerification);
		return new SuccessResult("successfully verificated with mernis!");
	}

}