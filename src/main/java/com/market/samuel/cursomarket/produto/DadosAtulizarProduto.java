package com.market.samuel.cursomarket.produto;

import jakarta.validation.constraints.NotNull;

public record DadosAtulizarProduto(
        @NotNull
        Long id,
        String nome,
        Tipo tipo) {
}
