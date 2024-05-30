package Animal;

public class Cachorro extends Mamifero {
    @Override
    public void comer() {       // Polimorfismo sobreposiçao
        System.out.println("Comendo raçao");
    }

    @Override
    public void beber() {
        System.out.println("Bebendo água");
    }

    // Polimorfismo de Sobrecarga
    public void reagir(String frase) {
        if (frase.equals("Bom dia") || frase.equals("ola")) {
            System.out.println("abanar o rabo");
        } else if (frase.equals("Vai deitar") || frase.equals("Sai pra la")) {
            System.out.println("Latir");
        } else {
            System.out.println("Comando invalido");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("brincar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("latir e rosnar");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("abanar");
            } else {
                System.out.println("latir");
            }
        } else if (peso >= 10) {
            System.out.println("Rosnar");

        } else {
            System.out.println("ignorar");
        }

    }
}
