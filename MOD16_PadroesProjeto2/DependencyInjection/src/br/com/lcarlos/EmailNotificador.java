package br.com.lcarlos;

//Aqui estamos fazendo a implementação da dependência

public class EmailNotificador implements Notificador{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
