package org.example.State;

import org.example.FactoryMethod.Pedido;

public class PedidoEstadoEnviado extends PedidoEstado {
    private PedidoEstadoEnviado() {};
    private static PedidoEstadoEnviado instance = new PedidoEstadoEnviado();
    public static PedidoEstadoEnviado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Enviado";
    }

    public boolean entregar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}