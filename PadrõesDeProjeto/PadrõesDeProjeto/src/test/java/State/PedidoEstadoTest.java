package State;
import org.example.FactoryMethod.Pedido;
import org.example.State.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PedidoEstadoTest {
    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    // Pedido aguardando confirmação

    @Test
    public void naoDeveAguardarConfirmacaoPedidoAguardandoConfirmacao() {
        pedido.setEstado(PedidoEstadoAguardandoConfirmacao.getInstance());
        assertFalse(pedido.aguardarConfirmacao());
    }

    @Test
    public void deveConfirmarPedidoAguardandoConfirmacao() {
        pedido.setEstado(PedidoEstadoAguardandoConfirmacao.getInstance());
        assertTrue(pedido.confirmar());
        assertEquals(PedidoEstadoConfirmado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoAguardandoConfirmacao() {
        pedido.setEstado(PedidoEstadoAguardandoConfirmacao.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEntregarPedidoAguardandoConfirmacao() {
        pedido.setEstado(PedidoEstadoAguardandoConfirmacao.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveEnviarPedidoAguardandoConfirmacao() {
        pedido.setEstado(PedidoEstadoAguardandoConfirmacao.getInstance());
        assertFalse(pedido.enviar());
    }


    // Pedido Confirmado

    @Test
    public void naoDeveConfirmarPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertFalse(pedido.confirmar());
    }

    @Test
    public void deveEnviarPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertTrue(pedido.enviar());
        assertEquals(PedidoEstadoEnviado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEntregarPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveAguardarConfirmacaoPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertFalse(pedido.aguardarConfirmacao());
    }

    // Pedido Enviado

    @Test
    public void naoDeveEnviarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void deveEntregarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveConfirmarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertFalse(pedido.confirmar());
    }

    @Test
    public void naoDeveAguardarConfirmacaoPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertFalse(pedido.enviar());
    }

    // Pedido Entregue

    @Test
    public void naoDeveEntregarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.entregar());
    }


    @Test
    public void naoDeveCancelarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveConfirmarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.confirmar());
    }

    @Test
    public void naoDeveEnviarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveAguardarConfirmacaoPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.aguardarConfirmacao());
    }

    // Pedido Cancelado

    @Test
    public void naoDeveCancelarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.entregar());
    }


    @Test
    public void naoDeveEntregarPedidoCancelar() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveConfirmarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.confirmar());
    }

    @Test
    public void naoDeveEnviarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveAguardarConfirmacaoPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.aguardarConfirmacao());
    }


}
