package org.example.Observer;

public class Cliente implements Observador {
    private String nome;
    private String ultimaMensagem = "";

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String atualizar(String mensagem) {
        this.ultimaMensagem = "Cliente " + nome + " recebeu a notificação: " + mensagem;
        return (ultimaMensagem);
    }

    public String getUltimaMensagem() {
        return ultimaMensagem;
    }
}
