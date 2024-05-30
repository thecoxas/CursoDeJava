package ExercicioPoo;

public class ContaBancoTestar {
    public static void main(String[] args) {

        ContaBanco c1 =new ContaBanco(0,false);
        c1.setNumeroConta(1111);
        c1.setDono("Welton");
        c1.abrirConta("CC");
        c1.depositar(500);
        c1.sacar(550);
        c1.fecharConta();


        ContaBanco c2 =new ContaBanco(0,false);
        c2.setNumeroConta(1112);
        c2.setDono("lucineia");
        c2.abrirConta("CP");
        c2.depositar(450);
        c2.sacar(700);
        c2.pagarMensal();


        c1.estadoAtual();
        c2.estadoAtual();
    }
}
