import java.util.Scanner;

/**
 * @author Luiz Carlos
 * @version 1.0
 * @since 09/07/2023
 */
public class Main {
    public static void main(String[] args) {
        /* Programa para avaliar a média de 4 notas do aluno.
         * Em duas linhas de código no método main foi possível criar
         * um novo objeto da classe Aluno e chamar o método mediaAluno.
         * No método foi utilizado o laço for para totalizar as 4 notas,
         * aplicar a média e a condicional de acordo com o resultado
         */
       Aluno a1 = new Aluno("Luiz Carlos");
       a1.mediaAluno();
    }
}