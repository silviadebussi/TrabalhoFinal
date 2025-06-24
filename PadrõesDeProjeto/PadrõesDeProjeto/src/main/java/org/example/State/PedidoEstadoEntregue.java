package org.example.State;

import org.example.FactoryMethod.Pedido;

public class PedidoEstadoEntregue extends PedidoEstado {
    private PedidoEstadoEntregue() {};
    private static PedidoEstadoEntregue instance = new PedidoEstadoEntregue();
    public static PedidoEstadoEntregue getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Entregue";
    }

}