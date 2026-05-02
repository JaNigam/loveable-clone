package com.jayant.projects.lovable.service;

import com.jayant.projects.lovable.dto.auth.UserProfileResponse;
import org.springframework.stereotype.Component;


@Component
public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
