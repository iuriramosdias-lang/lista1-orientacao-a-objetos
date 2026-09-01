package ex08;

public class LivroDaQuestao8 extends ProdutoDaQuestao8 {
    public LivroDaQuestao8(String nomeDoProduto, double precoDoProduto){
        super(nomeDoProduto, precoDoProduto);
    }
    private String nomeDoAutor;

    public String getNomeDoAutor() {
        return nomeDoAutor;
    }

    public void setNomeDoAutor(String nomeDoAutor) {
        this.nomeDoAutor = nomeDoAutor;
    }

    @Override
    public String toString() {
        return "ex08.LivroDaQuestao8{" +
                "nomeDoProduto='" + nomeDoProduto + '\'' +
                ", precoDoProduto=" + precoDoProduto +
                ", nomeDoAutor='" + nomeDoAutor + '\'' +
                '}';
    }
}
