package aulaOrientadoAObjeto;

public class CarroTestar {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        // carro1.modelo = "fiat";
        carro1.status();

        carro1.setModelo("fiat");
        System.out.println(carro1.getModelo());

        carro1.setCor("azul");
        System.out.println(carro1.getCor());
    }
}
