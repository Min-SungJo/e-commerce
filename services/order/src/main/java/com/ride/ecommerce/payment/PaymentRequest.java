package com.ride.ecommerce.payment;

import com.ride.ecommerce.customer.CustomerResponse;
import com.ride.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
