package planocargocarreira.model;

public class Cargo {
    
    private String denomicacao;
    private Double baseSalarial;

    public Cargo() {}

    public Cargo(String denomicacao, Double baseSalarial) {
        this.denomicacao = denomicacao;
        this.baseSalarial = baseSalarial;
    }

    public String getDenomicacao() {
        return denomicacao;
    }

    public void setDenomicacao(String denomicacao) {
        this.denomicacao = denomicacao;
    }

    public Double getBaseSalarial() {
        return this.baseSalarial;
    }

    public void setBaseSalarial(Double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    @Override
    public String toString() {
        return "Cargo [denomicacao=" + denomicacao + ", baseSalarial=" + baseSalarial + "]";
    }   
}
