package Exercicios;

import java.util.Scanner;

public class if_SwitchExercicios04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media < 10) {
            System.out.println("Aprovado");

        }else if (media == 10) {
            System.out.println("Espetacular");

        } else {
            System.out.println("Reprovado");
        }


    }
}
