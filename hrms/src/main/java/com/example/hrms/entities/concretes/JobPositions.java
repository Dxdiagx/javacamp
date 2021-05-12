package com.example.hrms.entities.concretes;
import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "job_positions")
public class JobPositions {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @GeneratedValue
    @Column(name = "position")
    private String position;
}
