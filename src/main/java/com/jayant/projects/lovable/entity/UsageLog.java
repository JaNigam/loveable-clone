package com.jayant.projects.lovable.entity;

import java.time.Instant;

public class UsageLog {
    Long id;

    User user;
    Project project;

    String action;
    Integer tokensUsed;
    Integer durationInMs;

    String metaData;

    Instant createdAt;
}
