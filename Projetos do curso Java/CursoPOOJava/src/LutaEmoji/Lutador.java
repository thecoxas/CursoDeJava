package LutaEmoji;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String categoria;
    private int vitorias, derrotas, empates;

    // Métodos Publicos
    public void apresentar() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Senhoras e senhores apresentamos o lutador: "+ getNome());
        System.out.println("Diretamente do(a): "+ getNacionalidade());
        System.out.println("Com "+ getIdade()+" anos pesando "+ getPeso()+" kg e "+ getAltura()+" de altura " );
        System.out.println(getVitorias()+ " Vitorias");
        System.out.println(getDerrotas()+ " Derrotas");
        System.out.println(getEmpates()+ " Empates");

    }

    public void status() {
        System.out.println(this.getNome()+ " É um peso "+ this.getCategorias());
        System.out.println("Ganhou "+ this.getVitorias()+ " vezes");
        System.out.println("Perdeu "+ this.getDerrotas()+ " vezes");
        System.out.println("Empatou "+ this.getEmpates()+ " vezes");

    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // Contrutor
    public Lutador(String no, String na, int id, int vit, int der, int emp, float al, float pe) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe) ;
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
    }
    // Getters & Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getCategorias() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "pesado";
        } else {
            this.categoria = "Invalido";
        }

    }

}
