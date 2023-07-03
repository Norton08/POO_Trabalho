public class Entregador extends Pessoa {
    Long id;
    String cnh;

    public Entregador(String CPF, String nome, String telefone, String email, String endereco, Long id, String cnh) {
        super(CPF, nome, telefone, email, endereco);
    }

    public static void cadastrar() {
    }

}
