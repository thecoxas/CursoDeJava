package Rstaurante;

public abstract class Recepcao {
    protected String nome;
    protected int cpf;
    protected int telefone;

    public void cafeDaManha(){

    }
    public void almoco(){

    }
    public void jantar(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Rstaurante.Recepcao{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", telefone=" + telefone +
                '}';
    }
}
