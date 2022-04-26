package com.example.hrms.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekerController {
	
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getall")
	public @ResponseBody List<JobSeeker> getAll(){
		return this.jobSeekerService.getAll();
	}
	
	@GetMapping("/getbyid/{job_seeker_id}")
	public Optional<JobSeeker> getById(@PathVariable int job_seeker_id){
		return jobSeekerService.getById(job_seeker_id);
	}
	
	@PostMapping("/add")
	public DataResult<JobSeeker> signUp(@RequestBody JobSeeker jobSeeker) {
	    return jobSeekerService.signUp(jobSeeker);  
	}
	
	@GetMapping("/getByJobSeekerNameAndUser")
	public DataResult<List<JobSeeker>> getByJobSeekerNameAndUser(@RequestParam("jobSeekerName") String jobSeekerName, @RequestParam("userId") int userId){
		return this.jobSeekerService.getByJobSeekerNameAndUser(jobSeekerName, userId);
	}
}
