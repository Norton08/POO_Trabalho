package domain.endereco;

import domain.cidade.Cidade;

public class Endereco {
    private long codigoEndereco;
    private String lote;
    private String quadra;
    private long numero;
    private String cep;
    private String complemento;
    private String rua;
    private Cidade cidade;
    private static int contador = 0;

    public Endereco(String lote, String quadra, long numero, String cep, String complemento, String rua, Cidade cidade) {
        this.lote = lote;
        this.quadra = quadra;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.rua = rua;
        this.codigoEndereco = contador++;
        this.cidade = cidade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public long getCodigoEndereco() {
        return codigoEndereco;
    }
}
