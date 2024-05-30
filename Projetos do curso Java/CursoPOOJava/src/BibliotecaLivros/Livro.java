package BibliotecaLivros;

public class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; // Aqui acontece a agregaçao quando eu uso a classe pessoa dentro da classe livro.

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("Titulo do livro: " + getTitulo());
        System.out.println("Autor do livro: " + getAutor());
        System.out.println("Total de páginas do livro: " + getTotPaginas());
        System.out.println("Está aberto: "+ aberto);
        System.out.println("Pagina atual do livro: " + getPagAtual());
        System.out.println("Leitor do livro: " + this.leitor.getNome());
        System.out.println("Idade do leitor: "+ this.leitor.getIdade());
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }


    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (totPaginas < p){
            System.out.println(0);
        } else {
            this.pagAtual = p;
        }

    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
