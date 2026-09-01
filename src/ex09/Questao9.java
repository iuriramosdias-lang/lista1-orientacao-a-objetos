package ex09;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite o nome da pessoa");
        String nomeDaPessoa = sc.nextLine();
        IO.println("Digite a idade");
        int idadeDaPessoa = sc.nextInt();
        sc.nextLine();
        IO.println("Digite o salario do professor");
        double salarioDoProfessor = sc.nextDouble();
        sc.nextLine();
        IO.println("Digite a disciplina que o professor ensina");
        String disciplinaDoProfessor = sc.nextLine();
        IO.println("Digite a matricula do aluno");
        int matriculaDoAluno = sc.nextInt();
        sc.nextLine();
        IO.println("Digite o curso do aluno");
        String cursoDoAluno = sc.nextLine();
        Professor professor = new Professor(nomeDaPessoa, idadeDaPessoa);
        professor.setDisciplinaDoProfessor(disciplinaDoProfessor);
        professor.setSalarioDoProfessor(salarioDoProfessor);
        Aluno aluno = new Aluno(nomeDaPessoa, idadeDaPessoa);
        aluno.setCursoDoAluno(cursoDoAluno);
        aluno.setMatriculaDoAluno(matriculaDoAluno);
        IO.println(professor);
        IO.println("---------------------");
        IO.println(aluno);
        sc.close();
    }
}
