package domain.comercio;

import domain.endereco.Endereco;

public class Farmacia extends Comercio{

    private long codigoFarmacia;

    public Farmacia(String cnpj, String razaoSocial, String nomeFantasia, String telefone, String email, Endereco endereco, long codigoFarmacia) {
        super(cnpj, razaoSocial, nomeFantasia, telefone, email, endereco);
        this.codigoFarmacia = codigoFarmacia;
    }
}
