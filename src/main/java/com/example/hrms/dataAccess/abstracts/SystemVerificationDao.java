package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.core.concretes.SystemVerification;

public interface SystemVerificationDao extends JpaRepository<SystemVerification, Integer>{

}
