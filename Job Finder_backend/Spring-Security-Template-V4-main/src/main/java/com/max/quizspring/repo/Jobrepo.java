package com.max.quizspring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.max.quizspring.model.Job;

public interface Jobrepo  extends JpaRepository<Job, Long>{
    
}
