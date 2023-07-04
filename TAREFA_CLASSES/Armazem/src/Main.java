/**
 * @author Luiz Carlos
 * @version 1.0
 * @since 03/07/2023
 */
public class Main {
    public static void main(String[] args) {
        Produto cafe = new Produto(123,"Café Extraforte 1kg",100);
        //Percebe que aqui estamos invocando ao novo objeto os métodos da classe produto
        cafe.estoqueAtual();
        cafe.reporEstoque(900);
        cafe.estoqueAtual();
        cafe.venda(50);
        cafe.estoqueAtual();

        }
    }
