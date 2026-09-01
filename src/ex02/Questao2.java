package ex02;

import java.util.Locale;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de alunos que deseja cadastrar");
        int numeroDeAlunos = sc.nextInt();
        sc.nextLine();

        AlunoDaQuestao2[] alunos = new AlunoDaQuestao2[numeroDeAlunos];

        for (int i = 0; i < alunos.length; i++) {

            if (i == 0) {
                System.out.printf("Digite o nome do aluno %d%n", i + 1);
                String nomeDoAluno = sc.nextLine();

                System.out.printf("Digite a idade do aluno %d%n", i + 1);
                int idadeDoAluno = sc.nextInt();
                sc.nextLine();

                System.out.printf("Digite o curso do aluno %d%n", i + 1);
                String cursoDoAluno = sc.nextLine();

                alunos[i] = new AlunoDaQuestao2(
                        nomeDoAluno,
                        idadeDoAluno,
                        cursoDoAluno
                );

            } else if (i == 1) {

                System.out.printf("Digite o nome do aluno %d%n", i + 1);
                String nomeDoAluno = sc.nextLine();

                alunos[i] = new AlunoDaQuestao2(nomeDoAluno);

            } else {

                alunos[i] = new AlunoDaQuestao2();
            }
        }

        for(int i = 0; i < alunos.length; i++ ){
            System.out.println(alunos[i]);
        }

        sc.close();
    }
}