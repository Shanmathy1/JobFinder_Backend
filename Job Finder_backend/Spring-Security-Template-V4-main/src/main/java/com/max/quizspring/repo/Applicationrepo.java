package com.max.quizspring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.max.quizspring.model.Application;

public interface Applicationrepo extends JpaRepository<Application, Long> {
}
