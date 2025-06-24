package org.example.FactoryMethod;

public class PedidoFactory {
    public static Pedido criarPedido(String tipo, double valor) {
        Class<?> classe;
        Object objeto;
        try {
            classe = Class.forName("org.example.FactoryMethod.Pedido" + tipo.substring(0, 1).toUpperCase() + tipo.substring(1));
            objeto = classe.getConstructor(double.class).newInstance(valor);
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de pedido desconhecido");
        }
        if (!(objeto instanceof Pedido)) {
            throw new IllegalArgumentException("Tipo de pedido inválido");
        }
        return (Pedido) objeto;
    }
}