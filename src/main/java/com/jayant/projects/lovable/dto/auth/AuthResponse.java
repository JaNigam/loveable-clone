package com.jayant.projects.lovable.dto.auth;


//record means this is immuatable and cannot be changed
public record AuthResponse(String token, UserProfileResponse user) {
}
