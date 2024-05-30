package Exercicios;

import java.util.Scanner;

public class if_SwitchExercicios06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o preço do primeiro produto");
        double preco1 = scan.nextDouble();
        System.out.println("Informe o preço do segundo produto");
        double preco2 = scan.nextDouble();
        System.out.println("Informe o preço do terceiro produto");
        double preco3 = scan.nextDouble();

        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("O primeiro produto é o mais barato, pois custa " + preco1);
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("O segundo produto é o mais barato, pois custa " + preco2);
        } else if (preco3 < preco1 && preco3 < preco2) {
            System.out.println("O terceiro produto é o mais barato, pois custa " + preco3);

        } else {
            System.out.println("valores invalidos");
        }
    }
}
