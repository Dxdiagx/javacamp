package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.JobPositionService;
import com.example.hrms.dataAccess.abstracts.JobPositionDao;
import com.example.hrms.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobPositionManager implements JobPositionService {
    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao job_PositionDao) {

        this.jobPositionDao = job_PositionDao;
    }

    @Override
    public List<JobPositions> getAll() {
        return jobPositionDao.findAll();
    }
}
