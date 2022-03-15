package repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import model.Payment;

@Repository
public interface PaymentRepository extends ReactiveMongoRepository<Payment, Integer> {
}
