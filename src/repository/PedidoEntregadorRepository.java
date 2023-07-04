package repository;

import domain.entregador.Entregador;
import domain.pedido.Pedido;
import enums.Status;
import iRepository.IPedidoEntregadorRepository;

import java.util.ArrayList;

public class PedidoEntregadorRepository implements IPedidoEntregadorRepository {
    @Override
    public Pedido buscarPedidoPorId(ArrayList<Pedido> pedidos, int pedidoId) {
        for (Pedido pedido : pedidos) {
            if (pedido.getCodigoPedido() == pedidoId) {
                return pedido;
            }
        }
        return null;
    }

    @Override
    public Entregador buscarEntregadorPorId(ArrayList<Entregador> entregadores, int entregadorId) {
        return null;
    }

    @Override
    public void adicionarPedido(ArrayList<Pedido> pedidos, Pedido pedido) {
        pedidos.add(pedido);
    }

    @Override
    public void adicionarEntregador(ArrayList<Entregador> entregadores, Entregador entregador) {
        entregadores.add(entregador);
    }

    @Override
    public void atribuirPedidoParaEntregador(ArrayList<Pedido> pedidos, ArrayList<Entregador> entregadores,  int idPedido, int idEntregador) {
        Pedido pedido = buscarPedidoPorId(pedidos ,idPedido);
        Entregador entregador = buscarEntregadorPorId(entregadores,idEntregador);

        if (pedido != null && entregador != null && entregador.isDisponivel()) {
            pedido.setStatus(Status.EmPreparo);
            entregador.setDisponivel(false);
            System.out.println("Pedido " + idPedido + " atribuído ao entregador " + idEntregador);
        } else {
            System.out.println("Não foi possível atribuir o pedido ao entregador.");
        }
    }

    @Override
    public void marcarPedidoComoEntregue(ArrayList<Pedido> pedidos,int idPedido) {
        Pedido pedido = buscarPedidoPorId(pedidos, idPedido);

        if (pedido != null) {
            pedido.setStatus(Status.Entregue);
            System.out.println("Pedido " + idPedido + " marcado como entregue.");
        } else {
            System.out.println("Pedido não encontrado.");
        }
    }
}
