package com.lambda.deliveryservice.repository;


import com.lambda.deliveryservice.domain.OrderDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<OrderDomain, Long> {
    List<OrderDomain> findAllByUserId(Long id);
    List<OrderDomain> findAllByStatus(String status);
}
