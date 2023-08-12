import domain.cliente.Cliente;
import domain.comercio.Comercio;
import domain.endereco.Endereco;
import domain.entrega.Entrega;
import domain.entregador.Entregador;
import domain.pedido.Pedido;
import domain.produto.Produto;
import enumss.Status;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao sistema de entregas!");
        //menu principal com os botões de cadastro, consulta e sair
        String[] opcoes = {"Cadastrar", "Consultar", "Sair"};
        int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu Principal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        switch (opcao) {
            case 0:
                //menu de cadastro com os botões de cliente, comercio, entregador e produto
                String[] opcoesCadastro = {"Cliente", "Comercio", "Entregador", "Produto"};
                int opcaoCadastro = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu de Cadastro",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesCadastro, opcoesCadastro[0]);
                switch (opcaoCadastro) {
                    case 0:
                        //cadastrar cliente com endereço
                        String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente");
                        String nome = JOptionPane.showInputDialog("Digite o nome do cliente");
                        String telefone = JOptionPane.showInputDialog("Digite o telefone do cliente");
                        String email = JOptionPane.showInputDialog("Digite o email do cliente");
                        String rua = JOptionPane.showInputDialog("Digite a rua do cliente");
                        String lote = JOptionPane.showInputDialog("Digite o lote do cliente");
                        String quadra = JOptionPane.showInputDialog("Digite a quadra do cliente");
                        long numero = Long.parseLong(JOptionPane.showInputDialog("Digite o número do endereço do cliente"));
                        String complemento = JOptionPane.showInputDialog("Digite o complemento do cliente");
                        String cep = JOptionPane.showInputDialog("Digite o CEP do cliente");
                        String cidade = JOptionPane.showInputDialog("Digite a cidade do cliente");
                        Endereco endereco = new Endereco(lote, quadra, numero, cep, complemento, rua, cidade);
                        Cliente cliente = new Cliente(cpf, nome, telefone, email, endereco);
                        JOptionPane.showMessageDialog(null, cliente);
                        break;
                    case 1:
                        //cadastrar comercio
                        break;
                    case 2:
                        //cadastrar entregador
                        break;
                    case 3:
                        //cadastrar produto
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                        break;
                }
                break;
            case 1:
                //menu de consulta com os botões de cliente, comercio, entregador, produto, pedido e entrega
                String[] opcoesConsulta = {"Cliente", "Comercio", "Entregador", "Produto", "Pedido", "Entrega"};
                int opcaoConsulta = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu de Consulta",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesConsulta, opcoesConsulta[0]);
                switch (opcaoConsulta) {
                    case 0:
                        //consultar cliente
                        break;
                    case 1:
                        //consultar comercio
                        break;
                    case 2:
                        //consultar entregador
                        break;
                    case 3:
                        //consultar produto
                        break;
                    case 4:
                        //consultar pedido
                        break;
                    case 5:
                        //consultar entrega
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                        break;
                }
                break;
            case 2:
                //sair
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
        }



        Endereco e1 = new Endereco("lt 21", "qd 89", 123, "11111-123", "muro azul", "Rua qualquer", "Goiânia-Go");
        Endereco e2 = new Endereco("lt 12", "qd 98", 321, "12111-114", "muro purpura", "Rua qualquer 2", "Goiânia-Go");
        Cliente cliente = new Cliente("111.111.111-1", "Qualquer", "9998887776", "teste@teste.com", e1);
        Comercio comercio = new Comercio("879495000178", "Qualquer SA", "Qualquer LTDA", "998298859", "qq@gmail.com",
                e2);
        Entregador entregador = new Entregador("111.111.111-1", "Qualquer", "9918867876", "teste@teste.com", e1,
                "654987132");
        Produto produto = new Produto(20.00, "produto qualquer");
        Pedido pedido = new Pedido("30 minutos", Status.EmPreparo, produto, comercio);
        Entrega entrega = new Entrega(pedido, entregador, cliente);
        System.out.println(entrega);

    }
}
