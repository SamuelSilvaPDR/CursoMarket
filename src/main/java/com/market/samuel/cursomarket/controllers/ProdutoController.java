package com.market.samuel.cursomarket.controllers;

import com.market.samuel.cursomarket.produto.DadosCadastroProduto;
import com.market.samuel.cursomarket.produto.Produto;
import com.market.samuel.cursomarket.produto.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

@PostMapping
    public void cadastrar(@RequestBody DadosCadastroProduto dados){
        repository.save(new Produto(dados));
    }
}
