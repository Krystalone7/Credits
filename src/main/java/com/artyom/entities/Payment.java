package com.artyom.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(schema = "credits", name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "sum")
    private double sum;

    @Column(name = "body_pay")
    private double loanPay;

    @Column(name = "interest_pay")
    private double interestPay;

    public Payment(LocalDate date, double sum, double loanPay, double interestPay) {
        this.date = date;
        this.sum = sum;
        this.loanPay = loanPay;
        this.interestPay = interestPay;
    }

    public Payment() {
    }
}
