package org.example;

import org.example.juros.JurosSantander;

public class Santander extends CalculadoraDeJuros{
    public Santander() {
        calculaJuros = new JurosSantander();
    }
}
