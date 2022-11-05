package org.example;

import org.example.juros.JurosBradesco;

public class Bradesco extends CalculadoraDeJuros{
    public Bradesco() {
        calculaJuros = new JurosBradesco();
    }
}
