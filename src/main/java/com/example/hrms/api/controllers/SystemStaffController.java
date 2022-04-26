package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.SystemStaffService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.JobPosition;
import com.example.hrms.entities.concretes.SystemStaff;

@RestController
@RequestMapping("/api/systemstaffs")
public class SystemStaffController {

	private SystemStaffService systemStaffService;
	
	@Autowired
	public SystemStaffController(SystemStaffService systemStaffService) {
		super();
		this.systemStaffService = systemStaffService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<SystemStaff>> getAll(){
		return systemStaffService.getAll();
	}
	
	@GetMapping("/getbyid/{system_staff_id}")
	public DataResult<SystemStaff> getById(@RequestParam("systemStaffId") int systemStaffId){
		return systemStaffService.getById(systemStaffId);
	}
	
	@PostMapping(value = "/addjobposition")
	public DataResult<JobPosition> addJobPosition(@RequestBody JobPosition jobPosition){
		return systemStaffService.addJobPosition(jobPosition);
	}
	
	
	
	
	
}
