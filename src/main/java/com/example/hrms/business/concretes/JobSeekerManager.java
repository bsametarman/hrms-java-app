package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.example.hrms.dataAccess.abstracts.JobSeekerDao;
import com.example.hrms.entities.concretes.JobAdvertisement;
import com.example.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	
	private JobSeekerDao jobSeekerDao;
	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.jobAdvertisementDao = jobAdvertisementDao;
	}
	
	@Override
	public List<JobSeeker> getAll() {
		return jobSeekerDao.findAll();
	}

	@Override
	public DataResult<JobSeeker> getById(int jobSeekerId) {
		return new SuccessDataResult<JobSeeker>(jobSeekerDao.getJobSeekerByJobSeekerId(jobSeekerId), "İş arayan listelendi!");
	}

	@Override
	public DataResult<JobSeeker> signUp(JobSeeker jobSeeker) {
		return new SuccessDataResult<JobSeeker>(jobSeekerDao.save(jobSeeker), "Başarıyla kaydedildi!");
		
	}

	@Override
	public DataResult<List<JobSeeker>> getByJobSeekerNameAndUser(String jobSeekerName, int userId) {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.getByJobSeekerNameAndUser_UserId(jobSeekerName, userId), "Data listelendi!");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveJobAdvertisements() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getAllActiveJobAdvertisements(), "Tüm iş ilanları listelendi!");
	}

}
