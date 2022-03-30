package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.core.emailVerification.entities.EmailVerification;



public interface EmailVerificationDao extends JpaRepository<EmailVerification, Integer>{

}
