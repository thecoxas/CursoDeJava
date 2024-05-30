package Exercicios;

import java.util.Scanner;

public class conversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a temperatura em farenheint : ");
        double tempF = scan.nextDouble();

        double celsius = (5* (tempF -32) / 9);
        System.out.println("A temperatura é de; "+celsius+" graus celsius");

    }
}
