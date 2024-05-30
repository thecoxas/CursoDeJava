package ProjetoFinal;

public class Visualizacao {
    private Gafanhotos espectador;
    private Video filme;

    public Visualizacao(Gafanhotos espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotassistido(this.espectador.getTotassistido() + 1);
        this.filme.setViwes(this.filme.getViwes() + 1);
    }

    public void avaliar() {
        this.filme.setAvaliacoes(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacoes(nota);
    }

    public void avaliar(float porcentagem) {
        int total = 0;
        if (porcentagem <= 20) {
            total = 3;
        } else if (porcentagem <= 50) {
            total = 5;
        } else if (porcentagem <=90) {
            total = 8;
        } else {
            total = 10;
        }
        this.filme.setAvaliacoes(total);
    }

    public Gafanhotos getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhotos espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
