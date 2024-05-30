package Exercicios;

import java.util.Scanner;

public class if_SwitchExercicios05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o primeiro numero:");
        int num1 = scan.nextInt();
        System.out.println("digite o segundo numero:");
        int num2 = scan.nextInt();
        System.out.println("digite o terceiro numero:");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("O maior é:"+ num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior é: "+ num2);

        } else if(num3 > num1 && num3 > num2 ){
            System.out.println("o maior é:" +num3);

        }
        if (num1 < num2 && num1 < num3){
            System.out.println("O menor é:"+ num1);

        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O menor é: "+ num2);

        } else if(num3 < num1 && num3 < num2 ) {
            System.out.println("o menor é:" + num3);
        } else {
            System.out.println("comando invalido");
        }



    }
}
