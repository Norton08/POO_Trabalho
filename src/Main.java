import domain.cliente.Cliente;
import domain.comercio.Comercio;
import domain.endereco.Endereco;
import domain.entrega.Entrega;
import domain.entregador.Entregador;
import domain.pedido.Pedido;
import domain.produto.Produto;
import enumss.Status;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Comercio> comercios = new ArrayList<>();
        ArrayList<Endereco> enderecos = new ArrayList<>();
        ArrayList<Entregador> entregadores = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();

        //lê o banco de dados e armazena os dados em listas
        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao sistema de entregas!");
        //menu principal com os botões de cadastro, consulta e sair
        String[] opcoes = {"Cadastrar", "Consultar", "Editar", "Excluir", "Sair"};
        int opcao=0;
        while (opcao != 3) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
            switch (opcao) {
                case 0:
                    //menu de cadastro com os botões de cliente, comercio, entregador e produto
                    String[] opcoesCadastro = {"Cliente", "Comercio", "Entregador", "Produto", "Endereço", "Voltar"};
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
                            String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do comercio");
                            String razaoSocial = JOptionPane.showInputDialog("Digite a razão social do comercio");
                            String nomeFantasia = JOptionPane.showInputDialog("Digite o nome fantasia do comercio");
                            String telefoneComercio = JOptionPane.showInputDialog("Digite o telefone do comercio");
                            String emailComercio = JOptionPane.showInputDialog("Digite o email do comercio");
                            String ruaComercio = JOptionPane.showInputDialog("Digite a rua do comercio");
                            String loteComercio = JOptionPane.showInputDialog("Digite o lote do comercio");
                            String quadraComercio = JOptionPane.showInputDialog("Digite a quadra do comercio");
                            long numeroComercio = Long.parseLong(JOptionPane.showInputDialog("Digite o número do endereço do comercio"));
                            String complementoComercio = JOptionPane.showInputDialog("Digite o complemento do comercio");
                            String cepComercio = JOptionPane.showInputDialog("Digite o CEP do comercio");
                            String cidadeComercio = JOptionPane.showInputDialog("Digite a cidade do comercio");
                            Endereco enderecoComercio = new Endereco(loteComercio, quadraComercio, numeroComercio, cepComercio, complementoComercio, ruaComercio, cidadeComercio);
                            Comercio comercio = new Comercio(cnpj, razaoSocial, nomeFantasia, telefoneComercio, emailComercio, enderecoComercio);
                            JOptionPane.showMessageDialog(null, comercio);
                            break;
                        case 2:
                            //cadastrar entregador
                            String cpfEntregador = JOptionPane.showInputDialog("Digite o CPF do entregador");
                            String nomeEntregador = JOptionPane.showInputDialog("Digite o nome do entregador");
                            String telefoneEntregador = JOptionPane.showInputDialog("Digite o telefone do entregador");
                            String emailEntregador = JOptionPane.showInputDialog("Digite o email do entregador");
                            String ruaEntregador = JOptionPane.showInputDialog("Digite a rua do entregador");
                            String loteEntregador = JOptionPane.showInputDialog("Digite o lote do entregador");
                            String quadraEntregador = JOptionPane.showInputDialog("Digite a quadra do entregador");
                            long numeroEntregador = Long.parseLong(JOptionPane.showInputDialog("Digite o número do endereço do entregador"));
                            Entregador entregador = new Entregador(cpfEntregador,nomeEntregador,telefoneEntregador,
                                                                    emailEntregador,endereco,loteEntregador)
                            break;
                        case 3:
                            //cadastrar produto
                            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do produto"));
                            String nomeProduto = JOptionPane.showInputDialog("Digite o Nome do produto");
                            Produto p = new Produto(valor,nomeProduto);
                            produtos.add(p);
                            JOptionPane.showMessageDialog(null, p);
                            break;
                        case 4:
                            //cadastrar endereço
                            String ruaEndereco = JOptionPane.showInputDialog("Digite a rua do endereço");
                            String loteEndereco = JOptionPane.showInputDialog("Digite o lote do endereço");
                            String quadraEndereco = JOptionPane.showInputDialog("Digite a quadra do endereço");
                            long numeroEndereco = Long.parseLong(JOptionPane.showInputDialog("Digite o número do endereço"));
                            String complementoEndereco = JOptionPane.showInputDialog("Digite o complemento do endereço");
                            String cepEndereco = JOptionPane.showInputDialog("Digite o CEP do endereço");
                            String cidadeEndereco = JOptionPane.showInputDialog("Digite a cidade do endereço");
                            Endereco endereco1 = new Endereco(loteEndereco, quadraEndereco, numeroEndereco, cepEndereco, complementoEndereco, ruaEndereco, cidadeEndereco);
                            JOptionPane.showMessageDialog(null, endereco1);
                            break;
                        case 5:
                            //voltar
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                            break;
                    }
                    break;
                case 1:
                    //menu de consulta com os botões de cliente, comercio, entregador, produto, pedido e entrega
                    String[] opcoesConsulta = {"Cliente", "Comercio", "Entregador", "Produto", "Pedido", "Entrega", "Voltar"};
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
                        case 6:
                            //voltar
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                            break;
                    }
                    break;
                case 2:
                    //editar
                    JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
                    //menu de edição com os botões de cliente, comercio, entregador, produto, pedido e entrega
                    String[] opcoesEdicao = {"Cliente", "Comercio", "Entregador", "Produto", "Pedido", "Endereço", "Voltar"};
                    int opcaoEdicao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu de Edição",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesEdicao, opcoesEdicao[0]);
                    switch (opcaoEdicao) {
                        case 0:
                            //editar cliente
                            String cpfCliente = JOptionPane.showInputDialog("Digite o CPF do cliente");
                            for(Cliente c : clientes){
                                if(c.getCpf().equals(cpfCliente)){
                                    String[] opcoesEdicaoCliente = {"Nome", "Telefone", "Email", "Endereço", "Voltar"};
                                    int opcaoEdicaoCliente = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu de Edição de Cliente",
                                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesEdicaoCliente, opcoesEdicaoCliente[0]);
                                    switch (opcaoEdicaoCliente) {
                                        case 0:
                                            //editar nome
                                            String nomeCliente = JOptionPane.showInputDialog("Digite o novo nome do cliente");
                                            c.setNome(nomeCliente);
                                            JOptionPane.showMessageDialog(null, "Nome alterado com sucesso!");
                                            break;
                                        case 1:
                                            //editar telefone
                                            String telefoneCliente = JOptionPane.showInputDialog("Digite o novo telefone do cliente");
                                            c.setTelefone(telefoneCliente);
                                            JOptionPane.showMessageDialog(null, "Telefone alterado com sucesso!");
                                            break;
                                        case 2:
                                            //editar email
                                            String emailCliente = JOptionPane.showInputDialog("Digite o novo email do cliente");
                                            c.setEmail(emailCliente);
                                            JOptionPane.showMessageDialog(null, "Email alterado com sucesso!");
                                            break;
                                        case 3:
                                            //editar endereço
                                            String ruaCliente = JOptionPane.showInputDialog("Digite a rua do endereço");
                                            String loteCliente = JOptionPane.showInputDialog("Digite o lote do endereço");
                                            String quadraCliente = JOptionPane.showInputDialog("Digite a quadra do endereço");
                                            long numeroCliente = Long.parseLong(JOptionPane.showInputDialog("Digite o número do endereço"));
                                            String complementoCliente = JOptionPane.showInputDialog("Digite o complemento do endereço");
                                            String cepCliente = JOptionPane.showInputDialog("Digite o CEP do endereço");
                                            String cidadeCliente = JOptionPane.showInputDialog("Digite a cidade do endereço");
                                            Endereco enderecoCliente = new Endereco(loteCliente, quadraCliente, numeroCliente, cepCliente, complementoCliente, ruaCliente, cidadeCliente);
                                            c.setResidencia(enderecoCliente);
                                            JOptionPane.showMessageDialog(null, "Endereço alterado com sucesso!");
                                            break;
                                        case 4:
                                            //voltar
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                                            break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            //editar comercio
                            break;
                        case 2:
                            //editar entregador
                            break;
                        case 3:
                            //editar produto
                            break;
                        case 4:
                            //editar pedido
                            break;
                        case 5:
                            //editar endereço



                            break;
                        case 6:
                            //voltar
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                            break;
                    }
                    break;
                case 3:
                    //sair
                    JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }


//        Endereco e1 = new Endereco("lt 21", "qd 89", 123, "11111-123", "muro azul", "Rua qualquer", "Goiânia-Go");
//        Endereco e2 = new Endereco("lt 12", "qd 98", 321, "12111-114", "muro purpura", "Rua qualquer 2", "Goiânia-Go");
//        Cliente cliente = new Cliente("111.111.111-1", "Qualquer", "9998887776", "teste@teste.com", e1);
//        Comercio comercio = new Comercio("879495000178", "Qualquer SA", "Qualquer LTDA", "998298859", "qq@gmail.com", e2);
//        Entregador entregador = new Entregador("111.111.111-1", "Qualquer", "9918867876", "teste@teste.com", e1, "654987132");
//        Produto produto = new Produto(20.00, "produto qualquer");
//        Pedido pedido = new Pedido("30 minutos", Status.EmPreparo, produto, comercio);
//        Entrega entrega = new Entrega(pedido, entregador, cliente);
//        System.out.println(entrega);

        }
    }
}
