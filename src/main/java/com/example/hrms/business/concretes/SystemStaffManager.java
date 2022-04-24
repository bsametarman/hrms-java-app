package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.SystemStaffService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.ErrorDataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.JobPositionDao;
import com.example.hrms.dataAccess.abstracts.SystemStaffDao;
import com.example.hrms.entities.concretes.JobPosition;
import com.example.hrms.entities.concretes.SystemStaff;


@Service
public class SystemStaffManager implements SystemStaffService{
	
	private SystemStaffDao systemStaffDao;
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public SystemStaffManager(SystemStaffDao systemStaffDao, JobPositionDao jobPositionDao) {
		super();
		this.systemStaffDao = systemStaffDao;
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<SystemStaff>> getAll() {
		return new SuccessDataResult<List<SystemStaff>>(systemStaffDao.findAll(), "Sistem yetkilileri listelendi!");
	}

	@Override
	public DataResult<SystemStaff> getById(int systemStaffId) {
		return new SuccessDataResult<SystemStaff>(systemStaffDao.getById(systemStaffId),"Sistem yetkilileri listelendi!");
	}
	
	@Override
	public DataResult<List<JobPosition>> getAllJobPositions() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"İş pozisyonları liselendi!");
	}

	@Override
	public DataResult<JobPosition> getJobPositionById(int jobPositionId) {
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.getById(jobPositionId), "İş pozisyonları listelendi!");
	}

	@Override
	public DataResult<JobPosition> addJobPosition(JobPosition jobPosition) {
		try {
			return new SuccessDataResult<JobPosition>(jobPositionDao.save(jobPosition), "İş pozisyonu eeklendi!");
		}
		catch(Exception e) {
			return new ErrorDataResult<JobPosition>("İş pozisyonu eklenemedi");
		}
	}

}
