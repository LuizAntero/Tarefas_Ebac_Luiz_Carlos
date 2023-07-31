/**
 * @author Luiz Carlos
 * @version 1.0
 * @since 30/07/2023
 */
public class App {
    /**
     * O projeto apresenta a aplicação do conceito de Herança, em que
     * a classe abstrata Pessoa herda suas propriedades para as subclasses PessoaFisica
     * e PessoaJuridica. Aplicamos o método construtor para a iniciolização dos objetos
     * e o método para impressão tanto dos atributos da classe Pessoa quanto daqueles
     * próprios da subclasse.     *
     */
    public static void main (String[] args){
        PessoaFisica pf1 = new PessoaFisica("Fernanda",
                "Rua XV de Novembro, 100", "12345", 'F');
        pf1.imprimir();

        PessoaJuridica pj1 = new PessoaJuridica("Casa das Flores",
                "Av. das Acácias, 985", "589674", "Comércio");
        pj1.imprimir();
    }
}
