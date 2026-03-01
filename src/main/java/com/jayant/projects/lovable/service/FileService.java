package com.jayant.projects.lovable.service;

import com.jayant.projects.lovable.dto.project.FileContentResponse;
import com.jayant.projects.lovable.dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
