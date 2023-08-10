package com.market.samuel.cursomarket.funcionario;

public record DadosListagemFuncionario(
        String nome,
        Atua atua
) {
    public DadosListagemFuncionario(Funcionario funcionario) {
        this(funcionario.getNome(),funcionario.getAtua());
    }
}
