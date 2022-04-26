package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobPositionService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.JobPositionDao;
import com.example.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		this.jobPositionDao = jobPositionDao;
	}
	
	@Override
	public DataResult<List<JobPosition>> getAll(){
		return new SuccessDataResult<List<JobPosition>>(jobPositionDao.findAll(), "İş pozisyonları listelendi!");
	}

	@Override
	public DataResult<JobPosition> getById(int jobPositionId) {
		return new SuccessDataResult<JobPosition>(jobPositionDao.getJobPositionByJobPositionId(jobPositionId), "İş pozisyonu listelendi!");
	}
	
}
