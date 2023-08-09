package com.market.samuel.cursomarket.funcionario;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import java.time.LocalDate;


@Table(name = "funcionario")
@Entity(name = "funcionarios")
@EqualsAndHashCode(of = "id")
public class Funcionario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cpf;
    @Enumerated(EnumType.STRING)
    private Atua atua;
    private LocalDate data_Nasc;
    private String telefone;

    public Funcionario() {
    }

    public Funcionario(long id, String nome, String cpf, Atua atua, LocalDate dataNasc, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.atua = atua;
        this.data_Nasc = dataNasc;
        this.telefone = telefone;
    }

    public Funcionario(DadosCadastroFuncionario dados) {
        this.nome= dados.nome();
        this.cpf= dados.cpf();
        this.atua=dados.atua();
        this.data_Nasc=dados.data_Nasc();
        this.telefone=dados.telefone();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Atua getAtua() {
        return atua;
    }

    public void setAtua(Atua atua) {
        this.atua = atua;
    }

    public LocalDate getDataNasc() {
        return data_Nasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.data_Nasc = data_Nasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
