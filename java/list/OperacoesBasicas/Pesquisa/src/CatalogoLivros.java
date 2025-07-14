import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributo
    List<Livro> listaLivros;

    // construtor
    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    // metodos
    public void adicionarLivro(String autor, String titulo, int anoProducao){
        listaLivros.add(new Livro(autor, titulo, anoProducao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaPorAutor = new ArrayList<>();

        if(!listaLivros.isEmpty()){
            for(Livro lv : listaLivros){
                if(lv.getAutor().equalsIgnoreCase(autor)){
                    listaPorAutor.add(lv);
                }
            }
        }
        return listaPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaIntervaloAnos = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro lv : listaLivros){
                if(lv.getAnoProducao() >= anoInicial && lv.getAnoProducao() <= anoFinal){
                    listaIntervaloAnos.add(lv);
                }
            }
        }
        return listaIntervaloAnos;
    }

    public Livro perquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!listaLivros.isEmpty()){
            for(Livro lv : listaLivros){
                if(lv.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = lv;
                }
            }
        }
        return livroPorTitulo;
    }

}// class
