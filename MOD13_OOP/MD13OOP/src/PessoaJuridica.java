public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String seguimento;

    public PessoaJuridica(String razao, String endereco, String cnpj, String seguimento) {
        this.setNome(razao);
        this.setEndereco(endereco);
        this.cnpj = cnpj;
        this.seguimento = seguimento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSeguimento() {
        return seguimento;
    }

    public void setSeguimento(String seguimento) {
        this.seguimento = seguimento;
    }

    public void imprimir(){
        System.out.println("*****Dados Pessoa Jurídica*****");
        System.out.println("Razão Social: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("CNPJ: " + this.getCnpj());
        System.out.println("Segmento: " + this.getSeguimento());
        System.out.println("*****************************");
    }
}
