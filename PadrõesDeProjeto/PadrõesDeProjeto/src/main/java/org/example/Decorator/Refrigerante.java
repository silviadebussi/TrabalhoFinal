package org.example.Decorator;
import org.example.FactoryMethod.Pedido;

import org.example.FactoryMethod.Pedido;

public class Refrigerante extends PedidoDecorator {
    private final double preco = 5.0;

    public Refrigerante(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double getValor() {
        return pedidoDecorado.getValor() + preco;
    }

    @Override
    public String processar() {
        return pedidoDecorado.processar() +
                "\nIncluído refrigerante. Novo valor: " + getValor();
    }
}
