package aulaOrientadoAObjeto;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("marca " + this.modelo);
        System.out.println("cor " + this.cor);
        System.out.println("Esta tampada ? " + this.tampada);
        System.out.println("Qual o tamanho da ponta ? " + this.ponta);
        System.out.println("Qual a carga ? " + this.carga);
    }

    void rabiscar() {
        if (this.tampada == true){
            System.out.println("erro: nao posso rabiscar!");
        } else {
            System.out.println("estou rabiscando");
        }


    }

    void tampar() {
        this.tampada = true;

    }

    void destampar() {
        this.tampada = false;

    }
}
