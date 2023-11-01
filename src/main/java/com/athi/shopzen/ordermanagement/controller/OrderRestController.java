package com.athi.shopzen.ordermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.athi.shopzen.ordermanagement.model.Order;
import com.athi.shopzen.ordermanagement.service.OrderService;

/**
 * @author athiselvam.n
 *
 */
@RestController
@RequestMapping("/order-management/api")
public class OrderRestController {

	@Autowired
	private OrderService orderService;

	/**
	 * @param Order
	 * @return
	 */
	@PostMapping(value = "/add")
	public String addOrder(@RequestBody Order order) {
		order = this.orderService.addOrder(order);
		return "Order Added with Id : " + order.getId();
	}

	/**
	 * @return
	 */
	@GetMapping(value = "/fetchall")
	public List<Order> fetchAllOrders() {
		return this.orderService.fetchAllOrders();
	}

	/**
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/fetch/{id}")
	public Order fetchOrderById(@PathVariable int id) {
		return this.orderService.fetchOrderById(id);
	}

	/**
	 * @param Order
	 * @return
	 */
	@PutMapping(value = "/update")
	public Order updateOrderById(@RequestBody Order order) {
		return this.orderService.updateOrder(order);
	}

	/**
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/delete/{id}")
	public String deleteOrderById(@PathVariable int id) {
		return this.orderService.deleteOrderById(id);
	}
}
