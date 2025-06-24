package org.example.Decorator;

import org.example.FactoryMethod.Pedido;

abstract class PedidoDecorator extends Pedido {
    protected Pedido pedidoDecorado;

    public PedidoDecorator(Pedido pedido) {
        super(pedido.getValor());
        this.pedidoDecorado = pedido;
    }

    @Override
    public abstract String processar();

    @Override
    public double getValor() {
        return pedidoDecorado.getValor();
    }
}
