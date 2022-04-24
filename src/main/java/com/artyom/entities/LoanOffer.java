package com.artyom.entities;

import com.artyom.dto.PaymentSchedule;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(schema = "credits", name = "loan_offers")
public class LoanOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "credit_id", referencedColumnName = "id")
    private Credit credit;

    @Column(name = "loan_sum")
    private int loanSum;

    //payment schedule

    public LoanOffer(Client client, Credit credit, int loanSum) {
        this.client = client;
        this.credit = credit;
        this.loanSum = loanSum;
    }

    public LoanOffer() {
    }

    public LoanOffer(int loanSum) {
        this.loanSum = loanSum;
    }
}
