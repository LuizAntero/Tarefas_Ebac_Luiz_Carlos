package br.com.lcarlos;

//Interface da dependência que vai proporcionar o serviço de notificação

public interface Notificador {
    void enviarMensagem(String mensagem);
}
