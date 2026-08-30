public class AlunoDaQuestao9 extends PessoaDaQuestao9{
    public AlunoDaQuestao9(String nome, int idade){
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
        return "AlunoDaQuestao9{" +
                "nomeDaPessoa='" + nomeDaPessoa + '\'' +
                ", idade=" + idade +
                ", matriculaDoAluno=" + matriculaDoAluno +
                ", cursoDoAluno='" + cursoDoAluno + '\'' +
                '}';
    }
}
