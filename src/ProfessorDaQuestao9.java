public class ProfessorDaQuestao9 extends PessoaDaQuestao9{
    public ProfessorDaQuestao9(String nome, int idade){
        super(nome, idade);
    }
    private String disciplinaDoProfessor;
    private double salarioDoProfessor;

    public String getDisciplinaDoProfessor() {
        return disciplinaDoProfessor;
    }

    public void setDisciplinaDoProfessor(String disciplinaDoProfessor) {
        this.disciplinaDoProfessor = disciplinaDoProfessor;
    }

    public double getSalarioDoProfessor() {
        return salarioDoProfessor;
    }

    public void setSalarioDoProfessor(double salarioDoProfessor) {
        if(salarioDoProfessor > 0){
            this.salarioDoProfessor = salarioDoProfessor;
        }
        else{
            IO.println("Salario invalido");
        }
    }

    @Override
    public String toString() {
        return "ProfessorDaQuestao9{" +
                "nomeDaPessoa='" + nomeDaPessoa + '\'' +
                ", idade=" + idade +
                ", disciplinaDoProfessor='" + disciplinaDoProfessor + '\'' +
                ", salarioDoProfessor=" + salarioDoProfessor +
                '}';
    }
}
