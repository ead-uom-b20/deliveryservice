package com.lambda.deliveryservice.service;

import com.lambda.deliveryservice.domain.OrderDomain;
import com.lambda.deliveryservice.dto.ResponseDto;

public interface OrderService {
    ResponseDto addNewOrder(OrderDomain orderDomain);
    ResponseDto getOrderById(Long id);
    ResponseDto getOrdersByCustomerId(Long customerId);
    ResponseDto getAllOrders();
    ResponseDto getAllOrdersByStatus(String status);
}
