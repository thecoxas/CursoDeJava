package ArrayDeArrays;

import java.util.Scanner;

public class compromissos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] compromissos = new String[31][24];
        boolean sair = false;
        byte opcao;
        int hora = 0;
        int dia = 0;

        while (!sair) {

            System.out.println("digite 1 para adicionar compromisso");
            System.out.println("digite 2 para verificar compromisso");
            System.out.println("digite 3 para sair");

            opcao = scan.nextByte();
            if (opcao == 1) {
                boolean diaValido = false;

                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido. Digite novamente");
                    }
                    dia--;
                    System.out.println("Digite o compromisso");
                    compromissos[dia][hora] = scan.next();
                }
                } else if (opcao == 2) {
                boolean horaValido = false;

                while (!horaValido) {
                    System.out.println("Entre com a hora do mês");
                    hora = scan.nextInt();
                    if (hora > 1 && hora <= 24) {
                        horaValido = true;
                    } else {
                        System.out.println("hora invalida. Digite novamente");
                    }
                    dia--;
                    System.out.println("o compromisso agendado é:");
                    compromissos[dia][hora] = scan.next();
                }



            } else if (opcao == 3) {
                    sair = true;
                } else {
                    System.out.println("opção invalida. Digite novamente");
                }



            }
        }
    }