package com.jayant.projects.lovable.dto.subscription;

import com.jayant.projects.lovable.dto.auth.UserProfileResponse;

import java.time.Instant;

public record PortalResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
