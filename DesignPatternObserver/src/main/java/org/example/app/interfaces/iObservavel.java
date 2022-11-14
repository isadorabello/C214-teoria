package org.example.app.interfaces;

import org.example.app.impl.Observador;

public interface iObservavel {
    void registraObservador(Observador obs);
    void removeObservador(Observador obs);
    void notificaObservadores();
}
