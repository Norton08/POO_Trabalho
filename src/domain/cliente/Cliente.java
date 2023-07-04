package domain.cliente;

import domain.endereco.Endereco;
import domain.pessoa.Pessoa;

import java.util.Date;

public class Cliente extends Pessoa {
    private long codigoCliente;
    private String numeroCartao;
    private Date dataValidade;
    private String codigoSeguranca;
    private static int contador = 0;

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

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }
}
