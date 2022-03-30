package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.core.mernisVerification.entities.MernisVerification;


public interface MernisVerificationDao extends JpaRepository<MernisVerification, Integer>{

}
