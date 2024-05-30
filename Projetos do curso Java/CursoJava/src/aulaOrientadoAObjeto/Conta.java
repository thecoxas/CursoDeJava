package aulaOrientadoAObjeto;

public class Conta {
    String titular;
    int numero;
    double saldo;

    //   Contrutor
    Conta() {

    }

    Conta(String titular) {
        this.titular = titular;
    }

    Conta(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }
    Conta(String titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo= saldo;

        // fim do contrutor
    }
}
