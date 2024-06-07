package AulaCursoEmVideo;

import java.util.Scanner;


public class condicionaisSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantas pernas o animal tem:");
        int pernas = scan.nextInt();
        switch (pernas) {
            case 1:
                System.out.println("Saci");
                break;
                case 2:
                System.out.println("Bípede");
                break;
                case 4 :
                System.out.println("Quadrúpede");
                break;
                case 6:
                case 8:
                System.out.println("Aranha");
                break;
        
            default:
            System.out.println("ET!");
                break;
        }
        
    }

}
