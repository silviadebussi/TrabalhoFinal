package org.example.AbstractFactory;

public class PixFactory implements PagamentoFactory {
    public MetodoPagamento criarPagamento() {
        return new PagamentoPix();
    }
}