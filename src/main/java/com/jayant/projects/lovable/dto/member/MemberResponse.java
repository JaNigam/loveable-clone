package com.jayant.projects.lovable.dto.member;

import com.jayant.projects.lovable.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(Long id, String email, String name, String avataUrl, ProjectRole role, Instant invitedAt) {
}
