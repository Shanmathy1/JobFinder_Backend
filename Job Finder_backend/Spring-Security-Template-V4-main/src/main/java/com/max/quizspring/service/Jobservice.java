package com.max.quizspring.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.max.quizspring.model.Job;
import com.max.quizspring.repo.Jobrepo;

import java.util.List;
import java.util.Optional;

@Service
public class Jobservice {

    @Autowired
    private Jobrepo jobRepo;

    public List<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    public Job addJob(Job job) {
        return jobRepo.save(job);
    }

    public Optional<Job> getJobById(Long jobId) {
        return jobRepo.findById(jobId);
    }

    public boolean deleteJob(Long jobId) {
        if (jobRepo.existsById(jobId)) {
            jobRepo.deleteById(jobId);
            return true;
        }
        return false;
    }
}

