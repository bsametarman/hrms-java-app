package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.ResumeService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.ResumeDao;
import com.example.hrms.entities.concretes.Resume;

@Service
public class ResumeManager implements ResumeService{
	
	private ResumeDao resumeDao;
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao = resumeDao;
	}
	
	@Override
	public DataResult<List<Resume>> getAll() {
		return new SuccessDataResult<List<Resume>>(this.resumeDao.findAll(), "Tüm CV'ler listelendi!");
	}

	@Override
	public DataResult<Resume> add(Resume resume) {
		return new SuccessDataResult<Resume>(this.resumeDao.save(resume), "CV eklendi!");
	}

}
