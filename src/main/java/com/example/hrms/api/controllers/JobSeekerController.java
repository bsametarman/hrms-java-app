package com.example.hrms.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobSeekerService;
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
	
	@GetMapping("/addjobseeker")
	public void addJobSeeker() {
		jobSeekerService.addJobSeeker();
	}
	
	@GetMapping("/getbyid/{job_seeker_id}")
	public Optional<JobSeeker> getById(@PathVariable int job_seeker_id){
		return jobSeekerService.getById(job_seeker_id);
	}
	
	
}
