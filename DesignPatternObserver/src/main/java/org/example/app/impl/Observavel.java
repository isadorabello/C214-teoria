package org.example.app.impl;

import org.example.app.interfaces.iObservavel;

import java.util.ArrayList;
import java.util.List;

public class Observavel implements iObservavel{

    private List<Observador> observadores;

    @Override
    public void registraObservador(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        if(observadores.contains(obs))
            observadores.remove(obs);
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : observadores) {
            observador.update(this);
        }
    }

    public int contar (String frase){
        String[] textoSeparado = frase.split(" ");
        return textoSeparado.length;
    }

    public int contarPares (String frase){
        int cont = 0;
        String[] textoSeparado = frase.split(" ");
        for (String palavra : textoSeparado){
            if(palavra.length() % 2 == 0){
                cont++;
            }
        }

        return cont;
    }

    public int contarMaiusculas (String frase){
        String[] textoSeparado = frase.split(" ");
        int cont = 0;
        for (String s : textoSeparado) {
            char aux = s.charAt(0);
            if (Character.isUpperCase(aux)) {
                cont++;
            }
        }
        return cont;
    }
}
