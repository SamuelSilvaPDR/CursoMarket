package com.market.samuel.cursomarket.person;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

@Table(name = "Person")
@Entity(name = "Persons")
@EqualsAndHashCode(of = "id")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String address;
    private String gender;

    public Person(DadosCadastroPerson dados) {
        this.firstname = dados.firstname();
        this.lastname = dados.lastname();
        this.address = dados.address();
        this.gender = dados.gender();
    }

    public Person(Long id, String firstname, String lastname, String address, String gender) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.gender = gender;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
