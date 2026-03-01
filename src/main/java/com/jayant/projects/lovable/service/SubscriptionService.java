package com.jayant.projects.lovable.service;

import com.jayant.projects.lovable.dto.subscription.CheckoutRequest;
import com.jayant.projects.lovable.dto.subscription.CheckoutResponse;
import com.jayant.projects.lovable.dto.subscription.PortalResponse;
import com.jayant.projects.lovable.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
