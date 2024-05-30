package Animal;

public class animalTestar {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.reagir(false);
        c1.reagir("Sai pra la");
        c1.reagir(4,5f);
        c1.reagir(20,30);
        c1.beber();
        c1.comer();
    }
}
