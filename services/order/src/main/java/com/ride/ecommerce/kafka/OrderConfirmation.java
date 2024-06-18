package com.ride.ecommerce.kafka;

import com.ride.ecommerce.customer.CustomerResponse;
import com.ride.ecommerce.order.PaymentMethod;
import com.ride.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
