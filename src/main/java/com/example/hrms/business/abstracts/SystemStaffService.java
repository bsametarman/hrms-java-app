package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.JobPosition;
import com.example.hrms.entities.concretes.SystemStaff;

public interface SystemStaffService {
	DataResult<List<SystemStaff>> getAll();
	DataResult<SystemStaff> getById(int systemStaffId);
	DataResult<List<JobPosition>> getAllJobPositions();
	DataResult<JobPosition> getJobPositionById(int jobPositionId);
	DataResult<JobPosition> addJobPosition(JobPosition jobPosition);
}
