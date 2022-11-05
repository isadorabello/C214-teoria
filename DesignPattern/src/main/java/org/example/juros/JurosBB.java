package org.example.juros;

import org.example.CalculaJuros;

public class JurosBB implements CalculaJuros {
    @Override
    public double calculoDeJuros(double valor) {
        double juros = 1.07;
        return  valor * juros;
    }
}
