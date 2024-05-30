package cursoLoianeGroner;

import java.util.Scanner;

public class if_ElseEncadeado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor do jogo");
        Double valor = scan.nextDouble();
        if (valor <= 10) {
            System.out.println("pode comprar ta barato");
        } else if (valor >= 10 &&  valor < 20) {
            System.out.println("pessa desconto");
        } else if (valor >=20 && valor < 30) {
            System.out.println("vamos procurar mais");
        }else {
            System.out.println("desisto nao vou comprar");
        }

        }

    }
