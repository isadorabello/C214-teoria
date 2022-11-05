package org.example;

public class CalculadoraDeJuros {
    protected CalculaJuros calculaJuros;

    public double calculaFrete(double valor) {
        return calculaJuros.calculoDeJuros(valor);
    }

    public void setCalculaJuros(CalculaJuros calculaJuros) {
        this.calculaJuros = calculaJuros;
    }

    public CalculaJuros getCalculaJuros() {
        return calculaJuros;
    }
}
