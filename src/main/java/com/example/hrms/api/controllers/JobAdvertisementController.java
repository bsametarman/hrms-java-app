package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobAdvertisementService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementController {
	
	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@PostMapping("/add")
	public DataResult<JobAdvertisement> add(@RequestBody JobAdvertisement jobAdvertisement){
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getallactivejobadvertisements")
	public DataResult<List<JobAdvertisement>> getAllActiceJobAdvertisements(){
		return this.jobAdvertisementService.getAllActiveJobAdvertisements();
	}
	
	@GetMapping("/getallactivejobstatementsbydateasc")
	public DataResult<List<JobAdvertisement>> getAllActiveJobAdvertisementsByDateAsc(){
		return this.jobAdvertisementService.getAllActiveJobAdvertisementsByDateAsc();
	}
	
	@PostMapping("/updateJobStatement")
	public DataResult<JobAdvertisement> add(int jobAdvertisementId){
		return this.jobAdvertisementService.updateJobAdvertisementState(jobAdvertisementId);
	}
}
