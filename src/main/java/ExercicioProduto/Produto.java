package ExercicioProduto;

import org.w3c.dom.ls.LSOutput;

public class Produto {

    private String nomeProduto;
    private double precoProduto;
    private int quantidadeEmEstoque;

    public Produto (String nomeProdutoInit, double precoProdutoInit, int quantidadeEmEstoqueInit) {

        nomeProduto = nomeProdutoInit;
        precoProduto = precoProdutoInit;
        quantidadeEmEstoque = quantidadeEmEstoqueInit;
    }
    public String visualizar() {
        return
                "Nome:" + nomeProduto +
                    " - Preco:" + precoProduto +
                        " -  Quantidade:" + quantidadeEmEstoque;
    }
}
