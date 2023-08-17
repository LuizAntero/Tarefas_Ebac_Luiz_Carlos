package br.com.lcarlos;

public class Main {
    public static void main(String[] args) {
        Notificador notificador = new EmailNotificador();
        ClienteService clienteService = new ClienteService(notificador);

        clienteService.cadastrarCliente("Rafaela");
    }
}