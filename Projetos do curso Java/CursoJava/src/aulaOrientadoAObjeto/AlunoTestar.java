package aulaOrientadoAObjeto;

import java.util.Scanner;

public class AlunoTestar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nomeAluno = scan.next();

        System.out.println("Digite a idade do aluno");
        int idadeAluno = scan.nextInt();

        Aluno aluno1 = new Aluno();
        aluno1.setNome(nomeAluno);
        aluno1.setIdade(idadeAluno);
        aluno1.status();
    }
}
