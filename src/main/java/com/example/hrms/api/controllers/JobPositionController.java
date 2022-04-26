package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobPositionService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.JobPosition;


@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionController {
	
	private JobPositionService jobPositionService;
	
	public JobPositionController(JobPositionService jobPositionService) {
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return jobPositionService.getAll();
	}
	
	@GetMapping("/getjobpositionbyid/{jobPositionId}")
	public DataResult<JobPosition> getJobPositionById(@RequestParam("jobPositionId") int jobPositionId){
		return jobPositionService.getById(jobPositionId);
	}
	
}
