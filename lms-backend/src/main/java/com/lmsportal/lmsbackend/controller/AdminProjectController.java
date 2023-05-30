package com.lmsportal.lmsbackend.controller;

import com.lmsportal.lmsbackend.model.Project;
import com.lmsportal.lmsbackend.service.admin.AdminProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin("*")
@RestController
@RequestMapping("/projects")
public class AdminProjectController {
    private final AdminProjectService projectService;
    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return this.projectService.createProject(project);
    }
    @GetMapping
    public List<Project> getProjects(){
        return this.projectService.getProjects();
    }
    @GetMapping("/{projectId}")
    public Project getProject(@PathVariable("projectId") Long projectId) {
        return this.projectService.getProject(projectId);
    }

    @DeleteMapping("/{projectId}")
    public void deleteProject(@PathVariable("projectId") Long projectId) {
        this.projectService.deleteProject(projectId);
    }

}
