import java.util.Scanner;
import java.util.UUID;

public class AlunoDaQuestao2 {
    private UUID id;
    private String nomeDoAluno;
    private int idadeDoAluno;
    private String cursoDoAluno;

    Scanner sc = new Scanner(System.in);

    public AlunoDaQuestao2(){
        this.cursoDoAluno = this.cursoDoAluno;
        this.id = UUID.randomUUID();
        this.nomeDoAluno = this.nomeDoAluno;
        this.idadeDoAluno = this.idadeDoAluno;

    }

    public AlunoDaQuestao2(String nomeDoAluno){
        this.nomeDoAluno = nomeDoAluno;
        this.idadeDoAluno = this.idadeDoAluno;
        this.cursoDoAluno = this.cursoDoAluno;
        this.id = UUID.randomUUID();
    }
    public AlunoDaQuestao2(String nomeDoAluno, int idadeDoAluno, String cursoDoAluno){
        this.nomeDoAluno = nomeDoAluno;
        this.idadeDoAluno = idadeDoAluno;
        this.cursoDoAluno = cursoDoAluno;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public int getIdadeDoAluno() {
        return idadeDoAluno;
    }

    public String getCursoDoAluno() {
        return cursoDoAluno;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public void setIdadeDoAluno(int idadeDoAluno) {
        this.idadeDoAluno = idadeDoAluno;
    }

    public void setCursoDoAluno(String cursoDoAluno) {
        this.cursoDoAluno = cursoDoAluno;
    }

    @Override
    public String toString() {
        return "AlunoDaQuestao2{" +
                "Id=" + id +
                ", Nome:'" + nomeDoAluno+
                ", Idade: " + idadeDoAluno +
                ", Curso'" + cursoDoAluno + '\'' +
                '}';
    }


}
