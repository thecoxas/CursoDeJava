package AulaCursoEmVideo;

import java.util.Scanner;

public class facaEnquanto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, cont = 0;
        String resp;
        do{
            System.out.print("digite um número ");
            num = scan.nextInt();
            cont += num;

         System.out.print("deseja continuar? [s/n]" );
         resp = scan.next();

        }while(resp.equals("s"));
        System.out.println("o valor da soma é: "+ cont);
    }

}
