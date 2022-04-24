package com.artyom.dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Payment {
    private final LocalDate date;
    private final int sum;
    private final int loanPay;
    private final int interestPay;

    public Payment(LocalDate date, int sum, int loanPay, int interestPay) {
        this.date = date;
        this.sum = sum;
        this.loanPay = loanPay;
        this.interestPay = interestPay;
    }
}
