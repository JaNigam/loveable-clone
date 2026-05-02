package com.jayant.projects.lovable.service;

import com.jayant.projects.lovable.dto.subscription.PlanLimitsResponse;
import com.jayant.projects.lovable.dto.subscription.UsageTodayResponse;
import org.springframework.stereotype.Service;

@Service
public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
