package com.athi.shopzen.ordermanagement.implementer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.athi.shopzen.ordermanagement.model.Order;
import com.athi.shopzen.ordermanagement.repository.OrderRepository;
import com.athi.shopzen.ordermanagement.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order addOrder(Order Order) {
		return this.orderRepository.save(Order);
	}

	@Override
	public List<Order> fetchAllOrders() {
		return this.orderRepository.findAll();
	}

	@Override
	public Order fetchOrderById(int id) {
		Optional<Order> optionalOrder = this.orderRepository.findById(id);
		Order Order = null;
		if (optionalOrder.isPresent()) {
			Order = optionalOrder.get();
		}
		return Order;
	}

	@Override
	public Order updateOrder(Order Order) {
		return this.orderRepository.save(Order);
	}

	@Override
	public String deleteOrderById(int id) {
		this.orderRepository.deleteById(id);
		return "Deleted Successfully!";
	}
}
