package com.example.hrms.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@GetMapping("/getbyid/{job_seeker_id}")
	public Optional<JobSeeker> getById(@PathVariable int job_seeker_id){
		return jobSeekerService.getById(job_seeker_id);
	}
	
//	@PostMapping("/signup/{jobSeekerId}/{name}/{lastName}/{identityNumber}/{birthDate}/{address}")
//	public void signUp(@PathVariable int jobSeekerId, String name, String lastName, String identityNumber, String birthDate,
//			String add) {
//		jobSeekerService.signUp(jobSeekerId, name, lastName, identityNumber, birthDate, address);
//	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
	public void signUp(@RequestBody JobSeeker jobSeeker) {
	    jobSeekerService.signUp(jobSeeker);  
	}
	
}
