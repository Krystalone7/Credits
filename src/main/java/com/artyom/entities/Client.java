package com.artyom.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(schema = "credits", name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "telephone")
    private int telephone;

    @Column(name = "mail")
    private String mail;

    @Column(name = "passport")
    private int passport;

    @OneToMany(mappedBy = "client")
    List<Bank> bank;

    public Client() {
    }

    public Client(String surname, String name, String patronymic, int telephone, String mail, int passport) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.telephone = telephone;
        this.mail = mail;
        this.passport = passport;
    }
}
