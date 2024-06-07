package AulaCursoEmVideo;

import java.util.Scanner;

public class condicionaisEncadeada {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o ano de nascimento");
        int ano =scan.nextInt();
        int idade = 2024 - ano;

        if (idade < 16) {
            System.out.println("Proibido votar "+ idade+" anos");
            
        }else if (idade >= 16 && idade < 18 || (idade > 70)){
            System.out.println("Voto opcional "+ idade+" anos");

        }else{
            System.out.println("Voto obrigatório "+ idade+" anos");
        }

    }

}
