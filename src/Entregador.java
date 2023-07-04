
public class Entregador extends Pessoa {
    private long codigoEntregador;
    private String cnh;
    private static long contador = 0;

    public Entregador(String cpf, String nome, String telefone, String email, Endereco residencia, String cnh) {
        super(cpf, nome, telefone, email, residencia);
        this.codigoEntregador = contador++;
        this.cnh = cnh;
    }

    public long getCodigoEntregador() {
        return codigoEntregador;
    }

    public void setCodigoEntregador(long codigoEntregador) {
        this.codigoEntregador = codigoEntregador;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
