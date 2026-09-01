package ex07;

public class MotoDaQuestao7 extends VeiculoDaQuestao7 {
    public MotoDaQuestao7(String marca, String modelo){
        super(marca, modelo);
    }
    int cilindradasDaMoto;

    public void setCilindradasDaMoto(int cilindradasDaMoto) {
        this.cilindradasDaMoto = cilindradasDaMoto;
    }

    @Override
    public String toString() {
        return "ex07.MotoDaQuestao7{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindradasDaMoto=" + cilindradasDaMoto +
                '}';
    }
}
