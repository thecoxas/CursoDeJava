package cursoLoianeGroner;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Entre com un numero");
//        int num = scan.nextInt();
//
//        System.out.println("Entre com um numero limite");
//        int max = scan.nextInt();
//
//        for (int i = num; i <= max ; i++) {
//            if (i % 8 ==0){  // com essa formula eu descubro os divisiveis de um número;
//                System.out.println("O valor de i é: "+ i);
//                break; // com o break eu consigo apenos o primeiro numero divisivel;
//            }
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com un numero");
        int num = scan.nextInt();

        System.out.println("Entre com um numero limite");
        int max = scan.nextInt();

        for (int i = num; i <= max ; i++) {
            if (i % 8 ==0){  // com essa formula eu descubro os divisiveis de um número;
                continue;  // ele vai pular os divisiveis e vai mostrar os outros numeros do loop;
            }
            System.out.println("O valor de i é: "+ i);
            
        }


        }
    }

