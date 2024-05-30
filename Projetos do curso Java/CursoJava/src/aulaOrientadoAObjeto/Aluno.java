package aulaOrientadoAObjeto;

public class Aluno {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade >0 && idade < 130){
            System.out.println("Idade cadastrada");
        this.idade = idade;
    } else {
            System.out.println("Erro! idade invalida.");
        }
    }

    public int getIdade() {
        return idade;
    }
    public void status (){
        System.out.println("Nome; "+ getNome());
        System.out.println("Idade; "+ getIdade());
    }
}
