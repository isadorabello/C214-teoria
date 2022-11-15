package org.example.app.impl;

import org.example.app.interfaces.iObservador;

public class Observador  implements iObservador{

    int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel frase) {
        System.out.println("Identificador: "+this.id);
        System.out.println("A quantidade de palavras é " + frase.getQuantTotal());
        System.out.println("Palavras pares: " + frase.getQuantPares());
        System.out.println("Palavras com primeira letra maiuscula: " + frase.getQuantMaiusculas());
        System.out.println("------------------------------------------------------------");
    }

}
