package com.artyom.dto;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class PaymentSchedule {
    private List<Payment> payments = new ArrayList<>();

    public PaymentSchedule() {
    }

    public PaymentSchedule(List<Payment> payments) {
        this.payments = payments;
    }

    public void addPayment(Payment payment){
        payments.add(payment);
    }
}
