package com.example.hrms.core.abstracts;

import com.example.hrms.core.concretes.EmailVerification;

public interface EmailVerificationService {
	public void validate(EmailVerification emailVerification);
}
