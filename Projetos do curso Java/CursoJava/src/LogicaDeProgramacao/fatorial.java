package LogicaDeProgramacao;

public class fatorial {
    public static void main(String[] args) {
        int i = 4;
        int fatorial = 1;
        while (i >= 1) {
            fatorial *= i ;
            i --;
            
        }
        System.out.println(fatorial);
    }

}
