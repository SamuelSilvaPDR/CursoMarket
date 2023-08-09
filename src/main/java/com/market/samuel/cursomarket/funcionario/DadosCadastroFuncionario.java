package com.market.samuel.cursomarket.funcionario;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import org.springframework.format.annotation.NumberFormat;

import java.time.LocalDate;

public record DadosCadastroFuncionario(
        @NotBlank
        String nome,
        @NotBlank
        String cpf,
        @Enumerated
        Atua atua,
        @Past
        LocalDate data_Nasc,
        @NotBlank
        @NumberFormat
        String telefone
) {
}
