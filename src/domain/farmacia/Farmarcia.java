package domain.farmacia;

import domain.cidade.Cidade;
import domain.comercio.Comercio;
import domain.endereco.Endereco;

import java.util.Date;

public class Farmarcia extends Comercio {
    private long codigoFarmacia;
    private static int contador = 0;

    public Farmarcia(String cnpj, String razaoSocial, String nomeFantasia, String telefone, String email,
            Date horarioAtendimento, Endereco endereco, Cidade cidade) {
        super(cnpj, razaoSocial, nomeFantasia, telefone, email, horarioAtendimento, endereco, cidade);
        this.codigoFarmacia = contador++;
    }

    public long getCodigoFarmacia() {
        return codigoFarmacia;
    }
}
