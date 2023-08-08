package com.market.samuel.cursomarket.controllers;

import com.market.samuel.cursomarket.produto.DadosCadastroProduto;
import com.market.samuel.cursomarket.produto.DadosListagemProdutos;
import com.market.samuel.cursomarket.produto.Produto;
import com.market.samuel.cursomarket.produto.ProdutoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

@PostMapping
@Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroProduto dados){
        repository.save(new Produto(dados));
    }
@GetMapping
    public List<DadosListagemProdutos> listar() {
        return repository.findAll().stream().map(DadosListagemProdutos::new).toList();
    }
}
