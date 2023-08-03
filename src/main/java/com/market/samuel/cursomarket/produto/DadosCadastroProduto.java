package com.market.samuel.cursomarket.produto;

public record DadosCadastroProduto(
        String nome,
        String peso,
        Tipo tipo,
        String valor,
        String validade) {
}
