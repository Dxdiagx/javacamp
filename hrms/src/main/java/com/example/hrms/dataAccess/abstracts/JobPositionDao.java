package com.example.hrms.dataAccess.abstracts;

import com.example.hrms.entities.concretes.JobPositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPositions,Integer> {
}
