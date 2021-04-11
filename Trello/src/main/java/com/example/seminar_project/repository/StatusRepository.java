package com.example.seminar_project.repository;

import com.example.seminar_project.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
