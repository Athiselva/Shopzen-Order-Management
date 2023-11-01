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

import com.athi.shopzen.ordermanagement.model.Payment;
import com.athi.shopzen.ordermanagement.service.PaymentService;

@RestController
@RequestMapping(value = "payment-management/api")
public class PaymentRestController {
	
	@Autowired
	private PaymentService paymentService;

	@PostMapping(value = "/add")
	public String addPayment(@RequestBody Payment payment) {
		payment = this.paymentService.addPayment(payment);
		return "Payment Added with Id : " + payment.getId();
	}

	@GetMapping(value = "/fetchall")
	public List<Payment> fetchAllPayments() {
		return this.paymentService.fetchAllPayments();
	}

	@GetMapping(value = "/fetch/{id}")
	public Payment fetchPaymentById(@PathVariable int id) {
		return this.paymentService.fetchPaymentById(id);
	}

	@PutMapping(value = "/update")
	public Payment updatePaymentById(@RequestBody Payment payment) {
		return this.paymentService.updatePayment(payment);
	}

	@DeleteMapping(value = "/delete/{id}")
	public String deletePaymentById(@PathVariable int id) {
		return this.paymentService.deletePaymentById(id);
	}
}
