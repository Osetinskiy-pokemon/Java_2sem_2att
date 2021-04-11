package com.example.seminar_project.repository;

import com.example.seminar_project.entity.StatusTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusTaskRepository extends JpaRepository<StatusTask, Long> {
}
