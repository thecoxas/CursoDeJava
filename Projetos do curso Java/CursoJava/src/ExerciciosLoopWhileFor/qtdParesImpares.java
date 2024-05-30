package ExerciciosLoopWhileFor;

import java.util.Scanner;

public class qtdParesImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int pares= 0 ;
        int impares = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("entre com um numero: ");
            num = scan.nextInt();
            if (num % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("pares "+pares);
        System.out.println("Impares "+impares);
    }
}
