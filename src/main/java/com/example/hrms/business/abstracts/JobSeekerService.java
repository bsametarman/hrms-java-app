package com.example.hrms.business.abstracts;

import java.util.List;
import java.util.Optional;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	List<JobSeeker> getAll();
	Optional<JobSeeker> getById(int job_seeker_id);
	void signUp(JobSeeker jobSeeker);
	DataResult<List<JobSeeker>> getByJobSeekerNameAndUser(String jobSeekerName, int userId);
}
