import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    // atributo
    private List<Tarefa> tarefaLista;

    // construtor
    public ListaTarefa(){
        this.tarefaLista = new ArrayList<>();
    }

    // metodos
    public void adicionarTarefa(String descricao){
        tarefaLista.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descicao){
        // cria uma lista para adicionar elementos repetidos
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        // percorre a lista de tarefas para achar elementos repetidos
        for(Tarefa tar : tarefaLista){
            if(tar.getDescricao().equalsIgnoreCase(descicao)){
                tarefaParaRemover.add(tar);
            }
        }
        // remove os elementos achados
        tarefaLista.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaLista.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaLista);
    }

}// class
