package br.com.luizcarlos;

//Aqui temos a subclasse concreta que herda da classe abstrata CriadorDeDocumento que por sua vez implementa
//o Method Factory para criar instâncias concretas.

public class WordDocumentoCriador extends CriadorDeDocumento{
    @Override
    public IDocumento criarDocumento() {
        return new WordDocumento();
    }
}
