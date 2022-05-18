package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.ResumeService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.Resume;

@RestController
@RequestMapping("/api/resumes")
public class ResumesController {
	
	private ResumeService resumeService;
	
	@Autowired
	public ResumesController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Resume>> getAll(){
		return this.resumeService.getAll();
	}
	
	@PostMapping("/add")
	public DataResult<Resume> add(@RequestBody Resume resume) {
		return this.resumeService.add(resume);
	}
}
