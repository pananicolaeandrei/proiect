package pana.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pana.paymentservice.repository.PaymentRepository;
import pana.paymentservice.entity.Payment;
import pana.paymentservice.service.PaymentService;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    public PaymentService service;

    @Autowired
    public PaymentRepository paymentRepository;

    @PostMapping("/doPay/")
    public Payment doPayment(@RequestBody Payment payment){
        return service.doPay(payment);
    }

    @GetMapping()
    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }
}
