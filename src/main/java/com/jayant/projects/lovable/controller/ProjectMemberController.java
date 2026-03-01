package com.jayant.projects.lovable.controller;


import com.jayant.projects.lovable.dto.member.InviteMemberRequest;
import com.jayant.projects.lovable.dto.member.MemberResponse;
import com.jayant.projects.lovable.entity.ProjectMember;
import com.jayant.projects.lovable.service.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/members")
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;

    @GetMapping
    public ResponseEntity<List<ProjectMember>> getProjectMembers(@PathVariable long projectId) {
        Long userId = 1L; // This should be obtained from the authenticated user context
        return ResponseEntity.ok(projectMemberService.getProjectMembers(projectId, userId));
    }

    @PostMapping
    ResponseEntity<MemberResponse> inviteMember(@PathVariable Long projectId, @RequestBody InviteMemberRequest request) {
        Long userId = 1L; // This should be obtained from the authenticated user context
        return ResponseEntity.ok(projectMemberService.inviteMember(projectId, request, userId));
    }

    @PatchMapping("/{memberId}")
    ResponseEntity<MemberResponse> updateMemberRole(@PathVariable Long projectId, @PathVariable Long memberId, @RequestBody InviteMemberRequest request) {
        Long userId = 1L; // This should be obtained from the authenticated user context
        return ResponseEntity.ok(projectMemberService.updateMemberRole(projectId, memberId, request, userId));
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(
            @PathVariable Long projectId,
            @PathVariable Long memberId
    ) {
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.deleteProjectMember(projectId, memberId, userId));
    }


}
