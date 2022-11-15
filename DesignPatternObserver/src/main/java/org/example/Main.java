package org.example;

import org.example.app.impl.Observador;
import org.example.app.impl.Observavel;

public class Main {
    public static void main(String[] args) {

        Observavel frase = new Observavel();

        Observador o1 = new Observador(111);
        Observador o2 = new Observador(222);
        Observador o3 = new Observador(333);
        Observador o4 = new Observador(444);

        frase.registraObservador(o1);
        frase.registraObservador(o2);
        frase.registraObservador(o3);
        frase.registraObservador(o4);

        frase.setNovaFrase("Take me down to the paradise city Where the grass is green and the girls are pretty Take me home");

        frase.removeObservador(o1);

        frase.setNovaFrase("Parece uma rosa De longe é formosa É toda recalcada Alegria alheia incomoda");

        frase.removeObservador(o4);

        frase.setNovaFrase("Não se pode pisar duas vezes no mesmo rio");

        frase.setNovaFrase("O nome do deus era Zeus, o nome do filho, Perseu");
    }
}