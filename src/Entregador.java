import java.util.Date;

public class Entregador extends Pessoa {
    private long codigoEntregador;
    private String cnh;

    public Entregador(String cpf, String nome, String telefone, String email, Endereco residencia,
            long codigoEntregador, String cnh) {
        super(cpf, nome, telefone, email, residencia);
        this.codigoEntregador = codigoEntregador;
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
