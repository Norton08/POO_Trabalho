import domain.cliente.Cliente;
import domain.comercio.Comercio;
import domain.endereco.Endereco;
import domain.entrega.Entrega;
import domain.entregador.Entregador;
import domain.pedido.Pedido;
import domain.produto.Produto;
import enumss.Status;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Endereco e1 = new Endereco("lt 21", "qd 89",123, "11111-123","muro azul", "Rua qualquer", "Goiânia-Go");
        Endereco e2 = new Endereco("lt 12", "qd 98",321, "12111-114","muro purpura", "Rua qualquer 2", "Goiânia-Go");

        Cliente cliente = new Cliente("111.111.111-1", "Qualquer", "9998887776", "teste@teste.com", e1);

        Comercio comercio = new Comercio("879495000178", "qualquer SA", "Qualquer LTDA", "998298859","qq@gmail.com", e2);

        Entregador entregador = new Entregador("111.111.111-1", "Qualquer", "9998887776", "teste@teste.com", e1, "654987132");

        Produto produto = new Produto(20.00, "produto qualquer");

        Pedido pedido = new Pedido("30 minutos", Status.EmPreparo, produto, comercio);

        Entrega entrega = new Entrega(pedido,entregador,cliente);

        System.out.println(entrega);
    }
}
