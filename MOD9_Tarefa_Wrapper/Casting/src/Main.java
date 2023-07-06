import java.util.Scanner;
/**
 * @author Luiz Carlos
 * @version 1.0
 * @since 06/07/2023
 */
public class Main {
    public static void main(String[] args) {
        //Este projeto demonstra a aplicação do casting
        //Solicito um valor numérico do usuário no console
        System.out.print("Digite a sua idade: ");

        /*Importamos a classe Scanner para coletar a informação do console
        /O valor numérico será alocado na variável de tipo primitivo int
        /Criamos a Wrapper Class Byte cujo valor atribuído será
        /o valor numérico int num por meio do casting explícito (byte) num
        */
        Scanner leitor = new Scanner(System.in);
        int num = leitor.nextInt();
        Byte num2 = (byte) num;

        //Temos a validação impressa da classe invólucro Byte
        //O projeto demonstra o uso adequado da memória para este contexto
        System.out.println("Sua Idade: " + num2 + " anos");
    }
}