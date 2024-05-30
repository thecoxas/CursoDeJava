package PooWelton;

public class AulaCasa {
    public static void main(String[] args) {
        Casa casa1 = new Casa();
        casa1.pessoas = 6;
        casa1.criancas = 4;
        casa1.comodos = 8;
        casa1.adultos = 2;
        casa1.endereco = "Rua 13 numero 14 setor vila Maria";
        casa1.rendaMensal = 2.200;
        casa1.principaisMoveis = "geladeira, sofa, cama, mesa, fogão";

        casa1.status();
        casa1.limpar();
    }
}
