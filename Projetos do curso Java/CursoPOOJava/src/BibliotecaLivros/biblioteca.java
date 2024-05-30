package BibliotecaLivros;

public class biblioteca {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        p[0] = new Pessoa("Welton",39, 'M');
        p[1] = new Pessoa("Lucineia", 34, 'F');

        l[0] = new Livro("harrypotter","Ermione",450, p[0] );
        l[1] = new Livro("cursoJava","Devdoto",500, p[1]) ;
        l[2] = new Livro("linux", "Joãzinho",1000, p[0]);

        l[0].abrir();
        l[0].folhear(1);
        l[0].avancarPag();
        p[0].fazerAniver();
        l[0].detalhes();

    }
}
