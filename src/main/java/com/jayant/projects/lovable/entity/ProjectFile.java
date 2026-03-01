package com.jayant.projects.lovable.entity;

import lombok.Data;

import java.time.Instant;

@Data
public class ProjectFile {

    Long id;

    Project project;

    String path;

    String minioObjectKey;

    Instant createdAt;
    Instant updatedAt;

    User createdBy;
    User updatedBy;


}
