package Herança2;

public class testarAnimal {
    public static void main(String[] args) {
        //Animal.Animal animal1 = new Animal.Animal(); por a classe Animal.Animal ser abstrata ela nao pode ser instanciada!
        //Calango c1 = new Calango();
        //c1.setNome("Lula");
        //c1.comer();
        //c1.Beber();

        //Animal.Cachorro cao1 = new Animal.Cachorro();
        //cao1.setNome("Jugernault");
       //cao1.lambe();
        //cao1.latir();

        //Gato cat1 = new Gato();
        //cat1.setNome("Cristal");
        //cat1.Beber();
        //cat1.miar();
        //cat1.cospirPelo();

        Pombo p1 = new Pombo();
        p1.setNome("Lina");
        p1.entregarCarta();
        p1.entregarCarta();
        p1.entregarCarta();
        p1.voar();

        Dragao dragon1 = new Dragao();
        dragon1.setNome("fenix");
        dragon1.voar();
        dragon1.cuspirFogo();


    }
}
