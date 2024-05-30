package Curso_DevDojo_Introducao;

public class EstruturaDeRepeticaoBreak {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorparcela =valorTotal / parcela;
            if(valorparcela < 1000){
                break;
            }
            System.out.println("parcela"+ parcela + " $ " + valorparcela);



            
        }
    }
}
