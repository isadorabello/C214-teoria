package org.example.app.impl;

import org.example.app.interfaces.iObservavel;

import java.util.ArrayList;
import java.util.List;

public class Observavel implements iObservavel{

    private String frase;
    private int quantTotal;
    private int quantPares;
    private int quantMaiusculas;
    private List<Observador> observadores;

    public Observavel() {
        observadores = new ArrayList<Observador>();
    }

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

    private int contarPares(String[] frase) {
        int cont = 0;
        for(String s: frase) {
            if(s.length() % 2 == 0){
                cont++;
            }
        }
        return cont;
    }

    private int contarMaiusculas(String[] frase){
        int cont = 0;
        for(int i = 0; i<frase.length; i++){
            char aux = frase[i].charAt(0);
            if(Character.isUpperCase(aux)){
                cont++;
            }
        }
        return cont;
    }

    private void novasMedidas(String frase) {
        String[] palavrasAux = frase.split(" ");
        int count1 = 0;
        int count2 = 0;

        setQuantTotal(palavrasAux.length);

        count1= contarPares(palavrasAux);
        setQuantPares(count1);

        count2 = contarMaiusculas(palavrasAux);
        setQuantMaiusculas(count2);

        System.out.println("--------------------- Nova noticação --------------------");
        notificaObservadores();
    }

    public void setNovaFrase(String frase) {
        System.out.println("\n\n####### NOVIDADE: Frase Adicionada #######\n\n");
        this.frase = frase;
        novasMedidas(this.frase);
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setObservadores(List<Observador> observadores) {
        this.observadores = observadores;
    }

    public List<Observador> getObservadores() {
        return observadores;
    }

    public int getQuantMaiusculas() {
        return quantMaiusculas;
    }

    public void setQuantMaiusculas(int quantMaiusculas) {
        this.quantMaiusculas = quantMaiusculas;
    }

    public int getQuantPares() {
        return quantPares;
    }

    public void setQuantPares(int quantPares) {
        this.quantPares = quantPares;
    }

    public int getQuantTotal() {
        return quantTotal;
    }

    public void setQuantTotal(int numPalavras) {
        this.quantTotal = numPalavras;
    }
}
