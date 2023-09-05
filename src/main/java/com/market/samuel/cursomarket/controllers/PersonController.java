package com.market.samuel.cursomarket.controllers;


import com.market.samuel.cursomarket.funcionario.DadosCadastroFuncionario;
import com.market.samuel.cursomarket.funcionario.Funcionario;
import com.market.samuel.cursomarket.funcionario.FuncionarioRepository;
import com.market.samuel.cursomarket.person.DadosCadastroPerson;
import com.market.samuel.cursomarket.person.Person;
import com.market.samuel.cursomarket.person.PersonRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarPerson(@RequestBody @Valid DadosCadastroPerson dados){
        repository.save(new Person(dados));
    }
}
