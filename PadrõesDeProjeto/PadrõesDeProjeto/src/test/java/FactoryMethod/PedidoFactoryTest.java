package FactoryMethod;

import org.example.FactoryMethod.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoFactoryTest {

    @Test
    void testCriarPedidoNormal() {
        Pedido pedido = PedidoFactory.criarPedido("normal", 100.0);
        assertNotNull(pedido);
        assertTrue(pedido instanceof PedidoNormal);
        assertEquals("Pedido Normal processado. Valor: 100.0", pedido.processar());
    }

    @Test
    void testCriarPedidoExpresso() {
        Pedido pedido = PedidoFactory.criarPedido("expresso", 200.0);
        assertNotNull(pedido);
        assertTrue(pedido instanceof PedidoExpresso);
        assertEquals("Pedido Expresso processado. Valor: 200.0", pedido.processar());
    }

    @Test
    void testCriarPedidoRetiradaLoja() {
        Pedido pedido = PedidoFactory.criarPedido("RetiradaLoja", 200.0);
        assertNotNull(pedido);
        assertTrue(pedido instanceof PedidoRetiradaLoja);
        assertEquals("Pedido Retirada Loja processado. Valor: 200.0", pedido.processar());
    }

    @Test
    void testCriarPedidoTipoInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            PedidoFactory.criarPedido("premium", 300.0);
        });
        assertEquals("Tipo de pedido desconhecido", exception.getMessage());
    }
}
