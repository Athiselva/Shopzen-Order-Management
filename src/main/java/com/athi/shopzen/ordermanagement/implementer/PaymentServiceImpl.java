package com.athi.shopzen.ordermanagement.implementer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.athi.shopzen.ordermanagement.model.Payment;
import com.athi.shopzen.ordermanagement.repository.PaymentRepository;
import com.athi.shopzen.ordermanagement.service.PaymentService;

/**
 * @author athiselvam.n
 *
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public Payment addPayment(Payment Payment) {
		return this.paymentRepository.save(Payment);
	}

	@Override
	public List<Payment> fetchAllPayments() {
		return this.paymentRepository.findAll();
	}

	@Override
	public Payment fetchPaymentById(int id) {
		Optional<Payment> optionalPayment = this.paymentRepository.findById(id);
		Payment Payment = null;
		if (optionalPayment.isPresent()) {
			Payment = optionalPayment.get();
		}
		return Payment;
	}

	@Override
	public Payment updatePayment(Payment Payment) {
		return this.paymentRepository.save(Payment);
	}

	@Override
	public String deletePaymentById(int id) {
		this.paymentRepository.deleteById(id);
		return "Deleted Successfully!";
	}
}
