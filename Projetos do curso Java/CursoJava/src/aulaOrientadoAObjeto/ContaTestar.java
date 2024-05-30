package aulaOrientadoAObjeto;

public class ContaTestar {
    public static void main(String[] args) {
        // Contrutor padrão
        Conta c1 = new Conta();
        c1.titular = "Welton";
        c1.numero = 1;
        c1.saldo = 2200.0;

        // Contrutor com 2 parâmetros
        Conta c2 =new Conta("Lucineia", 2);
        c2.saldo = 1600.5;

        // Construtor com 3 parâmetros
        Conta c3 = new Conta("Mickaelly", 3, 200.5);

        System.out.println("nome: "+c1.titular+" numero da conta: "+ c1.numero+" Saldo: "+ c1.saldo);
        System.out.println("nome: "+c2.titular+" numero da conta: "+ c2.numero+" Saldo: "+ c2.saldo);
        System.out.println("nome: "+c3.titular+" numero da conta: "+ c3.numero+" Saldo: "+ c3.saldo);

    }
}
