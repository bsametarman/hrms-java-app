package com.example.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.dataAccess.abstracts.JobSeekerDao;
import com.example.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
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
		JobSeeker jobSeekerCreate = new JobSeeker();
		jobSeekerCreate.setJobSeekerId(jobSeeker.getJobSeekerId());
		jobSeekerCreate.setName(jobSeeker.getName());
		jobSeekerCreate.setLastName(jobSeeker.getLastName());
		jobSeekerCreate.setIdentityNumber(jobSeeker.getIdentityNumber());
		jobSeekerCreate.setBirthDate(jobSeeker.getBirthDate());
		jobSeekerCreate.setAddress(jobSeeker.getAddress());
	
		jobSeekerDao.saveAndFlush(jobSeekerCreate);
		
	}

}
