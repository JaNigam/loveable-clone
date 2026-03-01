package com.jayant.projects.lovable.entity;

import com.jayant.projects.lovable.enums.MessageRole;
import lombok.Data;

import java.time.Instant;

@Data
public class ChatMessage {
    Long id;
    ChatSession chatSession;

    String content;
    String toolCall;

    MessageRole role;

    Integer tokensUsed;
    Instant createdAt;


}
