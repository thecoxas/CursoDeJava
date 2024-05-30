package ExerciciosLoopWhileFor;

import org.w3c.dom.ls.LSOutput;

public class precoDoPao {
    public static void main(String[] args) {
        System.out.println("Preço do pão : $ 0.18 ");
        System.out.println("Panificadora pão de ontem - tabela de preços ");
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i+" - $ "+ (0.18*i));

        }
    }
}
