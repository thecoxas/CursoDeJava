package LutaEmoji;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    // Métodos publicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategorias().equals(l2.getCategorias()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random(); // Gerador randomico
            int vencedor = aleatorio.nextInt(3); // 0, 1, 2;

            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Empatou");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:  // desafiado vence
                    System.out.println("-------------------------------------------");
                    System.out.println("O Vencedor foi " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante vence
                    System.out.println("-------------------------------------------");
                    System.out.println("O vencedor foi " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }

        }
    }


    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getRounds() {
        return rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public boolean getAprovada() {
        return aprovada;
    }
}
