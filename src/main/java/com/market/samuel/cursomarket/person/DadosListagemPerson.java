package com.market.samuel.cursomarket.person;

public record DadosListagemPerson(
        String firstname,
        String lastname,
        String address
) {
    public DadosListagemPerson(Person person) {
        this(person.getFirstname(), person.getLastname(), person.getAddress());
    }
}
