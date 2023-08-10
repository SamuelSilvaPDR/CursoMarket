package com.market.samuel.cursomarket.controllers;

import com.market.samuel.cursomarket.funcionario.DadosCadastroFuncionario;
import com.market.samuel.cursomarket.funcionario.DadosListagemFuncionario;
import com.market.samuel.cursomarket.funcionario.Funcionario;
import com.market.samuel.cursomarket.funcionario.FuncionarioRepository;
import com.market.samuel.cursomarket.produto.DadosListagemProdutos;
import com.market.samuel.cursomarket.produto.Produto;
import com.market.samuel.cursomarket.produto.ProdutoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
    @GetMapping
    public List<DadosListagemFuncionario> listar() {
        return repository.findAll().stream().map(DadosListagemFuncionario::new).toList();
    }

}
