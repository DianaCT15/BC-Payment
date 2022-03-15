package service;

import model.Payment;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PaymentService {
    Mono<Payment> createPayment(Payment p);
    Mono<Payment> updatePayment(Payment p);
    Mono<Payment> findByPaymentId(Integer id);
    Flux<Payment> findAllByCreditId(Integer id);
    Mono<Void> deletePayment(Integer id);
}