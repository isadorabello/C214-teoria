package org.example;

import org.example.juros.JurosItau;

public class Itau extends CalculadoraDeJuros{
    public Itau() {
        calculaJuros = new JurosItau();
    }
}
