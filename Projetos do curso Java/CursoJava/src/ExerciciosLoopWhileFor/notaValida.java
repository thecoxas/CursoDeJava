package ExerciciosLoopWhileFor;

import java.util.Scanner;

public class notaValida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean NotaValida = false ;

       do {

           System.out.println("Entre com uma nota");
           double nota = scan.nextDouble();

           if (nota >= 0 && nota <= 10) {
               NotaValida = true;
               System.out.println("Você digitou: "+ nota);

           } else {
               System.out.println("nota invalida, digite novamente");
           }

       } while (!NotaValida);
    }
}

