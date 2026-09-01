package ex06;

public class Funcionario extends Pessoa {
    public Funcionario(String nome, int idade){
        super(nome, idade);
    }
    private double salarioDoFuncionario;

    public double getSalarioDoFuncionario() {
        return salarioDoFuncionario;
    }

    public void setSalarioDoFuncionario(double salarioDoFuncionario) {
        this.salarioDoFuncionario = salarioDoFuncionario;
    }

    @Override
    public String toString() {
        return "ex06.FuncionarioDaQuestao6{" +
                "salarioDoFuncionario=" + salarioDoFuncionario +
                ", nomeDaPessoa='" + nomeDaPessoa + '\'' +
                ", idadeDaPessoa=" + idadeDaPessoa +
                '}';
    }
}
