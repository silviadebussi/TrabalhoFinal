package org.example.State;

import org.example.FactoryMethod.Pedido;

public class PedidoEstadoConfirmado extends PedidoEstado {
    private PedidoEstadoConfirmado() {};
    private static PedidoEstadoConfirmado instance = new PedidoEstadoConfirmado();
    public static PedidoEstadoConfirmado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Confirmado";
    }

    public boolean enviar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
