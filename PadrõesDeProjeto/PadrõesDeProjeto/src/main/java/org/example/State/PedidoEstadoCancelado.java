package org.example.State;

import org.example.FactoryMethod.Pedido;

public class PedidoEstadoCancelado extends PedidoEstado {
    private PedidoEstadoCancelado() {};
    private static PedidoEstadoCancelado instance = new PedidoEstadoCancelado();
    public static PedidoEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }

}