package org.example;

import org.example.juros.JurosBB;

public class BancoDoBrasil extends CalculadoraDeJuros{
    public BancoDoBrasil() {
        calculaJuros = new JurosBB();
    }
}
