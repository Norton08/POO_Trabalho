package domain.pedido;

import domain.comercio.Comercio;
import domain.produto.Produto;
import enumss.Status;
import jdk.jfr.Timespan;

import java.util.ArrayList;

public class Pedido {
    private static int contador = 0;
    private int codigoPedido;
    private Timespan tempoEstimado;
    private Status status;
    private ArrayList<Produto> produtos;
    private Comercio comercio;

    public Pedido(int codigoPedido, Timespan tempoEstimado, Status status, ArrayList<Produto> produtos, Comercio comercio) {
        this.codigoPedido = contador++;
        this.tempoEstimado = tempoEstimado;
        this.status = status;
        produtos.addAll(produtos);
        this.comercio = comercio;
    }

    public long getCodigoPedido() {
        return codigoPedido;
    }

    public Timespan getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(Timespan tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Comercio getComercio() {
        return comercio;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }
}
