package org.example;

import org.example.juros.JurosBB;
import org.example.juros.JurosBradesco;
import org.example.juros.JurosItau;
import org.example.juros.JurosSantander;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TesteCalculadoraDeJuros {
    CalculadoraDeJuros calculadoraDeJuros;

    @Test
    public void testeSantander() {
        calculadoraDeJuros = new Santander();
        assertTrue(calculadoraDeJuros.getCalculaJuros() instanceof JurosSantander);
    }

    @Test
    public void testeSantanderValor() {
        calculadoraDeJuros = new Santander();
        double valor = calculadoraDeJuros.calculaJuros(100);
        assertEquals(valor, 112.0, 0.1);

    }

    @Test
    public void testeItau() {
        calculadoraDeJuros = new Itau();
        assertTrue(calculadoraDeJuros.getCalculaJuros() instanceof JurosItau);
    }

    @Test
    public void testeItauValor() {
        calculadoraDeJuros = new Itau();
        double valor = calculadoraDeJuros.calculaJuros(100);
        assertEquals(valor, 118.0, 0.1);

    }

    @Test
    public void testeBradesco() {
        calculadoraDeJuros = new Bradesco();
        assertTrue(calculadoraDeJuros.getCalculaJuros() instanceof JurosBradesco);
    }

    @Test
    public void testeBradescoValor() {
        calculadoraDeJuros = new Bradesco();
        double valor = calculadoraDeJuros.calculaJuros(100);
        assertEquals(valor, 105.0, 0.1);

    }

    @Test
    public void testeBancoDoBrasil() {
        calculadoraDeJuros = new BancoDoBrasil();
        assertTrue(calculadoraDeJuros.getCalculaJuros() instanceof JurosBB);
    }

    @Test
    public void testeBancoDoBrasilValor() {
        calculadoraDeJuros = new BancoDoBrasil();
        double valor = calculadoraDeJuros.calculaJuros(100);
        assertEquals(valor, 107.0, 0.1);

    }
}
