package Exercicios;

import java.util.Scanner;

public class ConversaoParaCentimetros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor a ser convertido : ");
        double valor = scan.nextDouble();
        double conversao = valor * 100;
        System.out.println(conversao+ " centimetros");
    }
}
