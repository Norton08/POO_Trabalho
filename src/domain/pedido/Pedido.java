package domain.pedido;

import domain.comercio.Comercio;
import domain.produto.Produto;
import enumss.Status;
//import jdk.jfr.Timespan;

public class Pedido {
    private static int contador = 0;
    private int codigoPedido;
    private String tempoEstimado;
    private Status status;
    private Produto produto;
    private Comercio comercio;

    public Pedido(String tempoEstimado, Status status, Produto produto, Comercio comercio) {
        this.codigoPedido = ++contador;
        this.tempoEstimado = tempoEstimado;
        this.status = status;
        this.produto = produto;
        this.comercio = comercio;
    }

    public long getCodigoPedido() {
        return codigoPedido;
    }

    public String getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(String tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produtos) {
        this.produto = produtos;
    }

    public Comercio getComercio() {
        return comercio;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }

    @Override
    public String toString() {
        return "Pedido: " + codigoPedido +
                "\nTempo Estimado = " + tempoEstimado + " - " + status +
                "\n====================";
    }
}
