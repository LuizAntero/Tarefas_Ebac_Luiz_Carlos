package br.com.luizcarlos;

//Aqui temos a subclasse concreta que herda da classe abstrata CriadorDeDocumento que por sua vez implementa
//o Abstract Factory Method para criar instâncias concretas.

class PdfDocumentoCriador extends CriadorDeDocumento {

    @Override
    public IDocumento criarDocumento() {
        return new PdfDocumento();
    }
}
