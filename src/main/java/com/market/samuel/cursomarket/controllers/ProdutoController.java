package com.market.samuel.cursomarket.controllers;

import com.market.samuel.cursomarket.produto.*;
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

@PutMapping
@Transactional
    public void atualizar(@RequestBody @Valid DadosAtulizarProduto dados){
        var produto = repository.getReferenceById(dados.id());
        produto.atualizarProduto(dados);
}
}
