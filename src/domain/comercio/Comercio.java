package domain.comercio;

import domain.cidade.Cidade;
import domain.endereco.Endereco;

import java.util.Date;

public abstract class Comercio {
    protected String cnpj;
    protected String razaoSocial;
    protected String nomeFantasia;
    protected String telefone;
    protected String email;
    protected Date horarioAtendimento;

    protected Endereco endereco;

    protected Cidade cidade;

    public Comercio(String cnpj, String razaoSocial, String nomeFantasia, String telefone, String email,
                    Date horarioAtendimento, Endereco endereco, Cidade cidade) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.telefone = telefone;
        this.email = email;
        this.horarioAtendimento = horarioAtendimento;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(Date horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public static void cadastrar() {
    }
}
