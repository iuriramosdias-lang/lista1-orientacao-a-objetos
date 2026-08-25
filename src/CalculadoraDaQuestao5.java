
public class CalculadoraDaQuestao5 {
    double primeiroNumero;
    double segundoNumero;
    double terceiroNumero;


    public CalculadoraDaQuestao5(double primeiroNumero, double segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    public CalculadoraDaQuestao5(int primeiroNumero, int segundoNumero) {
        this.primeiroNumero = (double) primeiroNumero;
        this.segundoNumero = (double) segundoNumero;
    }

    public CalculadoraDaQuestao5(int primeiroNumero, int segundoNumero, int terceiroNumero) {
        this.primeiroNumero = (double) primeiroNumero;
        this.segundoNumero = (double) segundoNumero;
        this.terceiroNumero = (double) terceiroNumero;
    }


    public void somaDeDoisInteiros(){
        double resultadoDaSoma = this.primeiroNumero + this.segundoNumero;
        int resultadoDaSoma1 = (int) resultadoDaSoma;
        IO.println("O resultado e"+ resultadoDaSoma1);
    }


    public void somaDeDoisDoubles(){
        double resultadoDaSoma = this.primeiroNumero + this.segundoNumero;
        IO.println("O resultado da soma e"+ resultadoDaSoma);
    }

    public void somaDeTresInteiros(){
        double resultadoDaSoma = this.primeiroNumero + this.segundoNumero + this.terceiroNumero;
        int resultadoDaSoma1 = (int) resultadoDaSoma;
        IO.println("O resultado e"+ resultadoDaSoma1);
    }
}
