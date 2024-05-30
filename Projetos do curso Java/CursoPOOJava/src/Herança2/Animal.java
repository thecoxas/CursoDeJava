package Herança2;

public abstract class Animal {

    private String nome;

    public void comer(){
        System.out.println("O "+ getNome()+" comeu");
    }
    public void Beber(){
        System.out.println("O "+ getNome()+" bebeu");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
