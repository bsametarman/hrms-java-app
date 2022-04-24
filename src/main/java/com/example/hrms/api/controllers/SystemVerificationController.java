package com.example.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.core.systemVerification.abstracts.SystemVerificationService;



@RestController
@RequestMapping("/api")
public class SystemVerificationController {
	private SystemVerificationService systemVerificationService;
	
	@Autowired
	public SystemVerificationController(SystemVerificationService systemVerificationService) {
		super();
		this.systemVerificationService = systemVerificationService;
	}
	
//	@PostMapping("/systemverification")
//	public Result validate(@RequestBody SystemVerification systemVerification) {
//		return systemVerificationService.verificate(systemVerification);
//	}
}
