package Exercicios;

import java.util.Scanner;

public class if_SwitchExercicios01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro para saber se ele é positivo ou negativo");
        int num1 = scan.nextInt();
        if (num1 >= 0) {
            System.out.println(num1+" é positivo");
        } else {
            System.out.println(num1+" é negativo");
        }

    }

}
