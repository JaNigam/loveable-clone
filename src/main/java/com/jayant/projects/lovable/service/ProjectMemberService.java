package com.jayant.projects.lovable.service;

import com.jayant.projects.lovable.dto.member.InviteMemberRequest;
import com.jayant.projects.lovable.dto.member.MemberResponse;
import com.jayant.projects.lovable.entity.ProjectMember;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
