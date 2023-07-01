public class Endereco {
    private String lote;
    private String quadra;
    private long numero;
    private String cep;
    private String complemento;
    private String rua;

    public Endereco(String lote, String quadra, long numero, String cep, String complemento, String rua) {
        this.lote = lote;
        this.quadra = quadra;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.rua = rua;
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
}
