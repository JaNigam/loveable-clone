package com.jayant.projects.lovable.entity;

import com.jayant.projects.lovable.enums.SubscriptionStatus;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class Subscription {

    Long id;

    User user;
    Plan plan;

    String stripeCustomerId;
    String stripeSubscriptionId;

    Instant currentPeriodStart;
    Instant currentPeriodEnd;

    Boolean cancelAtPeriodEnd;

    SubscriptionStatus status;

    Instant createdAt;
    Instant updatedAt;


}
