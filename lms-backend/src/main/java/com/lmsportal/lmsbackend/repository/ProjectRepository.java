package com.lmsportal.lmsbackend.repository;

import com.lmsportal.lmsbackend.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
