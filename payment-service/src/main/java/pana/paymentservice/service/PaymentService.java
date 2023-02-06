package pana.paymentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pana.paymentservice.repository.PaymentRepository;
import pana.paymentservice.entity.Payment;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment doPay(Payment payment){
        payment.setPaymentStatus(paymentStatus());
        payment.setTxId(UUID.randomUUID().toString());
        return repository.save(payment);
    }

    private String paymentStatus(){
        //mocking a 3rd party payment call like Gpay,Paytm,etc.
        return "succes";
//        return new Random().nextBoolean()?"success":"failure";
    }
}
