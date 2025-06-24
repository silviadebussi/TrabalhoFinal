package AbstractFactory;

import org.example.AbstractFactory.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    void testPagamentoCartao() {
        MetodoPagamento pagamento = new PagamentoCartao();
        String resultado = pagamento.pagar(100.0);
        assertEquals("Pagamento de 100.0 realizado com Cartão.", resultado);
    }

    @Test
    void testPagamentoPix() {
        PagamentoPix pagamento = new PagamentoPix();
        String resultado = pagamento.pagar(200.0);
        assertEquals("Pagamento de 200.0 realizado com Pix.", resultado);
    }

    @Test
    void testCartaoFactory() {
        PagamentoFactory factory = new CartaoFactory();
        MetodoPagamento pagamento = factory.criarPagamento();
        assertTrue(pagamento instanceof PagamentoCartao);
    }

    @Test
    void testPixFactory() {
        PagamentoFactory factory = new PixFactory();
        MetodoPagamento pagamento = factory.criarPagamento();
        assertTrue(pagamento instanceof PagamentoPix);
    }
}