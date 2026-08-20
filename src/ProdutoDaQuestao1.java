import java.util.UUID;

public class ProdutoDaQuestao1{
    private UUID id;
    private String nomeDoProduto;
    private int quantidadeDoProduto;
    private double precoDoProduto;

    public ProdutoDaQuestao1(String nomeDoProduto, int quantidadeDoProduto, double precoDoProduto){
        this.id = UUID.randomUUID();
        this.quantidadeDoProduto = quantidadeDoProduto;
        this.nomeDoProduto = nomeDoProduto;
        this.precoDoProduto = precoDoProduto;
    }

    public UUID getId() {
        return id;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public int getQuantidadeDoProduto() {
        return quantidadeDoProduto;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public void setQuantidadeDoProduto(int quantidadeDoProduto) {
        this.quantidadeDoProduto = quantidadeDoProduto;
    }

    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    @Override
    public String toString() {
        return "ID: " + id
                + ", Nome: " + nomeDoProduto
                + ", Quantidade: " + quantidadeDoProduto
                + ", Preço: %.2f" + precoDoProduto;
    }
}






