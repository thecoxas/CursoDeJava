package cursoLoianeGroner;

import java.util.Scanner;

public class AulaSwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero de (1 a 7)");

        int diasDaSemana = scan.nextInt();


        switch (diasDaSemana ){
            case 1:
                System.out.println("Domingo"); break;
            case 2:
                System.out.println("segunda"); break;
            case 3:
                System.out.println("terça"); break;
            case 4:
                System.out.println("quarta");break;
            case 5:
                System.out.println("quinta"); break;
            case 6:
                System.out.println("sexta"); break;
            case 7:
                System.out.println("sabado"); break;
            default:
                System.out.println("numero digitado invalido");
        }
        switch (diasDaSemana ){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util"); break;
            case 1:
            case 7:
                System.out.println("Fim de semana"); break;
            default:
                System.out.println("numero digitado invalido");
        }

    }



}

