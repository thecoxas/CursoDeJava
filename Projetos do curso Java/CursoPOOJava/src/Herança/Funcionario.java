package Herança;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;



    public void estaTrabalhando(){
        this.trabalhando= true;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
