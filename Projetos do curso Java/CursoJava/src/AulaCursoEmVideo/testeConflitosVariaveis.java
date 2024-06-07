package AulaCursoEmVideo;

public class testeConflitosVariaveis {
    public static void main(String[] args) {
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s = "Hello";
        
        //c = c + i;
        s += i ; // String e int dão liga; usado para dar espaçamento entre numeros;
        //i += s; 
        //c += s;
        i += l;  // int e long dão liga; 
        System.out.println(s);
        System.out.println(i);


    }

}
