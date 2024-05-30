package Curso_DevDojo_Introducao;

public class EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int contador = 0;
        while(contador <10) {
            System.out.println(contador);
            contador = contador +1;
        }
        //contador = 0; // repete infinitamente
        do {   // so vai funcionar se o while nao atender as condiçoes, retornar falso
            System.out.println("dentro do do-while" + ++contador);
        }while (contador < 10);

        for(int i = 1; i <= 10; i++) {
            System.out.println("for" +i);
    }

    }




}
