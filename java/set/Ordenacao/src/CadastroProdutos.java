import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // atributos
    private Set<Produto> produtoSet;

    // construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    // metodos
    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

     public Set<Produto> exibirProdutosPorNome(){
        // cria o Set que ira receber os produtos organizados por nome
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        // cria o Set que ira receber os produtos organizados por preco
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        // adiciona os elementos que iram ser organizados pelo Comparator
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

}// class


