package VetoresExercicos;

import java.util.Scanner;

public class vetoresMediaAlunos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] resultado = new double[notas1.length];

        for (int i = 0; i < notas1.length; i++) {

            System.out.println("Entre com a nota 1 do aluno"+ (i+1));
            notas1[i] = scan.nextDouble();

            System.out.println("Entre com a nota 2 do aluno"+ (i+1));
            notas2[i] = scan.nextDouble();

            resultado[1] = (notas1[i] + notas2[i] /2 );

        }
        System.out.print("notas 1= ");
        for (int i = 0; i < notas1.length; i++) {
            System.out.println(notas1[i]+ " ");
        }
        System.out.println();
        System.out.print("notas 2= ");
        for (int i = 0; i < notas2.length; i++) {
            System.out.println(notas2[i]+ " ");
        }
        System.out.println();
        System.out.println("Resultados: ");
        for (int i = 0; i < resultado.length; i++) {
            if (resultado[i] >= 7){
                System.out.println(resultado[i]+ " - Aprovado");
            } else {
                System.out.println(resultado[i]+ " - Reprovado");
            }

        }
    }
}
