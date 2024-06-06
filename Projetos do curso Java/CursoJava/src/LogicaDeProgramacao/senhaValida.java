package LogicaDeProgramacao;

import java.util.Scanner;

public class senhaValida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int codigo = 1234;

        System.out.println("Digite a sua senha de 4 digitos numéricos ");
        int senha = scan.nextInt();

        if (codigo != senha) {
            System.out.println("Acesso negado! Senha incorreta");
            
        }else{
            System.out.println("Acesso permitido! Senha válida");
        }


    }

}
