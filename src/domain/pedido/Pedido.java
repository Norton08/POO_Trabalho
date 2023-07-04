package domain.pedido;
import enums.Status;
import jdk.jfr.Timespan;

public class Pedido {
    private static int contador;
    private int codigoPedido;
    private Timespan tempoEstimado;
    private Status status;

    public Pedido(int codigoPedido, Timespan tempoEstimado, Status status) {
        this.codigoPedido = contador++;
        this.tempoEstimado = tempoEstimado;
        this.status = status;
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
}
