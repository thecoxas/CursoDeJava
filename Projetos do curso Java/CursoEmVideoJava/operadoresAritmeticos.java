public class operadoresAritmeticos {
    public static void main(String[] args) {

        /*  Pré-fixados
        int x = 27, y = 8;
        System.out.println("x: "+ ++x); // Imcremento
        System.out.println("y; "+ --y); // Decremento

        // Pós-fixados
        System.out.println("x: "+ x++); // O resultado gerado é x: 27
        System.out.println("x: "+ x); // O resultado gerado é x: 28
        // Lê a variavel primeiro depois incrementa;
        
        // Atribuição
        int x = 5;
        //x += 3; // X= x + 3
        x *= 3; // X= x * 3
        System.out.println(x);

        // Classe Math
        float y = (float) Math.PI;
        System.out.println(y);
        int potencia = (int) Math.pow(5, 3);
        System.out.println(potencia);
        int raiz = (int) Math.sqrt(100);
        System.out.println(raiz);
        int raizCub = (int) Math.cbrt(125);
        System.out.println(raizCub);

        // Arredondamento
        float x = 5.7f;
        int ar = Math.abs(-10); // valor absoluto
        //int ar = (int)Math.floor(x); Arredonda pra baixo
        //int ar = (int)Math.ceil(x); Arredonda pra cima
        //int ar = Math.round(x); Arredonda aritméticamente
        System.out.println(ar);*/

        // Random
        double aleatorio = Math.random();
        int ale = (int) (1 + aleatorio * (10-1)); // Gera um numero aleatório de 1 a 10;
        System.out.println(ale);



    }

}
