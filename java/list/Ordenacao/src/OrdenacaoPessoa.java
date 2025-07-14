import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    List<Pessoa> listaPessoa;

    public OrdenacaoPessoa() {
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        // cria a copia da listaPessoa
        List<Pessoa> listaPorIdade = new ArrayList<>(listaPessoa);
        // ordena os elemeentos usando Comparable
        Collections.sort(listaPorIdade);
        // reorna a lista ordenada
        return listaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        // cria a copia da lista
        List<Pessoa> listaPorAltura = new ArrayList<>(listaPessoa);
        // ordena os elementos agora usando a classe ComparatorPorAltura
        Collections.sort(listaPorAltura, new ComparatorPorAltura());
        return listaPorAltura;
    }

}// class
