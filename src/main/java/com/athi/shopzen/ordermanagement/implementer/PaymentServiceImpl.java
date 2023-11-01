package com.athi.shopzen.ordermanagement.implementer;

import java.sql.Timestamp;
import java.util.Date;
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
	public Payment addPayment(Payment payment) {
		Timestamp currentTimestamp = new Timestamp(new Date().getTime());
		payment.setCreatedAt(currentTimestamp);
		payment.setModifiedAt(currentTimestamp);
		return this.paymentRepository.save(payment);
	}

	@Override
	public List<Payment> fetchAllPayments() {
		return this.paymentRepository.findAll();
	}

	@Override
	public Payment fetchPaymentById(int id) {
		Optional<Payment> optionalPayment = this.paymentRepository.findById(id);
		Payment payment = null;
		if (optionalPayment.isPresent()) {
			payment = optionalPayment.get();
		}
		return payment;
	}

	@Override
	public Payment updatePayment(Payment payment) {
		return this.paymentRepository.save(payment);
	}

	@Override
	public String deletePaymentById(int id) {
		this.paymentRepository.deleteById(id);
		return "Deleted Successfully!";
	}
}
