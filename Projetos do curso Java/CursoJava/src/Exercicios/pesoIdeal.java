package Exercicios;

import java.util.Scanner;

public class pesoIdeal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a altura");
        double altura = scan.nextFloat();

        double pesoIdeal = (72.7 * altura) -58;
        System.out.println("O seu peso ideal é : " + pesoIdeal);

    }
}
