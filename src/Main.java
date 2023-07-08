import domain.comercio.Comercio;
import java.util.Scanner;

public class Main {
    private static boolean LoginOn = false;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao 'iFood'!'");
        int option = 0;
        while (option != 3) {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Fazer pedido");
            System.out.println("2 - Ver pedidos");
            System.out.println("3 - Sair");
            option = input.nextInt();
            switch (option) {
                case 1:
                    // listar todos os produtos da lista de produtos
                    // escolher o produto
                    break;
                case 2:
                    // ver pedidos
                    break;
                case 3:
                    // sair
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        input.close();
    }
}
