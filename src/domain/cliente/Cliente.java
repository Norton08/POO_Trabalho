package domain.cliente;

import domain.endereco.Endereco;
import domain.pessoa.Pessoa;

import java.util.Date;

public class Cliente extends Pessoa {
    private static int contador = 0;
    private long codigoCliente;

    public Cliente(String cpf, String nome, String telefone, String email, Endereco residencia) {
        super(cpf, nome, telefone, email, residencia);
        this.codigoCliente = ++contador;
    }

    public long getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String toString() {
        return "====================" +
                "\nCliente: "+ codigoCliente +
                "\n" + nome + " - " + telefone;

    }
}
