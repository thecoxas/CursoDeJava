package Exercicios;

import java.util.Scanner;

public class if_SwitchExercicios07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual turno vc estuda (M) para matutino (V) para vespertino e (N) para noturno");
        String turno = scan.next();
        switch (turno) {
            case "M":
                System.out.println("bom dia"); break;
            case "V":
                System.out.println("Boa tarde");break;
            case "N":
                System.out.println("Boa noite");break;
            case "m":
                System.out.println("bom dia"); break;
            case "v":
                System.out.println("Boa tarde");break;
            case "n":
                System.out.println("Boa noite");break;
            default:
                System.out.println("comando invalido");
        }
    }
}
