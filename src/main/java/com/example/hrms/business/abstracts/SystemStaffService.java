package com.example.hrms.business.abstracts;

import java.util.List;
import java.util.Optional;

import com.example.hrms.entities.concretes.SystemStaff;

public interface SystemStaffService {
	List<SystemStaff> getAll();
	Optional<SystemStaff> getById(int system_staff_id);
}
