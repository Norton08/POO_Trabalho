package domain.comercio;

import domain.endereco.Endereco;

public class Pet_Shop extends Comercio{

    private long codigoPetShop;

    public Pet_Shop(String cnpj, String razaoSocial, String nomeFantasia, String telefone, String email, Endereco endereco, long codigoPetShop) {
        super(cnpj, razaoSocial, nomeFantasia, telefone, email, endereco);
        this.codigoPetShop = codigoPetShop;
    }
}
