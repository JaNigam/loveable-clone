package com.jayant.projects.lovable.service;

import com.jayant.projects.lovable.dto.auth.AuthResponse;
import com.jayant.projects.lovable.dto.auth.LoginRequest;
import com.jayant.projects.lovable.dto.auth.SignupRequest;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    AuthResponse signup(SignupRequest request);
    AuthResponse login(LoginRequest request);
}
