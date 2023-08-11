package br.com.luizcarlos;

//Aqui temos a classe abstrata que vai declarar o Method Factory para as subclasses implementarem.
//O método vai retornar objeto do tipo IDocumento

abstract class CriadorDeDocumento {
    //Referenciando a interface IDocumento
    public abstract IDocumento criarDocumento();
}
