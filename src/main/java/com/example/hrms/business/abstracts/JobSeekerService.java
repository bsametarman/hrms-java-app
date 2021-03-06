package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.JobAdvertisement;
import com.example.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	List<JobSeeker> getAll();
	DataResult<JobSeeker> getById(int jobSeekerId);
	DataResult<JobSeeker> signUp(JobSeeker jobSeeker);
	DataResult<List<JobSeeker>> getByJobSeekerNameAndUser(String jobSeekerName, int userId);
	DataResult<List<JobAdvertisement>> getAllActiveJobAdvertisements();
}
