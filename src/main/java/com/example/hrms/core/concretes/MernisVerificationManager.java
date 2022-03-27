package com.example.hrms.core.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.core.abstracts.MernisVerificationService;
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
	public void validate(MernisVerification mernisVerification) {
		mernisVerificationDao.save(mernisVerification);
	}

}
