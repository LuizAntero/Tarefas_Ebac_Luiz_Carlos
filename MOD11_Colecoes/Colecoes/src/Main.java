import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Luiz Carlos
 * @version 1.0
 * @since 16/07/2023
 */


public class Main {
    public static void main(String[] args) {
        ordemAfabetica();
        ordemDeGenero();
    }
    public static void ordemAfabetica(){
        System.out.println("*****ordemAfabetica*****");
        Scanner leitor = new Scanner(System.in);
        System.out.print("Inserindo nomes separados por vírgula: ");
        String nomes = leitor.next();
        System.out.println("Dados brutos: " + nomes);

        /**
         * Alocando os dados brutos num Array do tipo String e aplicando o método split
         * Ordenando os nomes em ordem alfabética
         */
        String[] nomesSeparados = nomes.split(",");
        Arrays.sort(nomesSeparados);
        System.out.println("Em ordem alfabética" + Arrays.toString(nomesSeparados));
    }

    public static void ordemDeGenero(){
        System.out.println("*****ordemDeGenero*****");
        Scanner leitor = new Scanner(System.in);
        System.out.print("Inserindo nome-sexo separados por vírgula: ");//Willian-M,Isabel-F,Pedro-M,Aline-F
        String dadosBrutos = leitor.next();
        System.out.println("Dados brutos: " + dadosBrutos);

        //Declarando as listas de masculino e feminino
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        //Separando os dados brutos e alocando no Array do tipo String com método split
        String[] nomesSexoSeparados = dadosBrutos.split(",");

        /**
         * Loop para varrer cada elemento do Array nomesSexoSeparados
         * Alocar na variável i do tipo String
         * Alocar em novo método split agora separando o nome da pessoa e gênero
         * em novo Array do tipo String chamado nomeSexo
         * Alocar o elemento da posição 0 para a String nomePessoa
         * Alocar o elemento da posição 1 (vair ser M ou F) e colher o primeiro
         * caractere para o variável genero.
         * Dentro do mesmo laço, vamos aplicar um condicional para alocar
         * os valores de nomePessoa para ArrayList masculino ou feminino
         */
        for(String i: nomesSexoSeparados){
            String[] nomeSexo = i.split("-");
            String nomePessoa = nomeSexo[0];
            char genero = nomeSexo[1].charAt(0);

            if(genero == 'M'){
                masculino.add(nomePessoa);
            } else if (genero == 'F') {
                feminino.add(nomePessoa);
            }
        }
        //Printando no output os dados agrupados
        System.out.println("Nomes masculinos: ");
        for (String nome: masculino){
            System.out.println(nome);
        }
        System.out.println("Nomes femininos: ");
        for (String nome: feminino){
            System.out.println(nome);
        }
    }
}