package ProjetoFinal;

import Herança2.Cachorro;

public class projetoYoutube {
    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de Poo");
        v[1] = new Video("Aula2 de Poo");
        v[2] = new Video("Aula 3 de Poo");

        Gafanhotos g[] = new Gafanhotos[3];
        g[0] = new Gafanhotos("Mickaelly", 17, "F", "kpop");
        g[1] = new Gafanhotos("Mickessuel", 12, "M", "goku");
        g[2] = new Gafanhotos("Nicolas", 7, "M", "Vera");

        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0],v[0]);
        vis[0].avaliar(10.5f);
        vis[1] = new Visualizacao(g[0],v[1]);
        vis[1].avaliar(10);
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());

        //v[0].play();
        //v[0].like();
        //v[0].setAvaliacoes(5);


        //System.out.println(v[0].toString());
        // System.out.println(v[1].toString());
        //System.out.println(v[2].toString());
        //System.out.println(g[0].toString());
        //System.out.println(g[1].toString());
        //System.out.println(g[2].toString());/*
    }
}
