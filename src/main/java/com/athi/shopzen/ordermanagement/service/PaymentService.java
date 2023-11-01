package com.athi.shopzen.ordermanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.athi.shopzen.ordermanagement.model.Payment;

@Service
public interface PaymentService {
	
	public Payment addPayment(Payment Payment);

	public List<Payment> fetchAllPayments();

	public Payment fetchPaymentById(int id);

	public Payment updatePayment(Payment Payment);

	public String deletePaymentById(int id);
}
