package ExerciciosLoopWhileFor;

import java.util.Scanner;

public class NomeIdadeSalarioOutros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Digite seu nome");
            nome = scan.next();
            if (nome.length() >= 3){
                infoValida = true;
            } else {
                System.out.println("Nome precisa de no mínimo 3 caracteres");
            }
        }while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite sua idade");
            idade = scan.nextInt();
            if (idade > 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 1 e 150.");
            }
        }while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite seu salário");
            salario = scan.nextDouble();
            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Salario precisa ser maior que 0");
            }
        }while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com seu sexo");
            sexo = scan.next();
            if (sexo.equalsIgnoreCase("f")|| sexo.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm'.");
            }
        }while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com seu estado civil");
            estadoCivil = scan.next();
            if (estadoCivil.equalsIgnoreCase("c")|| estadoCivil.equalsIgnoreCase("s")
                    || estadoCivil.equalsIgnoreCase("d") || estadoCivil.equalsIgnoreCase("v")) {
                infoValida = true;
            } else {
                System.out.println("estado civil precisa ser 'c', 's', 'd' ou 'v'.");
            }
        }while (!infoValida);
        System.out.println("Essas foram as informações coletadas");
        System.out.println("nome :"+nome);
        System.out.println("idade : "+idade);
        System.out.println("Salario : "+salario);
        System.out.println("Sexo : "+sexo);
        System.out.println("Estado civil : "+estadoCivil);
    }

}
