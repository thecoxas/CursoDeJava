package ExerciciosLoopWhileFor;

import java.util.Scanner;

public class UsuarioSenha {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        boolean infoValidas = false;
        String nomeUser;
        String senha;
        do {
            System.out.println("Entre com o nome do usuario :");
            nomeUser = scan.next();

            System.out.println("Entre com a senha");
            senha = scan.next();

            if (nomeUser.equalsIgnoreCase(senha)){
                System.out.println("Senha igual a usuario, digite novamente");
            }else {
                infoValidas = true;
                System.out.println("Senha e usuarios validos");
            }
        } while (!infoValidas);
    }
}
