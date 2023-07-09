import java.util.Scanner;

public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float mediaAluno(){
        Scanner leitor = new Scanner(System.in);
        float nota = 0.0f;
        float media = 0.0f;
        float soma = 0.0f;
        for (int i = 1; i<=4; i++){
            System.out.print("Insira a nota nr " + i + ": ");
            nota = leitor.nextFloat();
            soma += nota;
            media = soma/i;
        }
        System.out.format("Média do Aluno: %.2f", media);
        System.out.println();

        if(media>=7){
            System.out.println("Situação do aluno " + this.getNome() + " : APROVADO.");
        }else if(media>=5){
            System.out.println("Situação do aluno " + this.getNome() + " : EM RECUPERAÇÃO.");
        }else {
            System.out.println("Situação do aluno " + this.getNome() + " : REPROVADO.");
        }
        return media;
    }

}
