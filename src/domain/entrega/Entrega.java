package domain.entrega;

import domain.cliente.Cliente;
import domain.entregador.Entregador;
import domain.pedido.Pedido;

public class Entrega {
    private static int contador = 0;
    private int codigoEntrega;
    private Pedido pedido;
    private Entregador entregador;
    private Cliente cliente;


    public Entrega(Pedido pedido, Entregador entregador, Cliente cliente) {
        this.codigoEntrega = ++contador;
        this.pedido = pedido;
        this.entregador = entregador;
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
