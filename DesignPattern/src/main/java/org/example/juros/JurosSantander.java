package org.example.juros;

import org.example.CalculaJuros;

public class JurosSantander implements CalculaJuros {
    @Override
    public double calculoDeJuros(double valor) {
        double juros = 1.12;
        return  valor * juros;
    }
}
