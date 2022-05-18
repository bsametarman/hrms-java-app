package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.hrms.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer>{
	@Query(value="SELECT * FROM resumes WHERE job_seeker_id = :jobSeekerId", nativeQuery=true)
	List<Resume> getResumeByJobSeekerId(int jobSeekerId);
}
