package aulaOrientadoAObjeto;

import java.util.Scanner;

public class FutebolTestar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu time do coração:");
        String time = scan.next();

        Futebol fut1 = new Futebol();
        fut1.setNomeTime(time);
        fut1.status();


    }
}
