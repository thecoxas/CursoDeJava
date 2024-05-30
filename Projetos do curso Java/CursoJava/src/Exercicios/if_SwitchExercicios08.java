package Exercicios;

import java.util.Scanner;

public class if_SwitchExercicios08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com seu salario");
        double Salario = scan.nextDouble();
        double PrimeiraTaxa = 20.0 / 100;
        double SegundaTaxa = 15.0 / 100;
        double TerceiraTaxa = 10.0 / 100;
        double quartaTaxa = 5.0 / 100;

        if(Salario < 280){
            System.out.println("Sera acrescido no seu salario "+ Salario * PrimeiraTaxa + " Seu novo salario depois do acrescimo sera de:" +
                    " "+ (Salario * PrimeiraTaxa + Salario) );
        }
    }
}
