package domain.petShop;

import domain.cidade.Cidade;
import domain.comercio.Comercio;
import domain.endereco.Endereco;

import java.util.Date;

public class PetShop extends Comercio {
    private long codigoPetShop;
    private static int contador = 0;

    public PetShop(String cnpj, String razaoSocial, String nomeFantasia, String telefone, String email,
            Date horarioAtendimento, Endereco endereco, Cidade cidade) {
        super(cnpj, razaoSocial, nomeFantasia, telefone, email, horarioAtendimento, endereco, cidade);
        this.codigoPetShop = contador++;
    }

    public long getCodigoPetShop() {
        return codigoPetShop;
    }

}
