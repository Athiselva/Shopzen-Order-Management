package com.athi.shopzen.ordermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.athi.shopzen.ordermanagement.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
