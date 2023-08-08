package com.market.samuel.cursomarket.produto;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.Filter;

import java.time.LocalDate;

public record DadosCadastroProduto(

        @NotBlank
        String nome,
        @NotBlank
        String peso,
        @Enumerated
        Tipo tipo,
        int valor,
        @Future
        LocalDate validade) {
}
