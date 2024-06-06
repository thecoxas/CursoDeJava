package LogicaDeProgramacao;

import java.util.Scanner;

public class maiorDeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
        int ano = scan.nextInt();
        int idade = 2024 - ano;
        if (idade < 18) {
            System.out.println("Menor de idade nao pode votar => "+ idade+ " anos de idade");
            
        } else {
            System.out.println("Maior de idade pode votar => "+ idade+" anos de idade" );

        }
    }

}
