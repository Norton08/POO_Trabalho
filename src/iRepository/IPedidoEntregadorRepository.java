package iRepository;

import domain.entregador.Entregador;
import domain.pedido.Pedido;

import java.util.ArrayList;

public interface IPedidoEntregadorRepository {
    Pedido buscarPedidoPorId(ArrayList<Pedido> pedidos, int pedidoId);
    Entregador buscarEntregadorPorId(ArrayList<Entregador> entregadores, int entregadorId);
    void adicionarPedido(ArrayList<Pedido> pedidos, Pedido pedido);
    void adicionarEntregador(ArrayList<Entregador> entregadores, Entregador entregador);
    void atribuirPedidoParaEntregador(ArrayList<Pedido> pedidos, ArrayList<Entregador> entregadores, int idPedido, int idEntregador);
    void marcarPedidoComoEntregue(ArrayList<Pedido> pedidos,int idPedido);
}
