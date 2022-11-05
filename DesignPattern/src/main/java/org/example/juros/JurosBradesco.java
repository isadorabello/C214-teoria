package org.example.juros;

import org.example.CalculaJuros;

public class JurosBradesco implements CalculaJuros {
    @Override
    public double calculoDeJuros(double valor) {
        double juros = 1.05;
        return  valor * juros;
    }
}
