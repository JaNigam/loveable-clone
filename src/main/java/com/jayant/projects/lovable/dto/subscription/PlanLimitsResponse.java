package com.jayant.projects.lovable.dto.subscription;

public record PlanLimitsResponse(
        Integer planName,
        Integer maxTokensPerDay,
        Integer maxProjects,
        Integer unlimitedAi
) {
}