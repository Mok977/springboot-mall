package com.mok.springbootmall.dao;

import com.mok.springbootmall.model.Order;
import com.mok.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer userId, List<OrderItem> orderItemList);

}
