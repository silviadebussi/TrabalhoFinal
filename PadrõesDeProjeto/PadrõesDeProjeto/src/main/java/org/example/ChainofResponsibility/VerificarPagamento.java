package org.example.ChainofResponsibility;

import org.example.FactoryMethod.Pedido;

public class VerificarPagamento extends VerificacaoPedido {
    @Override
    public String verificar(Pedido pedido) {
        if (pedido.getValor() <= 0) {
            return "Erro: Pagamento não autorizado!";
        }

        super.verificar(pedido);
        return "Pagamento verificado com sucesso.";
    }
}
