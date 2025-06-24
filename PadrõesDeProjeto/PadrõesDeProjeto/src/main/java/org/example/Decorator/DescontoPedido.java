package org.example.Decorator;
import org.example.FactoryMethod.Pedido;


import org.example.FactoryMethod.Pedido;

public class DescontoPedido extends PedidoDecorator {
    private double desconto;

    public DescontoPedido(Pedido pedido, double desconto) {
        super(pedido);
        this.desconto = desconto;
    }

    @Override
    public double getValor() {
        return pedidoDecorado.getValor() - desconto;
    }

   @Override
    public String processar() {
        double novoValor = getValor();
        return "Pedido com desconto processado. Novo valor: " + novoValor;
    }
}
