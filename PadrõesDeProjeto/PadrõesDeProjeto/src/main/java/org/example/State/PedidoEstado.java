package org.example.State;
import org.example.FactoryMethod.Pedido;
public abstract class PedidoEstado {

    public abstract String getEstado();

    public boolean aguardarConfirmacao(Pedido pedido) {
        return false;
    }

    public boolean cancelar(Pedido pedido) {
        return false;
    }

    public boolean confirmar(Pedido pedido) {
        return false;
    }

    public boolean enviar(Pedido pedido) {
        return false;
    }

    public boolean entregar(Pedido pedido) {
        return false;
    }

}