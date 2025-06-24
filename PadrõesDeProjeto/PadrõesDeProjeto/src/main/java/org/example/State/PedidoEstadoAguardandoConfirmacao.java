package org.example.State;

import org.example.FactoryMethod.Pedido;

public class PedidoEstadoAguardandoConfirmacao extends PedidoEstado {
    private PedidoEstadoAguardandoConfirmacao() {};
    private static PedidoEstadoAguardandoConfirmacao instance = new PedidoEstadoAguardandoConfirmacao();
    public static PedidoEstadoAguardandoConfirmacao getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aguardando Confirmação";
    }

    public boolean confirmar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }






}