package com.jayant.projects.lovable.service;

import com.jayant.projects.lovable.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
