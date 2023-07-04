package domain.cidade;

public class Cidade {
    private long codigoCidade;
    private String estado;
    private String pais;
    private static int contador = 0;

    public Cidade(String estado, String pais) {
        this.estado = estado;
        this.pais = pais;
        this.codigoCidade = contador++;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public long getCodigoCidade() {
        return codigoCidade;
    }
}
