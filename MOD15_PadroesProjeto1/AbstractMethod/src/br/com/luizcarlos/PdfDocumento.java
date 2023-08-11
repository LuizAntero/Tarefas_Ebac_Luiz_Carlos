package br.com.luizcarlos;

//Aqui temos a implementação concreta da interface Documento
public class PdfDocumento implements IDocumento {
    @Override
    public void criar() {
        System.out.println("Criando um documento PDF.");
    }
}
