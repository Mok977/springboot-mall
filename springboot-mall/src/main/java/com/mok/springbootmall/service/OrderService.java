package com.mok.springbootmall.service;

import com.mok.springbootmall.dto.CreateOrderRequest;
import com.mok.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
