package Decorator;

import org.example.Decorator.BaconExtra;
import org.example.Decorator.DescontoPedido;
import org.example.Decorator.Refrigerante;
import org.example.FactoryMethod.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoDecoratorTest {

    @Test
    void testPedidoComDesconto() {
        Pedido pedido = new PedidoNormal(100.0);
        Pedido pedidoComDesconto = new DescontoPedido(pedido, 20.0);
        assertNotNull(pedidoComDesconto);
        assertEquals("Pedido com desconto processado. Novo valor: 80.0", pedidoComDesconto.processar());
    }

    @Test
    void testPedidoComDescontoMaiorQueValor() {
        Pedido pedido = new PedidoNormal(50.0);
        Pedido pedidoComDesconto = new DescontoPedido(pedido, 60.0);
        assertNotNull(pedidoComDesconto);
        assertEquals("Pedido com desconto processado. Novo valor: -10.0", pedidoComDesconto.processar());
    }

    @Test
    void testPedidoComDescontoZero() {
        Pedido pedido = new PedidoExpresso(150.0);
        Pedido pedidoComDesconto = new DescontoPedido(pedido, 0.0);
        assertNotNull(pedidoComDesconto);
        assertEquals("Pedido com desconto processado. Novo valor: 150.0", pedidoComDesconto.processar());
    }

    @Test
    void testPedidoComRefrigerante() {
        Pedido pedido = new PedidoNormal(50.0);
        Pedido pedidoComRefrigerante = new Refrigerante(pedido);
        assertNotNull(pedidoComRefrigerante);
        assertEquals("Pedido Normal processado. Valor: 50.0\nIncluído refrigerante. Novo valor: 55.0", pedidoComRefrigerante.processar());
    }

    @Test
    void testPedidoComBaconExtra() {
        Pedido pedido = new PedidoExpresso(80.0);
        Pedido pedidoComBacon = new BaconExtra(pedido);
        assertNotNull(pedidoComBacon);
        assertEquals("Pedido Expresso processado. Valor: 80.0\nAdicionado bacon extra. Novo valor: 83.0", pedidoComBacon.processar());
    }

    @Test
    void testPedidoComBaconERefrigerante() {
        Pedido pedido = new PedidoNormal(100.0);
        Pedido pedidoComTudo = new BaconExtra(new Refrigerante(pedido));

        assertNotNull(pedidoComTudo);

        String expected = "Pedido Normal processado. Valor: 100.0\n" +
                "Incluído refrigerante. Novo valor: 105.0\n" +
                "Adicionado bacon extra. Novo valor: 108.0";

        assertEquals(expected, pedidoComTudo.processar());
    }

}

