package br.com.luizcarlos;

/**
 * Aqui temos o resultado do uso do Abstract Factory Method que encapsula a lógica de criação de objetos
 * em subclasses.
 * Temos dois tipos de documento, PDF e WORD. A classe abstrada CriadorDeDocumento
 * define o Factory Method '.criarDocumento()' que as subclasses concretas
 * PdfDocumentoCriador e WordDocumentoCriador IMPLEMENTAM para criar os novos objetos meuPdf e meuWord.
 */
public class Cliente {
    public static void main (String [] args){
        CriadorDeDocumento meuPdf = new PdfDocumentoCriador();
        IDocumento pdfDocumento = meuPdf.criarDocumento();
        pdfDocumento.criar();

        CriadorDeDocumento meuWord = new WordDocumentoCriador();
        IDocumento wordDocumento = meuWord.criarDocumento();
        wordDocumento.criar();
    }
}
