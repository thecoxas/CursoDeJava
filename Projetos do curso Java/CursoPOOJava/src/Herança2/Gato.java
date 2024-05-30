package Herança2;

public class Gato extends Animal{
    public void miar(){
        System.out.println("A "+ getNome()+ " miou");
    }
    public void cospirPelo(){
        System.out.println("A "+ getNome()+ " cupiu uma bola de pelo");
    }
}
