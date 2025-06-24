package org.example.FactoryMethod;

public class PedidoRetiradaLoja extends Pedido {
    public PedidoRetiradaLoja(double valor) {
        super(valor);
    }
    public String processar() {
        return("Pedido Retirada Loja processado. Valor: " + valor);
    }
}