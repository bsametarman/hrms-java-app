package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	@Query(value="SELECT * FROM job_advertisements j WHERE j.job_advertisement_state = true", nativeQuery = true)
	List<JobAdvertisement> getAllActiveJobAdvertisements();
}
