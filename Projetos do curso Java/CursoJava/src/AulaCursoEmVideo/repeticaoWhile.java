package AulaCursoEmVideo;

public class repeticaoWhile {
    public static void main(String[] args) {
        int cont = 0;
        String s = "";
        while (cont < 10) {
            cont++;
            /*if (cont == 3 || cont == 5 || cont == 7 || cont == 9) {
                continue; //pula os numeros selecionados na condição e segue o fluxo normal do programa;
            }
            if (cont == 6 ) {
                break; // Interrompe o fluxo ignorando o resto do loop;
            }*/
            System.out.print(s + cont+" ");
        }
    }

}
