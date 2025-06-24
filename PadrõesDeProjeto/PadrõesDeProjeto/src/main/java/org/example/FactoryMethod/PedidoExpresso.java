package org.example.FactoryMethod;

public class PedidoExpresso extends Pedido {
    public PedidoExpresso(double valor) {
        super(valor);
    }
    public String processar() {
        return ("Pedido Expresso processado. Valor: " + valor);
    }
}