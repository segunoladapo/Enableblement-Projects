package com.cognizant.restapi.controller;

import com.cognizant.restapi.domain.OrderItem;
import com.cognizant.restapi.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//@RestController
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Void> createOrderItem(@RequestBody OrderItem orderItem) {
        orderService.saveOrderItem(orderItem);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Void> updateItem(@RequestBody OrderItem orderItem) {
        orderService.saveOrderItem(orderItem);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<OrderItem>> findOrderById(@PathVariable long id) {
        return new ResponseEntity<>(orderService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteById(@PathVariable long id) {
        orderService.deleteItemById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
