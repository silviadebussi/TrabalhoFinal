package Singleton;

import org.example.Singleton.Carrinho;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
class CarrinhoTest {
    private Carrinho carrinho;

    @BeforeEach
    void setUp() {
        carrinho = Carrinho.getInstance();
        carrinho.getItens().clear();
    }

    @Test
    void deveRetornarMesmaInstanciaSingleton() {
        Carrinho outroCarrinho = Carrinho.getInstance();
        assertSame(carrinho, outroCarrinho, "Carrinho deve ser a mesma instância Singleton");
    }

    @Test
    void deveAdicionarItemNoCarrinho() {
        String resultado = carrinho.adicionarItem("Pizza");
        assertTrue(carrinho.getItens().contains("Pizza"));
        assertEquals("Item adicionado ao carrinho: Pizza", resultado);
    }

    @Test
    void deveRemoverItemDoCarrinho() {
        carrinho.adicionarItem("Chocolate");
        String resultado = carrinho.removerItem("Chocolate");
        assertFalse(carrinho.getItens().contains("Chocolate"));
        assertEquals("Item removido do carrinho: Chocolate", resultado);
    }

    @Test
    void deveListarItensDoCarrinho() {
        carrinho.adicionarItem("Halls");
        carrinho.adicionarItem("Coca-cola");

        String resultado = carrinho.listarItens();
        assertEquals("Itens no carrinho: [Halls, Coca-cola]", resultado);
    }

    @Test
    void deveRetornarListaVaziaSeNenhumItemForAdicionado() {
        String resultado = carrinho.listarItens();
        assertEquals("Itens no carrinho: []", resultado);
    }
}
