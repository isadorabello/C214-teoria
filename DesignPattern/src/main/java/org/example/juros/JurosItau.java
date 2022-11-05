package org.example.juros;

import org.example.CalculaJuros;

public class JurosItau implements CalculaJuros {
    @Override
    public double calculoDeJuros(double valor) {
        double juros = 1.18;
        return  valor * juros;
    }
}
