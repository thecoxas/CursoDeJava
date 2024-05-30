package cursoLoianeGroner;

import java.util.Scanner;

public class aulaIf_Else {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("entre com a idade : ");
        int idade = scan.nextInt();

        if (idade >= 18 ){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Nao é maior de idade");

        }

    }
}
