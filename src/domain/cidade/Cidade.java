package domain.cidade;

public class Cidade {
    private String estado;
    private String pais;

    public Cidade(String estado, String pais) {
        this.estado = estado;
        this.pais = pais;
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
}
