package br.com.luizcarlos;

//Aqui temos uma nova implementação concreta da interface IDocumento
public class WordDocumento implements IDocumento{
    @Override
    public void criar() {
        System.out.println("Criando um documento Word.");
    }
}
