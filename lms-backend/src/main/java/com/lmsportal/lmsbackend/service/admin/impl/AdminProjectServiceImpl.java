package com.lmsportal.lmsbackend.service.admin.impl;

import com.lmsportal.lmsbackend.exception.NotFoundException;
import com.lmsportal.lmsbackend.model.Project;
import com.lmsportal.lmsbackend.repository.ProjectRepository;
import com.lmsportal.lmsbackend.service.admin.AdminProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminProjectServiceImpl implements AdminProjectService {

    private final ProjectRepository projectRepository;

    public AdminProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project createProject(Project project) {
        return this.projectRepository.save(project);
    }

    @Override
    public List<Project> getProjects() {
        return this.projectRepository.findAll();
    }

    @Override
    public Project getProject(Long projectId) {
        return this.projectRepository.findById(projectId).orElseThrow(()-> {
                    NotFoundException notFoundException = new NotFoundException(
                            "Project with id " + projectId + " not found");
                    return notFoundException;
                });
    }

    @Override
    public void deleteProject(Long projectId) {
        this.projectRepository.deleteById(projectId);
    }
}
