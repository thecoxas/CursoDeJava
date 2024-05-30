package Rstaurante;

public class Cliente2 extends Recepcao {
    private String corDaPele;

    @Override
    public void cafeDaManha() {
        super.cafeDaManha();
        System.out.println("Café da manhã: Frutas e aveia");

    }

    @Override
    public void almoco() {
        super.almoco();
    }

    @Override
    public void jantar() {
        super.jantar();
    }

    public String getCorDaPele() {
        return corDaPele;
    }

    public void setCorDaPele(String corDaPele) {
        this.corDaPele = corDaPele;
    }
}
