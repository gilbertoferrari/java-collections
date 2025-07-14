public class Main {
    public static void main(String[] args) throws Exception {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Autor 1", "Livro 1", 2020);
        catalogoLivros.adicionarLivro("Autor 2", "Livro 1", 2021);
        catalogoLivros.adicionarLivro("Autor 2", "Livro 2", 2022);
        catalogoLivros.adicionarLivro("Autor 3", "Livro 3", 2023);
        catalogoLivros.adicionarLivro("Autor 4", "Livro 4", 1994);
        
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.perquisarPorTitulo("Livro 1"));
        
    }// main
}// class
