package domain.mercado;

import domain.cidade.Cidade;
import domain.comercio.Comercio;
import domain.endereco.Endereco;

import java.util.Date;

public class Mercado extends Comercio {
    private long codigoMercado;
    private static int contador = 0;

    public Mercado(String cnpj, String razaoSocial, String nomeFantasia, String telefone, String email,
            Date horarioAtendimento, Endereco endereco, Cidade cidade) {
        super(cnpj, razaoSocial, nomeFantasia, telefone, email, horarioAtendimento, endereco, cidade);
        this.codigoMercado = contador++;
    }

    public long getCodigoMercado() {
        return codigoMercado;
    }
}
