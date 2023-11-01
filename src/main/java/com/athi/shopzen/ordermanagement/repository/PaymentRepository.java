package com.athi.shopzen.ordermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.athi.shopzen.ordermanagement.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
