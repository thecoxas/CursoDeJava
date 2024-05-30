package ProjetoFinal;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacoes;
    private int viwes;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = 1;
        this.curtidas = 0;
        this.viwes = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
        this.viwes++;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacoes() {
        int nova;
        nova = (int) ((this.avaliacoes + avaliacoes)/ this.viwes);
        return avaliacoes;
    }

    public void setAvaliacoes(int avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public int getViwes() {
        return viwes;
    }

    public void setViwes(int viwes) {
        this.viwes = viwes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacoes=" + avaliacoes +
                ", viwes=" + viwes +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
