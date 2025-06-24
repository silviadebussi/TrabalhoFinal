package org.example.ChainofResponsibility;

import org.example.FactoryMethod.Pedido;

public abstract class VerificacaoPedido {
    protected VerificacaoPedido proximo;

    public void setProximo(VerificacaoPedido proximo) {
        this.proximo = proximo;
    }

    public String verificar(Pedido pedido) {
        if (proximo != null) {
            return proximo.verificar(pedido);
        }
        return null;
    }
}
