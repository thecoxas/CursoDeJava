package AulaCursoEmVideo;

public class comparacaoStrings {
    public static void main(String[] args) {
        String nome1 = "Welton";
        String nome2 = "Welton";
        String nome3 = new String("Welton");
        String res;
        //res = (nome1 == nome2)?"igual":"diferente"; // é um if diferente
        //res = (nome1 == nome3)?"igual":"diferente"; // nome3 nao tem a msm estrutura dos outros por isso diferente.
        res = (nome1.equals(nome3))?"igual":"diferente"; // O método equals é usado para determinar  se dois objetos são considerados iguais
        System.out.println(res);
    }

}
