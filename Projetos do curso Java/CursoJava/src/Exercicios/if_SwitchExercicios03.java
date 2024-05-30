package Exercicios;

import java.util.Scanner;

public class if_SwitchExercicios03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra");
        String letra = scan.next();

//        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
//                || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
//                || letra.equalsIgnoreCase("u")) {
//            System.out.println("vogal");
//        } else {
//            System.out.println("consoante");
//        }
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("vogal"); break;
            default:
                System.out.println("consoante");
        }
    }
}

