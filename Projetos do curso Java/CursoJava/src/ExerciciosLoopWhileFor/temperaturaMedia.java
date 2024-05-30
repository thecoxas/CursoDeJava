package ExerciciosLoopWhileFor;

import java.util.Scanner;

public class temperaturaMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com a qtd de temperaturas: ");
        int qtdTemperaturas = scan.nextInt();

        double temp, soma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for (int i = 1; i < qtdTemperaturas ; i++) {
            System.out.println("Entre com a temperatura: "+ i);
            temp = scan.nextDouble();
            soma += temp;

            if (temp > maior){
                maior = temp;
            }
            if (temp < menor){
                menor = temp;
            }


        }
        System.out.println("Media: "+ (soma/qtdTemperaturas));
        System.out.println("menor temperatura: "+ menor);
        System.out.println("maior temperatura: "+ maior);
    }
}
