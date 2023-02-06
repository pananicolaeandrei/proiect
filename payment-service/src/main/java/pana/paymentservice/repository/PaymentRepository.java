package pana.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pana.paymentservice.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
