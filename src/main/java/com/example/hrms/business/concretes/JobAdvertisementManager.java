package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobAdvertisementService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.example.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<JobAdvertisement> add(JobAdvertisement jobAdvertisement) {
		return new SuccessDataResult<JobAdvertisement>(this.jobAdvertisementDao.save(jobAdvertisement), "İş ilanı başarıyla eklendi!");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(), "İş ilanları listelendi!");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveJobAdvertisements() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getAllActiveJobAdvertisements(), "Aktif iş ilanları listelendi!");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveJobAdvertisementsByDateAsc() {
		Sort sort = Sort.by(Sort.Direction.ASC, "lastApplyDate");
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort), "Tarihe göre listelendi!");
	}

	@Override
	public DataResult<JobAdvertisement> updateJobAdvertisementState(int jobAdvertisementId) {
		JobAdvertisement jobAdvertisement = this.jobAdvertisementDao.getById(jobAdvertisementId);
		if(jobAdvertisement.isJobAdvertisementState()) {
			jobAdvertisement.setJobAdvertisementState(false);
		}
		else{
			jobAdvertisement.setJobAdvertisementState(true);
		}
		
		return new SuccessDataResult<JobAdvertisement>(this.jobAdvertisementDao.save(jobAdvertisement), "İş ilan durumu güncellendi");
	}
}
