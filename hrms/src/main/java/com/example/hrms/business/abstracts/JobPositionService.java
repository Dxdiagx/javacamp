package com.example.hrms.business.abstracts;

import com.example.hrms.entities.concretes.JobPositions;

import java.util.List;

public interface JobPositionService {
    List<JobPositions> getAll();
}

