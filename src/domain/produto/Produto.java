package domain.produto;

import java.util.ArrayList;

public class Produto {
    private double valor;
    private String nome;
    private String descricao;
    private ArrayList<String> comentarios;
    private long codigoProduto;
    private static int contador = 0;

    public Produto(double valor, String nome, String descricao, ArrayList<String> comentarios) {
        this.valor = valor;
        this.nome = nome;
        this.descricao = descricao;
        this.comentarios = comentarios;
        this.codigoProduto = contador++;
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
