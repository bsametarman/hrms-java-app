package com.example.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.core.emailVerification.abstracts.EmailVerificationService;
import com.example.hrms.core.emailVerification.entities.EmailVerification;
import com.example.hrms.core.utilities.results.Result;

@RestController
@RequestMapping("/api/emailverification")
public class EmailVerificationController {
	private EmailVerificationService emailVerificationService;
	
	@Autowired
	public EmailVerificationController(EmailVerificationService emailVerificationService) {
		super();
		this.emailVerificationService = emailVerificationService;
	}
	
	@PostMapping("/emailvalidate")
	public Result validate(@RequestBody EmailVerification emailVerification) {
		return emailVerificationService.validate(emailVerification);
	}
}
