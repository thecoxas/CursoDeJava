package PooWelton;

public class Casa {

    public int pessoas;
    public int adultos;
    public int criancas;
    public double rendaMensal;
    public int comodos;
    public String endereco;
    public String principaisMoveis;
    public boolean feliz = true;
    protected boolean suja = true;
    protected boolean fome = false;
    protected boolean matoGrande = false;
    protected boolean dispensaVazia = true;
    void status(){

        System.out.println("Quantas pessoas moram na casa: "+ pessoas);
        System.out.println("Quantos adultos: "+ adultos);
        System.out.println("Quantas crianças : "+ criancas);
        System.out.println("Quantos comodos tem na casa: "+ comodos);
        System.out.println("Qual a renda mensal da casa: "+ rendaMensal);
        System.out.println("Qual o endereço da casa: "+ endereco);
        System.out.println("Quais os principais moveis da casa : "+ principaisMoveis);
        System.out.println("todas as pessoas da casa são felizes? : "+ feliz);
        System.out.println("elas estão com fome? : "+ fome);
        System.out.println("A casa esta suja? : "+ suja);
        System.out.println("O mato esta grande ? : "+ matoGrande);
        System.out.println("A dispensa esta vazia ? : "+ dispensaVazia);
    }

    void limpar() {
       if (this.suja == true){
           System.out.println("Casa suja, preciso limpar");
       } else {
           System.out.println("A casa esta limpa");
       }
    }

    void cozinhar() {
        this.fome = true;
    }

    void capinar() {
        this.matoGrande = true;
    }

    void comprar() {
        this.dispensaVazia = true;
    }

    void brincar() {
        this.feliz = false;
    }
}
