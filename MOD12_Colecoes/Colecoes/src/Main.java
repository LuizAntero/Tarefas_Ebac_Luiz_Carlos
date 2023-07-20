import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Luiz Carlos
 * @version 1.0
 * @since 20/07/2023
 */

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Inserindo nomes-sexo: ");//Monica-F,Leandro-M,Aline-F,Silvia-F,Alan-M
        String dadoBruto = leitor.next();
        System.out.println(dadoBruto.toString());

        String [] listaNomeSexo = dadoBruto.split(",");

        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        for (String temp: listaNomeSexo){
            String [] nomeSexo = temp.split("-");
            String nome = nomeSexo[0];
            char genero = nomeSexo[1].charAt(0);

            if (genero == 'M'){
                nomesMasculinos.add(nome);
            } else if (genero == 'F'){
                nomesFemininos.add(nome);
            }
        }

        System.out.println("Nomes Masculinos: ");
        for(String masculinos: nomesMasculinos){
            System.out.println(masculinos);
        }
        System.out.println("Nomes Femininos: ");
        for(String femininos: nomesFemininos){
            System.out.println(femininos);
        }

    }
}