package Curso_DevDojo_Introducao;

public class Arrays03 {
    public static void main(String[] args) {
        String[] mes = {"jan","fev","mar","abril","maio","jun",
        "jul","ago","sep","out","nov","dez"};
        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};

        for(int i=0; i<dias.length; i++) {
            System.out.println("O mes de " + mes[i] + " tem " + dias[i] + " dias ao todo ");

        }
    }
}
