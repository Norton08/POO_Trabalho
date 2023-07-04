public class Entregador extends Pessoa {
    Long id;
    String cnh;
    static int contador = 0;

    public Entregador(String CPF, String nome, String telefone, String email, String endereco, String cnh) {
        super(CPF, nome, telefone, email, endereco);
        this.id = (long) contador++;
    }

    public static void cadastrar() {
    }

}
