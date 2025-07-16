public class Main {
    public static void main(String[] args) throws Exception {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Produto 1", 30L, 15d, 2);
        cadastroProdutos.adicionarProduto("Produto 1", 30L, 10d, 1);
        cadastroProdutos.adicionarProduto("Produto 5", 20L, 5d, 5);
        cadastroProdutos.adicionarProduto("Produto 4", 40L, 55d, 3);
        cadastroProdutos.adicionarProduto("Produto 2", 50L, 15d, 8);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());


    }
}
