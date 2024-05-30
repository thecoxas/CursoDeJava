package Curso_DevDojo_Introducao;

public class EstruturaCondicionalExercicio {
    public static void main(String[] args) {
//        double salario = 3000;
//        if (salario <= 1000) {
//            System.out.println("taxa de 10%");
//        }
//        else if (salario >= 1001 && salario <= 2000) {
//            System.out.println("taxa de 20%");
//        }
//        else {
//            System.out.println("taxa de 40%");

        // Exemplo de cobrança de taxa de imposto anual sobre o salário
        double SalarioAnual = 40000;
        double PrimeiraTaxa = 9.70 / 100;
        double SegundaTaxa = 20.0 / 100;
        double TerceiraTaxa = 40.0 / 100;
        double ValorImposto ;

        if (SalarioAnual <= 12000 ) {
            ValorImposto = SalarioAnual * PrimeiraTaxa;

        }else if ( SalarioAnual >=12000 && SalarioAnual <= 24000) {
            ValorImposto = SalarioAnual * SegundaTaxa;
        }
        else {
            ValorImposto = SalarioAnual * TerceiraTaxa;
        }
        System.out.println(ValorImposto);

    }
}
