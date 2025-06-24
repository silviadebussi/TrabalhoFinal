package org.example.Decorator;
import org.example.FactoryMethod.Pedido;
import org.example.FactoryMethod.Pedido;

public class BaconExtra extends PedidoDecorator {
    private final double preco = 3.0;

    public BaconExtra(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double getValor() {
        return pedidoDecorado.getValor() + preco;
    }

    @Override
    public String processar() {
        return pedidoDecorado.processar() +
                "\nAdicionado bacon extra. Novo valor: " + getValor();
    }
}


