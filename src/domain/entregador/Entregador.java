package domain.entregador;

import domain.endereco.Endereco;
import domain.pessoa.Pessoa;

public class Entregador extends Pessoa {
    private long codigoEntregador;
    private String cnh;
    private boolean isDisponivel;
    public Entregador(String cpf, String nome, String telefone, String email, Endereco endereco, long codigoEntregador, String cnh) {
        super(cpf, nome, telefone, email, endereco);
        this.codigoEntregador = codigoEntregador;
        this.cnh = cnh;
        this.isDisponivel = true;
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

    public boolean isDisponivel() {
        return isDisponivel;
    }

    public void setDisponivel(boolean disponivel) {
        isDisponivel = disponivel;
    }
}
