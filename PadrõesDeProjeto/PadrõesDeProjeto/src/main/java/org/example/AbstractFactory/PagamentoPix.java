package org.example.AbstractFactory;

public class PagamentoPix implements MetodoPagamento {
    public String pagar(double valor) {
        return ("Pagamento de " + valor + " realizado com Boleto.");
    }
}
