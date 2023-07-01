import java.util.Date;

public class Mercado extends Comercio{
    private long codigoMercado;

    public Mercado(String cnpj, String razaoSocial, String nomeFantasia, String telefone, String email, Date horarioAtendimento, Endereco endereco, Cidade cidade, long codigoMercado) {
        super(cnpj, razaoSocial, nomeFantasia, telefone, email, horarioAtendimento, endereco, cidade);
        this.codigoMercado = codigoMercado;
    }

    public long getCodigoMercado() {
        return codigoMercado;
    }

    public void setCodigoMercado(long codigoMercado) {
        this.codigoMercado = codigoMercado;
    }
}
