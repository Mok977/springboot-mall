package com.mok.springbootmall.service;

import com.mok.springbootmall.dto.CreateOrderRequest;
import com.mok.springbootmall.dto.OrderQueryParams;
import com.mok.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);
}
