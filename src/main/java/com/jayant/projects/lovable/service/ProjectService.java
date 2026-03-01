package com.jayant.projects.lovable.service;

import com.jayant.projects.lovable.dto.project.ProjectRequest;
import com.jayant.projects.lovable.dto.project.ProjectResponse;
import com.jayant.projects.lovable.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
