import java.util.Date;

public class Farmarcia extends Comercio {
    private long codigoFarmacia;

    public Farmarcia(String cnpj, String razaoSocial, String nomeFantasia, String telefone, String email, Date horarioAtendimento, Endereco endereco, Cidade cidade, long codigoFarmacia) {
        super(cnpj, razaoSocial, nomeFantasia, telefone, email, horarioAtendimento, endereco, cidade);
        this.codigoFarmacia = codigoFarmacia;
    }

    public long getCodigoFarmacia() {
        return codigoFarmacia;
    }

    public void setCodigoFarmacia(long codigoFarmacia) {
        this.codigoFarmacia = codigoFarmacia;
    }
}
