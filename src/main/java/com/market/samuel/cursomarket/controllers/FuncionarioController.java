package com.market.samuel.cursomarket.controllers;

import com.market.samuel.cursomarket.funcionario.DadosCadastroFuncionario;
import com.market.samuel.cursomarket.funcionario.Funcionario;
import com.market.samuel.cursomarket.funcionario.FuncionarioRepository;
import com.market.samuel.cursomarket.produto.Produto;
import com.market.samuel.cursomarket.produto.ProdutoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarFunc(@RequestBody @Valid DadosCadastroFuncionario dados){
        repository.save(new Funcionario(dados));
    }

}
