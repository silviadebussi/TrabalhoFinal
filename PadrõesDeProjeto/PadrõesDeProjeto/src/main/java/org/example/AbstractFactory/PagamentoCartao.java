package org.example.AbstractFactory;

public class PagamentoCartao implements MetodoPagamento {
    public String pagar(double valor) {
        return ("Pagamento de " + valor + " realizado com Cartão.");
    }
}