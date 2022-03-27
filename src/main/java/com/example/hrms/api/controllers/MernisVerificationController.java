package com.example.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.core.abstracts.MernisVerificationService;
import com.example.hrms.core.concretes.MernisVerification;

@RestController
@RequestMapping("/api")
public class MernisVerificationController {
	
	public MernisVerificationService mernisVerificationService;
	
	@Autowired
	public MernisVerificationController(MernisVerificationService mernisVerificationService) {
		super();
		this.mernisVerificationService = mernisVerificationService;
	}
	
	@PostMapping("/mernisvalidate")
	public void validate(@RequestBody MernisVerification mernisVerification) {
		mernisVerificationService.validate(mernisVerification);
	}
}
