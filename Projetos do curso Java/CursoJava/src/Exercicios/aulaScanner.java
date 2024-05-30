package Exercicios;

import java.util.Scanner;

public class aulaScanner {
    public static void main(String[] args) {
        //Classe Scanner

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome :");
        String nomeCompleto = scan.nextLine();

        System.out.println("digite sua idade :");
        int idade = scan.nextInt();

        System.out.println("Digite seu salario");
        double salario = scan.nextDouble();

        System.out.println("seu nome completo é : "+ nomeCompleto);
        System.out.println("Sua idade é : "+idade+ " anos");
        System.out.println("Você ganha $: "+salario);
    }
}
