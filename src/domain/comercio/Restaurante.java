package domain.comercio;

import domain.endereco.Endereco;

public class Restaurante extends Comercio{

    private long codigoRestaurante;

    public Restaurante(String cnpj, String razaoSocial, String nomeFantasia, String telefone, String email, Endereco endereco, long codigoRestaurante) {
        super(cnpj, razaoSocial, nomeFantasia, telefone, email, endereco);
        this.codigoRestaurante = codigoRestaurante;
    }
}
