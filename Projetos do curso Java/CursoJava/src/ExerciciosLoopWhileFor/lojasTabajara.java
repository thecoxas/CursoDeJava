package ExerciciosLoopWhileFor;

import java.util.Scanner;

public class lojasTabajara {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lojas Tabajara");

        boolean sair = false;
        String continuarCompra, output;
        int qtdProdutos, valorPago;
        double preco, total, troco;

        do {
            System.out.println("Deseja informar um nova compra?  S/N ");
            continuarCompra = scan.next();

            if (continuarCompra.equalsIgnoreCase("s")) {

                output = "lojasTabajara\n";

                System.out.println("Digite a quantidade de produtos");
                qtdProdutos = scan.nextInt();

                total = 0;

                for (int i = 1; i <= qtdProdutos; i++) {
                    System.out.println("Informe o preço do produto" + i);
                    preco = scan.nextDouble();
                    total += preco;
                    output += "Produto " + i + ": $ " + preco + "\n";
                }
                output += "Total: $ " + total;
                System.out.println("Total: $ " +total+"\n");

                System.out.println("Entre com o valor pago: ");
                valorPago = scan.nextInt();
                output += " Dinheiro: $ "+valorPago+ "\n";

                troco = total - valorPago;

                output += "Troco: $ "+troco;

                System.out.println(output);

            } else {
                sair = true;

            }


        } while (!sair);

    }
}