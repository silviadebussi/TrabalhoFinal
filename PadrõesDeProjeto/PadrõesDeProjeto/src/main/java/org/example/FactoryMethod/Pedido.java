package org.example.FactoryMethod;


import org.example.State.*;

public class Pedido {
    protected double valor;
    private PedidoEstado estado;
    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }
    public Pedido(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public Pedido() {
        this.estado = PedidoEstadoAguardandoConfirmacao.getInstance();
    }

    public boolean aguardarConfirmacao() {
        return estado.aguardarConfirmacao(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean confirmar() {
        return estado.confirmar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean enviar() {
        return estado.enviar(this);
    }


    public String getNomeEstado() {
        return estado.getEstado();
    }

    public PedidoEstado getEstado() {
        return estado;
    }


    public String processar() {
        return "Pedido no estado: " + getNomeEstado() + ", valor: R$ " + valor;
    }

}
