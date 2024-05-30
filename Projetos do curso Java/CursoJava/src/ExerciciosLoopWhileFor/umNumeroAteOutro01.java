package ExerciciosLoopWhileFor;

import java.util.Scanner;

public class umNumeroAteOutro01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com o primerio número: ");
        int num1 = scan.nextInt();
        System.out.println("entre com o segundo numero número: ");
        int num2 = scan.nextInt();

        int soma = 0;

        for (int i = num1; i <= num2 ; i++) {
            soma += i;
            //System.out.print(i+" - ");
            System.out.println("soma"+ soma);

        }
    }
}
