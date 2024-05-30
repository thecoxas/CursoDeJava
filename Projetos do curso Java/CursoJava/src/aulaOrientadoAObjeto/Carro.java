package aulaOrientadoAObjeto;

public class Carro {
    private String modelo;
    private String cor;
    protected   double velocidade;
    public double aceleracao;
    void status(){
        System.out.println("modelo : "+ modelo);
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }

}
