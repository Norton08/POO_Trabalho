package domain.restaurante;

import domain.cidade.Cidade;
import domain.comercio.Comercio;
import domain.endereco.Endereco;

import java.util.*;

public class Restaurante extends Comercio {
    private long codigoRestaurante;

    public Restaurante(String cnpj, String razaoSocial, String nomeFantasia, String telefone, String email,
                       Date horarioAtendimento, Endereco endereco, Cidade cidade, long codigoRestaurante) {
        super(cnpj, razaoSocial, nomeFantasia, telefone, email, horarioAtendimento, endereco, cidade);
        this.codigoRestaurante = codigoRestaurante;
    }

    public long getCodigoRestaurante() {
        return codigoRestaurante;
    }

    public void setCodigoRestaurante(long codigoRestaurante) {
        this.codigoRestaurante = codigoRestaurante;
    }
}
