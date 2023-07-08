package domain.entrega;

import domain.cliente.Cliente;
import domain.entregador.Entregador;
import domain.pedido.Pedido;
import domain.produto.Produto;

import java.util.ArrayList;

public class Entrega {
    private Pedido pedido;
    private Entregador entregador;
    private Cliente cliente;

    public Entrega(Pedido pedido, Entregador entregador, Cliente cliente) {
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
