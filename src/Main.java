import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao 'iFood'!'");
        System.out.println("Já é cadastrado? (S/N)");
        String resposta = input.nextLine();
        if (resposta == "S" || resposta == "s") {
            Login();
            // verificar se o login e senha estão corretos
            // se estiverem, logar
            // se não, pedir para digitar novamente
        } else {
            Cadastro();
            // cadastrar o usuário
        }
        input.close();
    }

    public static void Login() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Digite seu login: ");
            String login = input.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = input.nextLine();
            if (VerificarLogin(login, senha)) {
                // logar
                input.close();
            } else {
                System.out.println("Login ou senha incorretos. Digite novamente.");
            }
        }
    }

    private static boolean VerificarLogin(String login, String senha) {
        // verificar no banco de dados se o login e senha estão corretos
        return false;
    }

    public static void Cadastro() {
        Scanner input = new Scanner(System.in);
        System.out.println("Cadastrar como: ");
        System.out.println("1 - Empresa");
        System.out.println("2 - Entregador");
        System.out.println("3 - Cliente");
        int resposta = input.nextInt();
        switch (resposta) {
            case 1:
                Comercio.cadastrar();
                break;
            case 2:
                // Entregador.cadastrar();
                break;
            case 3:
                // Pessoa.cadastrar();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        input.close();
    }

}
