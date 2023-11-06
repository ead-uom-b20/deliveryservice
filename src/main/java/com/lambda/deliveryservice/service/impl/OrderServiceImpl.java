package com.lambda.deliveryservice.service.impl;

import com.lambda.deliveryservice.repository.OrderRepository;
import com.lambda.deliveryservice.utils.ServiceUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl {
    private final OrderRepository orderRepository;
    private final ServiceUtil serviceUtil;
}
