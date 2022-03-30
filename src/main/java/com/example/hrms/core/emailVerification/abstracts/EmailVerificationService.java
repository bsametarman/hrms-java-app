package com.example.hrms.core.emailVerification.abstracts;

import com.example.hrms.core.emailVerification.entities.EmailVerification;
import com.example.hrms.core.utilities.results.Result;

public interface EmailVerificationService {
	Result validate(EmailVerification emailVerification);
}
