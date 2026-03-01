package com.jayant.projects.lovable.entity;

import lombok.Data;

import java.time.Instant;


@Data
public class ChatSession {
    Project project;
    User user;

    String title;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;


}
