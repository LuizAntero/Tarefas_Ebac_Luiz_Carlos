package br.com.lcarlos;

/**
 * Aqui temos a classe ClienteService que depende de um serviço de notificação.
 * No lugar de criar internamente uma instância de Notificador, a classe ClienteService recebe
 * uma instância de Notificador no construtor (Constructor (Constructor Injection) por meio da
 * injeção de dependência. Isso permite diferentes implementações de Notificador para que possam
 * ser usadas sem  alterar o código de ClienteService.
 * Na prática estamos permitindo a flexibilidade do código e sua reutilização.
 */

public class ClienteService {
    private final Notificador notificador;

    public ClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void cadastrarCliente(String nome){
        //Lógica para cadastrar o cliente
        notificador.enviarMensagem("Cliente cadastrado: " + nome);
    }
}
