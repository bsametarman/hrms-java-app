package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobAdvertisementService;
import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.JobAdvertisement;
import com.example.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekerController {
	
	private JobSeekerService jobSeekerService;
	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerService, JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobSeekerService = jobSeekerService;
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public @ResponseBody List<JobSeeker> getAll(){
		return this.jobSeekerService.getAll();
	}
	
	@GetMapping("/getbyid/{job_seeker_id}")
	public DataResult<JobSeeker> getById(@RequestParam("jobSeekerId") int jobSeekerId){
		return jobSeekerService.getById(jobSeekerId);
	}
	
	@PostMapping("/add")
	public DataResult<JobSeeker> signUp(@RequestBody JobSeeker jobSeeker) {
	    return jobSeekerService.signUp(jobSeeker);  
	}
	
	@GetMapping("/getByJobSeekerNameAndUser")
	public DataResult<List<JobSeeker>> getByJobSeekerNameAndUser(@RequestParam("jobSeekerName") String jobSeekerName, @RequestParam("userId") int userId){
		return this.jobSeekerService.getByJobSeekerNameAndUser(jobSeekerName, userId);
	}
	
	@GetMapping("/getAllActiveJobAdvertisements")
	public DataResult<List<JobAdvertisement>> getAllActiveJobAdvertisements(){
		return this.jobAdvertisementService.getAllActiveJobAdvertisements();
	}
}
