package com.jayant.projects.lovable.entity;

import com.jayant.projects.lovable.enums.MessageRole;

import java.time.Instant;

public class ChatMessage {
    Long id;
    ChatSession chatSession;

    String content;
    String toolCall;

    MessageRole role;

    Integer tokensUsed;
    Instant createdAt;


}
