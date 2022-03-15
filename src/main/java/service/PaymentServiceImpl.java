package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import model.Payment;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
    PaymentRepository paymentRepository;

	@Override
	public Mono<Payment> createPayment(Payment p) {
		return paymentRepository.save(p);
	}

	@Override
	public Mono<Payment> updatePayment(Payment p) {
		return paymentRepository.save(p);
	}

	@Override
	public Mono<Payment> findByPaymentId(Integer id) {
		return paymentRepository.findById(id).switchIfEmpty(Mono.empty());
	}

	@Override
	public Flux<Payment> findAllByCreditId(Integer id) {
		return paymentRepository.findAll(Sort.by(String.valueOf(id)));
	}

	@Override
	public Mono<Void> deletePayment(Integer id) {
		return paymentRepository.deleteById(id);
	}

}
