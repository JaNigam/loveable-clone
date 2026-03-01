package com.jayant.projects.lovable.dto.member;

import com.jayant.projects.lovable.enums.ProjectRole;

public record InviteMemberRequest(String email, ProjectRole role) {
}
