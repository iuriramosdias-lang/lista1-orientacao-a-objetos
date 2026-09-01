package ex07;

public class CarroDaQuestao7 extends VeiculoDaQuestao7 {
    public CarroDaQuestao7(String marca, String modelo){
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
