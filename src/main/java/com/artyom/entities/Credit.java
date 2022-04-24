package com.artyom.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(schema = "credits", name = "credits")
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "credit_limit")
    private int creditLimit;

    @Column(name = "interest_rate")
    private int interestRate;

    @OneToMany(mappedBy = "credit")
    List<Bank> bank;

    public Credit(int creditLimit, int interestRate) {
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }

    public Credit() {
    }
}
