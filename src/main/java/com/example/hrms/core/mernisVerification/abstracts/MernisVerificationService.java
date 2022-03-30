package com.example.hrms.core.mernisVerification.abstracts;

import com.example.hrms.core.mernisVerification.entities.MernisVerification;
import com.example.hrms.core.utilities.results.Result;

public interface MernisVerificationService {
	Result validate(MernisVerification mernisVerification);
}