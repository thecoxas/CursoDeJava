package ExerciciosLoopWhileFor;

import java.util.Scanner;

public class qtdAnosPopulacaoUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double popA;
        double popB;
        double taxaA;
        float taxaB;
        boolean infoValida = false;
        do {
            System.out.println("entre com a populaçao A: ");
            popA = scan.nextDouble();
            if (popA > 0){
                infoValida = true;
            } else {
                System.out.println("populaçao precisa ser maior que 0.");
            }
        }while (!infoValida);

        infoValida = false;
        do {
            System.out.println("entre com a populaçao B: ");
            popB = scan.nextDouble();
            if (popB > 0){
                infoValida = true;
            } else {
                System.out.println("populaçao precisa ser maior que 0.");
            }
        }while (!infoValida);

        infoValida = false;
        do {
            System.out.println("entre com a taxa da populaçao A: ");
            taxaA = scan.nextDouble();
            if (popA > 0){
                infoValida = true;
            } else {
                System.out.println("populaçao precisa ser maior que 0.");
            }
        }while (!infoValida);

        infoValida = false;
        do {
            System.out.println("entre com a taxa da populaçao B: ");
            taxaB = scan.nextFloat();
            if (popB > 0){
                infoValida = true;
            } else {
                System.out.println("populaçao precisa ser maior que 0.");
            }
        }while (!infoValida);

        int cont = 0;
        while (popA < popB){
            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            cont ++;
        }
        System.out.println("população A "+ popA);
        System.out.println("população B "+ popB);
        System.out.println("Qtd anos "+ cont);
        }

    }







