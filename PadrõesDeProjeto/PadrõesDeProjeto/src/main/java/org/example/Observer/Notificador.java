package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class Notificador {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    public void notificarTodos(String mensagem) {
        for (Observador o : observadores) {
            o.atualizar(mensagem);
        }
    }
}