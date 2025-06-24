package org.example.Singleton;

import java.util.ArrayList;
import java.util.List;


public class Carrinho {
    private static volatile Carrinho instance;
    private List<String> itens;

    private Carrinho() {
        this.itens = new ArrayList<>();
    }

    public static Carrinho getInstance() {
        if (instance == null) {
            synchronized (Carrinho.class) {
                if (instance == null) {
                    instance = new Carrinho();
                }
            }
        }
        return instance;
    }
    public void limpar() {
        this.itens.clear();
    }

    public String adicionarItem(String item) {
        itens.add(item);
        return ("Item adicionado ao carrinho: " + item);
    }

    public String removerItem(String item) {
        itens.remove(item);
        return ("Item removido do carrinho: " + item);
    }

    public String listarItens() {
        return("Itens no carrinho: " + itens);
    }

    public List<String> getItens() {
        return itens;
    }
}