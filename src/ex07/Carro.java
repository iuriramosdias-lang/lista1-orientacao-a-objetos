package ex07;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo){
        super(marca, modelo);
    }
    private int quantidadeDePortas;

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public String toString() {
        return "ex07.CarroDaQuestao7{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", quantidadeDePortas=" + quantidadeDePortas +
                '}';
    }
}
