package ExerciciosLoopWhileFor;

import java.util.Scanner;

public class notasSomaMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com o numero de notas:");
        int notas = scan.nextInt();

        double media, nota, soma = 0;

        for (int i = 0; i < notas; i++) {
            System.out.println("entre com a nota: ");
            nota = scan.nextDouble();

            soma += nota;
        }
        media = soma / notas;
        System.out.println("Soma: "+ soma);
        System.out.println("media: "+ media);
    }
}
