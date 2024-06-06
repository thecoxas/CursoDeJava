package AulaCursoEmVideo;

public class operadoresLogicos {
    public static void main(String[] args) {
        int x, y, z;
        x = 3;
        y = 5;
        z = 7;
        boolean res;
        //res = (x < y && z > x)? true : false; // V && V retorna V;
        //res = (x > z || z < y)? true : false; // F ou F retorna F;
        res = (x == z ^ z > x)? true : false; // F ou exclusivo V retorna V;
        // ! muda o resultado logico de V para F e vice-versa;
        //String resultado = (x < y)?"Menor":"Maior";
        int idade = 72;
        String resultado = (idade > 16 && idade < 18) || (idade>70) ? "Opcional":"Nao é Opcional";
        System.out.println(resultado);
        System.out.println(res);
    }

}
