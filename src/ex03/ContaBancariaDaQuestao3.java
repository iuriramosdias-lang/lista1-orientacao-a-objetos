package ex03;

public class ContaBancariaDaQuestao3 {
    private String nomeDoTitular;
    private double saldoDaConta;

    public ContaBancariaDaQuestao3(String nome){
        this.nomeDoTitular = nome;
        this.saldoDaConta = 0;
    }
    public double deposito(double valor) {
        if (valor > 0) {
            this.saldoDaConta = this.saldoDaConta + valor;
            return this.saldoDaConta;
        } else {
            IO.println("Depósito inválido");
            return 0;
        }
    }
    public double saque(double valor){
            if(valor <= this.saldoDaConta && valor > 0){
                this.saldoDaConta = this.saldoDaConta - valor;
                return valor;

            }
            else{
                IO.println("Saque inválido. Você não possui essa quantia.");
                return 0;
            }
        }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    @Override
    public String toString() {
        return "ex03.ContaBancariaDaQuestao3{" +
                "nomeDoTitular='" + nomeDoTitular + '\'' +
                ", saldoDaConta=" + saldoDaConta +
                '}';
    }
}


