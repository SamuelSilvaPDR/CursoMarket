package com.market.samuel.cursomarket.produto;

public record  DadosListagemProdutos(String nome, Tipo tipo) {

    public DadosListagemProdutos(Produto produto){
        this(produto.getNome(), produto.getTipo());
    }
}
