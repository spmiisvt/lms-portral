package com.lmsportal.lmsbackend.service.admin;

import com.lmsportal.lmsbackend.model.Project;
import com.lmsportal.lmsbackend.model.Stage;

import java.util.List;

public interface AdminProjectService {
    Project createProject(Project project);
    List<Project> getProjects();
    Project getProject(Long projectId);
    void deleteProject(Long projectId);
}
