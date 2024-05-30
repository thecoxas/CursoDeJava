package Exercicios;

import java.util.Scanner;

public class if_SwitchExercicios02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite 1 para masculino e 2 para feminino");
        int sexo1 =scan.nextInt();

        switch (sexo1){
            case 1 :
                System.out.println("masculino"); break;
            case 2 :
                System.out.println("feminino");break;
            default:
                System.out.println("numero invalido");
        }
    }
}
