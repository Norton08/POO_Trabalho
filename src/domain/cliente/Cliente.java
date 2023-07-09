package domain.cliente;

import domain.endereco.Endereco;
import domain.pessoa.Pessoa;

import java.util.Date;

public class Cliente extends Pessoa {
    private static int contador = 0;
    private long codigoCliente;
    private String numeroCartao;
    private Date dataValidade;
    private String codigoSeguranca;

    public Cliente(String cpf, String nome, String telefone, String email, Endereco residencia, String numeroCartao,
            Date dataValidade, String codigoSeguranca) {
        super(cpf, nome, telefone, email, residencia);
        this.codigoCliente = contador++;
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
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
