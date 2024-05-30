package Herança2;

public class Pombo extends Ave {
    private int cartasEntregue;

    public Pombo(){
        this.cartasEntregue= 10;
    }

    public void cantar(){
        System.out.println("A "+ getNome()+ " cantou");
    }
    public void entregarCarta(){
        System.out.println("A "+ getNome()+ " Entregou mais uma carta");
        cartasEntregue = cartasEntregue + 1;
        System.out.println(getEntregarCarta()+ " cartas entregues no total");
    }

    public int getEntregarCarta() {
        return cartasEntregue;
    }


}
