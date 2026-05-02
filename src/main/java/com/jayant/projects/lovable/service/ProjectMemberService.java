package com.jayant.projects.lovable.service;

import com.jayant.projects.lovable.dto.member.InviteMemberRequest;
import com.jayant.projects.lovable.dto.member.MemberResponse;
import com.jayant.projects.lovable.dto.member.UpdateMemberRoleRequest;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
