package com.example.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.core.mernisVerification.abstracts.MernisVerificationService;



@RestController
@RequestMapping("/api")
public class MernisVerificationController {
	
	public MernisVerificationService mernisVerificationService;
	
	@Autowired
	public MernisVerificationController(MernisVerificationService mernisVerificationService) {
		super();
		this.mernisVerificationService = mernisVerificationService;
	}
	
//	@PostMapping("/mernisvalidate")
//	public Result validate(@RequestBody MernisVerification mernisVerification) {
//		return mernisVerificationService.validate(mernisVerification);
//	}
}
