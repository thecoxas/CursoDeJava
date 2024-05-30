package Curso_DevDojo_Introducao;

public class EstruturaCondicional02 {
    public static void main(String[] args) {
        int idade = 11;
        String categoria;

        if(idade < 15){
            //System.out.println("categoria juvenil");
            categoria = "categoria infantil";
        }
        else if(idade >= 15 && idade< 18 ){
            //System.out.println("categoria juvenil");
            categoria = "categoria juvenil";
        }
        else {
            //System.out.println("categoria adulto");
            categoria = "categoria adulto";
        }
        System.out.println(categoria);
    }
}
