package Pratice;

public class Media {
    public static void main(String[] args) {
        double nota1 = 45.5;
        double nota2 = 31.3;
        double media1 = nota1 + nota2;
        System.out.println("media do 1 semestre: "+ media1);

        double nota3 = 34.0;
        double nota4 = 23.5;
        double media2 = nota3 + nota4;
        System.out.println("Media do 2 semestre: "+ media2);

        double mediaTotal = (nota1 + nota2 + nota3 + nota4) / 2;


        if (mediaTotal >= 6){
            System.out.println("Aprovado");
            System.out.println("Sua media final foi: "+ mediaTotal);
        } else {
            System.out.println("Reprovado");
            System.out.println("Sua media foi: "+ mediaTotal);
        }
    }

}
