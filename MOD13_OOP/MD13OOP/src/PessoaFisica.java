public class PessoaFisica extends Pessoa{
    private String cpf;
    private char sexo;

    public PessoaFisica(String nome, String endereco, String cpf, char sexo) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void imprimir(){
        System.out.println("*****Dados Pessoa Física*****");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Genero: " + this.getSexo());
        System.out.println("*****************************");
    }

}
