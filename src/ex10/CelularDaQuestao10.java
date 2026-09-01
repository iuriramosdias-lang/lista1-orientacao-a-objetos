package ex10;

public class CelularDaQuestao10 {
    private String marcaDoCelular;
    private String modeloDoCelular;
    private String armazenamentoDoCelular;

    public CelularDaQuestao10(String marcaDoCelular, String modeloDoCelular, String armazenamentoDoCelular) {
        this.marcaDoCelular = marcaDoCelular;
        this.modeloDoCelular = modeloDoCelular;
        this.armazenamentoDoCelular = armazenamentoDoCelular;
    }

    public CelularDaQuestao10(String marcaDoCelular, String modeloDoCelular) {
        this.marcaDoCelular = marcaDoCelular;
        this.modeloDoCelular = modeloDoCelular;
    }
    public CelularDaQuestao10(String marcaDoCelular) {
        this.marcaDoCelular = marcaDoCelular;
    }

    public String getMarcaDoCelular() {
        return marcaDoCelular;
    }

    public void setMarcaDoCelular(String marcaDoCelular) {
        this.marcaDoCelular = marcaDoCelular;
    }

    public String getModeloDoCelular() {
        return modeloDoCelular;
    }

    public void setModeloDoCelular(String modeloDoCelular) {
        this.modeloDoCelular = modeloDoCelular;
    }

    public String getArmazenamentoDoCelular() {
        return armazenamentoDoCelular;
    }

    public void setArmazenamentoDoCelular(String armazenamentoDoCelular) {
        this.armazenamentoDoCelular = armazenamentoDoCelular;
    }

    public String exibirDados() {
        return "O Celular solicitado possui os seguintes dados" +
                "Marca" + marcaDoCelular + "                 "+
                "Modelo" + modeloDoCelular + "                 "+
                "Armazenamento" + armazenamentoDoCelular;
    }
}
