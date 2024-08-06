package com.max.quizspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.max.quizspring.model.Application;
import com.max.quizspring.repo.Applicationrepo;

import java.util.List;
import java.util.Optional;

@Service
public class Applicationservice {

    @Autowired
    private Applicationrepo applicationRepo;

    public List<Application> getAllApplications() {
        return applicationRepo.findAll();
    }

    public Application addApplication(Application application) {
        return applicationRepo.save(application);
    }

    public Optional<Application> getApplicationById(Long applicationId) {
        return applicationRepo.findById(applicationId);
    }

    public boolean deleteApplication(Long applicationId) {
        if (applicationRepo.existsById(applicationId)) {
            applicationRepo.deleteById(applicationId);
            return true;
        }
        return false;
    }
}
