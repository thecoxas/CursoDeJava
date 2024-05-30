package ExerciciosLoopWhileFor;

import java.util.Scanner;

public class numerosPrimos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero:");
        int num = scan.nextInt();

        boolean primo = true;
        for (int i = 2; i < num ; i++) {
            if (num % i ==0 ){
                System.out.println("nao é primo - divisivel por "+ i);
                primo = false;
            }
        }
        if (primo){
            System.out.println("É numero primo");
        }
    }
}
