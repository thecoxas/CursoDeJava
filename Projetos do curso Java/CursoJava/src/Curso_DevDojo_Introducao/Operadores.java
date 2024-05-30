package Curso_DevDojo_Introducao;

public class Operadores {
    public static void main(String[] args) {
        // Operadores aritmeticos + - * /

        int valor01 = 20;
        int valor02 = 10;
        int resultado = valor01 * valor02;
        double valor03 = 50;
        double valor04 = 25;
        double resultado2 = valor03 / valor04;
        System.out.println(resultado);
        System.out.println(resultado2);

        // Operador de resto %
        int resto = 50 % 7;
        System.out.println(resto);

        // Operadores booleanos > < >= <= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;

        System.out.println("Dez é maior que vinte :"+ isDezMaiorQueVinte);
        System.out.println("Dez é menor que vinte :"+ isDezMenorQueVinte);
        System.out.println("Dez é igual a vinte :"+ isDezIgualAVinte);
        System.out.println("Dez é diferente de vinte :"+ isDezDiferenteDeVinte);

        // Operadores lógicos  && (and) || (or) ! (not)
        int idade = 29;
        float salario = 3500f;
        boolean DentroDaLei = idade > 40 && salario >= 4612;
        boolean ForaDaLei = idade < 30 && salario >= 3361;
        System.out.println("Dentro da lei :"+ DentroDaLei);
        System.out.println("Fora da lei :"+ ForaDaLei);

        double conta01 = 1000;
        double conta02 = 8000;
        float playstationCinco = 5000f;
        boolean consigoComprar = conta01 >= playstationCinco || conta02 >= playstationCinco;
        System.out.println("O dinheiro é suficiente :"+ consigoComprar);

        // Operadores de atribuiçao =  +=  -=  *=  /=  %=
        double bonus =2000;
        bonus += 800;
        bonus -= 800;
        bonus *= 2;
        bonus /= 2;
        bonus %= 3;
        System.out.println(bonus);

        // ++ --
        int contador = 1;
        contador++;
        contador--;
        //++contador;
        //--contador;
        System.out.println(contador);
        int contador02 = 0;
        System.out.println(contador02);






    }
}
