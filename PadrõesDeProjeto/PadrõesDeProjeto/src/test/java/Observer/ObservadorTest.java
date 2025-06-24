package Observer;

import org.example.Observer.Cliente;
import org.example.Observer.Notificador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ObservadorTest {
    private Notificador notificador;
    private Cliente cliente;

    @BeforeEach
    void setUp() {
        notificador = new Notificador();
        cliente = new Cliente("Carlos");
        notificador.adicionarObservador(cliente);
    }

    @Test
    void clienteDeveReceberNotificacao() {
        String mensagem = "Promoção especial: 50% de desconto!";
        notificador.notificarTodos(mensagem);

        assertEquals("Cliente Carlos recebeu a notificação: " + mensagem, cliente.getUltimaMensagem());
    }

    @Test
    void clienteNaoDeveReceberNotificacaoSeNaoForAdicionado() {
        Notificador outroNotificador = new Notificador();
        Cliente clienteSemNotificacao = new Cliente("Ana");

        outroNotificador.notificarTodos("Mensagem para ninguém");

        assertTrue(clienteSemNotificacao.getUltimaMensagem().isEmpty());
    }
}
