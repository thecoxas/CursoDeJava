package AulaCursoEmVideo;

import java.util.Scanner;

public class classScanner {
    public static void main(String[] args) {
        // System.in entrada de dados;
        Scanner sc = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("digite seu salario: ");
        float salario = sc.nextFloat();

        System.out.println("Você é casado ? ");
        boolean casado = sc.nextBoolean();

        // System.out saída de dados;
        //System.out.println("Nome: "+nome);
        System.out.printf("nome %s\n ",nome);
        System.out.println("idade: "+idade);
        //System.out.println("salario: "+ salario); 
        System.out.printf("salario %.3f \n", salario);
        System.out.println("casado: "+ casado);
        
        //

    }

}
