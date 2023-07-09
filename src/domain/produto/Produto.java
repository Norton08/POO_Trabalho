package domain.produto;

public class Produto {
    private static int contador = 0;
    private long codigoProduto;
    private double valor;
    private String nome;

    public Produto(double valor, String nome) {
        this.codigoProduto = contador++;
        this.valor = valor;
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigoProduto() {
        return codigoProduto;
    }
}
