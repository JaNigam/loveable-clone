package com.jayant.projects.lovable.dto.subscription;


public record UsageTodayResponse(
        int tokensUsed,
        int tokensLimit,
        int previewsRunning,
        int previewsLimit
) {
}
