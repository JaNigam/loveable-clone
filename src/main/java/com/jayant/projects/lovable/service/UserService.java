package com.jayant.projects.lovable.service;

import com.jayant.projects.lovable.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
