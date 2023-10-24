package com.market.samuel.cursomarket.funcionario;

public record DadosListagemFuncionario(
        Long id,
        String nome,
        Atua atua
) {
    public DadosListagemFuncionario(Funcionario funcionario) {
        this(funcionario.getId(), funcionario.getNome(),funcionario.getAtua());
    }
}
