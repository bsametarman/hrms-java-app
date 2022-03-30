package com.example.hrms.core.systemVerification.abstracts;

import com.example.hrms.core.systemVerification.entities.SystemVerification;
import com.example.hrms.core.utilities.results.Result;

public interface SystemVerificationService {
	Result verificate(SystemVerification systemVerification);
}
