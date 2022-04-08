package com.example.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.core.mernisVerification.abstracts.MernisVerificationService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.JobSeekerDao;
import com.example.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	
	private JobSeekerDao jobSeekerDao;
	private MernisVerificationService mernisVerificationService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, MernisVerificationService mernisVerificationService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.mernisVerificationService = mernisVerificationService;
	}
	
	@Override
	public List<JobSeeker> getAll() {
		return jobSeekerDao.findAll();
	}

	@Override
	public Optional<JobSeeker> getById(int job_seeker_id) {
		return jobSeekerDao.findById(job_seeker_id);
	}

	@Override
	public void signUp(JobSeeker jobSeeker) {
		//mernisVerificationService.validate(jobSeeker);
	
		jobSeekerDao.saveAndFlush(jobSeeker);
		
	}

	@Override
	public DataResult<List<JobSeeker>> getByJobSeekerNameAndUser(String jobSeekerName, int userId) {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.getByJobSeekerNameAndUser_UserId(jobSeekerName, userId), "Data listelendi!");
	}

}
