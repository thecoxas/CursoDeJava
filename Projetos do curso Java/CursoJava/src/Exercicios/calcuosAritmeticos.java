package Exercicios;

import java.util.Scanner;

public class calcuosAritmeticos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero inteiro");
        int num1 = scan.nextInt();
        System.out.println("Entre com outro numero inteiro");
        double num2 = scan.nextDouble();
        System.out.println("Entre com um numero real");
        double num3 = scan.nextDouble();
        System.out.println("O dobro do primeiro numero pela metade do segundo é :"+((num1*num1) + (num2 / num2)) );
        System.out.println("O triplo do primeiro numero com o terceiro é :"+ ((num1*3)+ num3) );
    }
}
