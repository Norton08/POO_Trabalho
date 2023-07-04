package domain.petShop;

import domain.cidade.Cidade;
import domain.comercio.Comercio;
import domain.endereco.Endereco;

import java.util.Date;

public class PetShop extends Comercio {
    private long codigoPetShop;

    public PetShop(String cnpj, String razaoSocial, String nomeFantasia, String telefone, String email, Date horarioAtendimento, Endereco endereco, Cidade cidade, long codigoPetShop) {
        super(cnpj, razaoSocial, nomeFantasia, telefone, email, horarioAtendimento, endereco, cidade);
        this.codigoPetShop = codigoPetShop;
    }

    public long getCodigoPetShop() {
        return codigoPetShop;
    }

    public void setCodigoPetShop(long codigoPetShop) {
        this.codigoPetShop = codigoPetShop;
    }
}
