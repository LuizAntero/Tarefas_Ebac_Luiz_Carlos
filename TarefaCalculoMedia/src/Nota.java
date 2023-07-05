/**
 * @author Luiz Carlos
 * @version 1.0
 * @since 05/04/2023
 */
public class Nota {
    public static void main(String [] args){
        //Criamos uma array(vetor) do tipo int chamado nota contendo 4 valores
        int[] nota = {6, 8, 9, 7};

        //Declaramos uma variável chamada soma do tipo int com valor 0
        //Declaramos uma variável chamada media do tipo float
        int soma = 0;
        float media;

        /*Aplicamos um laço de repetição (for each) para o array que vai somar cada elemento
        e guardar na variável soma*/
        for (int val : nota) {
            soma += val;
        }

        //Aqui coletamos o total de elementos que compõem o array nota
        int qtdValores = nota.length;

        //Aqui calculamos a média convertendo os valores para float
        media = ((float) soma / (float)qtdValores);

        //Demonstrando o resultado no console
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}

