package Curso_DevDojo_Introducao;

public class Arrays {
    public static void main(String[] args) {
        int[] idades = new int[3] ;
        idades[0] = 39;
        idades[1] = 33;
        idades[2] = 12;

//        for (int i = 0; i < 3; i++) {           loop normal
//            System.out.println(idades[i]);
//        }
        for (int i = 2; i < 3; i--) {   // loop de baixo pra cima
            System.out.println(idades[i]);

        }


    }
}
