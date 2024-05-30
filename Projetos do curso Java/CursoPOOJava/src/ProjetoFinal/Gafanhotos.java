package ProjetoFinal;

public class Gafanhotos extends Pessoa {

    private String login;
    private int totassistido;

    public Gafanhotos(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totassistido = 0;
    }
    public void viuMaisUm(){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotassistido() {
        return totassistido;
    }

    public void setTotassistido(int totassistido) {
        this.totassistido = totassistido;
    }

    @Override
    public String toString() {
        return "Gafanhotos{" +
                "nome ='" + nome + '\'' +
                ", idade =" + idade +
                ", Sexo ='" + sexo + '\'' +
                ", Login =" + login +
                ", Total assistido ='" + totassistido + '\'' +
                ", experiencia =" + experiencia +
                '}';
    }
}
