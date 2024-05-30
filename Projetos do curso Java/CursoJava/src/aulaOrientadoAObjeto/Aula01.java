package aulaOrientadoAObjeto;

public class Aula01 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        // atibutos
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.carga = 40;
        c1.modelo = "bic";

        c1.destampar();
        c1.status();  // metodos
        c1.rabiscar();

        Caneta c2 = new Caneta();
        // atributos
        c2.cor = "preta";
        c2.ponta = 1.0f;
        c2.modelo = "faber castel";
        c2.carga = 90;
        // metodos
        c2.tampar();
        c2.rabiscar();
        c2.status();
    }
}
