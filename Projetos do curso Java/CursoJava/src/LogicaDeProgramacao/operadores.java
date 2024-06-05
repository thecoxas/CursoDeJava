package LogicaDeProgramacao;

public class operadores {
    public static void main(String[] args) {
        // Atribuição = atribui ou recebe;
        // Inicializa uma variavel;
        // Valor fixo da variavel = constante;
        String  msg = "Ola" ;

        // Concatenação = , ou +
        System.out.println("Mensagem "+ msg);
        System.out.printf("Mensagem %s\n",msg);

        // Entrada /Armazenamento
        int n1 = 11;
        int n2 = 3;
        
        // Processamento = Operaçoes e calculos
        int soma = n1 + n2;
        int diferenca = n1 - n2;
        int multiplicacao = n1 * n2;
        float divisao = n1 / n2;
        int resto = n1 % n2;
        
        // Saída dos dados
        System.out.println(soma);
        System.out.println(diferenca);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(resto);
    }

}
