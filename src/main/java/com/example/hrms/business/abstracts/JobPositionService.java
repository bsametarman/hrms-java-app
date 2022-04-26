package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();
	DataResult<JobPosition> getById(int jobPositionId);
}
