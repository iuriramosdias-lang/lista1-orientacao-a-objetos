package ex04;

import java.util.UUID;

public class FuncionarioDaQuestao4 {
    private UUID idDoFuncionario;
    private String nomeDoFuncionario;
    private double salarioDoFuncionario;

    public UUID getIdDoFuncionario() {
        return idDoFuncionario;
    }

    public void setIdDoFuncionario(UUID idDoFuncionario) {
        this.idDoFuncionario = idDoFuncionario;
    }

    public String getNomeDoFuncionario() {
        return nomeDoFuncionario;
    }

    public void setNomeDoFuncionario(String nomeDoFuncionario) {
        this.nomeDoFuncionario = nomeDoFuncionario;
    }

    public double getSalarioDoFuncionario() {
        return salarioDoFuncionario;
    }

    public void setSalarioDoFuncionario(double salarioDoFuncionario) {
        this.salarioDoFuncionario = salarioDoFuncionario;
    }

    public FuncionarioDaQuestao4(String nomeDoFuncionario){
        this.nomeDoFuncionario = nomeDoFuncionario;
        this.idDoFuncionario = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "ex04.FuncionarioDaQuestao4{" +
                "idDoFuncionario=" + idDoFuncionario +
                ", nomeDoFuncionario='" + nomeDoFuncionario + '\'' +
                ", salarioDoFuncionario=" + salarioDoFuncionario +
                '}';
    }
}
