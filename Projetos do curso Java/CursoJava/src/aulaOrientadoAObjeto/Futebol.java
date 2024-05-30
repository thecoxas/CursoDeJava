package aulaOrientadoAObjeto;

public class Futebol {
    private String nomeTime;

    public void setNomeTime(String meuTime){
        nomeTime = meuTime;
    }

    public String getNomeTime() {
        return nomeTime;
    }
    public void status(){
        System.out.println("Meu time do coraçao é: "+ getNomeTime());
    }


}
