package com.example.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.SystemStaffService;
import com.example.hrms.dataAccess.abstracts.SystemStaffDao;
import com.example.hrms.entities.concretes.SystemStaff;

@Service
public class SystemStaffManager implements SystemStaffService{
	
	private SystemStaffDao systemStaffDao;
	
	@Autowired
	public SystemStaffManager(SystemStaffDao systemStaffDao) {
		super();
		this.systemStaffDao = systemStaffDao;
	}

	@Override
	public List<SystemStaff> getAll() {
		return systemStaffDao.findAll();
	}

	@Override
	public Optional<SystemStaff> getById(int system_staff_id) {
		return systemStaffDao.findById(system_staff_id);
	}

}
