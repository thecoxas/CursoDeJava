package Rstaurante;

public class restaurante {
    public static void main(String[] args) {
        //Rstaurante.Recepcao r1 = new Rstaurante.Recepcao() ;
        Cliente1 c1 = new Cliente1();
        c1.setNome("Maickessuel");
        c1.setCpf(491345678);
        c1.setTelefone(991993344);
        System.out.println(c1.toString());
        c1.compania();
        c1.cafeDaManha();
        System.out.println("----------------------------------------");

        Cliente2 c2 = new Cliente2();
        c2.setNome("Lucineia");
        c2.setCpf(33456435);
        c2.setTelefone(992993409);
        System.out.println(c2.toString());
        c2.cafeDaManha();
        System.out.println("-------------------------------------------");

        Convidado con1 = new Convidado();
        con1.setNome("Josefina");

        System.out.println(con1.toString());

        con1.cafeDaManha();

    }
}
