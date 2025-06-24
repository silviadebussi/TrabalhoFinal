package org.example.ChainofResponsibility;

import org.example.FactoryMethod.Pedido;
import org.example.Singleton.Carrinho;

public class VerificarCarrinho extends VerificacaoPedido {
    public String verificar(Pedido pedido) {
        if (Carrinho.getInstance().getItens().isEmpty()) {
            return ("Erro: Carrinho de compras vazio!");
        }
        super.verificar(pedido);
        return("Carrinho verificado com sucesso.");
    }

}