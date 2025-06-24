package org.example.AbstractFactory;

public class CartaoFactory implements PagamentoFactory {
    public MetodoPagamento criarPagamento() {
        return new PagamentoCartao();
    }
}