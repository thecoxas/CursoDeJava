package Pratice;

public class Condicionais {
    public static void main(String[] args) {
        String nome;
        int idade;
        float hora = 24.0f;

        if (hora >= 18 && hora <= 22){
            System.out.println("Eu parei de estudar");
        } else if(hora >= 7 && hora < 11.30 ) {
            System.out.println("Ainda estou estudando");
        } else if (hora > 13 && hora < 18 ) {
            System.out.println("Voltei do almoço e estou estudando");
        } else if (hora >= 11.30 && hora <=13 ) {
            System.out.println("Hora do almoço");
        } else {
            System.out.println("Estou dormindo");
        }
    }
}
