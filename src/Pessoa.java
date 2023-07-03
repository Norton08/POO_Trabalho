public abstract class Pessoa {
    protected String cpf;
    protected String nome;
    protected String telefone;
    protected String email;
    private Endereco residencia;

    public Pessoa(String cpf, String nome, String telefone, String email, Endereco residencia) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.residencia = residencia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Endereco getResidencia() {
        return residencia;
    }

    public void setResidencia(Endereco residencia) {
        this.residencia = residencia;
    }
}
