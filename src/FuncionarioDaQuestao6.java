public class FuncionarioDaQuestao6 extends PessoaDaQuestao6{
    public FuncionarioDaQuestao6(String nome, int idade){
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
        return "FuncionarioDaQuestao6{" +
                "salarioDoFuncionario=" + salarioDoFuncionario +
                ", nomeDaPessoa='" + nomeDaPessoa + '\'' +
                ", idadeDaPessoa=" + idadeDaPessoa +
                '}';
    }
}
