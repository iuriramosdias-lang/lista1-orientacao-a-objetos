package ex09;

public class Aluno extends Pessoa {
    public Aluno(String nome, int idade){
        super(nome, idade);
    }
    private int matriculaDoAluno;
    private String cursoDoAluno;

    public int getMatriculaDoAluno() {
        return matriculaDoAluno;
    }

    public void setMatriculaDoAluno(int matriculaDoAluno) {
        this.matriculaDoAluno = matriculaDoAluno;
    }

    public String getCursoDoAluno() {
        return cursoDoAluno;
    }

    public void setCursoDoAluno(String cursoDoAluno) {
        this.cursoDoAluno = cursoDoAluno;
    }

    @Override
    public String toString() {
        return "ex09.AlunoDaQuestao9{" +
                "nomeDaPessoa='" + nomeDaPessoa + '\'' +
                ", idade=" + idade +
                ", matriculaDoAluno=" + matriculaDoAluno +
                ", cursoDoAluno='" + cursoDoAluno + '\'' +
                '}';
    }
}
