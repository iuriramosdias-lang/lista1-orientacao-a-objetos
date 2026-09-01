package ex09;

public class Professor extends Pessoa {
    public Professor(String nome, int idade){
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
        return "ex09.ProfessorDaQuestao9{" +
                "nomeDaPessoa='" + nomeDaPessoa + '\'' +
                ", idade=" + idade +
                ", disciplinaDoProfessor='" + disciplinaDoProfessor + '\'' +
                ", salarioDoProfessor=" + salarioDoProfessor +
                '}';
    }
}
