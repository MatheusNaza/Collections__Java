package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos(Set<Produto> produtoSet) {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {

        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {

        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;

    }

    public Set<Produto> exibirProdutosPorPreco() {

        Set<Produto> ProdutosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        ProdutosPorPreco.addAll(produtoSet);
        return ProdutosPorPreco;

    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos(null);

        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50, 15);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }

}
