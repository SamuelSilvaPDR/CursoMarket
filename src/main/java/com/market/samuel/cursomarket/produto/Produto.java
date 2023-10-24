package com.market.samuel.cursomarket.produto;

import com.market.samuel.cursomarket.funcionario.DadosCadastroFuncionario;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;


@Table(name = "produto")
@Entity(name = "produtos")
@EqualsAndHashCode(of = "id")
public class Produto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String peso;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private int valor;
    private LocalDate validade;

    public Produto(DadosCadastroProduto dados) {
        this.nome=dados.nome();
        this.peso= dados.peso();
        this.tipo=dados.tipo();
        this.valor=dados.valor();
        this.validade= dados.validade();
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

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public Produto(long id, String nome, String peso, Tipo tipo, int valor, LocalDate validade) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.tipo = tipo;
        this.valor = valor;
        this.validade = validade;
    }

    public Produto() {
    }

    public void atualizarProduto(DadosAtulizarProduto dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.tipo() != null) {
            this.tipo = dados.tipo();
        }
    }
}
