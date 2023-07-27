package domain.comercio;

import domain.endereco.Endereco;

public class Mercado extends Comercio{

    private long codigoMercado;

    public Mercado(String cnpj, String razaoSocial, String nomeFantasia, String telefone, String email, Endereco endereco, long codigoMercado) {
        super(cnpj, razaoSocial, nomeFantasia, telefone, email, endereco);
        this.codigoMercado = codigoMercado;
    }
}
