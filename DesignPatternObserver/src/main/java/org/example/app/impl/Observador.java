package org.example.app.impl;

import org.example.app.interfaces.iObservador;

public class Observador  implements iObservador{

    int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel frase) {

    }

}
