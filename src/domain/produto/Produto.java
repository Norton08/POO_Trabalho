package domain.produto;

import java.util.ArrayList;

public class Produto {
    private static int contador = 0;
    private long codigoProduto;
    private double valor;
    private String nome;

    public Produto(double valor, String nome) {
        this.codigoProduto = contador++;
        this.valor = valor;
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public long getCodigoProduto() {
        return codigoProduto;
    }
}
