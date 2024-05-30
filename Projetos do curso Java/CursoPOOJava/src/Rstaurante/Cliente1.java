package Rstaurante;

public class Cliente1 extends Recepcao {
    private boolean acompanhante = false;

    @Override
    public void cafeDaManha() {
        super.cafeDaManha();
        System.out.println("Café da manhã: Ovos mexidos com suco de laranja");
    }

    @Override
    public void almoco() {
        super.almoco();
    }

    @Override
    public void jantar() {
        super.jantar();
    }
    public void compania(){
        this.setAcompanhante(true);
        System.out.println("Acompanhado");
    }

    public boolean getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(boolean acompanhante) {
        this.acompanhante = acompanhante;
    }
}
