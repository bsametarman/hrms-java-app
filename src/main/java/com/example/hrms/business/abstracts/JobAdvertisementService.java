package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	DataResult<JobAdvertisement> add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> getAllActiveJobAdvertisements();
	DataResult<List<JobAdvertisement>> getAllActiveJobAdvertisementsByDateAsc();
	DataResult<JobAdvertisement> updateJobAdvertisementState(int jobAdvertisementId);
}
