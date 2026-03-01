package com.jayant.projects.lovable.entity;

import com.jayant.projects.lovable.enums.PreviewStatus;
import lombok.Data;

import java.time.Instant;

@Data
public class Preview {

    Long id;
    Project project;

    String namespace;
    String podName;
    String previewUrl;

    PreviewStatus status;

    Instant startedAt;
    Instant terminatedAt;

    Instant createdAt;
}
