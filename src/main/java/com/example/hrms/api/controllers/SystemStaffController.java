package com.example.hrms.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.SystemStaffService;
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
	public List<SystemStaff> getAll(){
		return systemStaffService.getAll();
	}
	
	@GetMapping("/getbyid/{system_staff_id}")
	public Optional<SystemStaff> getById(@PathVariable int system_staff_id){
		return systemStaffService.getById(system_staff_id);
	}
}
