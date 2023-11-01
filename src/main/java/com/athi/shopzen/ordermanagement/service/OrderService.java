package com.athi.shopzen.ordermanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.athi.shopzen.ordermanagement.model.Order;

@Service
public interface OrderService {

	public Order addOrder(Order Order);

	public List<Order> fetchAllOrders();

	public Order fetchOrderById(int id);

	public Order updateOrder(Order Order);

	public String deleteOrderById(int id);
}
