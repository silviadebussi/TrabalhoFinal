package ChainofResponsibility;

import org.example.ChainofResponsibility.VerificacaoPedido;
import org.example.ChainofResponsibility.VerificarCarrinho;
import org.example.ChainofResponsibility.VerificarPagamento;
import org.example.FactoryMethod.*;
import org.example.Singleton.Carrinho;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificacaoPedidoTest {
    private VerificacaoPedido verificacao;
    private Carrinho carrinho;

    @BeforeEach
    void setUp() {
        carrinho = Carrinho.getInstance();
        verificacao = new VerificarCarrinho();
        VerificacaoPedido pagamento = new VerificarPagamento();

        verificacao.setProximo(pagamento);
    }

    @Test
    void testVerificarCarrinhoVazio() {
        carrinho.limpar();
        Pedido pedido = new PedidoNormal(100.0);
        assertEquals("Erro: Carrinho de compras vazio!", verificacao.verificar(pedido));
    }

    @Test
    void testVerificarCarrinhoComItens() {
        carrinho.adicionarItem("Produto 1");
        Pedido pedido = new PedidoNormal(100.0);
        assertEquals("Carrinho verificado com sucesso.", verificacao.verificar(pedido));
    }


    @Test
    void testVerificarFluxoCompleto() {
        carrinho.adicionarItem("Produto 1");
        Pedido pedido = new PedidoNormal(100.0);
        assertEquals("Carrinho verificado com sucesso.", verificacao.verificar(pedido));
    }
}