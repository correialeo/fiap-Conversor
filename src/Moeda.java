public class Moeda {
    private Double valorDolar;
    private Double valorReal;
    private Double quantidadeDolar;
    private Double quantidadeReal;

    public Moeda(){

    }

    public Moeda(Double valorDolar, Double valorReal, Double quantidadeDolar, Double quantidadeReal) {
        this.valorDolar = valorDolar;
        this.valorReal = valorReal;
        this.quantidadeDolar = quantidadeDolar;
        this.quantidadeReal = quantidadeReal;
    }

    public Double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(Double valorDolar) {
        this.valorDolar = valorDolar;
    }

    public Double getValorReal() {
        return valorReal;
    }

    public void setValorReal(Double valorReal) {
        this.valorReal = valorReal;
    }

    public Double getQuantidadeDolar() {
        return quantidadeDolar;
    }

    public void setQuantidadeDolar(Double quantidadeDolar) {
        this.quantidadeDolar = quantidadeDolar;
    }

    public Double getQuantidadeReal() {
        return quantidadeReal;
    }

    public void setQuantidadeReal(Double quantidadeReal) {
        this.quantidadeReal = quantidadeReal;
    }
}
