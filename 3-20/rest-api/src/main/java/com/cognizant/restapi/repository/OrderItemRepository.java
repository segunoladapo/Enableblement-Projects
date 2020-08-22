package com.cognizant.restapi.repository;

import com.cognizant.restapi.domain.OrderItem;
import org.springframework.data.repository.CrudRepository;

public interface OrderItemRepository extends CrudRepository<OrderItem, Long> {
}
