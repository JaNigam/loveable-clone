package com.jayant.projects.lovable.controller;


import com.jayant.projects.lovable.dto.project.ProjectResponse;
import com.jayant.projects.lovable.dto.project.ProjectSummaryResponse;
import com.jayant.projects.lovable.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects")
public class ProjectController {
    private final ProjectService projectService;


    @GetMapping
    ResponseEntity<List<ProjectSummaryResponse>> getMyProjects(){
        Long userId = 1L;
        return ResponseEntity.ok(projectService.getUserProjects(userId));
    }

    @GetMapping("{id}")
    ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id){
        Long userId = 1L;
        return ResponseEntity.ok(projectService.getUserProjectById(id, userId));
    }

}
