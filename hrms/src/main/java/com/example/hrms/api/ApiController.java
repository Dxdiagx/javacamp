package com.example.hrms.api;

import com.example.hrms.business.abstracts.JobPositionService;
import com.example.hrms.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/job_position")

public class ApiController {

    private JobPositionService jobPositionService;

    @Autowired
    public ApiController(JobPositionService jobPositionService) {

        this.jobPositionService = jobPositionService;
    }
    @GetMapping("/getall")
    public List<JobPositions> getAll(){
        return this.jobPositionService.getAll();
    }

}
