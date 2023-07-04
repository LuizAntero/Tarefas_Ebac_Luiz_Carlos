/**
 * @author Luiz Carlos
 * @version 1.0
 * @since 03/07/2023
 */
public class Produto {
    private int codigo;
    private String nome;
    private int estoque;

    public Produto(int codigo, String nome, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    //Aqui temos um simples método que imprime o nome do objeto e o estoque atual dele
    public void estoqueAtual(){
        System.out.println("Etoque atual de " + this.getNome() + ": " + this.getEstoque());
    }

    /**
     * Método venda
     *
     * @param venda para aplicar a saída do produto do estoque mediante a venda
     * @return a quantidade da venda sobre o objeto do produto
     */

    public int venda(int venda) {
        if (this.estoque >= venda) {
            setEstoque(getEstoque() - venda);
        } else {
            System.out.println("Estoque indisponível");
        }
        return venda;
    }

    /**
     * Método reporEstoque
     * @param repor para aplicar a entrada do produto mediante reposição do estoque
     * @return
     */
    public int reporEstoque(int repor){
        if ((this.estoque+repor)<=1000){
            setEstoque(getEstoque()+repor);
        }else{
            System.out.println("Limite de estoque ultrapassado");
        }
        return repor;
        }

    }







