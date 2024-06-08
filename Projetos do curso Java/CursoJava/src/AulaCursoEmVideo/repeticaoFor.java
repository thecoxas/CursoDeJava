package AulaCursoEmVideo;

public class repeticaoFor {
    public static void main(String[] args) {

        /*for (int x = 0; x < y; x++) {
            ...
        }
        for (inicialização da variável; checagem de condição; incremento/decremento do valor da variável) {  
            comando a ser executado/declaração
        } */

        for(int x = 1000; x >= 100; x-=100){
           System.out.println(x);
        }
                        /*  OU
         * int i = 0;
         * while(i<=10){
         * System.out.println("Welton");
         * i++;
         }
         */
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= 2; j += 2) { //for aninhado
                System.out.println("j"+j);
                System.out.println("i"+i);
                
            }
            
        }

        }
        
        
    }


