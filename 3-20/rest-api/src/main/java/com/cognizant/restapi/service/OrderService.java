package com.cognizant.restapi.service;

import com.cognizant.restapi.domain.OrderItem;
import com.cognizant.restapi.repository.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    private OrderItemRepository orderItemRepository;

    public OrderService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public void saveOrderItem(OrderItem orderItem) {
        orderItemRepository.save(orderItem);
    }

    public Optional<OrderItem> findById(long id) {
        return orderItemRepository.findById(id);
    }

    public void deleteItemById(Long id) {
        orderItemRepository.deleteById(id);
    }
}
